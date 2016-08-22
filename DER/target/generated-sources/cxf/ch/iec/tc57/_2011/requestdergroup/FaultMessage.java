
package ch.iec.tc57._2011.requestdergroup;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-12-09T08:35:01.300-05:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "DERGroupFaultMessage", targetNamespace = "http://iec.ch/TC57/2011/DERGroupMessage")
public class FaultMessage extends Exception {
    
    private ch.iec.tc57._2011.dergroupmessage.DERGroupFaultMessageType derGroupFaultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, ch.iec.tc57._2011.dergroupmessage.DERGroupFaultMessageType derGroupFaultMessage) {
        super(message);
        this.derGroupFaultMessage = derGroupFaultMessage;
    }

    public FaultMessage(String message, ch.iec.tc57._2011.dergroupmessage.DERGroupFaultMessageType derGroupFaultMessage, Throwable cause) {
        super(message, cause);
        this.derGroupFaultMessage = derGroupFaultMessage;
    }

    public ch.iec.tc57._2011.dergroupmessage.DERGroupFaultMessageType getFaultInfo() {
        return this.derGroupFaultMessage;
    }
}