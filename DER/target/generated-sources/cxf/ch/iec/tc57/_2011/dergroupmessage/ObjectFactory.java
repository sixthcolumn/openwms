
package ch.iec.tc57._2011.dergroupmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.dergroupmessage package. 
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

    private final static QName _CancelDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "CancelDERGroup");
    private final static QName _DeletedDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "DeletedDERGroup");
    private final static QName _ClosedDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "ClosedDERGroup");
    private final static QName _CreateDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "CreateDERGroup");
    private final static QName _ChangeDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "ChangeDERGroup");
    private final static QName _CreatedDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "CreatedDERGroup");
    private final static QName _ChangedDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "ChangedDERGroup");
    private final static QName _CloseDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "CloseDERGroup");
    private final static QName _CanceledDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "CanceledDERGroup");
    private final static QName _DERGroupFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "DERGroupFaultMessage");
    private final static QName _DERGroupResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "DERGroupResponseMessage");
    private final static QName _DeleteDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/DERGroupMessage", "DeleteDERGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.dergroupmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DERGroupFaultMessageType }
     * 
     */
    public DERGroupFaultMessageType createDERGroupFaultMessageType() {
        return new DERGroupFaultMessageType();
    }

    /**
     * Create an instance of {@link DERGroupRequestMessageType }
     * 
     */
    public DERGroupRequestMessageType createDERGroupRequestMessageType() {
        return new DERGroupRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupResponseMessageType }
     * 
     */
    public DERGroupResponseMessageType createDERGroupResponseMessageType() {
        return new DERGroupResponseMessageType();
    }

    /**
     * Create an instance of {@link DERGroupEventMessageType }
     * 
     */
    public DERGroupEventMessageType createDERGroupEventMessageType() {
        return new DERGroupEventMessageType();
    }

    /**
     * Create an instance of {@link DERGroupPayloadType }
     * 
     */
    public DERGroupPayloadType createDERGroupPayloadType() {
        return new DERGroupPayloadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "CancelDERGroup")
    public JAXBElement<DERGroupRequestMessageType> createCancelDERGroup(DERGroupRequestMessageType value) {
        return new JAXBElement<DERGroupRequestMessageType>(_CancelDERGroup_QNAME, DERGroupRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "DeletedDERGroup")
    public JAXBElement<DERGroupEventMessageType> createDeletedDERGroup(DERGroupEventMessageType value) {
        return new JAXBElement<DERGroupEventMessageType>(_DeletedDERGroup_QNAME, DERGroupEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "ClosedDERGroup")
    public JAXBElement<DERGroupEventMessageType> createClosedDERGroup(DERGroupEventMessageType value) {
        return new JAXBElement<DERGroupEventMessageType>(_ClosedDERGroup_QNAME, DERGroupEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "CreateDERGroup")
    public JAXBElement<DERGroupRequestMessageType> createCreateDERGroup(DERGroupRequestMessageType value) {
        return new JAXBElement<DERGroupRequestMessageType>(_CreateDERGroup_QNAME, DERGroupRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "ChangeDERGroup")
    public JAXBElement<DERGroupRequestMessageType> createChangeDERGroup(DERGroupRequestMessageType value) {
        return new JAXBElement<DERGroupRequestMessageType>(_ChangeDERGroup_QNAME, DERGroupRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "CreatedDERGroup")
    public JAXBElement<DERGroupEventMessageType> createCreatedDERGroup(DERGroupEventMessageType value) {
        return new JAXBElement<DERGroupEventMessageType>(_CreatedDERGroup_QNAME, DERGroupEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "ChangedDERGroup")
    public JAXBElement<DERGroupEventMessageType> createChangedDERGroup(DERGroupEventMessageType value) {
        return new JAXBElement<DERGroupEventMessageType>(_ChangedDERGroup_QNAME, DERGroupEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "CloseDERGroup")
    public JAXBElement<DERGroupRequestMessageType> createCloseDERGroup(DERGroupRequestMessageType value) {
        return new JAXBElement<DERGroupRequestMessageType>(_CloseDERGroup_QNAME, DERGroupRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "CanceledDERGroup")
    public JAXBElement<DERGroupEventMessageType> createCanceledDERGroup(DERGroupEventMessageType value) {
        return new JAXBElement<DERGroupEventMessageType>(_CanceledDERGroup_QNAME, DERGroupEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "DERGroupFaultMessage")
    public JAXBElement<DERGroupFaultMessageType> createDERGroupFaultMessage(DERGroupFaultMessageType value) {
        return new JAXBElement<DERGroupFaultMessageType>(_DERGroupFaultMessage_QNAME, DERGroupFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "DERGroupResponseMessage")
    public JAXBElement<DERGroupResponseMessageType> createDERGroupResponseMessage(DERGroupResponseMessageType value) {
        return new JAXBElement<DERGroupResponseMessageType>(_DERGroupResponseMessage_QNAME, DERGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/DERGroupMessage", name = "DeleteDERGroup")
    public JAXBElement<DERGroupRequestMessageType> createDeleteDERGroup(DERGroupRequestMessageType value) {
        return new JAXBElement<DERGroupRequestMessageType>(_DeleteDERGroup_QNAME, DERGroupRequestMessageType.class, null, value);
    }

}
