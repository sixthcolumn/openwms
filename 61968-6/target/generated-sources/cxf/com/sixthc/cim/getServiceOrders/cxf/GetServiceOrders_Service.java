package com.sixthc.cim.getServiceOrders.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2016-08-21T16:21:54.182-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "GetServiceOrders", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/openwms/61968-6/wsdl/get/GetServiceOrders.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2015/GetServiceOrders") 
public class GetServiceOrders_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2015/GetServiceOrders", "GetServiceOrders");
    public final static QName GetServiceOrdersPort = new QName("http://iec.ch/TC57/2015/GetServiceOrders", "GetServiceOrders_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/openwms/61968-6/wsdl/get/GetServiceOrders.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetServiceOrders_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/openwms/61968-6/wsdl/get/GetServiceOrders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetServiceOrders_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetServiceOrders_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetServiceOrders_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetServiceOrders_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetServiceOrders_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetServiceOrders_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GetServiceOrdersPort
     */
    @WebEndpoint(name = "GetServiceOrders_Port")
    public GetServiceOrdersPort getGetServiceOrdersPort() {
        return super.getPort(GetServiceOrdersPort, GetServiceOrdersPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetServiceOrdersPort
     */
    @WebEndpoint(name = "GetServiceOrders_Port")
    public GetServiceOrdersPort getGetServiceOrdersPort(WebServiceFeature... features) {
        return super.getPort(GetServiceOrdersPort, GetServiceOrdersPort.class, features);
    }

}
