
package ch.iec.tc57._2011.requestdergroupdispatch;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-11-09T13:39:09.776-05:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "DERGroupDispatchFaultMessage", targetNamespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage")
public class FaultMessage extends Exception {
    
    private ch.iec.tc57._2011.dergroupdispatchmessage.DERGroupDispatchFaultMessageType derGroupDispatchFaultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, ch.iec.tc57._2011.dergroupdispatchmessage.DERGroupDispatchFaultMessageType derGroupDispatchFaultMessage) {
        super(message);
        this.derGroupDispatchFaultMessage = derGroupDispatchFaultMessage;
    }

    public FaultMessage(String message, ch.iec.tc57._2011.dergroupdispatchmessage.DERGroupDispatchFaultMessageType derGroupDispatchFaultMessage, Throwable cause) {
        super(message, cause);
        this.derGroupDispatchFaultMessage = derGroupDispatchFaultMessage;
    }

    public ch.iec.tc57._2011.dergroupdispatchmessage.DERGroupDispatchFaultMessageType getFaultInfo() {
        return this.derGroupDispatchFaultMessage;
    }
}
