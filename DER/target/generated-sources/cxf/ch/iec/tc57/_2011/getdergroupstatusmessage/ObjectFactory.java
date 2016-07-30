
package ch.iec.tc57._2011.getdergroupstatusmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.getdergroupstatusmessage package. 
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

    private final static QName _DERGroupStatusResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupStatusMessage", "DERGroupStatusResponseMessage");
    private final static QName _GetDERGroupStatus_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupStatusMessage", "GetDERGroupStatus");
    private final static QName _DERGroupStatusFaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/GetDERGroupStatusMessage", "DERGroupStatusFaultMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.getdergroupstatusmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DERGroupStatusResponseMessageType }
     * 
     */
    public DERGroupStatusResponseMessageType createDERGroupStatusResponseMessageType() {
        return new DERGroupStatusResponseMessageType();
    }

    /**
     * Create an instance of {@link DERGroupStatusFaultMessageType }
     * 
     */
    public DERGroupStatusFaultMessageType createDERGroupStatusFaultMessageType() {
        return new DERGroupStatusFaultMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusRequestMessageType }
     * 
     */
    public GetDERGroupStatusRequestMessageType createGetDERGroupStatusRequestMessageType() {
        return new GetDERGroupStatusRequestMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusRequestType }
     * 
     */
    public GetDERGroupStatusRequestType createGetDERGroupStatusRequestType() {
        return new GetDERGroupStatusRequestType();
    }

    /**
     * Create an instance of {@link DERGroupStatusPayloadType }
     * 
     */
    public DERGroupStatusPayloadType createDERGroupStatusPayloadType() {
        return new DERGroupStatusPayloadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupStatusResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage", name = "DERGroupStatusResponseMessage")
    public JAXBElement<DERGroupStatusResponseMessageType> createDERGroupStatusResponseMessage(DERGroupStatusResponseMessageType value) {
        return new JAXBElement<DERGroupStatusResponseMessageType>(_DERGroupStatusResponseMessage_QNAME, DERGroupStatusResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupStatusRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage", name = "GetDERGroupStatus")
    public JAXBElement<GetDERGroupStatusRequestMessageType> createGetDERGroupStatus(GetDERGroupStatusRequestMessageType value) {
        return new JAXBElement<GetDERGroupStatusRequestMessageType>(_GetDERGroupStatus_QNAME, GetDERGroupStatusRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupStatusFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/GetDERGroupStatusMessage", name = "DERGroupStatusFaultMessage")
    public JAXBElement<DERGroupStatusFaultMessageType> createDERGroupStatusFaultMessage(DERGroupStatusFaultMessageType value) {
        return new JAXBElement<DERGroupStatusFaultMessageType>(_DERGroupStatusFaultMessage_QNAME, DERGroupStatusFaultMessageType.class, null, value);
    }

}
