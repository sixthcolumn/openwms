package com.sixthc.cim.createServiceOrders.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-08-21T16:21:52.518-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://iec.ch/TC57/2015/ExecuteServiceOrders", name = "ServiceOrders_Port")
@XmlSeeAlso({com.sixthc.cim.createServiceOrders.ObjectFactory.class, ObjectFactory.class})
public interface ServiceOrdersPort {

    @RequestWrapper(localName = "CreateServiceOrders", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", className = "com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersRequestMessageType")
    @WebMethod(operationName = "CreateServiceOrders", action = "http://iec.ch/TC57/2015/ServiceOrders/CreateServiceOrders")
    @ResponseWrapper(localName = "ServiceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", className = "com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersResponseMessageType")
    public void createServiceOrders(
        @WebParam(mode = WebParam.Mode.INOUT, name = "Header", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage")
        com.sixthc.cim.createServiceOrders.RequestType request,
        @WebParam(mode = WebParam.Mode.INOUT, name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage")
        javax.xml.ws.Holder<ServiceOrdersPayloadType> payload,
        @WebParam(mode = WebParam.Mode.OUT, name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage")
        javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.ReplyType> reply
    ) throws FaultMessage;
}