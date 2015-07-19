package org.multispeak.version_3_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T12:13:39.140-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://www.multispeak.org/Version_3.0", name = "OA_ODSoap")
@XmlSeeAlso({org.multispeak.version_3.ObjectFactory.class})
public interface OAODSoap {

    /**
     * Returns the outageEventIDs for all active outage events.  The outageEventID is the objectID of an outageEvent.(Optional)
     */
    @WebResult(name = "GetActiveOutagesResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetActiveOutages", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetActiveOutages")
    @WebMethod(operationName = "GetActiveOutages", action = "http://www.multispeak.org/Version_3.0/GetActiveOutages")
    @ResponseWrapper(localName = "GetActiveOutagesResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetActiveOutagesResponse")
    public org.multispeak.version_3.ArrayOfString getActiveOutages();

    /**
     * Returns all circuit elements. The calling parameter lastReceived is included so that large sets of data can be returned in manageable blocks.  lastReceived should carry an empty string the first time in a session that this method is invoked.  When multiple calls to this method are required to obtain all of the data, the lastReceived should carry the objectID of the last data instance received in subsequent calls. (Optional)
     */
    @WebResult(name = "GetAllCircuitElementsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetAllCircuitElements", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetAllCircuitElements")
    @WebMethod(operationName = "GetAllCircuitElements", action = "http://www.multispeak.org/Version_3.0/GetAllCircuitElements")
    @ResponseWrapper(localName = "GetAllCircuitElementsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetAllCircuitElementsResponse")
    public org.multispeak.version_3.ArrayOfCircuitElement getAllCircuitElements(
        @WebParam(name = "lastReceived", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String lastReceived
    );

    /**
     * Returns circuit elements in the shortest route to source from the given line section or node (eaLoc). (Optional)
     */
    @WebResult(name = "GetUplineCircuitElementsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetUplineCircuitElements", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetUplineCircuitElements")
    @WebMethod(operationName = "GetUplineCircuitElements", action = "http://www.multispeak.org/Version_3.0/GetUplineCircuitElements")
    @ResponseWrapper(localName = "GetUplineCircuitElementsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetUplineCircuitElementsResponse")
    public org.multispeak.version_3.ArrayOfCircuitElement getUplineCircuitElements(
        @WebParam(name = "eaLoc", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String eaLoc
    );

    /**
     * Returns the current status of an outage event, given the outage event ID.  The outageEventID is the objectID of an outageEvent obtained earlier by calling GetActiveOutages.(Optional)
     */
    @WebResult(name = "GetOutageEventStatusResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetOutageEventStatus", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetOutageEventStatus")
    @WebMethod(operationName = "GetOutageEventStatus", action = "http://www.multispeak.org/Version_3.0/GetOutageEventStatus")
    @ResponseWrapper(localName = "GetOutageEventStatusResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetOutageEventStatusResponse")
    public org.multispeak.version_3.OutageEventStatus getOutageEventStatus(
        @WebParam(name = "outageEventID", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String outageEventID
    );

    /**
     * Returns the meter connectivity for all meters on the same transformer as the given meter number. (Optional)
     */
    @WebResult(name = "GetSiblingMeterConnectivityResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetSiblingMeterConnectivity", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetSiblingMeterConnectivity")
    @WebMethod(operationName = "GetSiblingMeterConnectivity", action = "http://www.multispeak.org/Version_3.0/GetSiblingMeterConnectivity")
    @ResponseWrapper(localName = "GetSiblingMeterConnectivityResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetSiblingMeterConnectivityResponse")
    public org.multispeak.version_3.ArrayOfMeterConnectivity getSiblingMeterConnectivity(
        @WebParam(name = "meterNo", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String meterNo
    );

    /**
     * Returns circuit elements immediately fed by the given line section or node (eaLoc). (Optional)
     */
    @WebResult(name = "GetChildCircuitElementsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetChildCircuitElements", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetChildCircuitElements")
    @WebMethod(operationName = "GetChildCircuitElements", action = "http://www.multispeak.org/Version_3.0/GetChildCircuitElements")
    @ResponseWrapper(localName = "GetChildCircuitElementsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetChildCircuitElementsResponse")
    public org.multispeak.version_3.ArrayOfCircuitElement getChildCircuitElements(
        @WebParam(name = "eaLoc", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String eaLoc
    );

    /**
     * OD requests list of methods supported by OA. (Required)
     */
    @WebResult(name = "GetMethodsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetMethods", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetMethods")
    @WebMethod(operationName = "GetMethods", action = "http://www.multispeak.org/Version_3.0/GetMethods")
    @ResponseWrapper(localName = "GetMethodsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetMethodsResponse")
    public org.multispeak.version_3.ArrayOfString getMethods();

    /**
     * Returns all substation names.(Optional)
     */
    @WebResult(name = "GetSubstationNamesResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetSubstationNames", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetSubstationNames")
    @WebMethod(operationName = "GetSubstationNames", action = "http://www.multispeak.org/Version_3.0/GetSubstationNames")
    @ResponseWrapper(localName = "GetSubstationNamesResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetSubstationNamesResponse")
    public org.multispeak.version_3.ArrayOfString getSubstationNames();

    /**
     * Returns all circuit elements fed by a given line section or node (eaLoc).   The calling parameter lastReceived is included so that large sets of data can be returned in manageable blocks.  lastReceived should carry an empty string the first time in a session that this method is invoked.  When multiple calls to this method are required to obtain all of the data, the lastReceived should carry the objectID of the last data instance received in subsequent calls.(Optional)
     */
    @WebResult(name = "GetDownlineCircuitElementsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetDownlineCircuitElements", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDownlineCircuitElements")
    @WebMethod(operationName = "GetDownlineCircuitElements", action = "http://www.multispeak.org/Version_3.0/GetDownlineCircuitElements")
    @ResponseWrapper(localName = "GetDownlineCircuitElementsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDownlineCircuitElementsResponse")
    public org.multispeak.version_3.ArrayOfCircuitElement getDownlineCircuitElements(
        @WebParam(name = "eaLoc", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String eaLoc,
        @WebParam(name = "lastReceived", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String lastReceived
    );

    /**
     * Returns all circuit elements that have been modified since the previous session identified. The calling parameter previousSessionID should carry the session identifier for the last session of data that the client has successfully received.  The calling parameter lastReceived is included so that large sets of data can be returned in manageable blocks.  lastReceived should carry an empty string the first time in a session that this method is invoked.  When multiple calls to this method are required to obtain all of the data, lastReceived should carry the objectID of the last data instance received in subsequent calls. (Optional)
     */
    @WebResult(name = "GetModifiedCircuitElementsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetModifiedCircuitElements", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetModifiedCircuitElements")
    @WebMethod(operationName = "GetModifiedCircuitElements", action = "http://www.multispeak.org/Version_3.0/GetModifiedCircuitElements")
    @ResponseWrapper(localName = "GetModifiedCircuitElementsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetModifiedCircuitElementsResponse")
    public org.multispeak.version_3.ArrayOfCircuitElement getModifiedCircuitElements(
        @WebParam(name = "previousSessionID", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String previousSessionID,
        @WebParam(name = "lastReceived", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String lastReceived
    );

    /**
     * Returns the meter connectivity for all meters downline from a given meterNo. (Optional)
     */
    @WebResult(name = "GetDownlineMeterConnectivityResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetDownlineMeterConnectivity", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDownlineMeterConnectivity")
    @WebMethod(operationName = "GetDownlineMeterConnectivity", action = "http://www.multispeak.org/Version_3.0/GetDownlineMeterConnectivity")
    @ResponseWrapper(localName = "GetDownlineMeterConnectivityResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDownlineMeterConnectivityResponse")
    public org.multispeak.version_3.ArrayOfMeterConnectivity getDownlineMeterConnectivity(
        @WebParam(name = "meterNo", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String meterNo
    );

    /**
     * Returns circuit elements immediately upstream of the given line section or node (eaLoc). (Optional)
     */
    @WebResult(name = "GetParentCircuitElementsResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetParentCircuitElements", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetParentCircuitElements")
    @WebMethod(operationName = "GetParentCircuitElements", action = "http://www.multispeak.org/Version_3.0/GetParentCircuitElements")
    @ResponseWrapper(localName = "GetParentCircuitElementsResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetParentCircuitElementsResponse")
    public org.multispeak.version_3.ArrayOfCircuitElement getParentCircuitElements(
        @WebParam(name = "eaLoc", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String eaLoc
    );

    /**
     * OD Notifies OA of a change in OutageDetectionDevice by sending an array of changed OutageDetectionDevice objects.  OA returns information about failed transactions using an array of errorObjects.(Optional)
     */
    @WebResult(name = "ODDeviceChangedNotificationResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "ODDeviceChangedNotification", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.ODDeviceChangedNotification")
    @WebMethod(operationName = "ODDeviceChangedNotification", action = "http://www.multispeak.org/Version_3.0/ODDeviceChangedNotification")
    @ResponseWrapper(localName = "ODDeviceChangedNotificationResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.ODDeviceChangedNotificationResponse")
    public org.multispeak.version_3.ArrayOfErrorObject odDeviceChangedNotification(
        @WebParam(name = "ODDevices", targetNamespace = "http://www.multispeak.org/Version_3.0")
        org.multispeak.version_3.ArrayOfOutageDetectionDevice odDevices
    );

    /**
     * Finds the first upline distribution transformer from a given meter number and returns the meter connectivity for all meters cnnected to it. (Optional)
     */
    @WebResult(name = "GetUplineMeterConnectivityResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetUplineMeterConnectivity", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetUplineMeterConnectivity")
    @WebMethod(operationName = "GetUplineMeterConnectivity", action = "http://www.multispeak.org/Version_3.0/GetUplineMeterConnectivity")
    @ResponseWrapper(localName = "GetUplineMeterConnectivityResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetUplineMeterConnectivityResponse")
    public org.multispeak.version_3.ArrayOfMeterConnectivity getUplineMeterConnectivity(
        @WebParam(name = "meterNo", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String meterNo
    );

    /**
     * Returns the current status of an outage event, given the outage location.  The outageLocation object includes the telephone number, service locationID, account number and/or meter number at the location of the outage.(Optional)
     */
    @WebResult(name = "GetOutageEventStatusByOutageLocationResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetOutageEventStatusByOutageLocation", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetOutageEventStatusByOutageLocation")
    @WebMethod(operationName = "GetOutageEventStatusByOutageLocation", action = "http://www.multispeak.org/Version_3.0/GetOutageEventStatusByOutageLocation")
    @ResponseWrapper(localName = "GetOutageEventStatusByOutageLocationResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetOutageEventStatusByOutageLocationResponse")
    public org.multispeak.version_3.OutageEventStatus getOutageEventStatusByOutageLocation(
        @WebParam(name = "location", targetNamespace = "http://www.multispeak.org/Version_3.0")
        org.multispeak.version_3.OutageLocation location
    );

    /**
     * The client requests from the server the members of a specific domain of information, identified by the domainName parameter, which are supported by the server.  This method is used, along with the GetDomainNames method to enable systems to exchange information about application-specific or installation-specific lists of information, such as the lists of counties for this installation or the list of serviceStatusCodes used by the server. (Optional)
     */
    @WebResult(name = "GetDomainMembersResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetDomainMembers", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDomainMembers")
    @WebMethod(operationName = "GetDomainMembers", action = "http://www.multispeak.org/Version_3.0/GetDomainMembers")
    @ResponseWrapper(localName = "GetDomainMembersResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDomainMembersResponse")
    public org.multispeak.version_3.ArrayOfDomainMember getDomainMembers(
        @WebParam(name = "domainName", targetNamespace = "http://www.multispeak.org/Version_3.0")
        java.lang.String domainName
    );

    /**
     * OD pings URL of OA to see if it is alive.  Returns errorObject(s) as necessary to communicate application status. (Required)
     */
    @WebResult(name = "PingURLResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "PingURL", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.PingURL")
    @WebMethod(operationName = "PingURL", action = "http://www.multispeak.org/Version_3.0/PingURL")
    @ResponseWrapper(localName = "PingURLResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.PingURLResponse")
    public org.multispeak.version_3.ArrayOfErrorObject pingURL();

    /**
     * OD Notifies OA of a change in OutageDetectionEvents by sending an array of changed OutageDetectionEvent objects.  OA returns information about failed transactions using an array of errorObjects.(Recommended)
     */
    @WebResult(name = "ODEventNotificationResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "ODEventNotification", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.ODEventNotification")
    @WebMethod(operationName = "ODEventNotification", action = "http://www.multispeak.org/Version_3.0/ODEventNotification")
    @ResponseWrapper(localName = "ODEventNotificationResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.ODEventNotificationResponse")
    public org.multispeak.version_3.ArrayOfErrorObject odEventNotification(
        @WebParam(name = "ODEvents", targetNamespace = "http://www.multispeak.org/Version_3.0")
        org.multispeak.version_3.ArrayOfOutageDetectionEvent odEvents
    );

    /**
     * The client requests from the server a list of names of domains supported by the server.  This method is used, along with the GetDomainMembers method to enable systems to exchange information about application-specific or installation-specific lists of information, such as the lists of counties for this installation or the list of serviceStatusCodes used by the server. (Optional)
     */
    @WebResult(name = "GetDomainNamesResult", targetNamespace = "http://www.multispeak.org/Version_3.0")
    @RequestWrapper(localName = "GetDomainNames", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDomainNames")
    @WebMethod(operationName = "GetDomainNames", action = "http://www.multispeak.org/Version_3.0/GetDomainNames")
    @ResponseWrapper(localName = "GetDomainNamesResponse", targetNamespace = "http://www.multispeak.org/Version_3.0", className = "org.multispeak.version_3.GetDomainNamesResponse")
    public org.multispeak.version_3.ArrayOfString getDomainNames();
}
