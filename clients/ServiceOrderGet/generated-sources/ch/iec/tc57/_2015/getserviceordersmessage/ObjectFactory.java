
package ch.iec.tc57._2015.getserviceordersmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2015.getserviceordersmessage package. 
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

    private final static QName _GetServiceOrdersFaultMessage_QNAME = new QName("http://iec.ch/TC57/2015/GetServiceOrdersMessage", "GetServiceOrdersFaultMessage");
    private final static QName _GetServiceOrdersResponseMessage_QNAME = new QName("http://iec.ch/TC57/2015/GetServiceOrdersMessage", "GetServiceOrdersResponseMessage");
    private final static QName _GetServiceOrdersRequestMessage_QNAME = new QName("http://iec.ch/TC57/2015/GetServiceOrdersMessage", "GetServiceOrdersRequestMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2015.getserviceordersmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceOrdersResponseMessageType }
     * 
     */
    public GetServiceOrdersResponseMessageType createGetServiceOrdersResponseMessageType() {
        return new GetServiceOrdersResponseMessageType();
    }

    /**
     * Create an instance of {@link GetServiceOrdersFaultMessageType }
     * 
     */
    public GetServiceOrdersFaultMessageType createGetServiceOrdersFaultMessageType() {
        return new GetServiceOrdersFaultMessageType();
    }

    /**
     * Create an instance of {@link GetServiceOrdersRequestMessageType }
     * 
     */
    public GetServiceOrdersRequestMessageType createGetServiceOrdersRequestMessageType() {
        return new GetServiceOrdersRequestMessageType();
    }

    /**
     * Create an instance of {@link GetServiceOrdersResponseType }
     * 
     */
    public GetServiceOrdersResponseType createGetServiceOrdersResponseType() {
        return new GetServiceOrdersResponseType();
    }

    /**
     * Create an instance of {@link ServiceOrdersPayloadType }
     * 
     */
    public ServiceOrdersPayloadType createServiceOrdersPayloadType() {
        return new ServiceOrdersPayloadType();
    }

    /**
     * Create an instance of {@link GetServiceOrdersRequestType }
     * 
     */
    public GetServiceOrdersRequestType createGetServiceOrdersRequestType() {
        return new GetServiceOrdersRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrdersFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/GetServiceOrdersMessage", name = "GetServiceOrdersFaultMessage")
    public JAXBElement<GetServiceOrdersFaultMessageType> createGetServiceOrdersFaultMessage(GetServiceOrdersFaultMessageType value) {
        return new JAXBElement<GetServiceOrdersFaultMessageType>(_GetServiceOrdersFaultMessage_QNAME, GetServiceOrdersFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrdersResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/GetServiceOrdersMessage", name = "GetServiceOrdersResponseMessage")
    public JAXBElement<GetServiceOrdersResponseMessageType> createGetServiceOrdersResponseMessage(GetServiceOrdersResponseMessageType value) {
        return new JAXBElement<GetServiceOrdersResponseMessageType>(_GetServiceOrdersResponseMessage_QNAME, GetServiceOrdersResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/GetServiceOrdersMessage", name = "GetServiceOrdersRequestMessage")
    public JAXBElement<GetServiceOrdersRequestMessageType> createGetServiceOrdersRequestMessage(GetServiceOrdersRequestMessageType value) {
        return new JAXBElement<GetServiceOrdersRequestMessageType>(_GetServiceOrdersRequestMessage_QNAME, GetServiceOrdersRequestMessageType.class, null, value);
    }

}
