
package com.sixthc.cim.create.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sixthc.cim.create.cxf package. 
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

    private final static QName _CloseMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "CloseMaintenanceOrders");
    private final static QName _CanceledMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "CanceledMaintenanceOrders");
    private final static QName _DeletedMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "DeletedMaintenanceOrders");
    private final static QName _MaintenanceOrdersResponseMessage_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "MaintenanceOrdersResponseMessage");
    private final static QName _EventMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "EventMessage");
    private final static QName _CreatedMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "CreatedMaintenanceOrders");
    private final static QName _CancelMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "CancelMaintenanceOrders");
    private final static QName _ChangeMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "ChangeMaintenanceOrders");
    private final static QName _MaintenanceOrdersFaultMessage_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "MaintenanceOrdersFaultMessage");
    private final static QName _CreateMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "CreateMaintenanceOrders");
    private final static QName _Message_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Message");
    private final static QName _DeleteMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "DeleteMaintenanceOrders");
    private final static QName _ChangedMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "ChangedMaintenanceOrders");
    private final static QName _MaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrders#", "MaintenanceOrders");
    private final static QName _FaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "FaultMessage");
    private final static QName _ResponseMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ResponseMessage");
    private final static QName _RequestMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessage");
    private final static QName _ClosedMaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrdersMessage", "ClosedMaintenanceOrders");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sixthc.cim.create.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReplyType.ID }
     * 
     */
    public ReplyType.ID createReplyTypeID() {
        return new ReplyType.ID();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link RequestType.ID }
     * 
     */
    public RequestType.ID createRequestTypeID() {
        return new RequestType.ID();
    }

    /**
     * Create an instance of {@link PayloadType }
     * 
     */
    public PayloadType createPayloadType() {
        return new PayloadType();
    }

    /**
     * Create an instance of {@link NameTypeAuthority2 }
     * 
     */
    public NameTypeAuthority2 createNameTypeAuthority2() {
        return new NameTypeAuthority2();
    }

    /**
     * Create an instance of {@link Organisation }
     * 
     */
    public Organisation createOrganisation() {
        return new Organisation();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Work.Priority }
     * 
     */
    public Work.Priority createWorkPriority() {
        return new Work.Priority();
    }

    /**
     * Create an instance of {@link WorkAsset.Procedures.Measurements }
     * 
     */
    public WorkAsset.Procedures.Measurements createWorkAssetProceduresMeasurements() {
        return new WorkAsset.Procedures.Measurements();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress }
     * 
     */
    public Organisation.StreetAddress createOrganisationStreetAddress() {
        return new Organisation.StreetAddress();
    }

    /**
     * Create an instance of {@link Name2 }
     * 
     */
    public Name2 createName2() {
        return new Name2();
    }

    /**
     * Create an instance of {@link WorkTask.MaterialItems.Quantity }
     * 
     */
    public WorkTask.MaterialItems.Quantity createWorkTaskMaterialItemsQuantity() {
        return new WorkTask.MaterialItems.Quantity();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link WorkLocation.PositionPoints }
     * 
     */
    public WorkLocation.PositionPoints createWorkLocationPositionPoints() {
        return new WorkLocation.PositionPoints();
    }

    /**
     * Create an instance of {@link WorkLocation.CoordinateSystem }
     * 
     */
    public WorkLocation.CoordinateSystem createWorkLocationCoordinateSystem() {
        return new WorkLocation.CoordinateSystem();
    }

    /**
     * Create an instance of {@link WorkTask }
     * 
     */
    public WorkTask createWorkTask() {
        return new WorkTask();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link MaintenanceOrdersFaultMessageType }
     * 
     */
    public MaintenanceOrdersFaultMessageType createMaintenanceOrdersFaultMessageType() {
        return new MaintenanceOrdersFaultMessageType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.TownDetail }
     * 
     */
    public WorkLocation.MainAddress.TownDetail createWorkLocationMainAddressTownDetail() {
        return new WorkLocation.MainAddress.TownDetail();
    }

    /**
     * Create an instance of {@link TelephoneNumber }
     * 
     */
    public TelephoneNumber createTelephoneNumber() {
        return new TelephoneNumber();
    }

    /**
     * Create an instance of {@link Work.Attachments }
     * 
     */
    public Work.Attachments createWorkAttachments() {
        return new Work.Attachments();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link WorkTimeSchedule }
     * 
     */
    public WorkTimeSchedule createWorkTimeSchedule() {
        return new WorkTimeSchedule();
    }

    /**
     * Create an instance of {@link FaultMessageType }
     * 
     */
    public FaultMessageType createFaultMessageType() {
        return new FaultMessageType();
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link AssetLocationHazard }
     * 
     */
    public AssetLocationHazard createAssetLocationHazard() {
        return new AssetLocationHazard();
    }

    /**
     * Create an instance of {@link WorkAsset.Procedures }
     * 
     */
    public WorkAsset.Procedures createWorkAssetProcedures() {
        return new WorkAsset.Procedures();
    }

    /**
     * Create an instance of {@link MaintenanceOrdersResponseMessageType }
     * 
     */
    public MaintenanceOrdersResponseMessageType createMaintenanceOrdersResponseMessageType() {
        return new MaintenanceOrdersResponseMessageType();
    }

    /**
     * Create an instance of {@link InternalLocation }
     * 
     */
    public InternalLocation createInternalLocation() {
        return new InternalLocation();
    }

    /**
     * Create an instance of {@link ErrorType.RelatedID }
     * 
     */
    public ErrorType.RelatedID createErrorTypeRelatedID() {
        return new ErrorType.RelatedID();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link Asset.Procedures.Measurements }
     * 
     */
    public Asset.Procedures.Measurements createAssetProceduresMeasurements() {
        return new Asset.Procedures.Measurements();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link MaintenanceOrders }
     * 
     */
    public MaintenanceOrders createMaintenanceOrders() {
        return new MaintenanceOrders();
    }

    /**
     * Create an instance of {@link WorkLocation }
     * 
     */
    public WorkLocation createWorkLocation() {
        return new WorkLocation();
    }

    /**
     * Create an instance of {@link WorkAsset }
     * 
     */
    public WorkAsset createWorkAsset() {
        return new WorkAsset();
    }

    /**
     * Create an instance of {@link PayloadType.ID }
     * 
     */
    public PayloadType.ID createPayloadTypeID() {
        return new PayloadType.ID();
    }

    /**
     * Create an instance of {@link MessageProperty }
     * 
     */
    public MessageProperty createMessageProperty() {
        return new MessageProperty();
    }

    /**
     * Create an instance of {@link ActivityRecord }
     * 
     */
    public ActivityRecord createActivityRecord() {
        return new ActivityRecord();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link CrewMember }
     * 
     */
    public CrewMember createCrewMember() {
        return new CrewMember();
    }

    /**
     * Create an instance of {@link ReplyType }
     * 
     */
    public ReplyType createReplyType() {
        return new ReplyType();
    }

    /**
     * Create an instance of {@link NameType2 }
     * 
     */
    public NameType2 createNameType2() {
        return new NameType2();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress.TownDetail }
     * 
     */
    public Organisation.StreetAddress.TownDetail createOrganisationStreetAddressTownDetail() {
        return new Organisation.StreetAddress.TownDetail();
    }

    /**
     * Create an instance of {@link ErrorType.ID }
     * 
     */
    public ErrorType.ID createErrorTypeID() {
        return new ErrorType.ID();
    }

    /**
     * Create an instance of {@link MaintenanceOrdersPayloadType }
     * 
     */
    public MaintenanceOrdersPayloadType createMaintenanceOrdersPayloadType() {
        return new MaintenanceOrdersPayloadType();
    }

    /**
     * Create an instance of {@link OperationSet }
     * 
     */
    public OperationSet createOperationSet() {
        return new OperationSet();
    }

    /**
     * Create an instance of {@link ReplayDetectionType }
     * 
     */
    public ReplayDetectionType createReplayDetectionType() {
        return new ReplayDetectionType();
    }

    /**
     * Create an instance of {@link MaintenanceOrdersEventMessageType }
     * 
     */
    public MaintenanceOrdersEventMessageType createMaintenanceOrdersEventMessageType() {
        return new MaintenanceOrdersEventMessageType();
    }

    /**
     * Create an instance of {@link EventMessageType }
     * 
     */
    public EventMessageType createEventMessageType() {
        return new EventMessageType();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress.StreetDetail }
     * 
     */
    public Organisation.StreetAddress.StreetDetail createOrganisationStreetAddressStreetDetail() {
        return new Organisation.StreetAddress.StreetDetail();
    }

    /**
     * Create an instance of {@link MaintenanceOrder }
     * 
     */
    public MaintenanceOrder createMaintenanceOrder() {
        return new MaintenanceOrder();
    }

    /**
     * Create an instance of {@link Asset.Procedures }
     * 
     */
    public Asset.Procedures createAssetProcedures() {
        return new Asset.Procedures();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress }
     * 
     */
    public WorkLocation.MainAddress createWorkLocationMainAddress() {
        return new WorkLocation.MainAddress();
    }

    /**
     * Create an instance of {@link WorkTimeSchedule.ScheduleInterval }
     * 
     */
    public WorkTimeSchedule.ScheduleInterval createWorkTimeScheduleScheduleInterval() {
        return new WorkTimeSchedule.ScheduleInterval();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.StreetDetail }
     * 
     */
    public WorkLocation.MainAddress.StreetDetail createWorkLocationMainAddressStreetDetail() {
        return new WorkLocation.MainAddress.StreetDetail();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link OptionType }
     * 
     */
    public OptionType createOptionType() {
        return new OptionType();
    }

    /**
     * Create an instance of {@link Organisation.Phone1 }
     * 
     */
    public Organisation.Phone1 createOrganisationPhone1() {
        return new Organisation.Phone1();
    }

    /**
     * Create an instance of {@link WorkTask.MaterialItems }
     * 
     */
    public WorkTask.MaterialItems createWorkTaskMaterialItems() {
        return new WorkTask.MaterialItems();
    }

    /**
     * Create an instance of {@link CrewMember.Person }
     * 
     */
    public CrewMember.Person createCrewMemberPerson() {
        return new CrewMember.Person();
    }

    /**
     * Create an instance of {@link MaintenanceOrdersRequestMessageType }
     * 
     */
    public MaintenanceOrdersRequestMessageType createMaintenanceOrdersRequestMessageType() {
        return new MaintenanceOrdersRequestMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "CloseMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersRequestMessageType> createCloseMaintenanceOrders(MaintenanceOrdersRequestMessageType value) {
        return new JAXBElement<MaintenanceOrdersRequestMessageType>(_CloseMaintenanceOrders_QNAME, MaintenanceOrdersRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "CanceledMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersEventMessageType> createCanceledMaintenanceOrders(MaintenanceOrdersEventMessageType value) {
        return new JAXBElement<MaintenanceOrdersEventMessageType>(_CanceledMaintenanceOrders_QNAME, MaintenanceOrdersEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "DeletedMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersEventMessageType> createDeletedMaintenanceOrders(MaintenanceOrdersEventMessageType value) {
        return new JAXBElement<MaintenanceOrdersEventMessageType>(_DeletedMaintenanceOrders_QNAME, MaintenanceOrdersEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "MaintenanceOrdersResponseMessage")
    public JAXBElement<MaintenanceOrdersResponseMessageType> createMaintenanceOrdersResponseMessage(MaintenanceOrdersResponseMessageType value) {
        return new JAXBElement<MaintenanceOrdersResponseMessageType>(_MaintenanceOrdersResponseMessage_QNAME, MaintenanceOrdersResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "EventMessage")
    public JAXBElement<EventMessageType> createEventMessage(EventMessageType value) {
        return new JAXBElement<EventMessageType>(_EventMessage_QNAME, EventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "CreatedMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersEventMessageType> createCreatedMaintenanceOrders(MaintenanceOrdersEventMessageType value) {
        return new JAXBElement<MaintenanceOrdersEventMessageType>(_CreatedMaintenanceOrders_QNAME, MaintenanceOrdersEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "CancelMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersRequestMessageType> createCancelMaintenanceOrders(MaintenanceOrdersRequestMessageType value) {
        return new JAXBElement<MaintenanceOrdersRequestMessageType>(_CancelMaintenanceOrders_QNAME, MaintenanceOrdersRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "ChangeMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersRequestMessageType> createChangeMaintenanceOrders(MaintenanceOrdersRequestMessageType value) {
        return new JAXBElement<MaintenanceOrdersRequestMessageType>(_ChangeMaintenanceOrders_QNAME, MaintenanceOrdersRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "MaintenanceOrdersFaultMessage")
    public JAXBElement<MaintenanceOrdersFaultMessageType> createMaintenanceOrdersFaultMessage(MaintenanceOrdersFaultMessageType value) {
        return new JAXBElement<MaintenanceOrdersFaultMessageType>(_MaintenanceOrdersFaultMessage_QNAME, MaintenanceOrdersFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "CreateMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersRequestMessageType> createCreateMaintenanceOrders(MaintenanceOrdersRequestMessageType value) {
        return new JAXBElement<MaintenanceOrdersRequestMessageType>(_CreateMaintenanceOrders_QNAME, MaintenanceOrdersRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Message")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<MessageType>(_Message_QNAME, MessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "DeleteMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersRequestMessageType> createDeleteMaintenanceOrders(MaintenanceOrdersRequestMessageType value) {
        return new JAXBElement<MaintenanceOrdersRequestMessageType>(_DeleteMaintenanceOrders_QNAME, MaintenanceOrdersRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "ChangedMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersEventMessageType> createChangedMaintenanceOrders(MaintenanceOrdersEventMessageType value) {
        return new JAXBElement<MaintenanceOrdersEventMessageType>(_ChangedMaintenanceOrders_QNAME, MaintenanceOrdersEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#", name = "MaintenanceOrders")
    public JAXBElement<MaintenanceOrders> createMaintenanceOrders(MaintenanceOrders value) {
        return new JAXBElement<MaintenanceOrders>(_MaintenanceOrders_QNAME, MaintenanceOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "FaultMessage")
    public JAXBElement<FaultMessageType> createFaultMessage(FaultMessageType value) {
        return new JAXBElement<FaultMessageType>(_FaultMessage_QNAME, FaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ResponseMessage")
    public JAXBElement<ResponseMessageType> createResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_ResponseMessage_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessage")
    public JAXBElement<RequestMessageType> createRequestMessage(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_RequestMessage_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrdersEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", name = "ClosedMaintenanceOrders")
    public JAXBElement<MaintenanceOrdersEventMessageType> createClosedMaintenanceOrders(MaintenanceOrdersEventMessageType value) {
        return new JAXBElement<MaintenanceOrdersEventMessageType>(_ClosedMaintenanceOrders_QNAME, MaintenanceOrdersEventMessageType.class, null, value);
    }

}
