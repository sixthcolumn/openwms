
package com.sixthc.cim.deleteMaintenanceOrders.cxf;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-08-21T16:21:53.060-04:00
 * Generated source version: 2.4.1
 */

@WebFault(name = "MaintenanceOrdersFaultMessage", targetNamespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage")
public class FaultMessage extends Exception {
    
    private com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersFaultMessageType maintenanceOrdersFaultMessage;

    public FaultMessage() {
        super();
    }
    
    public FaultMessage(String message) {
        super(message);
    }
    
    public FaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultMessage(String message, com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersFaultMessageType maintenanceOrdersFaultMessage) {
        super(message);
        this.maintenanceOrdersFaultMessage = maintenanceOrdersFaultMessage;
    }

    public FaultMessage(String message, com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersFaultMessageType maintenanceOrdersFaultMessage, Throwable cause) {
        super(message, cause);
        this.maintenanceOrdersFaultMessage = maintenanceOrdersFaultMessage;
    }

    public com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersFaultMessageType getFaultInfo() {
        return this.maintenanceOrdersFaultMessage;
    }
}
