
package com.sixthc.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.ReplyType;
import ch.iec.tc57._2011.schema.message.RequestType;
import ch.iec.tc57._2015.serviceordersmessage.ServiceOrdersPayloadType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceOrders_Port", targetNamespace = "http://iec.ch/TC57/2015/ExecuteServiceOrders")
@XmlSeeAlso({
    ch.iec.tc57._2015.serviceorders.ObjectFactory.class,
    ch.iec.tc57._2011.schema.message.ObjectFactory.class,
    ch.iec.tc57._2015.serviceordersmessage.ObjectFactory.class
})
public interface ServiceOrdersPort {


    /**
     * 
     * @param request
     * @param reply
     * @param payload
     * @param header
     * @throws FaultMessage
     */
    @WebMethod(operationName = "CreateServiceOrders", action = "http://iec.ch/TC57/2015/ServiceOrders/CreateServiceOrders")
    @RequestWrapper(localName = "CreateServiceOrders", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", className = "ch.iec.tc57._2015.serviceordersmessage.ServiceOrdersRequestMessageType")
    @ResponseWrapper(localName = "ServiceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", className = "ch.iec.tc57._2015.serviceordersmessage.ServiceOrdersResponseMessageType")
    public void createServiceOrders(
        @WebParam(name = "Header", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", mode = WebParam.Mode.INOUT)
        Holder<HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage")
        RequestType request,
        @WebParam(name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", mode = WebParam.Mode.INOUT)
        Holder<ServiceOrdersPayloadType> payload,
        @WebParam(name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/ServiceOrdersMessage", mode = WebParam.Mode.OUT)
        Holder<ReplyType> reply)
        throws FaultMessage
    ;

}