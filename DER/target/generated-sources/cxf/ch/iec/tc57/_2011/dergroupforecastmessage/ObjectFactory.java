
package ch.iec.tc57._2011.dergroupforecastmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.dergroupforecastmessage package. 
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

    private final static QName _CreatedDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "CreatedDERGroupForecast");
    private final static QName _DERGroupForecastFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "DERGroupForecastFaultMessage");
    private final static QName _DeleteDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "DeleteDERGroupForecast");
    private final static QName _CancelDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "CancelDERGroupForecast");
    private final static QName _ChangedDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "ChangedDERGroupForecast");
    private final static QName _DeletedDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "DeletedDERGroupForecast");
    private final static QName _ChangeDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "ChangeDERGroupForecast");
    private final static QName _CloseDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "CloseDERGroupForecast");
    private final static QName _DERGroupForecastResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "DERGroupForecastResponseMessage");
    private final static QName _ClosedDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "ClosedDERGroupForecast");
    private final static QName _CanceledDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "CanceledDERGroupForecast");
    private final static QName _CreateDERGroupForecast_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupForecastMessage", "CreateDERGroupForecast");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.dergroupforecastmessage
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link DERGroupForecastEventMessageType }
     * 
     */
    public DERGroupForecastEventMessageType createDERGroupForecastEventMessageType() {
        return new DERGroupForecastEventMessageType();
    }

    /**
     * Create an instance of {@link DERGroupForecastRequestMessageType }
     * 
     */
    public DERGroupForecastRequestMessageType createDERGroupForecastRequestMessageType() {
        return new DERGroupForecastRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupForecastResponseMessageType }
     * 
     */
    public DERGroupForecastResponseMessageType createDERGroupForecastResponseMessageType() {
        return new DERGroupForecastResponseMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "CreatedDERGroupForecast")
    public JAXBElement<DERGroupForecastEventMessageType> createCreatedDERGroupForecast(DERGroupForecastEventMessageType value) {
        return new JAXBElement<DERGroupForecastEventMessageType>(_CreatedDERGroupForecast_QNAME, DERGroupForecastEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "DERGroupForecastFaultMessage")
    public JAXBElement<DERGroupForecastFaultMessageType> createDERGroupForecastFaultMessage(DERGroupForecastFaultMessageType value) {
        return new JAXBElement<DERGroupForecastFaultMessageType>(_DERGroupForecastFaultMessage_QNAME, DERGroupForecastFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "DeleteDERGroupForecast")
    public JAXBElement<DERGroupForecastRequestMessageType> createDeleteDERGroupForecast(DERGroupForecastRequestMessageType value) {
        return new JAXBElement<DERGroupForecastRequestMessageType>(_DeleteDERGroupForecast_QNAME, DERGroupForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "CancelDERGroupForecast")
    public JAXBElement<DERGroupForecastRequestMessageType> createCancelDERGroupForecast(DERGroupForecastRequestMessageType value) {
        return new JAXBElement<DERGroupForecastRequestMessageType>(_CancelDERGroupForecast_QNAME, DERGroupForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "ChangedDERGroupForecast")
    public JAXBElement<DERGroupForecastEventMessageType> createChangedDERGroupForecast(DERGroupForecastEventMessageType value) {
        return new JAXBElement<DERGroupForecastEventMessageType>(_ChangedDERGroupForecast_QNAME, DERGroupForecastEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "DeletedDERGroupForecast")
    public JAXBElement<DERGroupForecastEventMessageType> createDeletedDERGroupForecast(DERGroupForecastEventMessageType value) {
        return new JAXBElement<DERGroupForecastEventMessageType>(_DeletedDERGroupForecast_QNAME, DERGroupForecastEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "ChangeDERGroupForecast")
    public JAXBElement<DERGroupForecastRequestMessageType> createChangeDERGroupForecast(DERGroupForecastRequestMessageType value) {
        return new JAXBElement<DERGroupForecastRequestMessageType>(_ChangeDERGroupForecast_QNAME, DERGroupForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "CloseDERGroupForecast")
    public JAXBElement<DERGroupForecastRequestMessageType> createCloseDERGroupForecast(DERGroupForecastRequestMessageType value) {
        return new JAXBElement<DERGroupForecastRequestMessageType>(_CloseDERGroupForecast_QNAME, DERGroupForecastRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "DERGroupForecastResponseMessage")
    public JAXBElement<DERGroupForecastResponseMessageType> createDERGroupForecastResponseMessage(DERGroupForecastResponseMessageType value) {
        return new JAXBElement<DERGroupForecastResponseMessageType>(_DERGroupForecastResponseMessage_QNAME, DERGroupForecastResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "ClosedDERGroupForecast")
    public JAXBElement<DERGroupForecastEventMessageType> createClosedDERGroupForecast(DERGroupForecastEventMessageType value) {
        return new JAXBElement<DERGroupForecastEventMessageType>(_ClosedDERGroupForecast_QNAME, DERGroupForecastEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "CanceledDERGroupForecast")
    public JAXBElement<DERGroupForecastEventMessageType> createCanceledDERGroupForecast(DERGroupForecastEventMessageType value) {
        return new JAXBElement<DERGroupForecastEventMessageType>(_CanceledDERGroupForecast_QNAME, DERGroupForecastEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupForecastMessage", name = "CreateDERGroupForecast")
    public JAXBElement<DERGroupForecastRequestMessageType> createCreateDERGroupForecast(DERGroupForecastRequestMessageType value) {
        return new JAXBElement<DERGroupForecastRequestMessageType>(_CreateDERGroupForecast_QNAME, DERGroupForecastRequestMessageType.class, null, value);
    }

}
