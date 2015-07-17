
package com.sixthc.request;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T11:34:02.340-04:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "FaultMessage", targetNamespace = "http://www.iec.ch/TC57/2011/schema/message")
public class FaultMessage extends Exception {
    
    private ch.iec.tc57._2011.schema.message.FaultMessageType faultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, ch.iec.tc57._2011.schema.message.FaultMessageType faultMessage) {
        super(message);
        this.faultMessage = faultMessage;
    }

    public FaultMessage(String message, ch.iec.tc57._2011.schema.message.FaultMessageType faultMessage, Throwable cause) {
        super(message, cause);
        this.faultMessage = faultMessage;
    }

    public ch.iec.tc57._2011.schema.message.FaultMessageType getFaultInfo() {
        return this.faultMessage;
    }
}
