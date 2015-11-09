
package ch.iec.tc57._2011.dergroupdispatchmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.dergroupdispatchmessage package. 
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

    private final static QName _CanceledDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "CanceledDERGroupDispatch");
    private final static QName _ChangedDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "ChangedDERGroupDispatch");
    private final static QName _DERGroupDispatchFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "DERGroupDispatchFaultMessage");
    private final static QName _ChangeDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "ChangeDERGroupDispatch");
    private final static QName _CloseDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "CloseDERGroupDispatch");
    private final static QName _DERGroupDispatchResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "DERGroupDispatchResponseMessage");
    private final static QName _CreatedDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "CreatedDERGroupDispatch");
    private final static QName _CreateDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "CreateDERGroupDispatch");
    private final static QName _DeletedDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "DeletedDERGroupDispatch");
    private final static QName _DeleteDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "DeleteDERGroupDispatch");
    private final static QName _ClosedDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "ClosedDERGroupDispatch");
    private final static QName _CancelDERGroupDispatch_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupDispatchMessage", "CancelDERGroupDispatch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.dergroupdispatchmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DERGroupDispatchEventMessageType }
     * 
     */
    public DERGroupDispatchEventMessageType createDERGroupDispatchEventMessageType() {
        return new DERGroupDispatchEventMessageType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchResponseMessageType }
     * 
     */
    public DERGroupDispatchResponseMessageType createDERGroupDispatchResponseMessageType() {
        return new DERGroupDispatchResponseMessageType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchRequestMessageType }
     * 
     */
    public DERGroupDispatchRequestMessageType createDERGroupDispatchRequestMessageType() {
        return new DERGroupDispatchRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchPayloadType }
     * 
     */
    public DERGroupDispatchPayloadType createDERGroupDispatchPayloadType() {
        return new DERGroupDispatchPayloadType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchFaultMessageType }
     * 
     */
    public DERGroupDispatchFaultMessageType createDERGroupDispatchFaultMessageType() {
        return new DERGroupDispatchFaultMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "CanceledDERGroupDispatch")
    public JAXBElement<DERGroupDispatchEventMessageType> createCanceledDERGroupDispatch(DERGroupDispatchEventMessageType value) {
        return new JAXBElement<DERGroupDispatchEventMessageType>(_CanceledDERGroupDispatch_QNAME, DERGroupDispatchEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "ChangedDERGroupDispatch")
    public JAXBElement<DERGroupDispatchEventMessageType> createChangedDERGroupDispatch(DERGroupDispatchEventMessageType value) {
        return new JAXBElement<DERGroupDispatchEventMessageType>(_ChangedDERGroupDispatch_QNAME, DERGroupDispatchEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "DERGroupDispatchFaultMessage")
    public JAXBElement<DERGroupDispatchFaultMessageType> createDERGroupDispatchFaultMessage(DERGroupDispatchFaultMessageType value) {
        return new JAXBElement<DERGroupDispatchFaultMessageType>(_DERGroupDispatchFaultMessage_QNAME, DERGroupDispatchFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "ChangeDERGroupDispatch")
    public JAXBElement<DERGroupDispatchRequestMessageType> createChangeDERGroupDispatch(DERGroupDispatchRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchRequestMessageType>(_ChangeDERGroupDispatch_QNAME, DERGroupDispatchRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "CloseDERGroupDispatch")
    public JAXBElement<DERGroupDispatchRequestMessageType> createCloseDERGroupDispatch(DERGroupDispatchRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchRequestMessageType>(_CloseDERGroupDispatch_QNAME, DERGroupDispatchRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "DERGroupDispatchResponseMessage")
    public JAXBElement<DERGroupDispatchResponseMessageType> createDERGroupDispatchResponseMessage(DERGroupDispatchResponseMessageType value) {
        return new JAXBElement<DERGroupDispatchResponseMessageType>(_DERGroupDispatchResponseMessage_QNAME, DERGroupDispatchResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "CreatedDERGroupDispatch")
    public JAXBElement<DERGroupDispatchEventMessageType> createCreatedDERGroupDispatch(DERGroupDispatchEventMessageType value) {
        return new JAXBElement<DERGroupDispatchEventMessageType>(_CreatedDERGroupDispatch_QNAME, DERGroupDispatchEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "CreateDERGroupDispatch")
    public JAXBElement<DERGroupDispatchRequestMessageType> createCreateDERGroupDispatch(DERGroupDispatchRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchRequestMessageType>(_CreateDERGroupDispatch_QNAME, DERGroupDispatchRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "DeletedDERGroupDispatch")
    public JAXBElement<DERGroupDispatchEventMessageType> createDeletedDERGroupDispatch(DERGroupDispatchEventMessageType value) {
        return new JAXBElement<DERGroupDispatchEventMessageType>(_DeletedDERGroupDispatch_QNAME, DERGroupDispatchEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "DeleteDERGroupDispatch")
    public JAXBElement<DERGroupDispatchRequestMessageType> createDeleteDERGroupDispatch(DERGroupDispatchRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchRequestMessageType>(_DeleteDERGroupDispatch_QNAME, DERGroupDispatchRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "ClosedDERGroupDispatch")
    public JAXBElement<DERGroupDispatchEventMessageType> createClosedDERGroupDispatch(DERGroupDispatchEventMessageType value) {
        return new JAXBElement<DERGroupDispatchEventMessageType>(_ClosedDERGroupDispatch_QNAME, DERGroupDispatchEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupDispatchMessage", name = "CancelDERGroupDispatch")
    public JAXBElement<DERGroupDispatchRequestMessageType> createCancelDERGroupDispatch(DERGroupDispatchRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchRequestMessageType>(_CancelDERGroupDispatch_QNAME, DERGroupDispatchRequestMessageType.class, null, value);
    }

}
