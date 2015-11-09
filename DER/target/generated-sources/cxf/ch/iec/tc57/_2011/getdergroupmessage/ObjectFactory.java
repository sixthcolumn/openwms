
package ch.iec.tc57._2011.getdergroupmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.getdergroupmessage package. 
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

    private final static QName _DERGroupResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupMessage", "DERGroupResponseMessage");
    private final static QName _DERGroupFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupMessage", "DERGroupFaultMessage");
    private final static QName _GetDERGroup_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupMessage", "GetDERGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.getdergroupmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDERGroupRequestType }
     * 
     */
    public GetDERGroupRequestType createGetDERGroupRequestType() {
        return new GetDERGroupRequestType();
    }

    /**
     * Create an instance of {@link DERGroupResponseMessageType }
     * 
     */
    public DERGroupResponseMessageType createDERGroupResponseMessageType() {
        return new DERGroupResponseMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupRequestMessageType }
     * 
     */
    public GetDERGroupRequestMessageType createGetDERGroupRequestMessageType() {
        return new GetDERGroupRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupPayloadType }
     * 
     */
    public DERGroupPayloadType createDERGroupPayloadType() {
        return new DERGroupPayloadType();
    }

    /**
     * Create an instance of {@link DERGroupFaultMessageType }
     * 
     */
    public DERGroupFaultMessageType createDERGroupFaultMessageType() {
        return new DERGroupFaultMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupMessage", name = "DERGroupResponseMessage")
    public JAXBElement<DERGroupResponseMessageType> createDERGroupResponseMessage(DERGroupResponseMessageType value) {
        return new JAXBElement<DERGroupResponseMessageType>(_DERGroupResponseMessage_QNAME, DERGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupMessage", name = "DERGroupFaultMessage")
    public JAXBElement<DERGroupFaultMessageType> createDERGroupFaultMessage(DERGroupFaultMessageType value) {
        return new JAXBElement<DERGroupFaultMessageType>(_DERGroupFaultMessage_QNAME, DERGroupFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupMessage", name = "GetDERGroup")
    public JAXBElement<GetDERGroupRequestMessageType> createGetDERGroup(GetDERGroupRequestMessageType value) {
        return new JAXBElement<GetDERGroupRequestMessageType>(_GetDERGroup_QNAME, GetDERGroupRequestMessageType.class, null, value);
    }

}
