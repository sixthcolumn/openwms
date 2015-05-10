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
 * 2015-05-09T09:21:06.245-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "GetEndDeviceControls", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/openwms/61968/wsdl/GetEndDeviceControls.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2011/EndDeviceControls") 
public class GetEndDeviceControls extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "GetEndDeviceControls");
    public final static QName GetEndDeviceControlsPort = new QName("http://iec.ch/TC57/2011/EndDeviceControls", "GetEndDeviceControls_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/openwms/61968/wsdl/GetEndDeviceControls.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetEndDeviceControls.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/openwms/61968/wsdl/GetEndDeviceControls.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetEndDeviceControls(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetEndDeviceControls(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetEndDeviceControls() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetEndDeviceControls(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetEndDeviceControls(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetEndDeviceControls(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GetEndDeviceControlsPort
     */
    @WebEndpoint(name = "GetEndDeviceControls_Port")
    public GetEndDeviceControlsPort getGetEndDeviceControlsPort() {
        return super.getPort(GetEndDeviceControlsPort, GetEndDeviceControlsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetEndDeviceControlsPort
     */
    @WebEndpoint(name = "GetEndDeviceControls_Port")
    public GetEndDeviceControlsPort getGetEndDeviceControlsPort(WebServiceFeature... features) {
        return super.getPort(GetEndDeviceControlsPort, GetEndDeviceControlsPort.class, features);
    }

}
