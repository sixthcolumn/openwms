package ch.iec.tc57._2011.getdergroupstatus;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-11-09T13:39:09.168-05:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "GetDERGroupStatus", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/openwms/DER/wsdl/GetDERGroupStatus.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2011/GetDERGroupStatus") 
public class GetDERGroupStatus extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2011/GetDERGroupStatus", "GetDERGroupStatus");
    public final static QName GetDERGroupStatusPort = new QName("http://iec.ch/TC57/2011/GetDERGroupStatus", "GetDERGroupStatus_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/openwms/DER/wsdl/GetDERGroupStatus.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetDERGroupStatus.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/openwms/DER/wsdl/GetDERGroupStatus.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetDERGroupStatus(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetDERGroupStatus(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetDERGroupStatus() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetDERGroupStatus(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetDERGroupStatus(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetDERGroupStatus(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GetDERGroupStatusPort
     */
    @WebEndpoint(name = "GetDERGroupStatus_Port")
    public GetDERGroupStatusPort getGetDERGroupStatusPort() {
        return super.getPort(GetDERGroupStatusPort, GetDERGroupStatusPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetDERGroupStatusPort
     */
    @WebEndpoint(name = "GetDERGroupStatus_Port")
    public GetDERGroupStatusPort getGetDERGroupStatusPort(WebServiceFeature... features) {
        return super.getPort(GetDERGroupStatusPort, GetDERGroupStatusPort.class, features);
    }

}
