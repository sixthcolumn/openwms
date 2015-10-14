
package com.sixthc.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import ch.iec.tc57._2015.getmaintenanceordersmessage.GetMaintenanceOrdersRequestMessageType;
import ch.iec.tc57._2015.getmaintenanceordersmessage.GetMaintenanceOrdersResponseMessageType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetMaintenanceOrders_Port", targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrders")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ch.iec.tc57._2011.schema.message.ObjectFactory.class,
    ch.iec.tc57._2015.getmaintenanceorders.ObjectFactory.class,
    ch.iec.tc57._2015.maintenanceorders.ObjectFactory.class,
    ch.iec.tc57._2015.getmaintenanceordersmessage.ObjectFactory.class
})
public interface GetMaintenanceOrdersPort {


    /**
     * 
     * @param getMaintenanceOrdersRequestMessage
     * @return
     *     returns ch.iec.tc57._2015.getmaintenanceordersmessage.GetMaintenanceOrdersResponseMessageType
     * @throws GetMaintenanceOrdersFaultMessage
     */
    @WebMethod(operationName = "GetMaintenanceOrders", action = "http://iec.ch/TC57/2015/GetMaintenanceOrders/GetMaintenanceOrders")
    @WebResult(name = "GetMaintenanceOrdersResponseMessage", targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", partName = "GetMaintenanceOrdersResponseMessage")
    public GetMaintenanceOrdersResponseMessageType getMaintenanceOrders(
        @WebParam(name = "GetMaintenanceOrdersRequestMessage", targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", partName = "GetMaintenanceOrdersRequestMessage")
        GetMaintenanceOrdersRequestMessageType getMaintenanceOrdersRequestMessage)
        throws GetMaintenanceOrdersFaultMessage
    ;

}
