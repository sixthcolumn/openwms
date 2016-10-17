
package ch.iec.tc57._2015.getmaintenanceordersmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2015.getmaintenanceordersmessage package. 
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

    private final static QName _GetMaintenanceOrdersFaultMessage_QNAME = new QName("http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", "GetMaintenanceOrdersFaultMessage");
    private final static QName _GetMaintenanceOrdersRequestMessage_QNAME = new QName("http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", "GetMaintenanceOrdersRequestMessage");
    private final static QName _GetMaintenanceOrdersResponseMessage_QNAME = new QName("http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", "GetMaintenanceOrdersResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2015.getmaintenanceordersmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMaintenanceOrdersRequestMessageType }
     * 
     */
    public GetMaintenanceOrdersRequestMessageType createGetMaintenanceOrdersRequestMessageType() {
        return new GetMaintenanceOrdersRequestMessageType();
    }

    /**
     * Create an instance of {@link GetMaintenanceOrdersFaultMessageType }
     * 
     */
    public GetMaintenanceOrdersFaultMessageType createGetMaintenanceOrdersFaultMessageType() {
        return new GetMaintenanceOrdersFaultMessageType();
    }

    /**
     * Create an instance of {@link GetMaintenanceOrdersResponseMessageType }
     * 
     */
    public GetMaintenanceOrdersResponseMessageType createGetMaintenanceOrdersResponseMessageType() {
        return new GetMaintenanceOrdersResponseMessageType();
    }

    /**
     * Create an instance of {@link MaintenanceOrdersPayloadType }
     * 
     */
    public MaintenanceOrdersPayloadType createMaintenanceOrdersPayloadType() {
        return new MaintenanceOrdersPayloadType();
    }

    /**
     * Create an instance of {@link GetMaintenanceOrdersResponseType }
     * 
     */
    public GetMaintenanceOrdersResponseType createGetMaintenanceOrdersResponseType() {
        return new GetMaintenanceOrdersResponseType();
    }

    /**
     * Create an instance of {@link GetMaintenanceOrdersRequestType }
     * 
     */
    public GetMaintenanceOrdersRequestType createGetMaintenanceOrdersRequestType() {
        return new GetMaintenanceOrdersRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaintenanceOrdersFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", name = "GetMaintenanceOrdersFaultMessage")
    public JAXBElement<GetMaintenanceOrdersFaultMessageType> createGetMaintenanceOrdersFaultMessage(GetMaintenanceOrdersFaultMessageType value) {
        return new JAXBElement<GetMaintenanceOrdersFaultMessageType>(_GetMaintenanceOrdersFaultMessage_QNAME, GetMaintenanceOrdersFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaintenanceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", name = "GetMaintenanceOrdersRequestMessage")
    public JAXBElement<GetMaintenanceOrdersRequestMessageType> createGetMaintenanceOrdersRequestMessage(GetMaintenanceOrdersRequestMessageType value) {
        return new JAXBElement<GetMaintenanceOrdersRequestMessageType>(_GetMaintenanceOrdersRequestMessage_QNAME, GetMaintenanceOrdersRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaintenanceOrdersResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/GetMaintenanceOrdersMessage", name = "GetMaintenanceOrdersResponseMessage")
    public JAXBElement<GetMaintenanceOrdersResponseMessageType> createGetMaintenanceOrdersResponseMessage(GetMaintenanceOrdersResponseMessageType value) {
        return new JAXBElement<GetMaintenanceOrdersResponseMessageType>(_GetMaintenanceOrdersResponseMessage_QNAME, GetMaintenanceOrdersResponseMessageType.class, null, value);
    }

}
