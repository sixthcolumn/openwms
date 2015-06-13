package com.sixthc.server.ws;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.multispeak.v5_0.wsdl.wo_server.WOServerSoap;

import ch.iec.tc57._2011.maintenanceordermessage.MaintenanceOrderPayloadType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;
import ch.iec.tc57._2011.sendmaintenanceorder.FaultMessage;
import ch.iec.tc57._2011.sendmaintenanceorder.MaintenanceOrderPort;
import ch.iec.tc57._2014.maintenanceorders.Asset;
import ch.iec.tc57._2014.maintenanceorders.AssetLocationHazard;
import ch.iec.tc57._2014.maintenanceorders.Crew;
import ch.iec.tc57._2014.maintenanceorders.CrewMember;
import ch.iec.tc57._2014.maintenanceorders.CrewMember.Person;
import ch.iec.tc57._2014.maintenanceorders.InternalLocation;
import ch.iec.tc57._2014.maintenanceorders.MaintenanceOrder;
import ch.iec.tc57._2014.maintenanceorders.MaintenanceOrders;
import ch.iec.tc57._2014.maintenanceorders.Name;
import ch.iec.tc57._2014.maintenanceorders.NameType;
import ch.iec.tc57._2014.maintenanceorders.NameTypeAuthority;
import ch.iec.tc57._2014.maintenanceorders.Organisation;
import ch.iec.tc57._2014.maintenanceorders.Organisation.Names;
import ch.iec.tc57._2014.maintenanceorders.Organisation.Phone1;
import ch.iec.tc57._2014.maintenanceorders.Organisation.StreetAddress;
import ch.iec.tc57._2014.maintenanceorders.Organisation.StreetAddress.TownDetail;
import ch.iec.tc57._2014.maintenanceorders.Work;
import ch.iec.tc57._2014.maintenanceorders.Work.Priority;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.CoordinateSystem;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress.Status;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress.StreetDetail;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.PositionPoints;
import ch.iec.tc57._2014.maintenanceorders.WorkTask;
import ch.iec.tc57._2014.maintenanceorders.WorkTask.MaterialItems;
import ch.iec.tc57._2014.maintenanceorders.WorkTask.MaterialItems.Quantity;
import ch.iec.tc57._2014.maintenanceorders.WorkTimeSchedule;
import ch.iec.tc57._2014.maintenanceorders.WorkTimeSchedule.ScheduleInterval;

import com.sixthc.dao.OrganizationDao;
import com.sixthc.dao.WorkOrderDao;
import com.sixthc.hbm.Address;
import com.sixthc.hbm.AddressDistricts;
import com.sixthc.hbm.AddressHazards;
import com.sixthc.hbm.AddressPositionPoints;
import com.sixthc.hbm.ConstraintException;
import com.sixthc.hbm.CrewNames;
import com.sixthc.hbm.Hazards;
import com.sixthc.hbm.MaterialItem;
import com.sixthc.hbm.MaterialItemNames;
import com.sixthc.hbm.Nametype;
import com.sixthc.hbm.Organization;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.hbm.WorkOrderHazards;
import com.sixthc.hbm.WorkOrderNames;
import com.sixthc.hbm.WorkOrderOrganizations;
import com.sixthc.hbm.WorkOrderSchedule;
import com.sixthc.hbm.WorkOrderWorkTasks;
import com.sixthc.hbm.WorkPositionPoints;
import com.sixthc.hbm.WorkTaskAssets;
import com.sixthc.hbm.WorkTaskCrews;
import com.sixthc.hbm.WorkTaskMaterialItems;
import com.sixthc.hbm.WorkTaskNames;
import com.sixthc.hbm.WorkTaskTimeSchedules;

public class MaintenanceOrderImpl implements MaintenanceOrderPort {
	static Logger log = Logger.getLogger(WOServerSoap.class);

	@Resource(name = "workOrderDao")
	private WorkOrderDao workOrderDao;
	/*
	 * DeviceDao deviceDao;
	 * 
	 * @Autowired
	 * 
	 * 
	 * @Autowired
	 */
	@Resource(name = "organizationDao")
	private OrganizationDao orgDao;

	List<com.sixthc.hbm.OrganizationNames> parseNames(List<Names> reqNames) {
		Vector<com.sixthc.hbm.OrganizationNames> namesList = new Vector<com.sixthc.hbm.OrganizationNames>();
		for (Names reqName : reqNames) {
			com.sixthc.hbm.OrganizationNames names = new com.sixthc.hbm.OrganizationNames();
			namesList.add(names);
			names.setName(reqName.getName());

			ch.iec.tc57._2014.maintenanceorders.Organisation.Names.NameType reqNameType = reqName
					.getNameType();
			if (reqNameType != null) {
				com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
				nameType.setName(reqNameType.getName());
				nameType.setDescription(reqNameType.getDescription());
				names.setNametype(nameType);
				nameType.getOrganizationNameses().add(names);

				NameTypeAuthority reqNameTypeAuthority = reqNameType
						.getNameTypeAuthority();
				if (reqNameTypeAuthority != null) {
					com.sixthc.hbm.NameTypeAuthority nameTypeAuthority = new com.sixthc.hbm.NameTypeAuthority();
					nameTypeAuthority.setName(reqNameTypeAuthority.getName());
					nameTypeAuthority.setDescription(reqNameTypeAuthority
							.getDescription());
					nameType.setNameTypeAuthority(nameTypeAuthority);
				}
			}
		}
		return namesList;
	}

	private void parseStreetDetail(com.sixthc.hbm.Address woAddress,
			WorkLocation.MainAddress addr) {
		WorkLocation.MainAddress.StreetDetail streetDetail = addr
				.getStreetDetail();

		if (streetDetail != null) {
			woAddress.setSdBuildingName(streetDetail.getBuildingName());
			woAddress.setSdCode(streetDetail.getCode());
			woAddress.setSdNumber(streetDetail.getNumber());
			woAddress.setSdSuffix(streetDetail.getSuffix());
			woAddress.setSdPrefix(streetDetail.getPrefix());
			woAddress.setSdSuiteNumber(streetDetail.getSuiteNumber());
			woAddress.setSdBuildingName(streetDetail.getBuildingName());

			streetDetail.getAddressGeneral(); // TODO : ?
			streetDetail.getName(); // TODO : ?
			streetDetail.getType(); // TODO : ?
		}

		ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress.TownDetail townDetail = addr
				.getTownDetail();
		if (townDetail != null) {
			woAddress.setTdCode(townDetail.getCode());
			woAddress.setTdCountry(townDetail.getCountry());
			woAddress.setTdName(townDetail.getName());
			woAddress.setTdSection(townDetail.getSection());
			woAddress.setTdStateProvince(townDetail.getStateOrProvince());
		}
	}

	private Timestamp parseDate(XMLGregorianCalendar from) {
		if (from != null) {
			Timestamp timestamp = new Timestamp(from.toGregorianCalendar()
					.getTimeInMillis());
			log.debug("parseDate : " + from);

			return timestamp;
		}
		return null;
	}

	private void parseStreetDetail(com.sixthc.hbm.Address woAddress,
			ch.iec.tc57._2014.maintenanceorders.Organisation.StreetAddress addr) {

		ch.iec.tc57._2014.maintenanceorders.Organisation.StreetAddress.StreetDetail streetDetail = addr
				.getStreetDetail();

		if (streetDetail != null) {
			woAddress.setSdBuildingName(streetDetail.getBuildingName());
			woAddress.setSdCode(streetDetail.getCode());
			woAddress.setSdNumber(streetDetail.getNumber());
			woAddress.setSdSuffix(streetDetail.getSuffix());
			woAddress.setSdPrefix(streetDetail.getPrefix());
			woAddress.setSdSuiteNumber(streetDetail.getSuiteNumber());
			woAddress.setSdBuildingName(streetDetail.getBuildingName());

			streetDetail.getAddressGeneral(); // TODO : ?
			streetDetail.getName(); // TODO : ?
			streetDetail.getType(); // TODO : ?
		}

		TownDetail townDetail = addr.getTownDetail();

		if (townDetail != null) {
			woAddress.setTdCode(townDetail.getCode());
			woAddress.setTdCountry(townDetail.getCountry());
			woAddress.setTdName(townDetail.getName());
			woAddress.setTdSection(townDetail.getSection());
			woAddress.setTdSection(townDetail.getStateOrProvince());
		}

	}

	public com.sixthc.hbm.Nametype parseNameType(NameType from) {
		if (from != null) {
			com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
			nameType.setName(from.getName());
			nameType.setDescription(from.getDescription());

			NameTypeAuthority reqNameTypeAuthority = from
					.getNameTypeAuthority();
			if (reqNameTypeAuthority != null) {
				com.sixthc.hbm.NameTypeAuthority nameTypeAuthority = new com.sixthc.hbm.NameTypeAuthority();
				nameTypeAuthority.setName(reqNameTypeAuthority.getName());
				nameTypeAuthority.setDescription(reqNameTypeAuthority
						.getDescription());
				nameType.setNameTypeAuthority(nameTypeAuthority);
			}
			return nameType;
		}
		return null;
	}

	public com.sixthc.hbm.Nametype parseNameType(Crew.Names.NameType from) {
		if (from != null) {
			com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
			nameType.setName(from.getName());
			nameType.setDescription(from.getDescription());

			ch.iec.tc57._2014.maintenanceorders.Crew.Names.NameType.NameTypeAuthority reqNameTypeAuthority = from
					.getNameTypeAuthority();
			if (reqNameTypeAuthority != null) {
				com.sixthc.hbm.NameTypeAuthority nameTypeAuthority = new com.sixthc.hbm.NameTypeAuthority();
				nameTypeAuthority.setName(reqNameTypeAuthority.getName());
				nameTypeAuthority.setDescription(reqNameTypeAuthority
						.getDescription());
				nameType.setNameTypeAuthority(nameTypeAuthority);
			}
			return nameType;
		}
		return null;
	}

	@Override
	public void createMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		MaintenanceOrders orders = payload.value.getMaintenanceOrders();
		for (MaintenanceOrder req : orders.getMaintenanceOrder()) {
			List<com.sixthc.hbm.Organization> orgList = new Vector<com.sixthc.hbm.Organization>();
			for (Organisation reqOrg : req.getOrganisation()) {
				com.sixthc.hbm.Organization workOrg = new com.sixthc.hbm.Organization();
				workOrg.setMrid(reqOrg.getMRID());
				List<com.sixthc.hbm.OrganizationNames> namesList = parseNames(reqOrg
						.getNames());
				for (com.sixthc.hbm.OrganizationNames names : namesList) {
					names.setOrganization(workOrg);
					workOrg.getOrganizationNameses().add(names);
				}

				Phone1 ph1 = reqOrg.getPhone1();
				if (ph1 != null) {
					com.sixthc.hbm.Phone phone = new com.sixthc.hbm.Phone();
					phone.setAreacode(ph1.getAreaCode());
					phone.setCitycode(ph1.getCityCode());
					phone.setCountrycode(ph1.getCountryCode());
					phone.setExtension(ph1.getExtension());
					phone.setLocalnumber(ph1.getLocalNumber());
					workOrg.setPhone(phone);
					phone.getOrganizations().add(workOrg);
				}

				StreetAddress addr = reqOrg.getStreetAddress();

				if (addr != null) {
					com.sixthc.hbm.Address woAddress = new com.sixthc.hbm.Address();
					parseStreetDetail(woAddress, addr);
					workOrg.setAddress(woAddress);
					woAddress.getOrganizations().add(workOrg);
				}
			//	orgDao.save(workOrg);
				orgList.add(workOrg);
			}

			for (Work reqWork : req.getWork()) {
				WorkOrder workOrder = new WorkOrder();
				
				// add orgs to all work orders
				for( Organization workOrg : orgList ) {
					WorkOrderOrganizations workOrgs = new WorkOrderOrganizations();
					workOrgs.setOrganization(workOrg);
					workOrg.getWorkOrderOrganizations().add(workOrgs);
					workOrder.getWorkOrderOrganizations().add(workOrgs);	
					workOrgs.setWorkOrder(workOrder);
				}
				
				workOrder.setMrid(reqWork.getMRID());
				workOrder.setCreatedBy("WMS"); // TODO : ?
				workOrder.setKind(reqWork.getKind() != null ? reqWork.getKind()
						.value() : "Not Set");
				reqWork.getLastModifiedDateTime();
				workOrder.setWorkOrderName("NOT SET"); // TODO : ?
				workOrder.setStatus("TBD"); // TODO : ?

				WorkTimeSchedule reqWorkSchedules = reqWork.getTimeSchedules();
				if (reqWorkSchedules != null) {
					WorkOrderSchedule workOrderSchedule = new WorkOrderSchedule();
					workOrder.getWorkOrderSchedules().add(workOrderSchedule);
					workOrderSchedule.setWorkOrder(workOrder);
					com.sixthc.hbm.TimeSchedule ts = new com.sixthc.hbm.TimeSchedule();
					workOrderSchedule.setTimeSchedule(ts);
					ts.getWorkOrderSchedules().add(workOrderSchedule);
					ScheduleInterval reqTimeInterval = reqWorkSchedules
							.getScheduleInterval();

					Timestamp start = parseDate(reqTimeInterval.getStart());
					if (start != null)
						ts.setStartTstamp(start);
					Timestamp end = parseDate(reqTimeInterval.getEnd());
					if (end != null)
						ts.setEndTstamp(end);
					workOrderSchedule.setTimeSchedule(ts);
					reqWorkSchedules.getKind(); // TODO : ?
					ts.setType("NA"); // TODO : not nillable, and not in request
				}

				for (Name reqName : reqWork.getNames()) {
					WorkOrderNames workOrderNames = new WorkOrderNames();
					workOrderNames.setName(reqName.getName());
					workOrder.getWorkOrderNameses().add(workOrderNames);
					workOrderNames.setWorkOrder(workOrder);

					com.sixthc.hbm.Nametype workOrderNameType = parseNameType(reqName
							.getNameType());
					if (workOrderNameType != null) {
						workOrderNames.setNametype(workOrderNameType);
						workOrderNameType.getWorkOrderNameses().add(
								workOrderNames);
					}
				}

				Priority priority = reqWork.getPriority();
				if (priority != null) {
					if (priority.getRank() != null)
						workOrder
								.setPriorityRank(priority.getRank().intValue());
					workOrder.setPriorityJustification(priority
							.getJustification());
					workOrder.setPriorityType(priority.getType());
				}

				Timestamp reqDateTime = parseDate(reqWork.getRequestDateTime());
				if (reqDateTime != null)
					workOrder.setRequestDatetime(reqDateTime);

				workOrder.setStatusKind(reqWork.getStatusKind().value());
				workOrder.setStatus(workOrder.getStatus());

				WorkLocation reqLoc = reqWork.getWorkLocation();
				if (reqLoc != null) {
					reqLoc.getDirection(); // TODO : ?

					for (AssetLocationHazard reqHazard : reqLoc.getHazards()) {
						Hazards hazards = new Hazards();
						hazards.setHazardName(reqHazard.getType());
						WorkOrderHazards workOrderHazards = new WorkOrderHazards();

						workOrderHazards.setHazards(hazards);
						workOrderHazards.setWorkOrder(workOrder);
						workOrder.getWorkOrderHazardses().add(workOrderHazards);
					}

					InternalLocation iloc = reqLoc.getInternalLocation();
					if (iloc != null) {
						iloc.getBuildingName(); // TODO : ?
						iloc.getBuildingNumber(); // TODO : ?
						iloc.getFloor(); // TODO : ?
						iloc.getRoomNumber(); // TODO : ?
					}

					MainAddress maddr = reqLoc.getMainAddress();
					if (maddr != null) {
						Address address = new Address();

						address.getAddressWorkorders().add(workOrder);
						workOrder.setAddress(address);

						CoordinateSystem coordSystem = reqLoc
								.getCoordinateSystem();
						if (coordSystem != null) {
							address.setCoordSystem(coordSystem.getCrsUrn());
						}
						parseStreetDetail(address, maddr);
						StreetDetail streetDetail = maddr.getStreetDetail();
						ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress.TownDetail townDetail = maddr
								.getTownDetail();

					}

					Status mstatus = maddr.getStatus();
					if (mstatus != null) {
						mstatus.getDateTime(); // TODO : ?
						mstatus.getDateTime(); // TODO : ?
						mstatus.getReason(); // TODO : ?
						mstatus.getRemark(); // TODO : ?
						mstatus.getValue(); // TODO : ?
					}

					for (PositionPoints p : reqLoc.getPositionPoints()) {
						WorkPositionPoints workPoints = new WorkPositionPoints();
						try {
							workPoints.setZposition(Integer.valueOf(p
									.getZPosition()));
							workPoints.setXposition(Integer.valueOf(p
									.getXPosition()));
							workPoints.setYposition(Integer.valueOf(p
									.getYPosition()));
							workPoints.setSequenceNum(p.getSequenceNumber()
									.intValue());
						} catch (NumberFormatException nfe) {
							log.error("position value ignored, not number");
							throw new ConstraintException(
									"address position points : non integer value passed");
						}
						workOrder.getWorkPositionPointses().add(workPoints);
						workPoints.setWorkOrder(workOrder);
					}
				}

				for (WorkTask reqTask : reqWork.getWorkTasks()) {
					com.sixthc.hbm.WorkTask workTask = new com.sixthc.hbm.WorkTask();
					WorkOrderWorkTasks workOrderWorkTasks = new WorkOrderWorkTasks();
					workOrderWorkTasks.setWorkTask(workTask);
					workOrderWorkTasks.setWorkOrder(workOrder);
					workTask.getWorkOrderWorkTaskses().add(workOrderWorkTasks);
					workOrder.getWorkOrderWorkTaskses().add(workOrderWorkTasks);

					for (Asset reqAsset : reqTask.getAssets()) {
						WorkTaskAssets workTaskAssets = new WorkTaskAssets();
						com.sixthc.hbm.Asset workAsset = new com.sixthc.hbm.Asset();
						workTaskAssets.setAsset(workAsset);
						workTask.getWorkTaskAssetses().add(workTaskAssets);
						workTaskAssets.setWorkTask(workTask);
						workAsset.setMrid(reqAsset.getMRID());
						workTaskAssets.setCreatedAt(new Date(System.currentTimeMillis())); // TODO : Not passed?

						WorkLocation reqAssetLoc = reqAsset.getLocation();
						if (reqAssetLoc != null) {
							MainAddress reqMainAddress = reqAssetLoc
									.getMainAddress();

							Address workAssetAddress = new Address();
							workAsset.setAddress(workAssetAddress);
							reqAssetLoc.getMRID(); // TODO : ?

							if (reqMainAddress != null) {
								parseStreetDetail(workAssetAddress,
										reqMainAddress);
								reqMainAddress.getStatus(); // TODO : ??
								workAsset.setAddress(workAssetAddress);
							}

							if (reqAssetLoc.getCoordinateSystem() != null) {
								workAssetAddress.setCoordSystem(reqAssetLoc
										.getCoordinateSystem().getCrsUrn());

								workAssetAddress.setDirections(reqAssetLoc
										.getDirection());
							}

							for (AssetLocationHazard reqHaz : reqAssetLoc
									.getHazards()) {
								
								Hazards workhaz = new Hazards();	
								AddressHazards addrHazards = new AddressHazards();
								workAssetAddress.getAddressHazardses().add(addrHazards);
								addrHazards.setAddress(workAssetAddress);
								addrHazards.setHazards(workhaz);
								
								workhaz.setHazardName(reqHaz.getType()); // TODO : Wrong?
							}

							InternalLocation reqIloc = reqAssetLoc
									.getInternalLocation();
							if (reqIloc != null) {
								reqIloc.getBuildingName(); // TODO : ?
								reqIloc.getBuildingNumber(); // TODO : ?
								reqIloc.getFloor(); // TODO : ?
								reqIloc.getRoomNumber(); // TODO : ?
							}

							reqAssetLoc.getMRID(); // TODO : ?

							Set<AddressDistricts> districts = workAssetAddress
									.getAddressDistrictses();

							if (districts != null) {
								for (AddressDistricts addr : districts) {
									AddressDistricts d = new AddressDistricts();
								}
							}

							List<PositionPoints> reqPoints = reqAssetLoc
									.getPositionPoints();
							for (PositionPoints p : reqPoints) {
								AddressPositionPoints workPoints = new AddressPositionPoints();
								try {
									workPoints.setZposition(Integer.valueOf(p
											.getZPosition()));
									workPoints.setXposition(Integer.valueOf(p
											.getXPosition()));
									workPoints.setYposition(Integer.valueOf(p
											.getYPosition()));
									workPoints.setSequence(p
											.getSequenceNumber().intValue());
								} catch (NumberFormatException nfe) {
									log.error("position value ignored, not number");
									throw new ConstraintException(
											"address position points : non integer value passed");
								}
								workAssetAddress.getAddressPositionPointses()
										.add(workPoints);
								workPoints.setAddress(workAssetAddress);

							}
						}
					}

					XMLGregorianCalendar dt = reqWork.getRequestDateTime();
					Timestamp timestamp = new Timestamp(dt
							.toGregorianCalendar().getTimeInMillis());
					if (dt != null) {
						log.debug("request date : " + dt);
						dt.toGregorianCalendar().getTime();
						workOrder.setRequestDatetime(timestamp);
					}

					Timestamp reqCrewEta = parseDate(reqTask.getCrewETA());
					if (reqCrewEta != null)
						if (reqDateTime != null)
							workOrder.setRequestDatetime(reqCrewEta);

					for (Crew reqCrew : reqTask.getCrews()) {
						WorkTaskCrews workCrews = new WorkTaskCrews();
						workTask.getWorkTaskCrewses().add(workCrews);
						workCrews.setWorkTask(workTask);
						com.sixthc.hbm.Crew workCrew = new com.sixthc.hbm.Crew();
						workCrews.setCrew(workCrew);
						workCrew.setMrid(reqCrew.getMRID());
						Set<CrewNames> workCrewNames = workCrew
								.getCrewNameses();
						for (ch.iec.tc57._2014.maintenanceorders.Crew.Names reqCrewName : reqCrew
								.getNames()) {
							CrewNames workCrewName = new CrewNames();
							workCrewName.setName(reqCrewName.getName());

							com.sixthc.hbm.Nametype crewNameType = parseNameType(reqCrewName
									.getNameType());
							if (crewNameType != null) {
								workCrewName.setNametype(crewNameType);
								// TODO : Probably have to point back to crew
								// names (crewNameType.get...)
							}
						}
						reqCrew.getWorkAssets();

						for (CrewMember reqCrewMember : reqCrew
								.getCrewMembers()) {
							Person reqPerson = reqCrewMember.getPerson();
							reqPerson.getFirstName(); // TODO : No table/field
														// for crew member
														// first/last?
							reqPerson.getLastName(); // TODO : see above
						}
					}

					workTask.setInstructions(reqTask.getInstruction());

					WorkTaskMaterialItems workTaskItems = new WorkTaskMaterialItems();
					for (MaterialItems reqMat : reqTask.getMaterialItems()) {
						MaterialItem workMatItem = new MaterialItem();
						workTaskItems.setMaterialItem(workMatItem);
						workMatItem.getWorkTaskMaterialItemses().add(
								workTaskItems);

						Quantity reqMatQuantity = reqMat.getQuantity();
						BigInteger reqMatQuantityValue = reqMatQuantity
								.getValue();
						if (reqMatQuantityValue != null)
							workMatItem.setQuantity(reqMatQuantityValue
									.floatValue());

						Name reqMatNames = reqMat.getNames();
						MaterialItemNames workMatItemName = new MaterialItemNames();
						workMatItemName.setName(reqMatNames.getName());
						Nametype workNameType = parseNameType(reqMatNames
								.getNameType());
						if (workNameType != null) {
							workMatItemName.setNametype(workNameType);
							workNameType.getMaterialItemNameses().add(
									workMatItemName);
						}

						for (MaterialItemNames matItemNames : workMatItem
								.getMaterialItemNameses()) {
							matItemNames.setName(reqMatNames.getName());
							matItemNames.setNametype(workNameType);
						}
					}

					workTask.setMrid(reqTask.getMRID());
					for (ch.iec.tc57._2014.maintenanceorders.WorkTask.Names reqNames : reqTask
							.getNames()) {
						WorkTaskNames workTaskName = new WorkTaskNames();
						workTaskName.setName(reqNames.getName());
						NameType reqNamesType = reqNames.getNameType();
						if (reqNamesType != null) {
							Nametype workTaskNameType = parseNameType(reqNamesType);
							workTaskNameType.getWorkTaskNameses().add(
									workTaskName);
							workTaskName.setNametype(workTaskNameType);
						}
					}

					reqTask.getOldAsset(); // TODO : ?

					reqTask.getStatusKind(); // TODO : ?

					workTask.setSubject(reqTask.getSubject());

					WorkTimeSchedule reqTaskSchedules = reqTask
							.getTimeSchedules();
					if (reqTaskSchedules != null) {

						WorkTaskTimeSchedules workTaskSchedule = new WorkTaskTimeSchedules();
						workTask.getWorkTaskTimeScheduleses().add(
								workTaskSchedule);
						workTaskSchedule.setWorkTask(workTask);
						com.sixthc.hbm.TimeSchedule ts = new com.sixthc.hbm.TimeSchedule();
						workTaskSchedule.setTimeSchedule(ts);
						ts.getWorkTaskTimeScheduleses().add(workTaskSchedule);
						ScheduleInterval reqTimeInterval = reqTaskSchedules
								.getScheduleInterval();

						Timestamp start = parseDate(reqTimeInterval.getStart());
						if (start != null)
							ts.setStartTstamp(start);
						Timestamp end = parseDate(reqTimeInterval.getEnd());
						if (end != null)
							ts.setEndTstamp(end);
						workTaskSchedule.setTimeSchedule(ts);
						reqTaskSchedules.getKind(); // TODO : ?
						ts.setType("NA"); // TODO : Where to get this
											// non-nillable value from
					}

				}
				workOrderDao.save(workOrder);
			}
		}

		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void closeMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		// TODO Auto-generated method stub

	}

}
