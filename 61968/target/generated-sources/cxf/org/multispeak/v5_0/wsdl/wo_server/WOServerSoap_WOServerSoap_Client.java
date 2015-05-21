
package org.multispeak.v5_0.wsdl.wo_server;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-05-14T11:18:29.973-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class WOServerSoap_WOServerSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.multispeak.org/V5.0/wsdl/WO_Server", "WO_Server");

    private WOServerSoap_WOServerSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WOServer.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WOServer ss = new WOServer(wsdlURL, SERVICE_NAME);
        WOServerSoap port = ss.getWOServerSoap();  
        
        {
        System.out.println("Invoking deleteClearanceInstance...");
        org.multispeak.v5_0.commonarrays.ArrayOfClearanceInstance _deleteClearanceInstance_arrayOfClearanceInstance = null;
        java.lang.String _deleteClearanceInstance_responseURL = "";
        java.lang.String _deleteClearanceInstance_transactionID = "";
        port.deleteClearanceInstance(_deleteClearanceInstance_arrayOfClearanceInstance, _deleteClearanceInstance_responseURL, _deleteClearanceInstance_transactionID);


        }
        {
        System.out.println("Invoking initiateWorkUnassignment...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkUnassignment _initiateWorkUnassignment_arrayOfWorkUnassignment = null;
        javax.xml.datatype.XMLGregorianCalendar _initiateWorkUnassignment_mustChangeBy = null;
        java.lang.String _initiateWorkUnassignment_responseURL = "";
        java.lang.String _initiateWorkUnassignment_transactionID = "";
        port.initiateWorkUnassignment(_initiateWorkUnassignment_arrayOfWorkUnassignment, _initiateWorkUnassignment_mustChangeBy, _initiateWorkUnassignment_responseURL, _initiateWorkUnassignment_transactionID);


        }
        {
        System.out.println("Invoking getWorkItemRefsByBoundsAndWorkStatusCategory...");
        org.multispeak.v5_0.commontypes.BoundingBox _getWorkItemRefsByBoundsAndWorkStatusCategory_boundingBox = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory _getWorkItemRefsByBoundsAndWorkStatusCategory_arrayOfWorkStatusCategory = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemRefsByBoundsAndWorkStatusCategory__return = port.getWorkItemRefsByBoundsAndWorkStatusCategory(_getWorkItemRefsByBoundsAndWorkStatusCategory_boundingBox, _getWorkItemRefsByBoundsAndWorkStatusCategory_arrayOfWorkStatusCategory);
        System.out.println("getWorkItemRefsByBoundsAndWorkStatusCategory.result=" + _getWorkItemRefsByBoundsAndWorkStatusCategory__return);


        }
        {
        System.out.println("Invoking getSupportedWorkTypes...");
        java.lang.String _getSupportedWorkTypes_lastReceived = "";
        org.multispeak.v5_0.commonarrays.ArrayOfWorkType _getSupportedWorkTypes__return = port.getSupportedWorkTypes(_getSupportedWorkTypes_lastReceived);
        System.out.println("getSupportedWorkTypes.result=" + _getSupportedWorkTypes__return);


        }
        {
        System.out.println("Invoking getWorkItemSummaries...");
        java.lang.String _getWorkItemSummaries_lastReceived = "";
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemSummary _getWorkItemSummaries__return = port.getWorkItemSummaries(_getWorkItemSummaries_lastReceived);
        System.out.println("getWorkItemSummaries.result=" + _getWorkItemSummaries__return);


        }
        {
        System.out.println("Invoking getWorkItemsByWorkItemRefs...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemsByWorkItemRefs_arrayOfWorkItemRef = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItem _getWorkItemsByWorkItemRefs__return = port.getWorkItemsByWorkItemRefs(_getWorkItemsByWorkItemRefs_arrayOfWorkItemRef);
        System.out.println("getWorkItemsByWorkItemRefs.result=" + _getWorkItemsByWorkItemRefs__return);


        }
        {
        System.out.println("Invoking pingURL...");
        port.pingURL();


        }
        {
        System.out.println("Invoking getMethods...");
        org.multispeak.v5_0.commonarrays.ArrayOfString _getMethods__return = port.getMethods();
        System.out.println("getMethods.result=" + _getMethods__return);


        }
        {
        System.out.println("Invoking initiateWorkItemsDeletion...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemDeletionRequest _initiateWorkItemsDeletion_arrayOfWorkItemDeletionRequest = null;
        java.lang.String _initiateWorkItemsDeletion_responseURL = "";
        java.lang.String _initiateWorkItemsDeletion_transactionID = "";
        org.multispeak.v5.ExpirationTime _initiateWorkItemsDeletion_expirationTime = null;
        port.initiateWorkItemsDeletion(_initiateWorkItemsDeletion_arrayOfWorkItemDeletionRequest, _initiateWorkItemsDeletion_responseURL, _initiateWorkItemsDeletion_transactionID, _initiateWorkItemsDeletion_expirationTime);


        }
        {
        System.out.println("Invoking getWorkItemRefsByResourceIDsAndWorkStatusCategory...");
        org.multispeak.v5_0.commonarrays.ArrayOfObjectID _getWorkItemRefsByResourceIDsAndWorkStatusCategory_arrayOfObjectID = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory _getWorkItemRefsByResourceIDsAndWorkStatusCategory_arrayOfWorkStatusCategory = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemRefsByResourceIDsAndWorkStatusCategory__return = port.getWorkItemRefsByResourceIDsAndWorkStatusCategory(_getWorkItemRefsByResourceIDsAndWorkStatusCategory_arrayOfObjectID, _getWorkItemRefsByResourceIDsAndWorkStatusCategory_arrayOfWorkStatusCategory);
        System.out.println("getWorkItemRefsByResourceIDsAndWorkStatusCategory.result=" + _getWorkItemRefsByResourceIDsAndWorkStatusCategory__return);


        }
        {
        System.out.println("Invoking unlinkAttachmentsFromObjects...");
        org.multispeak.v5_0.commonarrays.ArrayOfAttachmentUnlinkContainer _unlinkAttachmentsFromObjects_arrayOfAttachmentUnlinkContainer = null;
        port.unlinkAttachmentsFromObjects(_unlinkAttachmentsFromObjects_arrayOfAttachmentUnlinkContainer);


        }
        {
        System.out.println("Invoking initiateClearanceTagRequestByTaggedDeviceIDs...");
        org.multispeak.v5_0.commonarrays.ArrayOfTaggedDeviceRef _initiateClearanceTagRequestByTaggedDeviceIDs_arrayOfTaggedDeviceRef = null;
        java.lang.String _initiateClearanceTagRequestByTaggedDeviceIDs_responseURL = "";
        java.lang.String _initiateClearanceTagRequestByTaggedDeviceIDs_transactionID = "";
        port.initiateClearanceTagRequestByTaggedDeviceIDs(_initiateClearanceTagRequestByTaggedDeviceIDs_arrayOfTaggedDeviceRef, _initiateClearanceTagRequestByTaggedDeviceIDs_responseURL, _initiateClearanceTagRequestByTaggedDeviceIDs_transactionID);


        }
        {
        System.out.println("Invoking initiateClearanceInstanceRequest...");
        org.multispeak.v5_0.commonarrays.ArrayOfClearanceInstanceRequest _initiateClearanceInstanceRequest_arrayOfClearanceInstanceRequest = null;
        java.lang.String _initiateClearanceInstanceRequest_responseURL = "";
        java.lang.String _initiateClearanceInstanceRequest_transactionID = "";
        port.initiateClearanceInstanceRequest(_initiateClearanceInstanceRequest_arrayOfClearanceInstanceRequest, _initiateClearanceInstanceRequest_responseURL, _initiateClearanceInstanceRequest_transactionID);


        }
        {
        System.out.println("Invoking initiateWorkScheduleDeletion...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _initiateWorkScheduleDeletion_arrayOfWorkItemRef = null;
        javax.xml.datatype.XMLGregorianCalendar _initiateWorkScheduleDeletion_mustChangeBy = null;
        java.lang.String _initiateWorkScheduleDeletion_responseURL = "";
        java.lang.String _initiateWorkScheduleDeletion_transactionID = "";
        port.initiateWorkScheduleDeletion(_initiateWorkScheduleDeletion_arrayOfWorkItemRef, _initiateWorkScheduleDeletion_mustChangeBy, _initiateWorkScheduleDeletion_responseURL, _initiateWorkScheduleDeletion_transactionID);


        }
        {
        System.out.println("Invoking getWorkItemRefsByScheduleDateAndWorkStatusCategory...");
        org.multispeak.v5_0.commonarrays.ArrayOfScheduleDate _getWorkItemRefsByScheduleDateAndWorkStatusCategory_arrayOfScheduleDate = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory _getWorkItemRefsByScheduleDateAndWorkStatusCategory_arrayOfWorkStatusCategory = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemRefsByScheduleDateAndWorkStatusCategory__return = port.getWorkItemRefsByScheduleDateAndWorkStatusCategory(_getWorkItemRefsByScheduleDateAndWorkStatusCategory_arrayOfScheduleDate, _getWorkItemRefsByScheduleDateAndWorkStatusCategory_arrayOfWorkStatusCategory);
        System.out.println("getWorkItemRefsByScheduleDateAndWorkStatusCategory.result=" + _getWorkItemRefsByScheduleDateAndWorkStatusCategory__return);


        }
        {
        System.out.println("Invoking getWorkHistoriesByWorkItemRefs...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkHistoriesByWorkItemRefs_arrayOfWorkItemRef = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkHistoryReferable _getWorkHistoriesByWorkItemRefs__return = port.getWorkHistoriesByWorkItemRefs(_getWorkHistoriesByWorkItemRefs_arrayOfWorkItemRef);
        System.out.println("getWorkHistoriesByWorkItemRefs.result=" + _getWorkHistoriesByWorkItemRefs__return);


        }
        {
        System.out.println("Invoking getDomainNames...");
        org.multispeak.v5_0.commonarrays.ArrayOfString _getDomainNames__return = port.getDomainNames();
        System.out.println("getDomainNames.result=" + _getDomainNames__return);


        }
        {
        System.out.println("Invoking linkAttachmentsToObjects...");
        org.multispeak.v5_0.commonarrays.ArrayOfAttachmentContainer _linkAttachmentsToObjects_arrayOfAttachmentContainer = null;
        port.linkAttachmentsToObjects(_linkAttachmentsToObjects_arrayOfAttachmentContainer);


        }
        {
        System.out.println("Invoking getWorkItemSummariesByWorkItemRefs...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemSummariesByWorkItemRefs_arrayOfWorkItemRef = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemSummary _getWorkItemSummariesByWorkItemRefs__return = port.getWorkItemSummariesByWorkItemRefs(_getWorkItemSummariesByWorkItemRefs_arrayOfWorkItemRef);
        System.out.println("getWorkItemSummariesByWorkItemRefs.result=" + _getWorkItemSummariesByWorkItemRefs__return);


        }
        {
        System.out.println("Invoking initiateWorkAssignmentChanges...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkAssignmentChange _initiateWorkAssignmentChanges_arrayOfWorkAssignmentChange = null;
        javax.xml.datatype.XMLGregorianCalendar _initiateWorkAssignmentChanges_mustChangeBy = null;
        java.lang.String _initiateWorkAssignmentChanges_responseURL = "";
        java.lang.String _initiateWorkAssignmentChanges_transactionID = "";
        port.initiateWorkAssignmentChanges(_initiateWorkAssignmentChanges_arrayOfWorkAssignmentChange, _initiateWorkAssignmentChanges_mustChangeBy, _initiateWorkAssignmentChanges_responseURL, _initiateWorkAssignmentChanges_transactionID);


        }
        {
        System.out.println("Invoking getAttachmentsByObjectRefs...");
        org.multispeak.v5_0.commonarrays.ArrayOfObjectRef _getAttachmentsByObjectRefs_arrayOfObjectRef = null;
        org.multispeak.v5_0.commonarrays.ArrayOfAttachment _getAttachmentsByObjectRefs__return = port.getAttachmentsByObjectRefs(_getAttachmentsByObjectRefs_arrayOfObjectRef);
        System.out.println("getAttachmentsByObjectRefs.result=" + _getAttachmentsByObjectRefs__return);


        }
        {
        System.out.println("Invoking getWorkRequestStatuses...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkRequestRef _getWorkRequestStatuses_arrayOfWorkRequestRef = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkRequestStatusReferable _getWorkRequestStatuses__return = port.getWorkRequestStatuses(_getWorkRequestStatuses_arrayOfWorkRequestRef);
        System.out.println("getWorkRequestStatuses.result=" + _getWorkRequestStatuses__return);


        }
        {
        System.out.println("Invoking getWorkItemRefsByWorkStatusCodes...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCode _getWorkItemRefsByWorkStatusCodes_arrayOfWorkStatusCode = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemRefsByWorkStatusCodes__return = port.getWorkItemRefsByWorkStatusCodes(_getWorkItemRefsByWorkStatusCodes_arrayOfWorkStatusCode);
        System.out.println("getWorkItemRefsByWorkStatusCodes.result=" + _getWorkItemRefsByWorkStatusCodes__return);


        }
        {
        System.out.println("Invoking getClearanceTagsByTaggedDeviceIDs...");
        org.multispeak.v5_0.commonarrays.ArrayOfTaggedDeviceRef _getClearanceTagsByTaggedDeviceIDs_arrayOfTaggedDeviceRef = null;
        org.multispeak.v5_0.commonarrays.ArrayOfClearanceTag _getClearanceTagsByTaggedDeviceIDs__return = port.getClearanceTagsByTaggedDeviceIDs(_getClearanceTagsByTaggedDeviceIDs_arrayOfTaggedDeviceRef);
        System.out.println("getClearanceTagsByTaggedDeviceIDs.result=" + _getClearanceTagsByTaggedDeviceIDs__return);


        }
        {
        System.out.println("Invoking getActiveWorkItemSummaries...");
        java.lang.String _getActiveWorkItemSummaries_lastReceived = "";
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemSummary _getActiveWorkItemSummaries__return = port.getActiveWorkItemSummaries(_getActiveWorkItemSummaries_lastReceived);
        System.out.println("getActiveWorkItemSummaries.result=" + _getActiveWorkItemSummaries__return);


        }
        {
        System.out.println("Invoking initiateWorkScheduleChanges...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkScheduleChange _initiateWorkScheduleChanges_arrayOfWorkScheduleChange = null;
        javax.xml.datatype.XMLGregorianCalendar _initiateWorkScheduleChanges_mustChangeBy = null;
        java.lang.String _initiateWorkScheduleChanges_responseURL = "";
        java.lang.String _initiateWorkScheduleChanges_transactionID = "";
        port.initiateWorkScheduleChanges(_initiateWorkScheduleChanges_arrayOfWorkScheduleChange, _initiateWorkScheduleChanges_mustChangeBy, _initiateWorkScheduleChanges_responseURL, _initiateWorkScheduleChanges_transactionID);


        }
        {
        System.out.println("Invoking initiateWorkRequest...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkRequest _initiateWorkRequest_arrayOfWorkRequest = null;
        java.lang.String _initiateWorkRequest_responseURL = "";
        java.lang.String _initiateWorkRequest_transactionID = "";
        org.multispeak.v5.ExpirationTime _initiateWorkRequest_expirationTime = null;
        port.initiateWorkRequest(_initiateWorkRequest_arrayOfWorkRequest, _initiateWorkRequest_responseURL, _initiateWorkRequest_transactionID, _initiateWorkRequest_expirationTime);


        }
        {
        System.out.println("Invoking getWorkItemRefsByWorkTypesAndWorkStatusCategory...");
        org.multispeak.v5_0.commonarrays.ArrayOfWorkType _getWorkItemRefsByWorkTypesAndWorkStatusCategory_arrayOfWorkType = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkStatusCategory _getWorkItemRefsByWorkTypesAndWorkStatusCategory_arrayOfWorkStatusCategory = null;
        org.multispeak.v5_0.commonarrays.ArrayOfWorkItemRef _getWorkItemRefsByWorkTypesAndWorkStatusCategory__return = port.getWorkItemRefsByWorkTypesAndWorkStatusCategory(_getWorkItemRefsByWorkTypesAndWorkStatusCategory_arrayOfWorkType, _getWorkItemRefsByWorkTypesAndWorkStatusCategory_arrayOfWorkStatusCategory);
        System.out.println("getWorkItemRefsByWorkTypesAndWorkStatusCategory.result=" + _getWorkItemRefsByWorkTypesAndWorkStatusCategory__return);


        }
        {
        System.out.println("Invoking getDomainMembers...");
        java.lang.String _getDomainMembers_domainName = "";
        org.multispeak.v5_0.commonarrays.ArrayOfDomainMember _getDomainMembers__return = port.getDomainMembers(_getDomainMembers_domainName);
        System.out.println("getDomainMembers.result=" + _getDomainMembers__return);


        }

        System.exit(0);
    }

}
