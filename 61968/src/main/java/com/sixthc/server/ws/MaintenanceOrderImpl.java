package com.sixthc.server.ws;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.multispeak.v5_0.wsdl.wo_server.WOServerSoap;

import ch.iec.tc57._2011.maintenanceordermessage.MaintenanceOrderPayloadType;
import ch.iec.tc57._2011.schema.message.ErrorType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;
import ch.iec.tc57._2011.sendmaintenanceorder.FaultMessage;
import ch.iec.tc57._2011.sendmaintenanceorder.MaintenanceOrderPort;
import ch.iec.tc57._2014.maintenanceorders.Asset;
import ch.iec.tc57._2014.maintenanceorders.Asset.Procedures;
import ch.iec.tc57._2014.maintenanceorders.Asset.Procedures.Measurements;
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
import ch.iec.tc57._2014.maintenanceorders.WorkAsset;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.CoordinateSystem;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress;
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
import com.sixthc.hbm.AssetNames;
import com.sixthc.hbm.AssetProcedures;
import com.sixthc.hbm.Attachment;
import com.sixthc.hbm.ConstraintException;
import com.sixthc.hbm.Contactperson;
import com.sixthc.hbm.CrewAssets;
import com.sixthc.hbm.CrewContactpersons;
import com.sixthc.hbm.CrewNames;
import com.sixthc.hbm.Hazards;
import com.sixthc.hbm.MaterialItem;
import com.sixthc.hbm.MaterialItemNames;
import com.sixthc.hbm.Measurement;
import com.sixthc.hbm.Nametype;
import com.sixthc.hbm.Organization;
import com.sixthc.hbm.Procedure;
import com.sixthc.hbm.ProcedureMeasurements;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.hbm.WorkOrderAttachments;
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
import com.sixthc.hbm.WorkTaskOldAssets;
import com.sixthc.hbm.WorkTaskTimeSchedules;
import com.sixthc.util.ImageLoadFileException;
import com.sixthc.util.ImageLoader;

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

	private List<com.sixthc.hbm.OrganizationNames> parseNames(
			List<Names> reqNames) {
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

	private List<com.sixthc.hbm.WorkTaskNames> parseWorkTaskNames(
			List<WorkTask.Names> reqNames) {
		Vector<com.sixthc.hbm.WorkTaskNames> namesList = new Vector<com.sixthc.hbm.WorkTaskNames>();
		for (WorkTask.Names reqName : reqNames) {
			com.sixthc.hbm.WorkTaskNames names = new com.sixthc.hbm.WorkTaskNames();
			namesList.add(names);
			names.setName(reqName.getName());

			NameType reqNameType = reqName.getNameType();
			if (reqNameType != null) {
				com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
				nameType.setName(reqNameType.getName());
				nameType.setDescription(reqNameType.getDescription());
				names.setNametype(nameType);
				nameType.getWorkTaskNameses().add(names);

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

	private List<com.sixthc.hbm.AssetNames> parseAssetNames(
			List<Asset.Names> reqNames) {
		Vector<com.sixthc.hbm.AssetNames> namesList = new Vector<com.sixthc.hbm.AssetNames>();
		for (Asset.Names reqName : reqNames) {
			com.sixthc.hbm.AssetNames names = new com.sixthc.hbm.AssetNames();
			namesList.add(names);
			names.setName(reqName.getName());

			NameType reqNameType = reqName.getNameType();
			if (reqNameType != null) {
				com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
				nameType.setName(reqNameType.getName());
				nameType.setDescription(reqNameType.getDescription());
				names.setNametype(nameType);
				nameType.getAssetNameses().add(names);

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

	private List<com.sixthc.hbm.CrewNames> parseCrewNames(
			List<Crew.Names> reqNames) {
		Vector<com.sixthc.hbm.CrewNames> namesList = new Vector<com.sixthc.hbm.CrewNames>();
		for (Crew.Names reqName : reqNames) {
			com.sixthc.hbm.CrewNames names = new com.sixthc.hbm.CrewNames();
			namesList.add(names);
			names.setName(reqName.getName());

			ch.iec.tc57._2014.maintenanceorders.Crew.Names.NameType reqNameType = reqName
					.getNameType();
			if (reqNameType != null) {
				com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
				nameType.setName(reqNameType.getName());
				nameType.setDescription(reqNameType.getDescription());
				names.setNametype(nameType);
				nameType.getCrewNameses().add(names);

				ch.iec.tc57._2014.maintenanceorders.Crew.Names.NameType.NameTypeAuthority reqNameTypeAuthority = reqNameType
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

			woAddress.setSdAddress1(streetDetail.getAddressGeneral());
			woAddress.setSdAddress2(streetDetail.getName());
			streetDetail.isWithinTownLimits(); // not in hbm address bb:  ignore, not mapped
			woAddress.setSdType(streetDetail.getType());

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

			woAddress.setSdAddress1(streetDetail.getAddressGeneral());
			woAddress.setSdAddress2(streetDetail.getName());
			woAddress.setSdType(streetDetail.getType());
		}

		TownDetail townDetail = addr.getTownDetail();

		if (townDetail != null) {
			woAddress.setTdCode(townDetail.getCode());
			woAddress.setTdCountry(townDetail.getCountry());
			woAddress.setTdName(townDetail.getName());
			woAddress.setTdSection(townDetail.getSection());
			woAddress.setTdStateProvince(townDetail.getStateOrProvince());
		}

	}

	private com.sixthc.hbm.Nametype parseNameType(
			ch.iec.tc57._2014.maintenanceorders.NameType from) {
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

	private com.sixthc.hbm.Nametype parseNameType(Crew.Names.NameType from) {
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

	private com.sixthc.hbm.Asset parseAsset(Asset reqAsset) {
		com.sixthc.hbm.Asset workAsset = new com.sixthc.hbm.Asset();
		workAsset.setMrid(reqAsset.getMRID());
		WorkLocation reqAssetLoc = reqAsset.getLocation();
		workAsset.setCriticalFlag(reqAsset.isCritical() == true ? 1 : 0);
		workAsset.setUtcNumber(reqAsset.getUtcNumber());
		if (reqAssetLoc != null) {
			MainAddress reqMainAddress = reqAssetLoc.getMainAddress();

			Address workAssetAddress = new Address();
			workAsset.setAddress(workAssetAddress);
			reqAssetLoc.getMRID(); // ignore

			InternalLocation reqInternalLoc = reqAssetLoc.getInternalLocation();
			if (reqInternalLoc != null) {
				workAsset.setInternalBuildingName(reqInternalLoc
						.getBuildingName());
				workAsset.setInternalBuildingNumber(reqInternalLoc
						.getBuildingNumber());
				workAsset.setInternalFloor(reqInternalLoc.getFloor());
				workAsset.setInternalRoomNumber(reqInternalLoc.getRoomNumber());
			}

			if (reqMainAddress != null) {
				parseStreetDetail(workAssetAddress, reqMainAddress);
				reqMainAddress.getStatus(); // ignore
				workAsset.setAddress(workAssetAddress);
			}

			if (reqAssetLoc.getCoordinateSystem() != null) {
				workAssetAddress.setCoordSystem(reqAssetLoc
						.getCoordinateSystem().getCrsUrn());

				workAssetAddress.setDirections(reqAssetLoc.getDirection());
			}

			for (AssetLocationHazard reqHaz : reqAssetLoc.getHazards()) {

				Hazards workhaz = new Hazards();
				AddressHazards addrHazards = new AddressHazards();
				workAssetAddress.getAddressHazardses().add(addrHazards);
				addrHazards.setAddress(workAssetAddress);
				addrHazards.setHazards(workhaz);
				workhaz.setHazardName(reqHaz.getType());
			}

			InternalLocation reqIloc = reqAssetLoc.getInternalLocation();
			if (reqIloc != null) {
				workAsset.setInternalBuildingName(reqIloc.getBuildingName());
				workAsset.setInternalBuildingNumber(reqIloc.getBuildingNumber());
				workAsset.setInternalFloor(reqIloc.getFloor());
				workAsset.setInternalRoomNumber(reqIloc.getRoomNumber());
			}

			reqAssetLoc.getMRID(); // ignore

			List<PositionPoints> reqPoints = reqAssetLoc.getPositionPoints();
			for (PositionPoints p : reqPoints) {
				AddressPositionPoints workPoints = new AddressPositionPoints();
				try {
					workPoints.setZposition(Integer.valueOf(p.getZPosition()));
					workPoints.setXposition(Integer.valueOf(p.getXPosition()));
					workPoints.setYposition(Integer.valueOf(p.getYPosition()));
					workPoints.setSequence(p.getSequenceNumber().intValue());
				} catch (NumberFormatException nfe) {
					log.error("position value ignored, not number");
					throw new ConstraintException(
							"address position points : non integer value passed");
				}
				workAssetAddress.getAddressPositionPointses().add(workPoints);
				workPoints.setAddress(workAssetAddress);

			}

		}

		for (Procedures reqProc : reqAsset.getProcedures()) {
			AssetProcedures workProcs = new AssetProcedures();
			Procedure workProc = new Procedure();

			workAsset.getAssetProcedureses().add(workProcs);
			workProcs.setProcedure(workProc);
			workProcs.setAsset(workAsset);
			workProc.getAssetProcedureses().add(workProcs);

			workProc.setInstruction(reqProc.getInstruction());
			if (reqProc.getKind() != null)
				workProc.setKind(reqProc.getKind().value());
			try {
				workProc.setSequence(Integer.valueOf(reqProc
						.getSequenceNumber()));
			} catch (NumberFormatException nfe) {
				log.error("position value ignored, not number");
				throw new ConstraintException(
						"asset sequence : non integer value passed");
			}

			for (Measurements reqMeasure : reqProc.getMeasurements()) {
				ProcedureMeasurements workMeasures = new ProcedureMeasurements();
				workMeasures.setProcedure(workProc);
				workProc.getProcedureMeasurementses().add(workMeasures);

				Measurement workMeasure = new Measurement();
				workMeasures.setMeasurement(workMeasure);
				workMeasure.getProcedureMeasurementses().add(workMeasures);

				workMeasure.setType(reqMeasure.getMeasurementType());
				if (reqMeasure.getPhases() != null)
					workMeasure.setPhases(reqMeasure.getPhases().value());
				try {
					workMeasure.setUnitMultiplier(Float.valueOf(reqMeasure
							.getUnitMultiplier()));
				} catch (NumberFormatException nfe) {
					log.error("position value ignored, not number");
					throw new ConstraintException(
							"asset procedure measure unit multiplier : non float value passed");
				}
				workMeasure.setUnitSymbol(reqMeasure.getUnitSymbol());
			}
		}

		List<com.sixthc.hbm.AssetNames> namesList = parseAssetNames(reqAsset
				.getNames());
		for (AssetNames assetNames : namesList) {
			workAsset.getAssetNameses().add(assetNames);
			assetNames.setAsset(workAsset);
		}

		return workAsset;
	}

	@Override
	public void createMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		boolean imageFileProcessingError = false;
		reply.value = new ReplyType();

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
				for (Organization workOrg : orgList) {
					WorkOrderOrganizations workOrgs = new WorkOrderOrganizations();
					workOrgs.setOrganization(workOrg);
					workOrg.getWorkOrderOrganizations().add(workOrgs);
					workOrder.getWorkOrderOrganizations().add(workOrgs);
					workOrgs.setWorkOrder(workOrder);
				}

				UUID uuid = UUID.randomUUID();
				workOrder.setMrid(uuid.toString());
				reqWork.setMRID(uuid.toString()); // overwrite MRID
				workOrder.setCreatedBy("WMS");
				workOrder.setKind(reqWork.getKind() != null ? reqWork.getKind()
						.value() : "Not Set");

				Timestamp workUpdatedDateTime = parseDate(reqWork
						.getLastModifiedDateTime());
				if (workUpdatedDateTime != null)
					workOrder.setUpdatedAt(workUpdatedDateTime);

				reqWork.getLastModifiedDateTime();
				//workOrder.setWorkOrderName("NOT SET"); // leave null
				workOrder.setStatus("ACTIVE");

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
					if (reqWorkSchedules.getKind() != null)
						ts.setType(reqWorkSchedules.getKind().value());
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
					// reqLoc.getMRID(); //  bb: ignore

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
						workOrder.setInternalBuildingName(iloc
								.getBuildingName());
						workOrder.setInternalBuildingNum(iloc
								.getBuildingNumber());
						workOrder.setInternalFloor(iloc.getFloor());
						workOrder.setInternalRoomNum(iloc.getRoomNumber());
					}

					MainAddress reqMaddr = reqLoc.getMainAddress();
					if (reqMaddr != null) {
						Address address = new Address();

						address.getAddressWorkorders().add(workOrder);
						workOrder.setAddress(address);

						address.setDirections(reqLoc.getDirection());
						CoordinateSystem coordSystem = reqLoc
								.getCoordinateSystem();
						if (coordSystem != null) {
							address.setCoordSystem(coordSystem.getCrsUrn());
						}
						parseStreetDetail(address, reqMaddr);

						// Status mstatus = reqMaddr.getStatus(); // ignore

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
						com.sixthc.hbm.Asset workAsset = parseAsset(reqAsset);
						workTaskAssets.setAsset(workAsset);
						workTask.getWorkTaskAssetses().add(workTaskAssets);
						workTaskAssets.setWorkTask(workTask);
						workAsset.setMrid(reqAsset.getMRID());
						workTaskAssets.setCreatedAt(new Date(System
								.currentTimeMillis())); // use current time

					}

					Timestamp reqCrewEta = parseDate(reqTask.getCrewETA());
					if (reqCrewEta != null)
						if (reqDateTime != null)
							workTask.setCrewEta(reqCrewEta);

					for (Crew reqCrew : reqTask.getCrews()) {
						WorkTaskCrews workCrews = new WorkTaskCrews();
						workTask.getWorkTaskCrewses().add(workCrews);
						workCrews.setWorkTask(workTask);
						com.sixthc.hbm.Crew workCrew = new com.sixthc.hbm.Crew();
						workCrews.setCrew(workCrew);
						workCrew.setMrid(reqCrew.getMRID());

						parseCrewNames(reqCrew.getNames());

						List<com.sixthc.hbm.CrewNames> namesList = parseCrewNames(reqCrew
								.getNames());
						for (CrewNames crewNames : namesList) {
							workCrew.getCrewNameses().add(crewNames);
							crewNames.setCrew(workCrew);
						}

						for (WorkAsset reqCrewAsset : reqCrew.getWorkAssets()) {
							com.sixthc.hbm.Asset workCrewAsset = parseAsset(reqCrewAsset);
							CrewAssets crewAssets = new CrewAssets();
							workCrewAsset.getWorkCrewAssets().add(crewAssets);
							crewAssets.setAsset(workCrewAsset);
							workCrew.getCrewAssets().add(crewAssets);
							crewAssets.setCrew(workCrew);
						}

						for (CrewMember reqCrewMember : reqCrew
								.getCrewMembers()) {
							Person reqPerson = reqCrewMember.getPerson();

							CrewContactpersons persons = new CrewContactpersons();
							persons.setCrew(workCrew);
							workCrew.getContactPersons().add(persons);
							
							Contactperson person = new Contactperson();
							person.setFirstname(reqPerson.getFirstName()); 
							person.setLastname(reqPerson.getLastName());
							
							persons.setContactperson(person);
							person.getCrewContactpersons().add(persons);
						}
					}

					workTask.setInstructions(reqTask.getInstruction());

					for (MaterialItems reqMat : reqTask.getMaterialItems()) {
						WorkTaskMaterialItems workTaskItems = new WorkTaskMaterialItems();
						MaterialItem workMatItem = new MaterialItem();

						workTaskItems.setWorkTask(workTask);
						workTask.getWorkTaskMaterialItemses()
								.add(workTaskItems);

						workTaskItems.setMaterialItem(workMatItem);
						workMatItem.getWorkTaskMaterialItemses().add(
								workTaskItems);

						Quantity reqMatQuantity = reqMat.getQuantity();
						if (reqMatQuantity != null) {
							BigInteger reqMatQuantityValue = reqMatQuantity
									.getValue();
							if (reqMatQuantityValue != null)
								workMatItem.setQuantity(reqMatQuantityValue
										.floatValue());

							workMatItem.setMultiplier(reqMatQuantity
									.getMultiplier());

							workMatItem.setUnit(reqMatQuantity.getUnit());

						}

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

					for (WorkTaskNames workTaskNames : parseWorkTaskNames(reqTask
							.getNames())) {
						workTaskNames.setWorkTask(workTask);
						workTask.getWorkTaskNameses().add(workTaskNames);
					}

					com.sixthc.hbm.Asset oldAsset = parseAsset(reqTask
							.getOldAsset());
					com.sixthc.hbm.WorkTaskOldAssets workTaskOldAssets = new WorkTaskOldAssets();

					workTaskOldAssets.setAsset(oldAsset);
					oldAsset.getWorkTaskOldAssetses().add(workTaskOldAssets);

					workTaskOldAssets.setWorkTask(workTask);
					workTask.getWorkTaskOldAssetses().add(workTaskOldAssets);

					workTaskOldAssets.setCreatedAt(new Date(System
							.currentTimeMillis()));

					// reqTask.getStatusKind(); // ignore
					if (reqTask.getTaskKind() != null)
						workTask.setTaskType(reqTask.getTaskKind().value());

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
						if (reqTaskSchedules.getKind() != null)
							ts.setType(reqTaskSchedules.getKind().value());

					}

					if (reqWork.getAttachments() != null) {
						
						for( ch.iec.tc57._2014.maintenanceorders.Attachment reqAtt : reqWork.getAttachments().getAttachment()) {
							try {
								String file = UUID.randomUUID().toString();
								String uri = reqAtt.getUrl();
								
								Attachment attachment = new Attachment();
								attachment.setComment(reqAtt.getComment());
								attachment.setDescription(reqAtt.getDescription());
								attachment.setFilename(file);
								attachment.setType("jpg"); // TODO : Get file suffix

								ImageLoader.getImage(uri, file);

								WorkOrderAttachments woa = new WorkOrderAttachments();
								woa.setAttachment(attachment);
								attachment.setWorkOrderAttachmentses(workOrder
										.getWorkOrderAttachmentses());
								woa.setWorkOrder(workOrder);
								workOrder.getWorkOrderAttachmentses().add(woa);
							} catch (ImageLoadFileException e) {
								log.error(e);
								imageFileProcessingError = true;
								ErrorType et = new ErrorType();
								et.setCode("WARNING");
								et.setDetails("failed to load image from url : "
										+ reqAtt);
								reply.value.getError().add(et);
							}
						}
					}
				}
				workOrderDao.save(workOrder);
			}
		}

		if (imageFileProcessingError == true) {
			reply.value.setResult("Partial");

		} else
			reply.value.setResult("OK");

	}

	@Override
	public void closeMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void cancelMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void changeMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

	@Override
	public void deleteMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {
		reply.value = new ReplyType();
		reply.value.setResult("OK");

	}

}
