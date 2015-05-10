package ch.iec.tc57._2010.workrequest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-05-09T09:21:19.885-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "RequestWorkRequest", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/openwms/61968/wsdl/61968-6/RequestWorkRequest.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2010/WorkRequest") 
public class RequestWorkRequest extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2010/WorkRequest", "RequestWorkRequest");
    public final static QName WorkRequestPort = new QName("http://iec.ch/TC57/2010/WorkRequest", "WorkRequest_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/openwms/61968/wsdl/61968-6/RequestWorkRequest.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RequestWorkRequest.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/openwms/61968/wsdl/61968-6/RequestWorkRequest.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RequestWorkRequest(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RequestWorkRequest(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RequestWorkRequest() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RequestWorkRequest(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RequestWorkRequest(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RequestWorkRequest(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WorkRequestPort
     */
    @WebEndpoint(name = "WorkRequest_Port")
    public WorkRequestPort getWorkRequestPort() {
        return super.getPort(WorkRequestPort, WorkRequestPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkRequestPort
     */
    @WebEndpoint(name = "WorkRequest_Port")
    public WorkRequestPort getWorkRequestPort(WebServiceFeature... features) {
        return super.getPort(WorkRequestPort, WorkRequestPort.class, features);
    }

}
