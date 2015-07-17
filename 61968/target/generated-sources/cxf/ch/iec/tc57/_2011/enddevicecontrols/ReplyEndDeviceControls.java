package ch.iec.tc57._2011.enddevicecontrols;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T11:33:53.949-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "ReplyEndDeviceControls", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/ReplyEndDeviceControls.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2011/EndDeviceControls") 
public class ReplyEndDeviceControls extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "ReplyEndDeviceControls");
    public final static QName ReplyEndDeviceControlsPort = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "ReplyEndDeviceControls_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/ReplyEndDeviceControls.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReplyEndDeviceControls.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/ReplyEndDeviceControls.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReplyEndDeviceControls(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReplyEndDeviceControls(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReplyEndDeviceControls() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReplyEndDeviceControls(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReplyEndDeviceControls(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReplyEndDeviceControls(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ReplyEndDeviceControlsPort
     */
    @WebEndpoint(name = "ReplyEndDeviceControls_Port")
    public ReplyEndDeviceControlsPort getReplyEndDeviceControlsPort() {
        return super.getPort(ReplyEndDeviceControlsPort, ReplyEndDeviceControlsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReplyEndDeviceControlsPort
     */
    @WebEndpoint(name = "ReplyEndDeviceControls_Port")
    public ReplyEndDeviceControlsPort getReplyEndDeviceControlsPort(WebServiceFeature... features) {
        return super.getPort(ReplyEndDeviceControlsPort, ReplyEndDeviceControlsPort.class, features);
    }

}
