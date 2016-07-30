package org.multispeak.v5_0.wsdl.sb_der_server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-12-09T08:35:08.622-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "SB_DER_Server", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/openwms/DER/wsdl/SB_DER_Server.wsdl",
                  targetNamespace = "http://www.multispeak.org/V5.0/wsdl/SB_DER_Server") 
public class SBDERServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.multispeak.org/V5.0/wsdl/SB_DER_Server", "SB_DER_Server");
    public final static QName SBDERServerSoap = new QName("http://www.multispeak.org/V5.0/wsdl/SB_DER_Server", "SB_DER_ServerSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/openwms/DER/wsdl/SB_DER_Server.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SBDERServer.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/openwms/DER/wsdl/SB_DER_Server.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SBDERServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SBDERServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SBDERServer() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SBDERServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SBDERServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SBDERServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SBDERServerSoap
     */
    @WebEndpoint(name = "SB_DER_ServerSoap")
    public SBDERServerSoap getSBDERServerSoap() {
        return super.getPort(SBDERServerSoap, SBDERServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SBDERServerSoap
     */
    @WebEndpoint(name = "SB_DER_ServerSoap")
    public SBDERServerSoap getSBDERServerSoap(WebServiceFeature... features) {
        return super.getPort(SBDERServerSoap, SBDERServerSoap.class, features);
    }

}
