
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-05-14T11:18:32.521-04:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "EndDeviceControlsFaultMessage", targetNamespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage")
public class FaultMessage extends Exception {
    
    private ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsFaultMessageType endDeviceControlsFaultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsFaultMessageType endDeviceControlsFaultMessage) {
        super(message);
        this.endDeviceControlsFaultMessage = endDeviceControlsFaultMessage;
    }

    public FaultMessage(String message, ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsFaultMessageType endDeviceControlsFaultMessage, Throwable cause) {
        super(message, cause);
        this.endDeviceControlsFaultMessage = endDeviceControlsFaultMessage;
    }

    public ch.iec.tc57._2011.enddevicecontrolsmessage.EndDeviceControlsFaultMessageType getFaultInfo() {
        return this.endDeviceControlsFaultMessage;
    }
}
