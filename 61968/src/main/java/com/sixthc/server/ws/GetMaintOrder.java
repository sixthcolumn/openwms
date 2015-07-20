package com.sixthc.server.ws;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixthc.cim.get.cxf.Asset2;
import com.sixthc.cim.get.cxf.AssetLocationHazard2;
import com.sixthc.cim.get.cxf.Crew2;
import com.sixthc.cim.get.cxf.CrewMember;
import com.sixthc.cim.get.cxf.CrewMember.Person;
import com.sixthc.cim.get.cxf.GetMaintenanceOrdersFaultMessage;
import com.sixthc.cim.get.cxf.GetMaintenanceOrdersPort;
import com.sixthc.cim.get.cxf.GetMaintenanceOrdersRequestMessageType;
import com.sixthc.cim.get.cxf.GetMaintenanceOrdersResponseMessageType;
import com.sixthc.cim.get.cxf.InternalLocation2;
import com.sixthc.cim.get.cxf.MaintenanceOrder;
import com.sixthc.cim.get.cxf.MaintenanceOrder2;
import com.sixthc.cim.get.cxf.MaintenanceOrders;
import com.sixthc.cim.get.cxf.MaintenanceOrdersPayloadType;
import com.sixthc.cim.get.cxf.Name;
import com.sixthc.cim.get.cxf.Name2;
import com.sixthc.cim.get.cxf.NameType;
import com.sixthc.cim.get.cxf.NameType2;
import com.sixthc.cim.get.cxf.NameTypeAuthority;
import com.sixthc.cim.get.cxf.NameTypeAuthority2;
import com.sixthc.cim.get.cxf.Organisation2;
import com.sixthc.cim.get.cxf.Organisation2.Phone1;
import com.sixthc.cim.get.cxf.Organisation2.StreetAddress;
import com.sixthc.cim.get.cxf.Organisation2.StreetAddress.TownDetail;
import com.sixthc.cim.get.cxf.PhaseCode;
import com.sixthc.cim.get.cxf.ProcedureKind;
import com.sixthc.cim.get.cxf.Work2;
import com.sixthc.cim.get.cxf.WorkKind2;
import com.sixthc.cim.get.cxf.WorkLocation2;
import com.sixthc.cim.get.cxf.WorkLocation2.MainAddress;
import com.sixthc.cim.get.cxf.WorkLocation2.MainAddress.StreetDetail;
import com.sixthc.cim.get.cxf.WorkLocation2.PositionPoints;
import com.sixthc.cim.get.cxf.WorkStatusKind2;
import com.sixthc.cim.get.cxf.WorkTask;
import com.sixthc.cim.get.cxf.WorkTaskKind;
import com.sixthc.cim.get.cxf.WorkTimeSchedule2;
import com.sixthc.cim.get.cxf.WorkTimeScheduleKind2;
import com.sixthc.dao.MaintOrderDao;
import com.sixthc.hbm.Address;
import com.sixthc.hbm.AddressPositionPoints;
import com.sixthc.hbm.Asset;
import com.sixthc.hbm.AssetNames;
import com.sixthc.hbm.AssetProcedures;
import com.sixthc.hbm.Contactperson;
import com.sixthc.hbm.CrewAssets;
import com.sixthc.hbm.CrewContactpersons;
import com.sixthc.hbm.CrewNames;
import com.sixthc.hbm.Hazards;
import com.sixthc.hbm.Maintorder;
import com.sixthc.hbm.MaintorderNames;
import com.sixthc.hbm.Measurement;
import com.sixthc.hbm.Nametype;
import com.sixthc.hbm.Organization;
import com.sixthc.hbm.OrganizationNames;
import com.sixthc.hbm.Phone;
import com.sixthc.hbm.Procedure;
import com.sixthc.hbm.ProcedureMeasurements;
import com.sixthc.hbm.TimeSchedule;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.hbm.WorkOrderHazards;
import com.sixthc.hbm.WorkOrderNames;
import com.sixthc.hbm.WorkOrderOrganizations;
import com.sixthc.hbm.WorkOrderSchedule;
import com.sixthc.hbm.WorkOrderWorkTasks;
import com.sixthc.hbm.WorkPositionPoints;
import com.sixthc.hbm.WorkTaskAssets;
import com.sixthc.hbm.WorkTaskCrews;
import com.sixthc.hbm.WorkTaskTimeSchedules;
import com.sixthc.util.DateUtil;

public class GetMaintOrder implements GetMaintenanceOrdersPort {
	static Logger log = Logger.getLogger(GetMaintOrder.class);

	@Autowired
	private MaintOrderDao maintOrderDao;

	public void setPhone1(Phone from, Organisation2.Phone1 to) {
		to.setAreaCode(from.getAreacode());
		to.setCityCode(from.getCitycode());
		to.setCountryCode(from.getCountrycode());
		to.setExtension(from.getExtension());
		to.setLocalNumber(from.getLocalnumber());
	}

	private void setAddress1(Address from, StreetAddress to) {
		Organisation2.StreetAddress.StreetDetail sd = new Organisation2.StreetAddress.StreetDetail();
		to.setStreetDetail(sd);
		sd.setAddressGeneral(from.getSdAddress1());
		sd.setBuildingName(from.getSdBuildingName());
		sd.setCode(from.getSdCode());
		sd.setName(from.getSdAddress2());
		sd.setNumber(from.getSdNumber());
		sd.setPrefix(from.getSdPrefix());
		sd.setSuffix(from.getSdSuffix());
		sd.setSuiteNumber(from.getSdSuiteNumber());
		sd.setType(from.getSdType());
		sd.setWithinTownLimits(from.getSdWithinTownLimitsFlag() == 1 ? true
				: false);

		TownDetail td = new TownDetail();
		to.setTownDetail(td);
		td.setCode(from.getTdCode());
		td.setCountry(from.getTdCountry());
		td.setName(from.getTdName());
		td.setSection(from.getTdSection());
		td.setStateOrProvince(from.getTdStateProvince());
	}

	private void setMainAddress(Address from, MainAddress to) {
		StreetDetail sd = new StreetDetail();
		to.setStreetDetail(sd);
		sd.setAddressGeneral(from.getSdAddress1());
		sd.setBuildingName(from.getSdBuildingName());
		sd.setCode(from.getSdCode());
		sd.setName(from.getSdAddress2());
		sd.setNumber(from.getSdNumber());
		sd.setPrefix(from.getSdPrefix());
		sd.setSuffix(from.getSdSuffix());
		sd.setSuiteNumber(from.getSdSuiteNumber());
		sd.setType(from.getSdType());
		sd.setWithinTownLimits(from.getSdWithinTownLimitsFlag() == 1 ? true
				: false);

		com.sixthc.cim.get.cxf.WorkLocation2.MainAddress.TownDetail td = new com.sixthc.cim.get.cxf.WorkLocation2.MainAddress.TownDetail();
		to.setTownDetail(td);
		to.setTownDetail(td);
		td.setCode(from.getTdCode());
		td.setCountry(from.getTdCountry());
		td.setName(from.getTdName());
		td.setSection(from.getTdSection());
		td.setStateOrProvince(from.getTdStateProvince());

	}

	private void setMaintOrderNames(MaintorderNames from, Name2 to) {
		to.setName(from.getName());

		if (from.getNametype() != null) {
			Nametype moNameType = from.getNametype();
			NameType2 respNameType = new NameType2();
			respNameType.setDescription(moNameType.getDescription());
			respNameType.setName(moNameType.getName());
			to.setNameType(respNameType);
			if (moNameType.getNameTypeAuthority() != null) {

				com.sixthc.hbm.NameTypeAuthority moNameTypeAuthority = moNameType
						.getNameTypeAuthority();
				NameTypeAuthority2 respNTA = new NameTypeAuthority2();
				respNameType.setNameTypeAuthority(respNTA);
				respNTA.setDescription(moNameTypeAuthority.getDescription());
				respNTA.setName(moNameTypeAuthority.getName());
			}
		}
	}

	private void setMaintOrderOrgNames(OrganizationNames moNames, Name2 to) {
		to.setName(moNames.getName());

		if (moNames.getNametype() != null) {
			Nametype moNameType = moNames.getNametype();
			NameType2 respNameType = new NameType2();
			respNameType.setDescription(moNameType.getDescription());
			respNameType.setName(moNameType.getName());
			to.setNameType(respNameType);
			if (moNameType.getNameTypeAuthority() != null) {
				com.sixthc.hbm.NameTypeAuthority moNameTypeAuthority = moNameType
						.getNameTypeAuthority();
				NameTypeAuthority2 respNTA = new NameTypeAuthority2();
				respNameType.setNameTypeAuthority(respNTA);
				respNTA.setDescription(moNameTypeAuthority.getDescription());
				respNTA.setName(moNameTypeAuthority.getName());
			}
		}
	}

	private void setWorkOrderNames(WorkOrderNames moWorkOrderNames, Name2 to) {
		to.setName(moWorkOrderNames.getName());

		if (moWorkOrderNames.getNametype() != null) {
			Nametype moNameType = moWorkOrderNames.getNametype();
			NameType2 respNameType = new NameType2();
			respNameType.setDescription(moNameType.getDescription());
			respNameType.setName(moNameType.getName());
			to.setNameType(respNameType);
			if (moNameType.getNameTypeAuthority() != null) {
				com.sixthc.hbm.NameTypeAuthority moNameTypeAuthority = moNameType
						.getNameTypeAuthority();
				NameTypeAuthority2 respNTA = new NameTypeAuthority2();
				respNameType.setNameTypeAuthority(respNTA);
				respNTA.setDescription(moNameTypeAuthority.getDescription());
				respNTA.setName(moNameTypeAuthority.getName());
			}
		}
	}

	private void setAssetNames(AssetNames assetNames, Name2 to) {
		to.setName(assetNames.getName());

		if (assetNames.getNametype() != null) {
			Nametype moNameType = assetNames.getNametype();
			NameType2 respNameType = new NameType2();
			respNameType.setDescription(moNameType.getDescription());
			respNameType.setName(moNameType.getName());
			to.setNameType(respNameType);
			if (moNameType.getNameTypeAuthority() != null) {
				com.sixthc.hbm.NameTypeAuthority moNameTypeAuthority = moNameType
						.getNameTypeAuthority();
				NameTypeAuthority2 respNTA = new NameTypeAuthority2();
				respNameType.setNameTypeAuthority(respNTA);
				respNTA.setDescription(moNameTypeAuthority.getDescription());
				respNTA.setName(moNameTypeAuthority.getName());
			}
		}
	}

	private void setCrewNames(CrewNames assetNames, Name2 to) {
		to.setName(assetNames.getName());

		if (assetNames.getNametype() != null) {
			Nametype moNameType = assetNames.getNametype();
			NameType2 respNameType = new NameType2();
			respNameType.setDescription(moNameType.getDescription());
			respNameType.setName(moNameType.getName());
			to.setNameType(respNameType);
			if (moNameType.getNameTypeAuthority() != null) {
				com.sixthc.hbm.NameTypeAuthority moNameTypeAuthority = moNameType
						.getNameTypeAuthority();
				NameTypeAuthority2 respNTA = new NameTypeAuthority2();
				respNameType.setNameTypeAuthority(respNTA);
				respNTA.setDescription(moNameTypeAuthority.getDescription());
				respNTA.setName(moNameTypeAuthority.getName());
			}
		}
	}

	private void setAsset(com.sixthc.hbm.Asset from, Asset2 to) {
		to.setMRID(from.getMrid());
		to.setCritical(from.getCriticalFlag() == 1 ? true : false);
		to.setUtcNumber(from.getUtcNumber());

		WorkLocation2 toWorkloc = new WorkLocation2();
		to.setLocation(toWorkloc);
		if (from.getAddress() != null) {
			MainAddress toMainAddr = new MainAddress();
			toWorkloc.setMainAddress(toMainAddr);
			setMainAddress(from.getAddress(), toMainAddr);
			toWorkloc.setDirection(from.getAddress().getDirections());
			//			CoordinateSystem cs = new CoordinateSystem();
			//			cs.setCrsUrn(from.getAddress().getCoordSystem());			
			//			toWorkloc.setCoordinateSystem(cs);
		}

		for (AssetNames assetNames : from.getAssetNameses()) {
			Name2 toAsset = new Name2();
			setAssetNames(assetNames, toAsset);
			toWorkloc.getNames().add(toAsset);
		}

		if (from.getInternalBuildingNumber() != null
				&& from.getInternalFloor() != null
				&& from.getInternalRoomNumber() != null) {
			InternalLocation2 toInternalLoc = new InternalLocation2();
			toWorkloc.setInternalLocation(toInternalLoc);
			toInternalLoc.setBuildingName(from.getInternalBuildingName());
			toInternalLoc.setBuildingNumber(from.getInternalBuildingNumber());
			toInternalLoc.setFloor(from.getInternalFloor());
			toInternalLoc.setRoomNumber(from.getInternalRoomNumber());
		}

		Address addr = from.getAddress();
		if (addr != null) {
			for (AddressPositionPoints moPoints : addr
					.getAddressPositionPointses()) {
				PositionPoints reqPos = new PositionPoints();
				reqPos.setSequenceNumber(BigInteger.valueOf(moPoints
						.getSequence()));
				reqPos.setXPosition(moPoints.getXposition().toString());
				reqPos.setYPosition(moPoints.getYposition().toString());
				reqPos.setZPosition(moPoints.getZposition().toString());
				to.getLocation().getPositionPoints().add(reqPos);
			}
		}

		for (AssetProcedures fromProcs : from.getAssetProcedureses()) {
			com.sixthc.cim.get.cxf.Asset2.Procedures toProc = new com.sixthc.cim.get.cxf.Asset2.Procedures();
			to.getProcedures().add(toProc);
			Procedure fromProc = fromProcs.getProcedure();
			toProc.setInstruction(fromProc.getInstruction());
			toProc.setKind(ProcedureKind.fromValue(fromProc.getKind()));
			toProc.setSequenceNumber(fromProc.getSequence().toString());

			for (ProcedureMeasurements fromProcMeasure : fromProc
					.getProcedureMeasurementses()) {
				com.sixthc.cim.get.cxf.Asset2.Procedures.Measurements toMeas = new com.sixthc.cim.get.cxf.Asset2.Procedures.Measurements();
				toProc.getMeasurements().add(toMeas);
				if (fromProcMeasure.getMeasurement() != null) {
					Measurement fromMeas = fromProcMeasure.getMeasurement();
					toMeas.setMeasurementType(fromMeas.getType());
					toMeas.setPhases(PhaseCode.valueOf(fromMeas.getPhases()));
					toMeas.setUnitMultiplier(fromMeas.getUnitMultiplier()
							.toString());
					toMeas.setUnitSymbol(fromMeas.getUnitSymbol());
				}
			}
		}
	}
	
	private void setWorkAsset(com.sixthc.hbm.Asset from, com.sixthc.cim.get.cxf.WorkAsset to) {
		to.setMRID(from.getMrid());
		to.setCritical(from.getCriticalFlag() == 1 ? true : false);
		to.setUtcNumber(from.getUtcNumber());

		WorkLocation2 toWorkloc = new WorkLocation2();
		to.setLocation(toWorkloc);
		if (from.getAddress() != null) {
			MainAddress toMainAddr = new MainAddress();
			toWorkloc.setMainAddress(toMainAddr);
			setMainAddress(from.getAddress(), toMainAddr);
			toWorkloc.setDirection(from.getAddress().getDirections());
			//			CoordinateSystem cs = new CoordinateSystem();
			//			cs.setCrsUrn(from.getAddress().getCoordSystem());			
			//			toWorkloc.setCoordinateSystem(cs);
		}

		for (AssetNames assetNames : from.getAssetNameses()) {
			Name2 toAsset = new Name2();
			setAssetNames(assetNames, toAsset);
			toWorkloc.getNames().add(toAsset);
		}

		if (from.getInternalBuildingNumber() != null
				&& from.getInternalFloor() != null
				&& from.getInternalRoomNumber() != null) {
			InternalLocation2 toInternalLoc = new InternalLocation2();
			toWorkloc.setInternalLocation(toInternalLoc);
			toInternalLoc.setBuildingName(from.getInternalBuildingName());
			toInternalLoc.setBuildingNumber(from.getInternalBuildingNumber());
			toInternalLoc.setFloor(from.getInternalFloor());
			toInternalLoc.setRoomNumber(from.getInternalRoomNumber());
		}

		Address addr = from.getAddress();
		if (addr != null) {
			for (AddressPositionPoints moPoints : addr
					.getAddressPositionPointses()) {
				PositionPoints reqPos = new PositionPoints();
				reqPos.setSequenceNumber(BigInteger.valueOf(moPoints
						.getSequence()));
				reqPos.setXPosition(moPoints.getXposition().toString());
				reqPos.setYPosition(moPoints.getYposition().toString());
				reqPos.setZPosition(moPoints.getZposition().toString());
				to.getLocation().getPositionPoints().add(reqPos);
			}
		}

		for (AssetProcedures fromProcs : from.getAssetProcedureses()) {
			com.sixthc.cim.get.cxf.WorkAsset.Procedures toProc = new com.sixthc.cim.get.cxf.WorkAsset.Procedures();
			to.getProcedures().add(toProc);
			Procedure fromProc = fromProcs.getProcedure();
			toProc.setInstruction(fromProc.getInstruction());
			toProc.setKind(ProcedureKind.fromValue(fromProc.getKind()));
			toProc.setSequenceNumber(fromProc.getSequence().toString());

			for (ProcedureMeasurements fromProcMeasure : fromProc
					.getProcedureMeasurementses()) {
				com.sixthc.cim.get.cxf.WorkAsset.Procedures.Measurements toMeas = new com.sixthc.cim.get.cxf.WorkAsset.Procedures.Measurements();
				toProc.getMeasurements().add(toMeas);
				if (fromProcMeasure.getMeasurement() != null) {
					Measurement fromMeas = fromProcMeasure.getMeasurement();
					toMeas.setMeasurementType(fromMeas.getType());
					toMeas.setPhases(PhaseCode.valueOf(fromMeas.getPhases()));
					toMeas.setUnitMultiplier(fromMeas.getUnitMultiplier()
							.toString());
					toMeas.setUnitSymbol(fromMeas.getUnitSymbol());
				}
			}
		}
	}

	@Override
	public GetMaintenanceOrdersResponseMessageType getMaintenanceOrders(
			GetMaintenanceOrdersRequestMessageType getMaintenanceOrdersRequestMessage)
			throws GetMaintenanceOrdersFaultMessage {

		GetMaintenanceOrdersResponseMessageType resp = new GetMaintenanceOrdersResponseMessageType();
		MaintenanceOrdersPayloadType payload = new MaintenanceOrdersPayloadType();
		resp.setPayload(payload);
		MaintenanceOrders respMaintOrders = new MaintenanceOrders();
		payload.setMaintenanceOrders(respMaintOrders);
		resp.setHeader(getMaintenanceOrdersRequestMessage.getHeader());
		com.sixthc.cim.get.cxf.ReplyType reply = new com.sixthc.cim.get.cxf.ReplyType();
		resp.setReply(reply);

		for (MaintenanceOrder reqMaint : getMaintenanceOrdersRequestMessage
				.getRequest().getGetMaintenanceOrders().getMaintenanceOrder()) {
			String lookupString = reqMaint.getMRID();
			Maintorder mo = maintOrderDao.find(lookupString);

			if (mo == null) {
				// error;
				continue;
			}

			// set maint order names
			MaintenanceOrder2 respMo = new MaintenanceOrder2();
			respMaintOrders.getMaintenanceOrder().add(respMo);
			respMo.setMRID(reqMaint.getMRID());
			System.out
					.println("mo coutn : " + mo.getMaintorderNameses().size());
			for (MaintorderNames moName : mo.getMaintorderNameses()) {
				Name2 respName = new Name2();
				respMo.getNames().add(respName);
				setMaintOrderNames(moName, respName);
			}

			/*
			 * currently we store the single ORG with each work order, design
			 * flaw. So we
			 * are going to get it from the first work order and place in
			 * maintOrder.org
			 */
			if (!mo.getWorkOrders().isEmpty()) {
				WorkOrder moOrgWorkOrder = mo.getWorkOrders().toArray(
						new WorkOrder[1])[0];
				for (WorkOrderOrganizations moOrg : moOrgWorkOrder
						.getWorkOrderOrganizations()) {
					Organisation2 respOrg = new Organisation2();
					respOrg.setStreetAddress(new StreetAddress());
					respMo.setOrganisation(respOrg);
					Organization moOrg2 = moOrg.getOrganization();
					setAddress1(moOrg2.getAddress(), respOrg.getStreetAddress());
					Phone1 phone = new Phone1();
					respOrg.setPhone1(phone);
					setPhone1(moOrg2.getPhone(), phone);
					respOrg.setMRID(moOrg2.getMrid());
					// set maint order org names
					for (OrganizationNames moNames : moOrg2
							.getOrganizationNameses()) {
						Name2 respName = new Name2();
						respOrg.getNames().add(respName);
						setMaintOrderOrgNames(moNames, respName);
					}
				}
			}

			for (WorkOrder moWorkOrder : mo.getWorkOrders()) {
				Work2 respWorkOrder = new Work2();
				respMo.getWork().add(respWorkOrder);

				respWorkOrder.setMRID(moWorkOrder.getMrid());

				// TODO : Missing activityRecords

				// work order names
				for (WorkOrderNames moWorkOrderNames : moWorkOrder
						.getWorkOrderNameses()) {
					Name2 respName2 = new Name2();
					respWorkOrder.getNames().add(respName2);
					setWorkOrderNames(moWorkOrderNames, respName2);
				}
				respWorkOrder
						.setKind(WorkKind2.fromValue(moWorkOrder.getKind()));
				respWorkOrder.setLastModifiedDateTime(DateUtil
						.getXMLDate(moWorkOrder.getUpdatedAt()));

				com.sixthc.cim.get.cxf.Work2.Priority respPriority = new com.sixthc.cim.get.cxf.Work2.Priority();
				respPriority.setJustification(moWorkOrder
						.getPriorityJustification());
				respPriority.setRank(BigInteger.valueOf(moWorkOrder
						.getPriorityRank()));
				respPriority.setType(moWorkOrder.getPriorityType());
				respWorkOrder.setPriority(respPriority);

				respWorkOrder.setRequestDateTime(DateUtil.getXMLDate(new Date(
						System.currentTimeMillis())));
				respWorkOrder.setStatusKind(WorkStatusKind2
						.fromValue(moWorkOrder.getStatusKind()));

				WorkLocation2 respLoc = new WorkLocation2();
				respWorkOrder.setWorkLocation(respLoc);

				//respWorkOrder.setWorkLocation(respLoc);
				for (WorkOrderHazards moHaz : moWorkOrder
						.getWorkOrderHazardses()) {
					AssetLocationHazard2 respHaz = new AssetLocationHazard2();
					Hazards moHaz2 = moHaz.getHazards();
					moHaz2.getHazardName();
					respHaz.setType(moHaz2.getHazardName());

					respLoc.getHazards().add(respHaz);

				}

				for (WorkOrderSchedule moSched : moWorkOrder
						.getWorkOrderSchedules()) {
					WorkTimeSchedule2 respSched = new WorkTimeSchedule2();
					respWorkOrder.getTimeSchedules().add(respSched);
					respSched.setKind(WorkTimeScheduleKind2.fromValue(moSched
							.getTimeSchedule().getType()));
					com.sixthc.cim.get.cxf.WorkTimeSchedule2.ScheduleInterval respSI = new com.sixthc.cim.get.cxf.WorkTimeSchedule2.ScheduleInterval();
					respSched.setScheduleInterval(respSI);
					TimeSchedule moS = moSched.getTimeSchedule();
					respSI.setStart(DateUtil.getXMLDate(moS.getStartTstamp()));
					respSI.setEnd(DateUtil.getXMLDate(moS.getEndTstamp()));
				}

				if (moWorkOrder.getInternalBuildingNum() != null
						&& moWorkOrder.getInternalFloor() != null
						&& moWorkOrder.getInternalRoomNum() != null) {
					InternalLocation2 respIloc = new InternalLocation2();
					respLoc.setInternalLocation(respIloc);
					respIloc.setBuildingName(moWorkOrder
							.getInternalBuildingName());
					respIloc.setBuildingNumber(moWorkOrder
							.getInternalBuildingNum());
					respIloc.setFloor(moWorkOrder.getInternalFloor());
					respIloc.setRoomNumber(moWorkOrder.getInternalRoomNum());
				}

				MainAddress respMainAddr = new MainAddress();
				respLoc.setMainAddress(respMainAddr);
				Address moWorkOrderAddress = moWorkOrder.getAddress();
				if (moWorkOrderAddress != null) {
					respLoc.setDirection(moWorkOrderAddress.getDirections());
					//					CoordinateSystem cs = new CoordinateSystem();
					//					cs.setCrsUrn(moWorkOrderAddress.getCoordSystem());
					//					respLoc.setCoordinateSystem(cs);
					MainAddress ma = new MainAddress();
					setMainAddress(moWorkOrderAddress, ma);
					respLoc.setDirection(moWorkOrderAddress.getDirections());
					//respLoc.setMRID(null); // TODO : No mrid for work location
					respLoc.setMainAddress(ma);
				}

				for (WorkPositionPoints moPoints : moWorkOrder
						.getWorkPositionPointses()) {
					PositionPoints reqPos = new PositionPoints();
					reqPos.setSequenceNumber(BigInteger.valueOf(moPoints
							.getSequenceNum()));
					reqPos.setXPosition(moPoints.getXposition().toString());
					reqPos.setYPosition(moPoints.getYposition().toString());
					reqPos.setZPosition(moPoints.getZposition().toString());
					respLoc.getPositionPoints().add(reqPos);
				}

				for (WorkOrderWorkTasks moTasks : moWorkOrder
						.getWorkOrderWorkTaskses()) {
					WorkTask respWorkTask = new WorkTask();
					respWorkOrder.getWorkTasks().add(respWorkTask);
					com.sixthc.hbm.WorkTask moWorkTask = moTasks.getWorkTask();

					if (moWorkTask.getCrewEta() != null)
						respWorkTask.setCrewETA(DateUtil.getXMLDate(moWorkTask
								.getCrewEta()));
					respWorkTask.setInstruction(moWorkTask.getInstructions());
					respWorkTask.setMRID(moWorkTask.getMrid());
					respWorkTask.setStatusKind(WorkStatusKind2
							.fromValue(moWorkTask.getStatusKind()));
					respWorkTask.setSubject(moWorkTask.getSubject());
					if (moWorkTask.getTaskType() != null) {
						respWorkTask.setTaskKind(WorkTaskKind
								.fromValue(moWorkTask.getTaskType()));
					}

					for (WorkTaskCrews moCrews : moWorkTask
							.getWorkTaskCrewses()) {
						com.sixthc.hbm.Crew moCrew = moCrews.getCrew();
						Crew2 respCrew = new Crew2();
						respWorkTask.getCrews().add(respCrew);

						respCrew.setMRID(moCrew.getMrid());
						for (CrewNames moCrewNames : moCrew.getCrewNameses()) {
							Name2 name = new Name2();
							respCrew.getNames().add(name);
							setCrewNames(moCrewNames, name);
						}

						for (CrewAssets moCrewAssets : moCrew.getCrewAssets()) {
							 Asset moCrewAsset = moCrewAssets.getAsset();
							com.sixthc.cim.get.cxf.WorkAsset respAsset = new com.sixthc.cim.get.cxf.WorkAsset();
							respCrew.getWorkAssets().add(respAsset);
							setWorkAsset(moCrewAsset, respAsset);
						}

						for( CrewContactpersons moContact : moCrew.getContactPersons() ) {
							Contactperson moContactPerson = moContact.getContactperson();
							 CrewMember respMember = new CrewMember();
							respCrew.getCrewMembers().add(respMember);
							Person respPerson = new Person();
							respMember.setPerson(respPerson);
							respPerson.setFirstName(moContactPerson.getFirstname());
							respPerson.setLastName(moContactPerson.getLastname());							
						}

					}

					moWorkTask.getWorkTaskNameses();
					moWorkTask.getWorkTaskIdentifiedObjectses();
					moWorkTask.getWorkTaskOldAssetses();

					for (WorkTaskTimeSchedules moSchedule : moWorkTask
							.getWorkTaskTimeScheduleses()) {
						WorkTimeSchedule2 respSched = new WorkTimeSchedule2();
						respWorkTask.getTimeSchedules().add(respSched);
						respSched.setKind(WorkTimeScheduleKind2
								.fromValue(moSchedule.getTimeSchedule()
										.getType()));
						com.sixthc.cim.get.cxf.WorkTimeSchedule2.ScheduleInterval respSI = new com.sixthc.cim.get.cxf.WorkTimeSchedule2.ScheduleInterval();
						respSched.setScheduleInterval(respSI);
						TimeSchedule moS = moSchedule.getTimeSchedule();
						respSI.setStart(DateUtil.getXMLDate(moS
								.getStartTstamp()));
						respSI.setEnd(DateUtil.getXMLDate(moS.getEndTstamp()));
					}

					for (WorkTaskAssets moAsset : moWorkTask
							.getWorkTaskAssetses()) {

						Asset2 respAsset = new Asset2();
						respWorkTask.getAssets().add(respAsset);
						com.sixthc.hbm.Asset a2 = moAsset.getAsset();
						setAsset(a2, respAsset);
					}
				}
			}

		}

		reply.setResult("OK");
		return resp;
	}
}
