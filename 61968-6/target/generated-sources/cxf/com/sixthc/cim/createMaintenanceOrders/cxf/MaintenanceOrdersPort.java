package com.sixthc.cim.createMaintenanceOrders.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-08-21T16:21:51.718-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2015/ExecuteMaintenanceOrders", name = "MaintenanceOrders_Port")
@XmlSeeAlso({com.sixthc.cim.createMaintenanceOrders.ObjectFactory.class, ObjectFactory.class})
public interface MaintenanceOrdersPort {

    @RequestWrapper(localName = "CreateMaintenanceOrders", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.createMaintenanceOrders.cxf.MaintenanceOrdersRequestMessageType")
    @WebMethod(operationName = "CreateMaintenanceOrders", action = "http://iec.ch/TC57/2015/MaintenanceOrders/CreateMaintenanceOrders")
    @ResponseWrapper(localName = "MaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.createMaintenanceOrders.cxf.MaintenanceOrdersResponseMessageType")
    public void createMaintenanceOrders(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        com.sixthc.cim.createMaintenanceOrders.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<MaintenanceOrdersPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.ReplyType> reply
    ) throws FaultMessage;
}