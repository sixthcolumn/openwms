
package com.sixthc.cim.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.iec.tc57._2011.dergroupdispatchmessage.DERGroupDispatchResponseMessageType;
import ch.iec.tc57._2011.getdergroupcapabilitymessage.GetDERGroupCapabilityResponseMessageType;
import ch.iec.tc57._2011.getdergroupstatusmessage.DERGroupStatusResponseMessageType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sixthc.cim.request package. 
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

    private final static QName _RequestChangeDERGroupPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestChangeDERGroupPayload");
    private final static QName _RequestCreateDERGroupDispatchResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestCreateDERGroupDispatchResponse");
    private final static QName _GetDERGroupCapabilityPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupCapabilityPayload");
    private final static QName _RequestDeleteDERGroupResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestDeleteDERGroupResponse");
    private final static QName _GetDERGroupCapabilityResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupCapabilityResponse");
    private final static QName _RequestChangeDERGroupResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestChangeDERGroupResponse");
    private final static QName _GetDERGroupForecastPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupForecastPayload");
    private final static QName _RequestDeleteDERGroupPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestDeleteDERGroupPayload");
    private final static QName _ChangeDERGroupForecastPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "ChangeDERGroupForecastPayload");
    private final static QName _GetDERGroupsPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupsPayload");
    private final static QName _RequestCreateDERGroupPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestCreateDERGroupPayload");
    private final static QName _GetDERGroupForecastResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupForecastResponse");
    private final static QName _GetDERGroupStatusPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupStatusPayload");
    private final static QName _RequestCreateDERGroupDispatchPayload_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestCreateDERGroupDispatchPayload");
    private final static QName _GetDERGroupStatusResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupStatusResponse");
    private final static QName _GetDERGroupsResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "GetDERGroupsResponse");
    private final static QName _RequestCreateDERGroupResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "RequestCreateDERGroupResponse");
    private final static QName _ChangeDERGroupForecastResponse_QNAME = new QName("http://sixthc.com/CIM/Request", "ChangeDERGroupForecastResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sixthc.cim.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeDERGroupCapabilityRequest }
     * 
     */
    public ChangeDERGroupCapabilityRequest createChangeDERGroupCapabilityRequest() {
        return new ChangeDERGroupCapabilityRequest();
    }

    /**
     * Create an instance of {@link ChangeDERGroupForecastRequest }
     * 
     */
    public ChangeDERGroupForecastRequest createChangeDERGroupForecastRequest() {
        return new ChangeDERGroupForecastRequest();
    }

    /**
     * Create an instance of {@link GetDERGroupsRequest }
     * 
     */
    public GetDERGroupsRequest createGetDERGroupsRequest() {
        return new GetDERGroupsRequest();
    }

    /**
     * Create an instance of {@link RequestDERGroupsRequest }
     * 
     */
    public RequestDERGroupsRequest createRequestDERGroupsRequest() {
        return new RequestDERGroupsRequest();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusRequest }
     * 
     */
    public GetDERGroupStatusRequest createGetDERGroupStatusRequest() {
        return new GetDERGroupStatusRequest();
    }

    /**
     * Create an instance of {@link GetDERGroupForecastRequest }
     * 
     */
    public GetDERGroupForecastRequest createGetDERGroupForecastRequest() {
        return new GetDERGroupForecastRequest();
    }

    /**
     * Create an instance of {@link GetDERGroupCapabilityRequest }
     * 
     */
    public GetDERGroupCapabilityRequest createGetDERGroupCapabilityRequest() {
        return new GetDERGroupCapabilityRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDERGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestChangeDERGroupPayload")
    public JAXBElement<RequestDERGroupsRequest> createRequestChangeDERGroupPayload(RequestDERGroupsRequest value) {
        return new JAXBElement<RequestDERGroupsRequest>(_RequestChangeDERGroupPayload_QNAME, RequestDERGroupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestCreateDERGroupDispatchResponse")
    public JAXBElement<DERGroupDispatchResponseMessageType> createRequestCreateDERGroupDispatchResponse(DERGroupDispatchResponseMessageType value) {
        return new JAXBElement<DERGroupDispatchResponseMessageType>(_RequestCreateDERGroupDispatchResponse_QNAME, DERGroupDispatchResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupCapabilityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupCapabilityPayload")
    public JAXBElement<GetDERGroupCapabilityRequest> createGetDERGroupCapabilityPayload(GetDERGroupCapabilityRequest value) {
        return new JAXBElement<GetDERGroupCapabilityRequest>(_GetDERGroupCapabilityPayload_QNAME, GetDERGroupCapabilityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestDeleteDERGroupResponse")
    public JAXBElement<ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType> createRequestDeleteDERGroupResponse(ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType value) {
        return new JAXBElement<ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType>(_RequestDeleteDERGroupResponse_QNAME, ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupCapabilityResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupCapabilityResponse")
    public JAXBElement<GetDERGroupCapabilityResponseMessageType> createGetDERGroupCapabilityResponse(GetDERGroupCapabilityResponseMessageType value) {
        return new JAXBElement<GetDERGroupCapabilityResponseMessageType>(_GetDERGroupCapabilityResponse_QNAME, GetDERGroupCapabilityResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestChangeDERGroupResponse")
    public JAXBElement<ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType> createRequestChangeDERGroupResponse(ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType value) {
        return new JAXBElement<ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType>(_RequestChangeDERGroupResponse_QNAME, ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupForecastRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupForecastPayload")
    public JAXBElement<GetDERGroupForecastRequest> createGetDERGroupForecastPayload(GetDERGroupForecastRequest value) {
        return new JAXBElement<GetDERGroupForecastRequest>(_GetDERGroupForecastPayload_QNAME, GetDERGroupForecastRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDERGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestDeleteDERGroupPayload")
    public JAXBElement<RequestDERGroupsRequest> createRequestDeleteDERGroupPayload(RequestDERGroupsRequest value) {
        return new JAXBElement<RequestDERGroupsRequest>(_RequestDeleteDERGroupPayload_QNAME, RequestDERGroupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDERGroupForecastRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "ChangeDERGroupForecastPayload")
    public JAXBElement<ChangeDERGroupForecastRequest> createChangeDERGroupForecastPayload(ChangeDERGroupForecastRequest value) {
        return new JAXBElement<ChangeDERGroupForecastRequest>(_ChangeDERGroupForecastPayload_QNAME, ChangeDERGroupForecastRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupsPayload")
    public JAXBElement<GetDERGroupsRequest> createGetDERGroupsPayload(GetDERGroupsRequest value) {
        return new JAXBElement<GetDERGroupsRequest>(_GetDERGroupsPayload_QNAME, GetDERGroupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDERGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestCreateDERGroupPayload")
    public JAXBElement<RequestDERGroupsRequest> createRequestCreateDERGroupPayload(RequestDERGroupsRequest value) {
        return new JAXBElement<RequestDERGroupsRequest>(_RequestCreateDERGroupPayload_QNAME, RequestDERGroupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupForecastResponse")
    public JAXBElement<ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastResponseMessageType> createGetDERGroupForecastResponse(ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastResponseMessageType value) {
        return new JAXBElement<ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastResponseMessageType>(_GetDERGroupForecastResponse_QNAME, ch.iec.tc57._2011.getdergroupforecastmessage.DERGroupForecastResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupStatusPayload")
    public JAXBElement<GetDERGroupStatusRequest> createGetDERGroupStatusPayload(GetDERGroupStatusRequest value) {
        return new JAXBElement<GetDERGroupStatusRequest>(_GetDERGroupStatusPayload_QNAME, GetDERGroupStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDERGroupCapabilityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestCreateDERGroupDispatchPayload")
    public JAXBElement<ChangeDERGroupCapabilityRequest> createRequestCreateDERGroupDispatchPayload(ChangeDERGroupCapabilityRequest value) {
        return new JAXBElement<ChangeDERGroupCapabilityRequest>(_RequestCreateDERGroupDispatchPayload_QNAME, ChangeDERGroupCapabilityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupStatusResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupStatusResponse")
    public JAXBElement<DERGroupStatusResponseMessageType> createGetDERGroupStatusResponse(DERGroupStatusResponseMessageType value) {
        return new JAXBElement<DERGroupStatusResponseMessageType>(_GetDERGroupStatusResponse_QNAME, DERGroupStatusResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ch.iec.tc57._2011.getdergroupmessage.DERGroupResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "GetDERGroupsResponse")
    public JAXBElement<ch.iec.tc57._2011.getdergroupmessage.DERGroupResponseMessageType> createGetDERGroupsResponse(ch.iec.tc57._2011.getdergroupmessage.DERGroupResponseMessageType value) {
        return new JAXBElement<ch.iec.tc57._2011.getdergroupmessage.DERGroupResponseMessageType>(_GetDERGroupsResponse_QNAME, ch.iec.tc57._2011.getdergroupmessage.DERGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "RequestCreateDERGroupResponse")
    public JAXBElement<ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType> createRequestCreateDERGroupResponse(ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType value) {
        return new JAXBElement<ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType>(_RequestCreateDERGroupResponse_QNAME, ch.iec.tc57._2011.dergroupmessage.DERGroupResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ch.iec.tc57._2011.dergroupforecastmessage.DERGroupForecastResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/CIM/Request", name = "ChangeDERGroupForecastResponse")
    public JAXBElement<ch.iec.tc57._2011.dergroupforecastmessage.DERGroupForecastResponseMessageType> createChangeDERGroupForecastResponse(ch.iec.tc57._2011.dergroupforecastmessage.DERGroupForecastResponseMessageType value) {
        return new JAXBElement<ch.iec.tc57._2011.dergroupforecastmessage.DERGroupForecastResponseMessageType>(_ChangeDERGroupForecastResponse_QNAME, ch.iec.tc57._2011.dergroupforecastmessage.DERGroupForecastResponseMessageType.class, null, value);
    }

}
