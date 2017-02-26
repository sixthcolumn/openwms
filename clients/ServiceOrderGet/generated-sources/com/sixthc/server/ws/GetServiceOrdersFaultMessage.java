
package com.sixthc.server.ws;

import javax.xml.ws.WebFault;
import ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersFaultMessageType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GetServiceOrdersFaultMessage", targetNamespace = "http://iec.ch/TC57/2015/GetServiceOrdersMessage")
public class GetServiceOrdersFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetServiceOrdersFaultMessageType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public GetServiceOrdersFaultMessage(String message, GetServiceOrdersFaultMessageType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public GetServiceOrdersFaultMessage(String message, GetServiceOrdersFaultMessageType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ch.iec.tc57._2015.getserviceordersmessage.GetServiceOrdersFaultMessageType
     */
    public GetServiceOrdersFaultMessageType getFaultInfo() {
        return faultInfo;
    }

}