
package com.sixthc.wsdl.der_request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachment;
import org.multispeak.v5_0.commonarrays.ArrayOfDomainMember;
import org.multispeak.v5_0.commonarrays.ArrayOfString;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDER;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupForecast;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupStatus;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sixthc.wsdl.der_request package. 
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

    private final static QName _RemoveDERsFromDERGroup_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "RemoveDERsFromDERGroup");
    private final static QName _GetDomainNamesResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDomainNamesResponse");
    private final static QName _CreateDERGroups_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "CreateDERGroups");
    private final static QName _GetMethods_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetMethods");
    private final static QName _GetAttachmentsByObjectRefsResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetAttachmentsByObjectRefsResponse");
    private final static QName _GetDomainMembersResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDomainMembersResponse");
    private final static QName _GetAllDERsResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetAllDERsResponse");
    private final static QName _PingURL_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "PingURL");
    private final static QName _GetDomainMembers_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDomainMembers");
    private final static QName _GetAttachmentsByObjectRefs_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetAttachmentsByObjectRefs");
    private final static QName _String_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "string");
    private final static QName _DeleteDERGroups_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "DeleteDERGroups");
    private final static QName _GetDERGroupStatusesByDERGroupIDsResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDERGroupStatusesByDERGroupIDsResponse");
    private final static QName _GetDomainNames_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDomainNames");
    private final static QName _GetDERsByDERID_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDERsByDERID");
    private final static QName _GetMethodsResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetMethodsResponse");
    private final static QName _InsertDERsInDERGroup_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "InsertDERsInDERGroup");
    private final static QName _UnlinkAttachmentsFromObjects_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "UnlinkAttachmentsFromObjects");
    private final static QName _GetDERGroupStatusesByDERGroupIDs_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDERGroupStatusesByDERGroupIDs");
    private final static QName _GetDERGroupForecastsResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDERGroupForecastsResponse");
    private final static QName _GetAllDERsPayloadMessage_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetAllDERsPayloadMessage");
    private final static QName _GetDERGroupForecasts_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDERGroupForecasts");
    private final static QName _LinkAttachmentsToObjects_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "LinkAttachmentsToObjects");
    private final static QName _GetDERsByDERIDResponse_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetDERsByDERIDResponse");
    private final static QName _GetAllDERs_QNAME = new QName("http://www.sixthc.com/wsdl/DER_Request", "GetAllDERs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sixthc.wsdl.der_request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDERGroupID2Payload }
     * 
     */
    public ArrayOfDERGroupID2Payload createArrayOfDERGroupID2Payload() {
        return new ArrayOfDERGroupID2Payload();
    }

    /**
     * Create an instance of {@link InitiateDERGroupDispatchRequests }
     * 
     */
    public InitiateDERGroupDispatchRequests createInitiateDERGroupDispatchRequests() {
        return new InitiateDERGroupDispatchRequests();
    }

    /**
     * Create an instance of {@link ArrayOfAttachmentUnlinkContainerPayload }
     * 
     */
    public ArrayOfAttachmentUnlinkContainerPayload createArrayOfAttachmentUnlinkContainerPayload() {
        return new ArrayOfAttachmentUnlinkContainerPayload();
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link PingURLPayload }
     * 
     */
    public PingURLPayload createPingURLPayload() {
        return new PingURLPayload();
    }

    /**
     * Create an instance of {@link ArrayOfDERPayload }
     * 
     */
    public ArrayOfDERPayload createArrayOfDERPayload() {
        return new ArrayOfDERPayload();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link DERGroupsPayload }
     * 
     */
    public DERGroupsPayload createDERGroupsPayload() {
        return new DERGroupsPayload();
    }

    /**
     * Create an instance of {@link ArrayOfObjectRefPayload }
     * 
     */
    public ArrayOfObjectRefPayload createArrayOfObjectRefPayload() {
        return new ArrayOfObjectRefPayload();
    }

    /**
     * Create an instance of {@link GetDomainNamePayload }
     * 
     */
    public GetDomainNamePayload createGetDomainNamePayload() {
        return new GetDomainNamePayload();
    }

    /**
     * Create an instance of {@link ArrayOfDERGroupID1Payload }
     * 
     */
    public ArrayOfDERGroupID1Payload createArrayOfDERGroupID1Payload() {
        return new ArrayOfDERGroupID1Payload();
    }

    /**
     * Create an instance of {@link GetMethodsPayload }
     * 
     */
    public GetMethodsPayload createGetMethodsPayload() {
        return new GetMethodsPayload();
    }

    /**
     * Create an instance of {@link ArrayOfDERIDPayload }
     * 
     */
    public ArrayOfDERIDPayload createArrayOfDERIDPayload() {
        return new ArrayOfDERIDPayload();
    }

    /**
     * Create an instance of {@link ArrayOfDERGroupId }
     * 
     */
    public ArrayOfDERGroupId createArrayOfDERGroupId() {
        return new ArrayOfDERGroupId();
    }

    /**
     * Create an instance of {@link LastReceivedPayload }
     * 
     */
    public LastReceivedPayload createLastReceivedPayload() {
        return new LastReceivedPayload();
    }

    /**
     * Create an instance of {@link ArrayOfDERID2Payload }
     * 
     */
    public ArrayOfDERID2Payload createArrayOfDERID2Payload() {
        return new ArrayOfDERID2Payload();
    }

    /**
     * Create an instance of {@link DomainMemberPayload }
     * 
     */
    public DomainMemberPayload createDomainMemberPayload() {
        return new DomainMemberPayload();
    }

    /**
     * Create an instance of {@link LinkAttachmentsToObjectsPayload }
     * 
     */
    public LinkAttachmentsToObjectsPayload createLinkAttachmentsToObjectsPayload() {
        return new LinkAttachmentsToObjectsPayload();
    }

    /**
     * Create an instance of {@link DERGroupForecastPayload }
     * 
     */
    public DERGroupForecastPayload createDERGroupForecastPayload() {
        return new DERGroupForecastPayload();
    }

    /**
     * Create an instance of {@link GetAllDERsPayload }
     * 
     */
    public GetAllDERsPayload createGetAllDERsPayload() {
        return new GetAllDERsPayload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERIDPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "RemoveDERsFromDERGroup")
    public JAXBElement<ArrayOfDERIDPayload> createRemoveDERsFromDERGroup(ArrayOfDERIDPayload value) {
        return new JAXBElement<ArrayOfDERIDPayload>(_RemoveDERsFromDERGroup_QNAME, ArrayOfDERIDPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDomainNamesResponse")
    public JAXBElement<ArrayOfString> createGetDomainNamesResponse(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetDomainNamesResponse_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "CreateDERGroups")
    public JAXBElement<DERGroupsPayload> createCreateDERGroups(DERGroupsPayload value) {
        return new JAXBElement<DERGroupsPayload>(_CreateDERGroups_QNAME, DERGroupsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMethodsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetMethods")
    public JAXBElement<GetMethodsPayload> createGetMethods(GetMethodsPayload value) {
        return new JAXBElement<GetMethodsPayload>(_GetMethods_QNAME, GetMethodsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetAttachmentsByObjectRefsResponse")
    public JAXBElement<ArrayOfAttachment> createGetAttachmentsByObjectRefsResponse(ArrayOfAttachment value) {
        return new JAXBElement<ArrayOfAttachment>(_GetAttachmentsByObjectRefsResponse_QNAME, ArrayOfAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDomainMembersResponse")
    public JAXBElement<ArrayOfDomainMember> createGetDomainMembersResponse(ArrayOfDomainMember value) {
        return new JAXBElement<ArrayOfDomainMember>(_GetDomainMembersResponse_QNAME, ArrayOfDomainMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetAllDERsResponse")
    public JAXBElement<ArrayOfDER> createGetAllDERsResponse(ArrayOfDER value) {
        return new JAXBElement<ArrayOfDER>(_GetAllDERsResponse_QNAME, ArrayOfDER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingURLPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "PingURL")
    public JAXBElement<PingURLPayload> createPingURL(PingURLPayload value) {
        return new JAXBElement<PingURLPayload>(_PingURL_QNAME, PingURLPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainMemberPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDomainMembers")
    public JAXBElement<DomainMemberPayload> createGetDomainMembers(DomainMemberPayload value) {
        return new JAXBElement<DomainMemberPayload>(_GetDomainMembers_QNAME, DomainMemberPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectRefPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetAttachmentsByObjectRefs")
    public JAXBElement<ArrayOfObjectRefPayload> createGetAttachmentsByObjectRefs(ArrayOfObjectRefPayload value) {
        return new JAXBElement<ArrayOfObjectRefPayload>(_GetAttachmentsByObjectRefs_QNAME, ArrayOfObjectRefPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERGroupID2Payload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "DeleteDERGroups")
    public JAXBElement<ArrayOfDERGroupID2Payload> createDeleteDERGroups(ArrayOfDERGroupID2Payload value) {
        return new JAXBElement<ArrayOfDERGroupID2Payload>(_DeleteDERGroups_QNAME, ArrayOfDERGroupID2Payload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERGroupStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDERGroupStatusesByDERGroupIDsResponse")
    public JAXBElement<ArrayOfDERGroupStatus> createGetDERGroupStatusesByDERGroupIDsResponse(ArrayOfDERGroupStatus value) {
        return new JAXBElement<ArrayOfDERGroupStatus>(_GetDERGroupStatusesByDERGroupIDsResponse_QNAME, ArrayOfDERGroupStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainNamePayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDomainNames")
    public JAXBElement<GetDomainNamePayload> createGetDomainNames(GetDomainNamePayload value) {
        return new JAXBElement<GetDomainNamePayload>(_GetDomainNames_QNAME, GetDomainNamePayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERID2Payload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDERsByDERID")
    public JAXBElement<ArrayOfDERID2Payload> createGetDERsByDERID(ArrayOfDERID2Payload value) {
        return new JAXBElement<ArrayOfDERID2Payload>(_GetDERsByDERID_QNAME, ArrayOfDERID2Payload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetMethodsResponse")
    public JAXBElement<ArrayOfString> createGetMethodsResponse(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_GetMethodsResponse_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERIDPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "InsertDERsInDERGroup")
    public JAXBElement<ArrayOfDERIDPayload> createInsertDERsInDERGroup(ArrayOfDERIDPayload value) {
        return new JAXBElement<ArrayOfDERIDPayload>(_InsertDERsInDERGroup_QNAME, ArrayOfDERIDPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentUnlinkContainerPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "UnlinkAttachmentsFromObjects")
    public JAXBElement<ArrayOfAttachmentUnlinkContainerPayload> createUnlinkAttachmentsFromObjects(ArrayOfAttachmentUnlinkContainerPayload value) {
        return new JAXBElement<ArrayOfAttachmentUnlinkContainerPayload>(_UnlinkAttachmentsFromObjects_QNAME, ArrayOfAttachmentUnlinkContainerPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERGroupID1Payload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDERGroupStatusesByDERGroupIDs")
    public JAXBElement<ArrayOfDERGroupID1Payload> createGetDERGroupStatusesByDERGroupIDs(ArrayOfDERGroupID1Payload value) {
        return new JAXBElement<ArrayOfDERGroupID1Payload>(_GetDERGroupStatusesByDERGroupIDs_QNAME, ArrayOfDERGroupID1Payload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDERGroupForecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDERGroupForecastsResponse")
    public JAXBElement<ArrayOfDERGroupForecast> createGetDERGroupForecastsResponse(ArrayOfDERGroupForecast value) {
        return new JAXBElement<ArrayOfDERGroupForecast>(_GetDERGroupForecastsResponse_QNAME, ArrayOfDERGroupForecast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDERsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetAllDERsPayloadMessage")
    public JAXBElement<GetAllDERsPayload> createGetAllDERsPayloadMessage(GetAllDERsPayload value) {
        return new JAXBElement<GetAllDERsPayload>(_GetAllDERsPayloadMessage_QNAME, GetAllDERsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupForecastPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDERGroupForecasts")
    public JAXBElement<DERGroupForecastPayload> createGetDERGroupForecasts(DERGroupForecastPayload value) {
        return new JAXBElement<DERGroupForecastPayload>(_GetDERGroupForecasts_QNAME, DERGroupForecastPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkAttachmentsToObjectsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "LinkAttachmentsToObjects")
    public JAXBElement<LinkAttachmentsToObjectsPayload> createLinkAttachmentsToObjects(LinkAttachmentsToObjectsPayload value) {
        return new JAXBElement<LinkAttachmentsToObjectsPayload>(_LinkAttachmentsToObjects_QNAME, LinkAttachmentsToObjectsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetDERsByDERIDResponse")
    public JAXBElement<ArrayOfDER> createGetDERsByDERIDResponse(ArrayOfDER value) {
        return new JAXBElement<ArrayOfDER>(_GetDERsByDERIDResponse_QNAME, ArrayOfDER.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastReceivedPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sixthc.com/wsdl/DER_Request", name = "GetAllDERs")
    public JAXBElement<LastReceivedPayload> createGetAllDERs(LastReceivedPayload value) {
        return new JAXBElement<LastReceivedPayload>(_GetAllDERs_QNAME, LastReceivedPayload.class, null, value);
    }

}
