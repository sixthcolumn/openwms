
package com.sixthc.cim.createServiceOrders.cxf;

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
 * 2016-08-21T16:21:52.497-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class ServiceOrdersPort_ServiceOrdersPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2015/ExecuteServiceOrders", "ExecuteServiceOrders");

    private ServiceOrdersPort_ServiceOrdersPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ExecuteServiceOrders.WSDL_LOCATION;
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
      
        ExecuteServiceOrders ss = new ExecuteServiceOrders(wsdlURL, SERVICE_NAME);
        ServiceOrdersPort port = ss.getServiceOrdersPort();  
        
        {
        System.out.println("Invoking createServiceOrders...");
        com.sixthc.cim.createServiceOrders.HeaderType _createServiceOrders_headerVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.HeaderType> _createServiceOrders_header = new javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.HeaderType>(_createServiceOrders_headerVal);
        com.sixthc.cim.createServiceOrders.RequestType _createServiceOrders_request = null;
        com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersPayloadType _createServiceOrders_payloadVal = null;
        javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersPayloadType> _createServiceOrders_payload = new javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.cxf.ServiceOrdersPayloadType>(_createServiceOrders_payloadVal);
        javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.ReplyType> _createServiceOrders_reply = new javax.xml.ws.Holder<com.sixthc.cim.createServiceOrders.ReplyType>();
        try {
            port.createServiceOrders(_createServiceOrders_header, _createServiceOrders_request, _createServiceOrders_payload, _createServiceOrders_reply);

            System.out.println("createServiceOrders._createServiceOrders_header=" + _createServiceOrders_header.value);
            System.out.println("createServiceOrders._createServiceOrders_payload=" + _createServiceOrders_payload.value);
            System.out.println("createServiceOrders._createServiceOrders_reply=" + _createServiceOrders_reply.value);
        } catch (FaultMessage e) { 
            System.out.println("Expected exception: FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}