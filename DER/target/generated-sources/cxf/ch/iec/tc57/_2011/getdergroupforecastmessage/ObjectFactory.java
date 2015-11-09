
package ch.iec.tc57._2011.getdergroupforecastmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.getdergroupforecastmessage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupForecastMessage", "GetDERGroupForecast");
    private final static QName _DERGroupForecastFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupForecastMessage", "DERGroupForecastFaultMessage");
    private final static QName _DERGroupForecastResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupForecastMessage", "DERGroupForecastResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.getdergroupforecastmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDERGroupForecastRequestMessageType }
     * 
     */
    public GetDERGroupForecastRequestMessageType createGetDERGroupForecastRequestMessageType() {
        return new GetDERGroupForecastRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupForecastFaultMessageType }
     * 
     */
    public DERGroupForecastFaultMessageType createDERGroupForecastFaultMessageType() {
        return new DERGroupForecastFaultMessageType();
    }

    /**
     * Create an instance of {@link DERGroupForecastPayloadType }
     * 
     */
    public DERGroupForecastPayloadType createDERGroupForecastPayloadType() {
        return new DERGroupForecastPayloadType();
    }

    /**
     * Create an instance of {@link GetDERGroupForecastRequestType }
     * 
     */
    public GetDERGroupForecastRequestType createGetDERGroupForecastRequestType() {
        return new GetDERGroupForecastRequestType();
    }

    /**
     * Create an instance of {@link DERGroupForecastResponseMessageType }
     * 
     */
    public DERGroupForecastResponseMessageType createDERGroupForecastResponseMessageType() {
        return new DERGroupForecastResponseMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupForecastRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage", name = "GetDERGroupForecast")
    public JAXBElement<GetDERGroupForecastRequestMessageType> createGetDERGroupForecast(GetDERGroupForecastRequestMessageType value) {
        return new JAXBElement<GetDERGroupForecastRequestMessageType>(_GetDERGroupForecast_QNAME, GetDERGroupForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage", name = "DERGroupForecastFaultMessage")
    public JAXBElement<DERGroupForecastFaultMessageType> createDERGroupForecastFaultMessage(DERGroupForecastFaultMessageType value) {
        return new JAXBElement<DERGroupForecastFaultMessageType>(_DERGroupForecastFaultMessage_QNAME, DERGroupForecastFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupForecastMessage", name = "DERGroupForecastResponseMessage")
    public JAXBElement<DERGroupForecastResponseMessageType> createDERGroupForecastResponseMessage(DERGroupForecastResponseMessageType value) {
        return new JAXBElement<DERGroupForecastResponseMessageType>(_DERGroupForecastResponseMessage_QNAME, DERGroupForecastResponseMessageType.class, null, value);
    }

}
