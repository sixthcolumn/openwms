package com.sixthc.cim.deleteMaintenanceOrders.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-08-21T16:21:53.065-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2015/ExecuteMaintenanceOrders", name = "MaintenanceOrders_Port")
@XmlSeeAlso({com.sixthc.cim.deleteMaintenanceOrders.ObjectFactory.class, ObjectFactory.class})
public interface MaintenanceOrdersPort {

    @RequestWrapper(localName = "ChangeMaintenanceOrders", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersRequestMessageType")
    @WebMethod(operationName = "ChangeMaintenanceOrders", action = "http://iec.ch/TC57/2015/MaintenanceOrders/ChangeMaintenanceOrders")
    @ResponseWrapper(localName = "MaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersResponseMessageType")
    public void changeMaintenanceOrders(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        com.sixthc.cim.deleteMaintenanceOrders.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<MaintenanceOrdersPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeleteMaintenanceOrders", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersRequestMessageType")
    @WebMethod(operationName = "DeleteMaintenanceOrders", action = "http://iec.ch/TC57/2015/MaintenanceOrders/DeleteMaintenanceOrders")
    @ResponseWrapper(localName = "MaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersResponseMessageType")
    public void deleteMaintenanceOrders(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        com.sixthc.cim.deleteMaintenanceOrders.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<MaintenanceOrdersPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.ReplyType> reply
    ) throws FaultMessage;
}
