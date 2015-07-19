
package com.sixthc.cim.get.cxf;

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
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T12:13:35.581-04:00
 * Generated source version: 2.4.1
 * 
 */
public final class GetMaintenanceOrdersPort_GetMaintenanceOrdersPort_Client {

    private static final QName SERVICE_NAME = new QName("http://iec.ch/TC57/2015/GetMaintenanceOrders", "GetMaintenanceOrders");

    private GetMaintenanceOrdersPort_GetMaintenanceOrdersPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GetMaintenanceOrders_Service.WSDL_LOCATION;
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
      
        GetMaintenanceOrders_Service ss = new GetMaintenanceOrders_Service(wsdlURL, SERVICE_NAME);
        GetMaintenanceOrdersPort port = ss.getGetMaintenanceOrdersPort();  
        
        {
        System.out.println("Invoking getMaintenanceOrders...");
        com.sixthc.cim.get.cxf.GetMaintenanceOrdersRequestMessageType _getMaintenanceOrders_getMaintenanceOrdersRequestMessage = null;
        try {
            com.sixthc.cim.get.cxf.GetMaintenanceOrdersResponseMessageType _getMaintenanceOrders__return = port.getMaintenanceOrders(_getMaintenanceOrders_getMaintenanceOrdersRequestMessage);
            System.out.println("getMaintenanceOrders.result=" + _getMaintenanceOrders__return);

        } catch (GetMaintenanceOrdersFaultMessage e) { 
            System.out.println("Expected exception: GetMaintenanceOrdersFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
