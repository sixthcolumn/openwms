
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
import ch.iec.tc57._2015.maintenanceordersmessage.MaintenanceOrdersPayloadType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MaintenanceOrders_Port", targetNamespace = "http://iec.ch/TC57/2015/ExecuteMaintenanceOrders")
@XmlSeeAlso({
    ch.iec.tc57._2015.maintenanceorders.ObjectFactory.class,
    ch.iec.tc57._2011.schema.message.ObjectFactory.class,
    ch.iec.tc57._2015.maintenanceordersmessage.ObjectFactory.class
})
public interface MaintenanceOrdersPort {


    /**
     * 
     * @param request
     * @param reply
     * @param payload
     * @param header
     * @throws FaultMessage
     */
    @WebMethod(operationName = "CreateMaintenanceOrders", action = "http://iec.ch/TC57/2015/MaintenanceOrders/CreateMaintenanceOrders")
    @RequestWrapper(localName = "CreateMaintenanceOrders", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "ch.iec.tc57._2015.maintenanceordersmessage.MaintenanceOrdersRequestMessageType")
    @ResponseWrapper(localName = "MaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", className = "ch.iec.tc57._2015.maintenanceordersmessage.MaintenanceOrdersResponseMessageType")
    public void createMaintenanceOrders(
        @WebParam(name = "Header", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", mode = WebParam.Mode.INOUT)
        Holder<HeaderType> header,
        @WebParam(name = "Request", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
        RequestType request,
        @WebParam(name = "Payload", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", mode = WebParam.Mode.INOUT)
        Holder<MaintenanceOrdersPayloadType> payload,
        @WebParam(name = "Reply", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", mode = WebParam.Mode.OUT)
        Holder<ReplyType> reply)
        throws FaultMessage
    ;

}
