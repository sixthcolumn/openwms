package com.sixthc.request;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T12:13:43.373-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "Request", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/Request.wsdl",
                  targetNamespace = "http://sixthc.com/Request") 
public class Request extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sixthc.com/Request", "Request");
    public final static QName RequestPort = new QName("http://sixthc.com/Request", "Request_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/Request.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Request.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/Request.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Request(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Request(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Request() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Request(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Request(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Request(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RequestPort
     */
    @WebEndpoint(name = "Request_Port")
    public RequestPort getRequestPort() {
        return super.getPort(RequestPort, RequestPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RequestPort
     */
    @WebEndpoint(name = "Request_Port")
    public RequestPort getRequestPort(WebServiceFeature... features) {
        return super.getPort(RequestPort, RequestPort.class, features);
    }

}