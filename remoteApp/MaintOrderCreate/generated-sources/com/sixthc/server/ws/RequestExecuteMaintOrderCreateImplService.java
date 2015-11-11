
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
@WebServiceClient(name = "RequestExecuteMaintOrderCreateImplService", targetNamespace = "http://ws.server.sixthc.com/", wsdlLocation = "http://localhost:8080/epriConnect/request/MaintOrderServiceCreate?wsdl")
public class RequestExecuteMaintOrderCreateImplService
    extends Service
{

    private final static URL REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_EXCEPTION;
    private final static QName REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_QNAME = new QName("http://ws.server.sixthc.com/", "RequestExecuteMaintOrderCreateImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/epriConnect/request/MaintOrderServiceCreate?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_WSDL_LOCATION = url;
        REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_EXCEPTION = e;
    }

    public RequestExecuteMaintOrderCreateImplService() {
        super(__getWsdlLocation(), REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_QNAME);
    }

    public RequestExecuteMaintOrderCreateImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_QNAME, features);
    }

    public RequestExecuteMaintOrderCreateImplService(URL wsdlLocation) {
        super(wsdlLocation, REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_QNAME);
    }

    public RequestExecuteMaintOrderCreateImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_QNAME, features);
    }

    public RequestExecuteMaintOrderCreateImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RequestExecuteMaintOrderCreateImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MaintenanceOrdersPort
     */
    @WebEndpoint(name = "RequestExecuteMaintOrderCreateImplPort")
    public MaintenanceOrdersPort getRequestExecuteMaintOrderCreateImplPort() {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "RequestExecuteMaintOrderCreateImplPort"), MaintenanceOrdersPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MaintenanceOrdersPort
     */
    @WebEndpoint(name = "RequestExecuteMaintOrderCreateImplPort")
    public MaintenanceOrdersPort getRequestExecuteMaintOrderCreateImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "RequestExecuteMaintOrderCreateImplPort"), MaintenanceOrdersPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_EXCEPTION!= null) {
            throw REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_EXCEPTION;
        }
        return REQUESTEXECUTEMAINTORDERCREATEIMPLSERVICE_WSDL_LOCATION;
    }

}
