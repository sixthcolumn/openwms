package com.sixthc.server.ws;

import java.sql.Timestamp;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.multispeak.v5_0.wsdl.wo_server.WOServerSoap;
import org.springframework.beans.factory.annotation.Autowired;

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
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.MainAddress.StreetDetail;
import ch.iec.tc57._2014.maintenanceorders.WorkLocation.PositionPoints;
import ch.iec.tc57._2014.maintenanceorders.WorkTask;

import com.sixthc.dao.WorkOrderDao;
import com.sixthc.hbm.Nametype;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.hbm.WorkOrderNames;

public class MaintenanceOrderImpl implements MaintenanceOrderPort {
	static Logger log = Logger.getLogger(WOServerSoap.class);

	@Autowired
	private WorkOrderDao workOrderDao;

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
			for (Organisation org : req.getOrganisation()) {
				org.getMRID();
				for (Names n : org.getNames()) {
					n.getName();
					ch.iec.tc57._2014.maintenanceorders.Organisation.Names.NameType ont = n
							.getNameType();
					ont.getDescription();
					ont.getName();
					NameTypeAuthority onta = ont.getNameTypeAuthority();
					onta.getDescription();
					onta.getName();
				}
				Phone1 ph1 = org.getPhone1();
				if (ph1 != null) {
					ph1.getAreaCode();
					ph1.getCityCode();
					ph1.getCountryCode();
					ph1.getExtension();
					ph1.getLocalNumber();
				}

				StreetAddress addr = org.getStreetAddress();
				if (addr != null) {

					ch.iec.tc57._2014.maintenanceorders.Organisation.StreetAddress.StreetDetail streetDetail = addr
							.getStreetDetail();
					if (streetDetail != null) {
						streetDetail.getAddressGeneral();
						streetDetail.getBuildingName();
						streetDetail.getCode();
						streetDetail.getName();
						streetDetail.getNumber();
						streetDetail.getPrefix();
						streetDetail.getSuffix();
						streetDetail.getSuiteNumber();
						streetDetail.getType();
					}

					TownDetail townDetail = addr.getTownDetail();
					if (townDetail != null) {
						townDetail.getCode();
						townDetail.getCountry();
						townDetail.getName();
						townDetail.getSection();
						townDetail.getStateOrProvince();
					}
				}
			}

			for (Work reqWorkOrder : req.getWork()) {
				WorkOrder workOrder = new WorkOrder();
				workOrder.setMrid(reqWorkOrder.getMRID());
				workOrder.setCreatedBy("WMS"); // TODO : ?
				workOrder.setKind(reqWorkOrder.getKind() != null ? reqWorkOrder
						.getKind().value() : "Not Set");
				reqWorkOrder.getLastModifiedDateTime();
				workOrder.setWorkOrderName("NOT SET"); // TODO : ?
				workOrder.setStatus("TBD"); // TODO : ?
				for (Name n : reqWorkOrder.getNames()) {
					NameType reqNameType = n.getNameType();
					if (reqNameType != null) {
						WorkOrderNames won = new WorkOrderNames();

						Nametype nametype = new Nametype();
						nametype.setDescription(reqNameType.getDescription());
						nametype.setName(reqNameType.getName());
						won.setNametype(nametype);

						NameTypeAuthority reqNameTypeAuthority = reqNameType
								.getNameTypeAuthority();
						if (reqNameTypeAuthority != null) {
							com.sixthc.hbm.NameTypeAuthority nameTypeAuthority = new com.sixthc.hbm.NameTypeAuthority();
							nameTypeAuthority
									.setDescription(reqNameTypeAuthority
											.getDescription());
							nameTypeAuthority.setName(reqNameTypeAuthority
									.getName());
							nametype.setNameTypeAuthority(nameTypeAuthority);
							nameTypeAuthority.getNametypes().add(nametype);
						}
						won.setName(n.getName());
						won.setWorkOrder(workOrder);
						won.setNametype(nametype);
						workOrder.getWorkOrderNameses().add(won);
					}

				}
				Priority priority = reqWorkOrder.getPriority();
				if (priority != null) {
					if (priority.getRank() != null)
						workOrder
								.setPriorityRank(priority.getRank().intValue());
					workOrder.setPriorityJustification(priority
							.getJustification());
					workOrder.setPriorityType(priority.getType());
				}

				XMLGregorianCalendar dt = reqWorkOrder.getRequestDateTime();
				Timestamp timestamp = new Timestamp(dt.toGregorianCalendar()
						.getTimeInMillis());
				if (dt != null) {
					log.debug("request date : " + dt);
					dt.toGregorianCalendar().getTime();
					workOrder.setRequestDatetime(timestamp);
				}

				workOrder.setStatusKind(reqWorkOrder.getStatusKind().value());
				workOrder.setStatus(workOrder.getStatus());

				WorkLocation loc = reqWorkOrder.getWorkLocation();
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

				for (WorkTask task : reqWorkOrder.getWorkTasks()) {
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
