package org.multispeak.version_4_1_release;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-05-09T09:21:19.336-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "CB_Server", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/openwms/61968/wsdl/cb_server_special.wsdl",
                  targetNamespace = "http://www.multispeak.org/Version_4.1_Release") 
public class CBServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.multispeak.org/Version_4.1_Release", "CB_Server");
    public final static QName CBServerSoap12 = new QName("http://www.multispeak.org/Version_4.1_Release", "CB_ServerSoap12");
    public final static QName CBServerSoap = new QName("http://www.multispeak.org/Version_4.1_Release", "CB_ServerSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/openwms/61968/wsdl/cb_server_special.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CBServer.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/openwms/61968/wsdl/cb_server_special.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CBServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CBServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CBServer() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CBServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CBServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CBServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CBServerSoap
     */
    @WebEndpoint(name = "CB_ServerSoap12")
    public CBServerSoap getCBServerSoap12() {
        return super.getPort(CBServerSoap12, CBServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CBServerSoap
     */
    @WebEndpoint(name = "CB_ServerSoap12")
    public CBServerSoap getCBServerSoap12(WebServiceFeature... features) {
        return super.getPort(CBServerSoap12, CBServerSoap.class, features);
    }
    /**
     *
     * @return
     *     returns CBServerSoap
     */
    @WebEndpoint(name = "CB_ServerSoap")
    public CBServerSoap getCBServerSoap() {
        return super.getPort(CBServerSoap, CBServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CBServerSoap
     */
    @WebEndpoint(name = "CB_ServerSoap")
    public CBServerSoap getCBServerSoap(WebServiceFeature... features) {
        return super.getPort(CBServerSoap, CBServerSoap.class, features);
    }

}
