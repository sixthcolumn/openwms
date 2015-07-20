
package ch.iec.tc57._2011.enddeviceevents;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-20T15:46:16.278-04:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "EndDeviceEventsFaultMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceEventsMessage")
public class FaultMessage extends Exception {
    
    private ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsFaultMessageType endDeviceEventsFaultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsFaultMessageType endDeviceEventsFaultMessage) {
        super(message);
        this.endDeviceEventsFaultMessage = endDeviceEventsFaultMessage;
    }

    public FaultMessage(String message, ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsFaultMessageType endDeviceEventsFaultMessage, Throwable cause) {
        super(message, cause);
        this.endDeviceEventsFaultMessage = endDeviceEventsFaultMessage;
    }

    public ch.iec.tc57._2011.enddeviceeventsmessage.EndDeviceEventsFaultMessageType getFaultInfo() {
        return this.endDeviceEventsFaultMessage;
    }
}