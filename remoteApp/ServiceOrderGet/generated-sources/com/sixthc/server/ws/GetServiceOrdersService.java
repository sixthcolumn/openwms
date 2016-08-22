
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
@WebServiceClient(name = "GetServiceOrdersService", targetNamespace = "http://ws.server.sixthc.com/", wsdlLocation = "http://localhost:8080/epri-61968-6/ServiceOrdersGet?wsdl")
public class GetServiceOrdersService
    extends Service
{

    private final static URL GETSERVICEORDERSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETSERVICEORDERSSERVICE_EXCEPTION;
    private final static QName GETSERVICEORDERSSERVICE_QNAME = new QName("http://ws.server.sixthc.com/", "GetServiceOrdersService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/epri-61968-6/ServiceOrdersGet?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETSERVICEORDERSSERVICE_WSDL_LOCATION = url;
        GETSERVICEORDERSSERVICE_EXCEPTION = e;
    }

    public GetServiceOrdersService() {
        super(__getWsdlLocation(), GETSERVICEORDERSSERVICE_QNAME);
    }

    public GetServiceOrdersService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETSERVICEORDERSSERVICE_QNAME, features);
    }

    public GetServiceOrdersService(URL wsdlLocation) {
        super(wsdlLocation, GETSERVICEORDERSSERVICE_QNAME);
    }

    public GetServiceOrdersService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETSERVICEORDERSSERVICE_QNAME, features);
    }

    public GetServiceOrdersService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetServiceOrdersService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetServiceOrdersPort
     */
    @WebEndpoint(name = "GetServiceOrdersPort")
    public GetServiceOrdersPort getGetServiceOrdersPort() {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "GetServiceOrdersPort"), GetServiceOrdersPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetServiceOrdersPort
     */
    @WebEndpoint(name = "GetServiceOrdersPort")
    public GetServiceOrdersPort getGetServiceOrdersPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "GetServiceOrdersPort"), GetServiceOrdersPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETSERVICEORDERSSERVICE_EXCEPTION!= null) {
            throw GETSERVICEORDERSSERVICE_EXCEPTION;
        }
        return GETSERVICEORDERSSERVICE_WSDL_LOCATION;
    }

}
