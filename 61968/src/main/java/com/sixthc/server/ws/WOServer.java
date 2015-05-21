package com.sixthc.server.ws;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.List;
import java.util.Vector;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.apache.xerces.dom.ElementImpl;
import org.multispeak.v5.Attachment;
import org.multispeak.v5.Attachments;
import org.multispeak.v5.ContentReference;
import org.multispeak.v5.ExpirationTime;
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
import org.multispeak.v5_0.commontypes.BoundingBox;
import org.multispeak.v5_0.wsdl.wo_server.WOServerSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.NodeList;

import com.google.common.io.ByteStreams;
import com.sixthc.dao.WorkOrderDao;
import com.sixthc.model.WorkOrder;
import com.sixthc.model.WorkOrderImage;
import com.sixthc.util.ImageLoadFileException;
import com.sixthc.util.ImageLoader;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

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
	
	private void saveImages(WorkOrder wo) throws ImageLoadFileException {
		List<WorkOrderImage> images = wo.getWorkOrderImages();
		if( images != null )
			for( WorkOrderImage image : images ) {
				ImageLoader.getImage(image.getUrl(), image.getFileName());
			}
	}



//	private List<String> getURLExtensions(
//			org.multispeak.v5_0.commontypes.Extensions extensions) {
//		log.debug("get url extensions");
//		Vector<String> urls = new Vector<String>();
//		if (extensions == null)
//			return urls;
//
//		for (Object images : extensions.getAny()) {
//			NodeList cn = ((ElementImpl) images).getChildNodes();
//			for (int i = 0; i < cn.getLength(); i++) {
//				if (cn.item(i) instanceof ElementImpl) {
//					NodeList url = (NodeList) cn.item(i);
//					if (url != null)
//						for (int j = 0; j < url.getLength(); j++) {
//							log.debug("url : " + url.item(j).getTextContent());
//							urls.add(url.item(j).getTextContent());
//						}
//				}
//			}
//
//		}
//		return urls;
//	}
	
//	private List<String> getAttachments(Attachments attachments) {
//		List<Attachment> atts = attachments.getAttachment();
//		Vector<String> result = new Vector<String>();
//		if( atts != null ) {
//			for( Attachment a : atts ) {
//				ContentReference cr = a.getContentReference();
//				log.debug("content reference value : " + cr.getURI());
//				result.add(cr.getURI());
//			}
//		}
//		return result;
//	}

	@Override
	public void initiateWorkRequest(ArrayOfWorkRequest arrayOfWorkRequest,
			String responseURL, String transactionID,
			ExpirationTime expirationTime) {
		log.debug("initiateWorkRequest called");
		List<WorkRequest> a = arrayOfWorkRequest.getWorkRequest();
		boolean imageFileProcessingError = false;
		for (WorkRequest w : a) {
			WorkOrder wo = new WorkOrder();
			wo.setMessage("test 1");
			wo.setCreateDate(new Timestamp(System.currentTimeMillis()));
			List<WorkOrderImage> images = new Vector<WorkOrderImage>();
			for( Attachment  att : w.getAttachments().getAttachment()) {
				WorkOrderImage woi = new WorkOrderImage(att.getContentReference().getURI());
				try {
					ImageLoader.getImage(woi.getUrl(), woi.getFileName());
				} catch (ImageLoadFileException e) {
					log.error(e);
					woi.setError(e.getMessage());
					imageFileProcessingError = true;
				}
				images.add(woi);
			}
			wo.setWorkOrderImages(images);
			workOrderDao.save(wo);
		}
		if( imageFileProcessingError == true ) {
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
