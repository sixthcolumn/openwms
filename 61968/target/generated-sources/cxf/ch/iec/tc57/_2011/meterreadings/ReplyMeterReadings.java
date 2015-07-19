package ch.iec.tc57._2011.meterreadings;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2015-07-17T12:13:36.086-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "ReplyMeterReadings", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/ReplyMeterReadings.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2011/MeterReadings") 
public class ReplyMeterReadings extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2011/MeterReadings", "ReplyMeterReadings");
    public final static QName ReplyMeterReadingsPort = new QName("http://iec.ch/TC57/2011/MeterReadings", "ReplyMeterReadings_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/ReplyMeterReadings.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReplyMeterReadings.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/ReplyMeterReadings.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReplyMeterReadings(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReplyMeterReadings(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReplyMeterReadings() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReplyMeterReadings(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReplyMeterReadings(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReplyMeterReadings(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ReplyMeterReadingsPort
     */
    @WebEndpoint(name = "ReplyMeterReadings_Port")
    public ReplyMeterReadingsPort getReplyMeterReadingsPort() {
        return super.getPort(ReplyMeterReadingsPort, ReplyMeterReadingsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReplyMeterReadingsPort
     */
    @WebEndpoint(name = "ReplyMeterReadings_Port")
    public ReplyMeterReadingsPort getReplyMeterReadingsPort(WebServiceFeature... features) {
        return super.getPort(ReplyMeterReadingsPort, ReplyMeterReadingsPort.class, features);
    }

}
