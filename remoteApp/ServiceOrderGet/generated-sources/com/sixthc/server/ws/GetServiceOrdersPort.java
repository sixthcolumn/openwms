
package com.sixthc.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersRequestMessageType;
import ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersResponseMessageType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetServiceOrders_Port", targetNamespace = "http://iec.ch/TC57/2015/GetServiceOrders")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ch.iec.tc57._2015.serviceorders.ObjectFactory.class,
    ch.iec.tc57._2015.getserviceorders.ObjectFactory.class,
    ch.iec.tc57._2011.schema.message.ObjectFactory.class,
    ch.iec.tc57._2015.getserviceordersmessage.ObjectFactory.class
})
public interface GetServiceOrdersPort {


    /**
     * 
     * @param getServiceOrdersRequestMessage
     * @return
     *     returns ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersResponseMessageType
     * @throws GetServiceOrdersFaultMessage
     */
    @WebMethod(operationName = "GetServiceOrders", action = "http://iec.ch/TC57/2015/GetServiceOrders/GetServiceOrders")
    @WebResult(name = "GetServiceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/GetServiceOrdersMessage", partName = "GetServiceOrdersResponseMessage")
    public GetServiceOrdersResponseMessageType getServiceOrders(
        @WebParam(name = "GetServiceOrdersRequestMessage", targetNamespace = "http://iec.ch/TC57/2015/GetServiceOrdersMessage", partName = "GetServiceOrdersRequestMessage")
        GetServiceOrdersRequestMessageType getServiceOrdersRequestMessage)
        throws GetServiceOrdersFaultMessage
    ;

}
