
package com.sixthc.cim.deleteMaintenanceOrders.cxf;

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
 * 2016-08-21T16:21:53.048-04:00
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
        System.out.println("Invoking changeMaintenanceOrders...");
        com.sixthc.cim.deleteMaintenanceOrders.HeaderType _changeMaintenanceOrders_headerVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.HeaderType> _changeMaintenanceOrders_header = new javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.HeaderType>(_changeMaintenanceOrders_headerVal);
        com.sixthc.cim.deleteMaintenanceOrders.RequestType _changeMaintenanceOrders_request = null;
        com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersPayloadType _changeMaintenanceOrders_payloadVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersPayloadType> _changeMaintenanceOrders_payload = new javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersPayloadType>(_changeMaintenanceOrders_payloadVal);
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.ReplyType> _changeMaintenanceOrders_reply = new javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.ReplyType>();
        try {
            port.changeMaintenanceOrders(_changeMaintenanceOrders_header, _changeMaintenanceOrders_request, _changeMaintenanceOrders_payload, _changeMaintenanceOrders_reply);

            System.out.println("changeMaintenanceOrders._changeMaintenanceOrders_header=" + _changeMaintenanceOrders_header.value);
            System.out.println("changeMaintenanceOrders._changeMaintenanceOrders_payload=" + _changeMaintenanceOrders_payload.value);
            System.out.println("changeMaintenanceOrders._changeMaintenanceOrders_reply=" + _changeMaintenanceOrders_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteMaintenanceOrders...");
        com.sixthc.cim.deleteMaintenanceOrders.HeaderType _deleteMaintenanceOrders_headerVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.HeaderType> _deleteMaintenanceOrders_header = new javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.HeaderType>(_deleteMaintenanceOrders_headerVal);
        com.sixthc.cim.deleteMaintenanceOrders.RequestType _deleteMaintenanceOrders_request = null;
        com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersPayloadType _deleteMaintenanceOrders_payloadVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersPayloadType> _deleteMaintenanceOrders_payload = new javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.cxf.MaintenanceOrdersPayloadType>(_deleteMaintenanceOrders_payloadVal);
        javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.ReplyType> _deleteMaintenanceOrders_reply = new javax.xml.ws.Holder<com.sixthc.cim.deleteMaintenanceOrders.ReplyType>();
        try {
            port.deleteMaintenanceOrders(_deleteMaintenanceOrders_header, _deleteMaintenanceOrders_request, _deleteMaintenanceOrders_payload, _deleteMaintenanceOrders_reply);

            System.out.println("deleteMaintenanceOrders._deleteMaintenanceOrders_header=" + _deleteMaintenanceOrders_header.value);
            System.out.println("deleteMaintenanceOrders._deleteMaintenanceOrders_payload=" + _deleteMaintenanceOrders_payload.value);
            System.out.println("deleteMaintenanceOrders._deleteMaintenanceOrders_reply=" + _deleteMaintenanceOrders_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
