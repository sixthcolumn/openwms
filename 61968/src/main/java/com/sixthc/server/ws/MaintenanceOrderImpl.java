package com.sixthc.server.ws;

import java.sql.Timestamp;
import java.util.List;
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
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.PositionPoints;
import ch.iec.tc57._2014.maintenanceorders.WorkTask;

import com.sixthc.dao.OrganizationDao;
import com.sixthc.dao.WorkOrderDao;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.hbm.WorkOrderNames;

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

	@Override
	public void createMaintenanceOrder(Holder<HeaderType> header,
			RequestType request, Holder<MaintenanceOrderPayloadType> payload,
			Holder<ReplyType> reply) throws FaultMessage {

		MaintenanceOrders orders = payload.value.getMaintenanceOrders();
		for (MaintenanceOrder req : orders.getMaintenanceOrder()) {

			// // get name and name type info
			// Name name = req.getNames();
			// if (name != null) {
			// String reqName = name.getName();
			// NameType reqNameType = name.getNameType();
			// String reqNameTypeDesc = reqNameType.getDescription();
			// String reqNameTypeName = reqNameType.getName();
			// NameTypeAuthority reqNameTypeAuth = reqNameType
			// .getNameTypeAuthority();
			// String reqNameTypeAuthName = reqNameTypeAuth.getName();
			// String reqNameTypeAuthDesc = reqNameTypeAuth.getDescription();
			//
			// // add name type to work, order
			// WorkOrderNames names = new WorkOrderNames();
			// workOrder.getWorkOrderNameses().add(names);
			// names.setName(reqName);
			// Nametype nameType = new Nametype();
			// names.setNametype(nameType);
			// nameType.setName(reqNameTypeName);
			// nameType.setDescription(reqNameTypeDesc); // TODO : Modified
			// // schema for
			// // nametype to add
			// com.sixthc.hbm.NameTypeAuthority nameTypeAuthority = new
			// com.sixthc.hbm.NameTypeAuthority();
			// nameType.setNameTypeAuthority(nameTypeAuthority);
			// nameTypeAuthority.setDescription(reqNameTypeAuthDesc);
			// nameTypeAuthority.setName(reqNameTypeAuthName);
			//
			// workOrder.getWorkOrderNameses().add(names);
			// names.setWorkOrder(workOrder);
			// }

			// TODO : get this, create multiple org records, link to work orders
			// from below
			for (Organisation reqOrg : req.getOrganisation()) {
				com.sixthc.hbm.Organization org = new com.sixthc.hbm.Organization();
				org.setMrid(reqOrg.getMRID());
				List<com.sixthc.hbm.OrganizationNames> namesList = parseNames(reqOrg
						.getNames());
				for (com.sixthc.hbm.OrganizationNames names : namesList) {
					names.setOrganization(org);
					org.getOrganizationNameses().add(names);
				}
				// for (Names reqNames : reqOrg.getNames()) {
				// com.sixthc.hbm.OrganizationNames names = new
				// com.sixthc.hbm.OrganizationNames();
				// names.setName(reqNames.getName());
				// names.setOrganization(org);
				// org.getOrganizationNameses().add(names);
				//
				// ch.iec.tc57._2014.maintenanceorders.Organisation.Names.NameType
				// reqNameType = reqNames
				// .getNameType();
				// if (reqNameType != null) {
				// com.sixthc.hbm.Nametype nameType = new
				// com.sixthc.hbm.Nametype();
				// nameType.setName(reqNameType.getName());
				// nameType.setDescription(reqNameType.getDescription());
				// names.setNametype(nameType);
				// nameType.getOrganizationNameses().add(names);
				//
				// NameTypeAuthority reqNameTypeAuthority = reqNameType
				// .getNameTypeAuthority();
				// if (reqNameTypeAuthority != null) {
				// com.sixthc.hbm.NameTypeAuthority nameTypeAuthority = new
				// com.sixthc.hbm.NameTypeAuthority();
				// nameTypeAuthority.setName(reqNameTypeAuthority.getName());
				// nameTypeAuthority.setDescription(reqNameTypeAuthority.getDescription());
				// nameType.setNameTypeAuthority(nameTypeAuthority);
				// }
				//
				// }
				// }

				Phone1 ph1 = reqOrg.getPhone1();
				if (ph1 != null) {
					com.sixthc.hbm.Phone phone = new com.sixthc.hbm.Phone();
					phone.setAreacode(ph1.getAreaCode());
					phone.setCitycode(ph1.getCityCode());
					phone.setCountrycode(ph1.getCountryCode());
					phone.setExtension(ph1.getExtension());
					phone.setLocalnumber(ph1.getLocalNumber());
					org.setPhone(phone);
					phone.getOrganizations().add(org);
				}

				StreetAddress addr = reqOrg.getStreetAddress();

				if (addr != null) {
					com.sixthc.hbm.Address woAddress = new com.sixthc.hbm.Address();
					ch.iec.tc57._2014.maintenanceorders.Organisation.StreetAddress.StreetDetail streetDetail = addr
							.getStreetDetail();
					if (streetDetail != null) {
						woAddress.setSdBuildingName(streetDetail
								.getBuildingName());
						woAddress.setSdCode(streetDetail.getCode());
						woAddress.setSdNumber(streetDetail.getNumber());
						woAddress.setSdSuffix(streetDetail.getSuffix());
						woAddress.setSdPrefix(streetDetail.getPrefix());
						woAddress.setSdSuiteNumber(streetDetail
								.getSuiteNumber());
						woAddress.setSdBuildingName(streetDetail
								.getBuildingName());

						streetDetail.getAddressGeneral(); // TODO : ?
						streetDetail.getName(); // TODO : ?
						streetDetail.getType(); // TODO : ?
						org.setAddress(woAddress);
					}

					TownDetail townDetail = addr.getTownDetail();
					if (townDetail != null) {
						woAddress.setTdCode(townDetail.getCode());
						woAddress.setTdCountry(townDetail.getCountry());
						woAddress.setTdName(townDetail.getName());
						woAddress.setTdSection(townDetail.getSection());
						woAddress.setTdSection(townDetail.getStateOrProvince());
					}
					org.setAddress(woAddress);
					woAddress.getOrganizations().add(org);
				}
				orgDao.save(org);
			}

			for (Work reqWork : req.getWork()) {
				WorkOrder workOrder = new WorkOrder();
				workOrder.setMrid(reqWork.getMRID());
				workOrder.setCreatedBy("WMS"); // TODO : ?
				workOrder.setKind(reqWork.getKind() != null ? reqWork
						.getKind().value() : "Not Set");
				reqWork.getLastModifiedDateTime();
				workOrder.setWorkOrderName("NOT SET"); // TODO : ?
				workOrder.setStatus("TBD"); // TODO : ?
				
				for( Name reqName : reqWork.getNames() ) {
					WorkOrderNames workOrderNames = new WorkOrderNames();
					workOrderNames.setName(reqName.getName());
					workOrder.getWorkOrderNameses().add(workOrderNames);
					workOrderNames.setWorkOrder(workOrder);

					 NameType reqNameType = reqName
							.getNameType();

					if (reqNameType != null) {						
						com.sixthc.hbm.Nametype nameType = new com.sixthc.hbm.Nametype();
						nameType.setName(reqNameType.getName());
						nameType.setDescription(reqNameType.getDescription());
						workOrderNames.setNametype(nameType);
						nameType.getWorkOrderNameses().add(workOrderNames);

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

				Priority priority = reqWork.getPriority();
				if (priority != null) {
					if (priority.getRank() != null)
						workOrder
								.setPriorityRank(priority.getRank().intValue());
					workOrder.setPriorityJustification(priority
							.getJustification());
					workOrder.setPriorityType(priority.getType());
				}

				XMLGregorianCalendar dt = reqWork.getRequestDateTime();
				Timestamp timestamp = new Timestamp(dt.toGregorianCalendar()
						.getTimeInMillis());
				if (dt != null) {
					log.debug("request date : " + dt);
					dt.toGregorianCalendar().getTime();
					workOrder.setRequestDatetime(timestamp);
				}

				workOrder.setStatusKind(reqWork.getStatusKind().value());
				workOrder.setStatus(workOrder.getStatus());

				WorkLocation loc = reqWork.getWorkLocation();
				if (loc != null) {
					loc.getCoordinateSystem();
					loc.getDirection();
					for (AssetLocationHazard haz : loc.getHazards()) {
						haz.getType();
					}
					InternalLocation iloc = loc.getInternalLocation();
					iloc.getBuildingName();
					iloc.getBuildingNumber();
					iloc.getFloor();
					iloc.getRoomNumber();

					MainAddress maddr = loc.getMainAddress();
					Status mstatus = maddr.getStatus();
					mstatus.getDateTime();
					mstatus.getDateTime();
					mstatus.getReason();
					mstatus.getRemark();
					mstatus.getValue();

					loc.getMRID();
					for (PositionPoints p : loc.getPositionPoints()) {
						p.getSequenceNumber();
						p.getXPosition();
						p.getYPosition();
						p.getZPosition();
					}
				}

				for (WorkTask task : reqWork.getWorkTasks()) {
					for (Asset as : task.getAssets()) {
						WorkLocation loc2 = as.getLocation();
						CoordinateSystem cs = loc2.getCoordinateSystem();
						cs.getCrsUrn();
						loc2.getDirection();
						for (AssetLocationHazard haz : loc2.getHazards()) {
							haz.getType();
						}
						InternalLocation inloc = loc2.getInternalLocation();
						inloc.getBuildingName();
						inloc.getBuildingNumber();
						inloc.getFloor();
						inloc.getRoomNumber();

						MainAddress maddr = loc2.getMainAddress();
						Status status = maddr.getStatus();
						status.getDateTime();
						status.getReason();
						status.getRemark();
						status.getValue();

						loc2.getMRID();
						for (PositionPoints pp : loc2.getPositionPoints()) {
							pp.getSequenceNumber();
							pp.getXPosition();
							pp.getYPosition();
							pp.getZPosition();
						}

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
