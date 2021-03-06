
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
@WebServiceClient(name = "ExecuteServiceOrderCreateService", targetNamespace = "http://ws.server.sixthc.com/", wsdlLocation = "http://localhost:8080/epri-61968-6/ServiceOrderCreate?wsdl")
public class ExecuteServiceOrderCreateService
    extends Service
{

    private final static URL EXECUTESERVICEORDERCREATESERVICE_WSDL_LOCATION;
    private final static WebServiceException EXECUTESERVICEORDERCREATESERVICE_EXCEPTION;
    private final static QName EXECUTESERVICEORDERCREATESERVICE_QNAME = new QName("http://ws.server.sixthc.com/", "ExecuteServiceOrderCreateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/epri-61968-6/ServiceOrderCreate?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXECUTESERVICEORDERCREATESERVICE_WSDL_LOCATION = url;
        EXECUTESERVICEORDERCREATESERVICE_EXCEPTION = e;
    }

    public ExecuteServiceOrderCreateService() {
        super(__getWsdlLocation(), EXECUTESERVICEORDERCREATESERVICE_QNAME);
    }

    public ExecuteServiceOrderCreateService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXECUTESERVICEORDERCREATESERVICE_QNAME, features);
    }

    public ExecuteServiceOrderCreateService(URL wsdlLocation) {
        super(wsdlLocation, EXECUTESERVICEORDERCREATESERVICE_QNAME);
    }

    public ExecuteServiceOrderCreateService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXECUTESERVICEORDERCREATESERVICE_QNAME, features);
    }

    public ExecuteServiceOrderCreateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExecuteServiceOrderCreateService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceOrdersPort
     */
    @WebEndpoint(name = "ExecuteServiceOrderCreatePort")
    public ServiceOrdersPort getExecuteServiceOrderCreatePort() {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "ExecuteServiceOrderCreatePort"), ServiceOrdersPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceOrdersPort
     */
    @WebEndpoint(name = "ExecuteServiceOrderCreatePort")
    public ServiceOrdersPort getExecuteServiceOrderCreatePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.server.sixthc.com/", "ExecuteServiceOrderCreatePort"), ServiceOrdersPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXECUTESERVICEORDERCREATESERVICE_EXCEPTION!= null) {
            throw EXECUTESERVICEORDERCREATESERVICE_EXCEPTION;
        }
        return EXECUTESERVICEORDERCREATESERVICE_WSDL_LOCATION;
    }

}
