
package com.sixthc.cim.createMaintenanceOrders.cxf;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-08-21T16:21:51.656-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class MaintenanceOrdersPort_MaintenanceOrdersPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2015/ExecuteMaintenanceOrders", "ExecuteMaintenanceOrders");

    private MaintenanceOrdersPort_MaintenanceOrdersPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ExecuteMaintenanceOrders.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ExecuteMaintenanceOrders ss = new ExecuteMaintenanceOrders(wsdlURL, SERVICE_NAME);
        MaintenanceOrdersPort port = ss.getMaintenanceOrdersPort();  
        
        {
        System.out.println("Invoking createMaintenanceOrders...");
        com.sixthc.cim.createMaintenanceOrders.HeaderType _createMaintenanceOrders_headerVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.HeaderType> _createMaintenanceOrders_header = new javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.HeaderType>(_createMaintenanceOrders_headerVal);
        com.sixthc.cim.createMaintenanceOrders.RequestType _createMaintenanceOrders_request = null;
        com.sixthc.cim.createMaintenanceOrders.cxf.MaintenanceOrdersPayloadType _createMaintenanceOrders_payloadVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.cxf.MaintenanceOrdersPayloadType> _createMaintenanceOrders_payload = new javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.cxf.MaintenanceOrdersPayloadType>(_createMaintenanceOrders_payloadVal);
        javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.ReplyType> _createMaintenanceOrders_reply = new javax.xml.ws.Holder<com.sixthc.cim.createMaintenanceOrders.ReplyType>();
        try {
            port.createMaintenanceOrders(_createMaintenanceOrders_header, _createMaintenanceOrders_request, _createMaintenanceOrders_payload, _createMaintenanceOrders_reply);

            System.out.println("createMaintenanceOrders._createMaintenanceOrders_header=" + _createMaintenanceOrders_header.value);
            System.out.println("createMaintenanceOrders._createMaintenanceOrders_payload=" + _createMaintenanceOrders_payload.value);
            System.out.println("createMaintenanceOrders._createMaintenanceOrders_reply=" + _createMaintenanceOrders_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}