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
 * 2015-07-17T12:13:35.822-04:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "GetMeterReadings", 
                  wsdlLocation = "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/GetMeterReadings.wsdl",
                  targetNamespace = "http://iec.ch/TC57/2011/MeterReadings") 
public class GetMeterReadings extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://iec.ch/TC57/2011/MeterReadings", "GetMeterReadings");
    public final static QName GetMeterReadingsPort = new QName("http://iec.ch/TC57/2011/MeterReadings", "GetMeterReadings_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/GetMeterReadings.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetMeterReadings.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/BenGoodwin/git/opentemp/openwms/61968/wsdl/GetMeterReadings.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetMeterReadings(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetMeterReadings(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetMeterReadings() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetMeterReadings(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetMeterReadings(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GetMeterReadings(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GetMeterReadingsPort
     */
    @WebEndpoint(name = "GetMeterReadings_Port")
    public GetMeterReadingsPort getGetMeterReadingsPort() {
        return super.getPort(GetMeterReadingsPort, GetMeterReadingsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetMeterReadingsPort
     */
    @WebEndpoint(name = "GetMeterReadings_Port")
    public GetMeterReadingsPort getGetMeterReadingsPort(WebServiceFeature... features) {
        return super.getPort(GetMeterReadingsPort, GetMeterReadingsPort.class, features);
    }

}
