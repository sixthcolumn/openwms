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
 * 2015-07-20T15:46:20.100-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "MR_Server", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/opentemp2/openwms/61968/wsdl/mr_server_special.wsdl",
                  targetNamespace = "http://www.multispeak.org/Version_4.1_Release") 
public class MRServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.multispeak.org/Version_4.1_Release", "MR_Server");
    public final static QName MRServerSoap = new QName("http://www.multispeak.org/Version_4.1_Release", "MR_ServerSoap");
    public final static QName MRServerSoap12 = new QName("http://www.multispeak.org/Version_4.1_Release", "MR_ServerSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/opentemp2/openwms/61968/wsdl/mr_server_special.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MRServer.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/opentemp2/openwms/61968/wsdl/mr_server_special.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MRServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MRServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MRServer() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MRServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MRServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MRServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MRServerSoap
     */
    @WebEndpoint(name = "MR_ServerSoap")
    public MRServerSoap getMRServerSoap() {
        return super.getPort(MRServerSoap, MRServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MRServerSoap
     */
    @WebEndpoint(name = "MR_ServerSoap")
    public MRServerSoap getMRServerSoap(WebServiceFeature... features) {
        return super.getPort(MRServerSoap, MRServerSoap.class, features);
    }
    /**
     *
     * @return
     *     returns MRServerSoap
     */
    @WebEndpoint(name = "MR_ServerSoap12")
    public MRServerSoap getMRServerSoap12() {
        return super.getPort(MRServerSoap12, MRServerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MRServerSoap
     */
    @WebEndpoint(name = "MR_ServerSoap12")
    public MRServerSoap getMRServerSoap12(WebServiceFeature... features) {
        return super.getPort(MRServerSoap12, MRServerSoap.class, features);
    }

}