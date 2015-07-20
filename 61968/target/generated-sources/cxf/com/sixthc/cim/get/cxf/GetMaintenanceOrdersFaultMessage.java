
package com.sixthc.cim.get.cxf;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T12:13:35.590-04:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "GetMaintenanceOrdersFaultMessage", targetNamespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage")
public class GetMaintenanceOrdersFaultMessage extends Exception {
    
    private com.sixthc.cim.get.cxf.GetMaintenanceOrdersFaultMessageType getMaintenanceOrdersFaultMessage;

    public GetMaintenanceOrdersFaultMessage() {
        super();
    }
    
    public GetMaintenanceOrdersFaultMessage(String message) {
        super(message);
    }
    
    public GetMaintenanceOrdersFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public GetMaintenanceOrdersFaultMessage(String message, com.sixthc.cim.get.cxf.GetMaintenanceOrdersFaultMessageType getMaintenanceOrdersFaultMessage) {
        super(message);
        this.getMaintenanceOrdersFaultMessage = getMaintenanceOrdersFaultMessage;
    }

    public GetMaintenanceOrdersFaultMessage(String message, com.sixthc.cim.get.cxf.GetMaintenanceOrdersFaultMessageType getMaintenanceOrdersFaultMessage, Throwable cause) {
        super(message, cause);
        this.getMaintenanceOrdersFaultMessage = getMaintenanceOrdersFaultMessage;
    }

    public com.sixthc.cim.get.cxf.GetMaintenanceOrdersFaultMessageType getFaultInfo() {
        return this.getMaintenanceOrdersFaultMessage;
    }
}