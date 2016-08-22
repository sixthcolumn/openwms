
package com.sixthc.server.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetMaintOrdersService", targetNamespace = "http://ws.server.sixthc.com/", wsdlLocation = "http://localhost:8080/epri-61968-6/MaintOrdersGet?wsdl")
public class GetMaintOrdersService
    extends Service
{

    private final static URL GETMAINTORDERSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETMAINTORDERSSERVICE_EXCEPTION;
    private final static QName GETMAINTORDERSSERVICE_QNAME = new QName("http://ws.server.sixthc.com/", "GetMaintOrdersService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/epri-61968-6/MaintOrdersGet?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETMAINTORDERSSERVICE_WSDL_LOCATION = url;
        GETMAINTORDERSSERVICE_EXCEPTION = e;
    }

    public GetMaintOrdersService() {
        super(__getWsdlLocation(), GETMAINTORDERSSERVICE_QNAME);
    }

    public GetMaintOrdersService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETMAINTORDERSSERVICE_QNAME, features);
    }

    public GetMaintOrdersService(URL wsdlLocation) {
        super(wsdlLocation, GETMAINTORDERSSERVICE_QNAME);
    }

    public GetMaintOrdersService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETMAINTORDERSSERVICE_QNAME, features);
    }

    public GetMaintOrdersService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetMaintOrdersService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetMaintenanceOrdersPort
     */
    @WebEndpoint(name = "GetMaintOrdersPort")
    public GetMaintenanceOrdersPort getGetMaintOrdersPort() {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "GetMaintOrdersPort"), GetMaintenanceOrdersPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetMaintenanceOrdersPort
     */
    @WebEndpoint(name = "GetMaintOrdersPort")
    public GetMaintenanceOrdersPort getGetMaintOrdersPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "GetMaintOrdersPort"), GetMaintenanceOrdersPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETMAINTORDERSSERVICE_EXCEPTION!= null) {
            throw GETMAINTORDERSSERVICE_EXCEPTION;
        }
        return GETMAINTORDERSSERVICE_WSDL_LOCATION;
    }

}
