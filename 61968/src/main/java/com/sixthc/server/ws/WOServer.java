package com.sixthc.server.ws;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.multispeak.v5.ExpirationTime;
import org.multispeak.v5.Geometry;
import org.multispeak.v5.LocationContact;
import org.multispeak.v5.MspPerson;
import org.multispeak.v5.RequestingPerson;
import org.multispeak.v5.WorkLocation;
import org.multispeak.v5.WorkRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachment;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentContainer;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentUnlinkContainer;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceInstance;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceInstanceRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfClearanceTag;
import org.multispeak.v5_0.commonarrays.ArrayOfDomainMember;
import org.multispeak.v5_0.commonarrays.ArrayOfObjectID;
import org.multispeak.v5_0.commonarrays.ArrayOfObjectRef;
import org.multispeak.v5_0.commonarrays.ArrayOfScheduleDate;
import org.multispeak.v5_0.commonarrays.ArrayOfString;
import org.multispeak.v5_0.commonarrays.ArrayOfTaggedDeviceRef;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkAssignmentChange;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkHistoryReferable;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItem;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemDeletionRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkItemSummary;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequest;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequestRef;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequestStatusReferable;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkScheduleChange;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCode;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkType;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkUnassignment;
import org.multispeak.v5_0.commontypes.Address;
import org.multispeak.v5_0.commontypes.AddressItem;
import org.multispeak.v5_0.commontypes.BoundingBox;
import org.multispeak.v5_0.commontypes.ContactInfo;
import org.multispeak.v5_0.commontypes.DetailedAddressFields;
import org.multispeak.v5_0.commontypes.EMailAddress;
import org.multispeak.v5_0.commontypes.GMLPolygon;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.commontypes.GPSMetadata;
import org.multispeak.v5_0.commontypes.OtherContactItem;
import org.multispeak.v5_0.commontypes.PhoneNumber;
import org.multispeak.v5_0.commontypes.TelephoneNumber;
import org.multispeak.v5_0.cpsm.IdentifiedObject;
import org.multispeak.v5_0.cpsm.Name;
import org.multispeak.v5_0.cpsm.NameType;
import org.multispeak.v5_0.cpsm.NameTypeAuthority;
import org.multispeak.v5_0.cpsm.Names;
import org.multispeak.v5_0.enumerations.AddressType;
import org.multispeak.v5_0.enumerations.EMailType;
import org.multispeak.v5_0.enumerations.PhoneType;
import org.multispeak.v5_0.gml.CoordType;
import org.multispeak.v5_0.gml.LinearRingType;
import org.multispeak.v5_0.wsdl.wo_server.WOServerSoap;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixthc.dao.WorkOrderDao;
import com.sixthc.hbm.Attachment;
import com.sixthc.hbm.Contactperson;
import com.sixthc.hbm.ContactpersonAddresses;
import com.sixthc.hbm.ContactpersonEmails;
import com.sixthc.hbm.ContactpersonOtherContactinfos;
import com.sixthc.hbm.ContactpersonPhones;
import com.sixthc.hbm.Email;
import com.sixthc.hbm.OtherContactinfo;
import com.sixthc.hbm.Phone;
import com.sixthc.hbm.WorkOrder;
import com.sixthc.hbm.WorkOrderAttachments;
import com.sixthc.util.ImageLoadFileException;
import com.sixthc.util.ImageLoader;

public class WOServer implements WOServerSoap {
	static Logger log = Logger.getLogger(WOServerSoap.class);

	@Autowired
	private WorkOrderDao workOrderDao;

	@Override
	public void deleteClearanceInstance(
			ArrayOfClearanceInstance arrayOfClearanceInstance,
			String responseURL, String transactionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initiateWorkUnassignment(
			ArrayOfWorkUnassignment arrayOfWorkUnassignment,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByBoundsAndWorkStatusCategory(
			BoundingBox boundingBox,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkType getSupportedWorkTypes(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkItemSummary getWorkItemSummaries(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkItem getWorkItemsByWorkItemRefs(
			ArrayOfWorkItemRef arrayOfWorkItemRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pingURL() {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfString getMethods() {
		ArrayOfString methods = new ArrayOfString();
		List<String> list = methods.getTheString();
		list.add("getMethods");
		list.add("pingURL");
		list.add("initiateWorkRequest");
		return methods;
	}

	@Override
	public void initiateWorkItemsDeletion(
			ArrayOfWorkItemDeletionRequest arrayOfWorkItemDeletionRequest,
			String responseURL, String transactionID,
			ExpirationTime expirationTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByResourceIDsAndWorkStatusCategory(
			ArrayOfObjectID arrayOfObjectID,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unlinkAttachmentsFromObjects(
			ArrayOfAttachmentUnlinkContainer arrayOfAttachmentUnlinkContainer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initiateClearanceTagRequestByTaggedDeviceIDs(
			ArrayOfTaggedDeviceRef arrayOfTaggedDeviceRef, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initiateClearanceInstanceRequest(
			ArrayOfClearanceInstanceRequest arrayOfClearanceInstanceRequest,
			String responseURL, String transactionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initiateWorkScheduleDeletion(
			ArrayOfWorkItemRef arrayOfWorkItemRef,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByScheduleDateAndWorkStatusCategory(
			ArrayOfScheduleDate arrayOfScheduleDate,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkHistoryReferable getWorkHistoriesByWorkItemRefs(
			ArrayOfWorkItemRef arrayOfWorkItemRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfString getDomainNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void linkAttachmentsToObjects(
			ArrayOfAttachmentContainer arrayOfAttachmentContainer) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfWorkItemSummary getWorkItemSummariesByWorkItemRefs(
			ArrayOfWorkItemRef arrayOfWorkItemRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initiateWorkAssignmentChanges(
			ArrayOfWorkAssignmentChange arrayOfWorkAssignmentChange,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayOfAttachment getAttachmentsByObjectRefs(
			ArrayOfObjectRef arrayOfObjectRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkRequestStatusReferable getWorkRequestStatuses(
			ArrayOfWorkRequestRef arrayOfWorkRequestRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByWorkStatusCodes(
			ArrayOfWorkStatusCode arrayOfWorkStatusCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfClearanceTag getClearanceTagsByTaggedDeviceIDs(
			ArrayOfTaggedDeviceRef arrayOfTaggedDeviceRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfWorkItemSummary getActiveWorkItemSummaries(String lastReceived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initiateWorkScheduleChanges(
			ArrayOfWorkScheduleChange arrayOfWorkScheduleChange,
			XMLGregorianCalendar mustChangeBy, String responseURL,
			String transactionID) {
		// TODO Auto-generated method stub

	}

	// TODO : This appears more than once in wsdl, what to do?
	private void parseIdentiedObject(IdentifiedObject from,
			com.sixthc.hbm.IdentifiedObject to) {
		if (from != null && to != null) {
			to.setMrid(from.getMRID());
			to.setDescription(from.getDescription());
			Names names = from.getNames(); // TODO : ?
			// bb: identified_object_names table
			if (names != null) {
				for (Name n : names.getName()) {
					n.getNameString();
					n.getDescription();
					NameType nameType = n.getNameType();
					if (nameType != null) {
						nameType.getNameString();
						nameType.getDescription();
						NameTypeAuthority nta = nameType.getNameTypeAuthority();
						if (nta != null) {
							nta.getNameString();
							nta.getDescription();
						}
					}
				}
			}
		}
	}

	private Phone parsePhoneNumber(PhoneNumber pn) {
		Phone p2 = new Phone();
		if (pn != null) {
			TelephoneNumber p = pn.getPhone();
			p2.setAreacode(p.getAreaCode());
			p2.setCitycode(p.getCityCode());
			p2.setCountrycode(p.getCountryCode());
			p2.setLocalnumber(p.getLocalNumber());
			// TODO : Change to string p2.setExtension(p.getExtension());
			PhoneType ptype = pn.getPhoneType();
			ptype.getOtherKind(); // TODO : ?
			// bb: other kind is not mapped in db, just a string for phonetype
			ptype.getValue(); // TODO : ? see above
			BigInteger priority = pn.getPriorityOrder();
			if (priority != null)
				p2.setPriorityorder(priority.intValue());
		}
		return p2;
	}

	private com.sixthc.hbm.Address parseAddress(Address addr) {
		com.sixthc.hbm.Address addr2 = new com.sixthc.hbm.Address();
		if (addr == null)
			return addr2;

		addr2.setSdAddress1(addr.getAddress1());
		addr2.setSdAddress2(addr.getAddress2());
		DetailedAddressFields dafs = addr.getDetailedAddressFields();
		if (dafs != null) {
			addr2.setSdPrefix(dafs.getStreetPrefix());
			addr2.setSdNumber(dafs.getStreetNumber());
			addr2.setSdSuffix(dafs.getStreetSuffix());
			addr2.setSdType(dafs.getStreetType());
			addr2.setSdBuildingName(dafs.getBuildingNumber()); // TODO : Verify
																// bb: correct -
																// msp.buildingNumber
																// =
																// cim.buildingName
			addr2.setSdSuiteNumber(dafs.getSuiteNumber());
			dafs.getAddressGeneral(); // TODO : ? //bb: maps to address11
			addr2.setTdPobox(dafs.getPostOfficeBox());
			addr2.setTdRegion(dafs.getRegion());
		}
		addr2.setTownshipName(addr.getTownCode()); // TODO : ? // bb: cim has no
													// equivalent field, leave
													// null multispeak equiv is
													// msp.worklocation.locationinformation.townshipname
		addr2.setTownshipName(addr.getCity()); // TODO : ? bb: see above
		addr2.setTdStateProvince(addr.getState()); // TODO : ? bb: correct
		addr2.setTdPostalCode(addr.getPostalCode());
		addr2.setTdCountry(addr.getCountry());

		return addr2;
	}

	private void parseAddressType(AddressType at) {
		at.getOtherKind();
		at.getValue();

	}

	private ContactpersonAddresses parseAddressItem(AddressItem ai) {
		ContactpersonAddresses addr2 = new ContactpersonAddresses();
		Address addr = ai.getAddress();
		addr2.setAddress(parseAddress(addr));
		parseAddressType(ai.getAddressType());
		ai.getPriorityOrder();
		return addr2;
	}

	private ContactpersonEmails parseEmail(EMailAddress ea) {
		ContactpersonEmails email = new ContactpersonEmails();
		Email email2 = new Email();
		email.setEmail(email2);
		email2.setEmail(ea.getEMail());
		EMailType eat = ea.getEMailType();
		if (eat != null) {
			eat.getOtherKind(); // TODO : ? bb: use value as type, or just
								// ignore -
			eat.getValue(); // TODO : ?
		}
		BigInteger po = ea.getPriorityOrder();
		if (po != null)
			email2.setPriorityOrder(po.intValue());

		return email;
	}

	private OtherContactinfo parseOther(OtherContactItem oci) {
		OtherContactinfo oci2 = new OtherContactinfo();
		oci2.setDetails(oci.getDetails());
		oci2.setInfoType(oci.getInfoType());
		return oci2;
	}

	// bb: not supporting this - only supporting GMLLocations, mapped into
	// position points
	private void parsePolygon(GMLPolygon gp) {
		Iterator<LinearRingType> iti = gp.getInnerBoundaryIs().iterator();
		// TODO : Need a type in the workpositionpoints for inner, outer?
		// TODO : note below, two level, multiple rings contain coords
		while (iti.hasNext()) {
			LinearRingType lrt = iti.next();
			List<CoordType> coords = lrt.getCoord();
			for (CoordType c : coords) {
				// TODO : missing bulge? bb: ignore
				c.getBulge();
				c.getX();
				c.getY();
				c.getZ();
			}
		}

		// TODO : There is ONE outer ring
		LinearRingType lrt = gp.getOuterBoundaryIs();
		List<CoordType> coords = lrt.getCoord();
		for (CoordType c : coords) {
			// TODO : missing bulge?
			c.getBulge();
			c.getX();
			c.getY();
			c.getZ();
		}
	}
	
	private void parseContact(MspPerson from, Contactperson to) {
		if (from.getPrimaryIdentifier() != null) {
			log.debug("primary identifier : "
					+ from.getPrimaryIdentifier().getIdentifierName());
			to.setPrimaryId(from.getPrimaryIdentifier()
					.getIdentifierName());
		}

		from.getComments(); // TODO : contactperson.comments
		// cp.setSecondaryId(from.getSecondaryIdentifier()
		// .getIdentifierName());
		parseIdentiedObject(from.getIdentifiedObject(),
				to.getIdentifiedObject());

		to.setLastname(from.getLastName());
		log.debug("contact person last name : " + from.getLastName());
		to.setFirstname(from.getFirstName());
		log.debug("contact person first name : " + from.getFirstName());
		to.setMiddle(from.getMiddleName());
		to.setPrefix(from.getPrefix());
		to.setSuffix(from.getSuffix());
		to.setGovernmentid(from.getGovernmentID());

		ContactInfo ci = from.getContactInfo();
		if (ci != null) {

			for (PhoneNumber pn : ci.getPhoneNumbers().getPhoneNumber()) {
				Phone p = parsePhoneNumber(pn);
				ContactpersonPhones phones = new ContactpersonPhones();
				phones.setPhone(p);
				phones.setContactperson(to);
				to.getContactpersonPhoneses().add(phones);
			}

			for (AddressItem ai : ci.getAddressItems().getAddressItem()) {
				ContactpersonAddresses addr = parseAddressItem(ai);
				to.getContactpersonAddresseses().add(addr);
				addr.setContactperson(to);
			}

			for (EMailAddress ea : ci.getEMailAddresses()
					.getEMailAddress()) {
				ContactpersonEmails email = parseEmail(ea);
				to.getContactpersonEmailses().add(email);
				email.setContactperson(to);
			}

			for (OtherContactItem oci : ci.getOtherContactInformation()
					.getOtherContactItem()) {
				ContactpersonOtherContactinfos other = new ContactpersonOtherContactinfos();
				other.setOtherContactinfo(parseOther(oci));
				to.getContactpersonOtherContactinfoses().add(other);
				other.setContactperson(to);
			}
		}


	}


	@Override
	public void initiateWorkRequest(ArrayOfWorkRequest arrayOfWorkRequest,
			String responseURL, String transactionID,
			ExpirationTime expirationTime) {
		log.debug("initiateWorkRequest called");
		List<WorkRequest> a = arrayOfWorkRequest.getWorkRequest();
		boolean imageFileProcessingError = false;
		for (WorkRequest request : a) {
			WorkOrder workOrder = new WorkOrder();
			workOrder.setComments(request.getComments());

			request.getPrimaryIdentifier(); // TODO : add to schema
			request.getSecondaryIdentifier(); // TODO : add schema
			if( request.getWorkTypeRef() != null ) 
				workOrder.setKind(request.getWorkTypeRef().getWorkSubTypeName());


			workOrder.setWorkOrderName(request.getTitle());
			workOrder.setMrid("1234"); // auto-generated by db
			workOrder.setStatus("screwed up"); // no MS equivilent


			// requesting person
			RequestingPerson rp = request.getRequestingPerson();
			if (rp != null) {
				Contactperson cp = new Contactperson();
				workOrder.setContactpersonByRequestContactId(cp);
				
				parseContact(rp, cp);
				cp.setAffiliation(rp.getAffiliation());			
				
				String createdBy = rp.getLastName() + ", " + rp.getFirstName();				
				workOrder.setCreatedBy(createdBy);
			}

			request.getRequestingSystem(); // TODO : not mapped in DB
			workOrder.setDescription(request.getDescription());
			log.debug("setDescription : " + workOrder.getDescription());
			workOrder.setTitle(request.getTitle());

			String workPriority = request.getRequestedWorkPriority();
			try {
				workOrder.setPriorityRank(Integer.parseInt(workPriority));
			} catch (NumberFormatException e) {
				log.error("unable to set priority rank", e);
			}

			// work location
			WorkLocation workLocation = request.getWorkLocation();
			if (workLocation != null) {
				// TODO : Where is address location?
				//
				// GPS Location
				GPSLocation gps = workLocation.getGPSLocation();
				if (gps != null) {
					workOrder.setGpsLatitude((float) gps.getLatitude());
					workOrder.setGpsLongitude((float) gps.getLongitude());
					workOrder.setGpsAltitude((float) gps.getAltitude()
							.floatValue()); // TODO

					// TODO : Below items not supported in schema
//					GPSMetadata gmd = gps.getGPSMetadata();
//					gmd.getEasting();
//					gmd.getNorthing();
//					gmd.getSource();
//					gmd.getNumber();
//					gmd.isIsRealTimeDiffCorrection();
//					gmd.getHdop();
//					gmd.getVdop();
//					gmd.getDiffID();
//					gmd.getCollected();
//					gmd.getNumSat();
					
				}

				// TODO : Where to store Bill?
				Geometry geo = workLocation.getGeometry();
				if (geo != null) {
					for (GMLPolygon gp : geo.getGMLPolygons().getGMLPolygon()) {
						parsePolygon(gp);
					}

				}

				LocationContact contact = workLocation.getLocationContact();
				if (contact != null) {
					Contactperson cp2 = new Contactperson();
					workOrder.setContactpersonByLocationContactId(cp2);
					parseContact(contact, cp2);
				}

			}

			for (org.multispeak.v5.Attachment att : request.getAttachments()
					.getAttachment()) {
				try {
					String file = UUID.randomUUID().toString();
					String uri = att.getContentReference().getURI();

					ImageLoader.getImage(uri, file);

					Attachment attachment = new Attachment();
					attachment.setFilename(file);
					attachment.setType("jpg"); // TODO : Get file suffix
					WorkOrderAttachments woa = new WorkOrderAttachments();
					woa.setAttachment(attachment);
					attachment.setWorkOrderAttachmentses(workOrder
							.getWorkOrderAttachmentses());
					woa.setWorkOrder(workOrder);
					workOrder.getWorkOrderAttachmentses().add(woa);
				} catch (ImageLoadFileException e) {
					log.error(e);
					imageFileProcessingError = true;
				}

			}

			workOrderDao.save(workOrder);
			break;
		}
		if (imageFileProcessingError == true) {
			throw new RuntimeException("Failed to load some attachments");
		}
	}

	@Override
	public ArrayOfWorkItemRef getWorkItemRefsByWorkTypesAndWorkStatusCategory(
			ArrayOfWorkType arrayOfWorkType,
			ArrayOfWorkStatusCategory arrayOfWorkStatusCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayOfDomainMember getDomainMembers(String domainName) {
		// TODO Auto-generated method stub
		return null;
	}

}