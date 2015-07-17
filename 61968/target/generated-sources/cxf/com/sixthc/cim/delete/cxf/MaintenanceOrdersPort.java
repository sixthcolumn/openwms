package com.sixthc.cim.delete.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T11:33:51.570-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2015/ExecuteMaintenanceOrders", name = "MaintenanceOrders_Port")
@XmlSeeAlso({ObjectFactory.class})
public interface MaintenanceOrdersPort {

    @RequestWrapper(localName = "ChangeMaintenanceOrders", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.delete.cxf.MaintenanceOrdersRequestMessageType")
    @WebMethod(operationName = "ChangeMaintenanceOrders", action = "http://iec.ch/TC57/2015/MaintenanceOrders/ChangeMaintenanceOrders")
    @ResponseWrapper(localName = "MaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.delete.cxf.MaintenanceOrdersResponseMessageType")
    public void changeMaintenanceOrders(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        com.sixthc.cim.delete.cxf.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<MaintenanceOrdersPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<ReplyType> reply
    ) throws FaultMessage;

    @RequestWrapper(localName = "DeleteMaintenanceOrders", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.delete.cxf.MaintenanceOrdersRequestMessageType")
    @WebMethod(operationName = "DeleteMaintenanceOrders", action = "http://iec.ch/TC57/2015/MaintenanceOrders/DeleteMaintenanceOrders")
    @ResponseWrapper(localName = "MaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "com.sixthc.cim.delete.cxf.MaintenanceOrdersResponseMessageType")
    public void deleteMaintenanceOrders(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        com.sixthc.cim.delete.cxf.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<MaintenanceOrdersPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        javax.xml.ws.Holder<ReplyType> reply
    ) throws FaultMessage;
}
