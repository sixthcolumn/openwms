
package ch.iec.tc57._2011.getdergroupcapabilitymessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.getdergroupcapabilitymessage package. 
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

    private final static QName _GetDERGroupCapabilityResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage", "GetDERGroupCapabilityResponseMessage");
    private final static QName _GetDERGroupCapability_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage", "GetDERGroupCapability");
    private final static QName _GetDERGroupCapabilityFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage", "GetDERGroupCapabilityFaultMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.getdergroupcapabilitymessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDERGroupCapabilityResponseMessageType }
     * 
     */
    public GetDERGroupCapabilityResponseMessageType createGetDERGroupCapabilityResponseMessageType() {
        return new GetDERGroupCapabilityResponseMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupCapabilityPayloadType }
     * 
     */
    public GetDERGroupCapabilityPayloadType createGetDERGroupCapabilityPayloadType() {
        return new GetDERGroupCapabilityPayloadType();
    }

    /**
     * Create an instance of {@link GetDERGroupCapabilityRequestType }
     * 
     */
    public GetDERGroupCapabilityRequestType createGetDERGroupCapabilityRequestType() {
        return new GetDERGroupCapabilityRequestType();
    }

    /**
     * Create an instance of {@link GetDERGroupCapabilityFaultMessageType }
     * 
     */
    public GetDERGroupCapabilityFaultMessageType createGetDERGroupCapabilityFaultMessageType() {
        return new GetDERGroupCapabilityFaultMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupCapabilityRequestMessageType }
     * 
     */
    public GetDERGroupCapabilityRequestMessageType createGetDERGroupCapabilityRequestMessageType() {
        return new GetDERGroupCapabilityRequestMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupCapabilityResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage", name = "GetDERGroupCapabilityResponseMessage")
    public JAXBElement<GetDERGroupCapabilityResponseMessageType> createGetDERGroupCapabilityResponseMessage(GetDERGroupCapabilityResponseMessageType value) {
        return new JAXBElement<GetDERGroupCapabilityResponseMessageType>(_GetDERGroupCapabilityResponseMessage_QNAME, GetDERGroupCapabilityResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupCapabilityRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage", name = "GetDERGroupCapability")
    public JAXBElement<GetDERGroupCapabilityRequestMessageType> createGetDERGroupCapability(GetDERGroupCapabilityRequestMessageType value) {
        return new JAXBElement<GetDERGroupCapabilityRequestMessageType>(_GetDERGroupCapability_QNAME, GetDERGroupCapabilityRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupCapabilityFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage", name = "GetDERGroupCapabilityFaultMessage")
    public JAXBElement<GetDERGroupCapabilityFaultMessageType> createGetDERGroupCapabilityFaultMessage(GetDERGroupCapabilityFaultMessageType value) {
        return new JAXBElement<GetDERGroupCapabilityFaultMessageType>(_GetDERGroupCapabilityFaultMessage_QNAME, GetDERGroupCapabilityFaultMessageType.class, null, value);
    }

}
