
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.multispeak.v5.ReceivedCDDevices;
import org.multispeak.v5.ReceivedElectricMeters;
import org.multispeak.v5.ReceivedGasMeters;
import org.multispeak.v5.ReceivedLoadManagementDevices;
import org.multispeak.v5.ReceivedModules;
import org.multispeak.v5.ReceivedPremisesDisplays;
import org.multispeak.v5.ReceivedPropaneMeters;
import org.multispeak.v5.ReceivedWaterMeters;
import org.multispeak.v5.TransponderIDRange;
import org.multispeak.v5_0.commontypes.Address;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.multispeak.v5_0.sandbox package. 
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

    private final static QName _EndDeviceShipmentShippedToAddress_QNAME = new QName("", "shippedToAddress");
    private final static QName _EndDeviceShipmentReceivedModules_QNAME = new QName("", "receivedModules");
    private final static QName _EndDeviceShipmentShippedDate_QNAME = new QName("", "shippedDate");
    private final static QName _EndDeviceShipmentPoReferenceNumber_QNAME = new QName("", "poReferenceNumber");
    private final static QName _EndDeviceShipmentTransponderIDRange_QNAME = new QName("", "transponderIDRange");
    private final static QName _EndDeviceShipmentRecipient_QNAME = new QName("", "recipient");
    private final static QName _EndDeviceShipmentShippingTicketNumber_QNAME = new QName("", "shippingTicketNumber");
    private final static QName _EndDeviceShipmentReceivedDate_QNAME = new QName("", "receivedDate");
    private final static QName _EndDeviceShipmentReceivedGasMeters_QNAME = new QName("", "receivedGasMeters");
    private final static QName _EndDeviceShipmentUtility_QNAME = new QName("", "utility");
    private final static QName _EndDeviceShipmentManufacturer_QNAME = new QName("", "manufacturer");
    private final static QName _EndDeviceShipmentReceivedWaterMeters_QNAME = new QName("", "receivedWaterMeters");
    private final static QName _EndDeviceShipmentReceivedElectricMeters_QNAME = new QName("", "receivedElectricMeters");
    private final static QName _EndDeviceShipmentReceivedLoadManagementDevices_QNAME = new QName("", "receivedLoadManagementDevices");
    private final static QName _EndDeviceShipmentReceivedPremisesDisplays_QNAME = new QName("", "receivedPremisesDisplays");
    private final static QName _EndDeviceShipmentReceivedCDDevices_QNAME = new QName("", "receivedCDDevices");
    private final static QName _EndDeviceShipmentReceivedPropaneMeters_QNAME = new QName("", "receivedPropaneMeters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.multispeak.v5_0.sandbox
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Timesheet }
     * 
     */
    public Timesheet createTimesheet() {
        return new Timesheet();
    }

    /**
     * Create an instance of {@link BlinkAlarm }
     * 
     */
    public BlinkAlarm createBlinkAlarm() {
        return new BlinkAlarm();
    }

    /**
     * Create an instance of {@link ElectricMeterTest }
     * 
     */
    public ElectricMeterTest createElectricMeterTest() {
        return new ElectricMeterTest();
    }

    /**
     * Create an instance of {@link DERGroupIDs }
     * 
     */
    public DERGroupIDs createDERGroupIDs() {
        return new DERGroupIDs();
    }

    /**
     * Create an instance of {@link MaintenanceDataSet }
     * 
     */
    public MaintenanceDataSet createMaintenanceDataSet() {
        return new MaintenanceDataSet();
    }

    /**
     * Create an instance of {@link DERGroupStatuses }
     * 
     */
    public DERGroupStatuses createDERGroupStatuses() {
        return new DERGroupStatuses();
    }

    /**
     * Create an instance of {@link RemoveDERsFromDERGroupResponse }
     * 
     */
    public RemoveDERsFromDERGroupResponse createRemoveDERsFromDERGroupResponse() {
        return new RemoveDERsFromDERGroupResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetDERGroupMembers }
     * 
     */
    public GetDERGroupMembers createGetDERGroupMembers() {
        return new GetDERGroupMembers();
    }

    /**
     * Create an instance of {@link GetDERGroupStatuses }
     * 
     */
    public GetDERGroupStatuses createGetDERGroupStatuses() {
        return new GetDERGroupStatuses();
    }

    /**
     * Create an instance of {@link RequisitionResultItem }
     * 
     */
    public RequisitionResultItem createRequisitionResultItem() {
        return new RequisitionResultItem();
    }

    /**
     * Create an instance of {@link OtherCapabilities }
     * 
     */
    public OtherCapabilities createOtherCapabilities() {
        return new OtherCapabilities();
    }

    /**
     * Create an instance of {@link DERIDs }
     * 
     */
    public DERIDs createDERIDs() {
        return new DERIDs();
    }

    /**
     * Create an instance of {@link DERGroups }
     * 
     */
    public DERGroups createDERGroups() {
        return new DERGroups();
    }

    /**
     * Create an instance of {@link AsLeft }
     * 
     */
    public AsLeft createAsLeft() {
        return new AsLeft();
    }

    /**
     * Create an instance of {@link DamageAssessmentLocation }
     * 
     */
    public DamageAssessmentLocation createDamageAssessmentLocation() {
        return new DamageAssessmentLocation();
    }

    /**
     * Create an instance of {@link DERGroupID }
     * 
     */
    public DERGroupID createDERGroupID() {
        return new DERGroupID();
    }

    /**
     * Create an instance of {@link GetDERGroupForecastsResponse }
     * 
     */
    public GetDERGroupForecastsResponse createGetDERGroupForecastsResponse() {
        return new GetDERGroupForecastsResponse();
    }

    /**
     * Create an instance of {@link RequisitionItem }
     * 
     */
    public RequisitionItem createRequisitionItem() {
        return new RequisitionItem();
    }

    /**
     * Create an instance of {@link DamageAssessments }
     * 
     */
    public DamageAssessments createDamageAssessments() {
        return new DamageAssessments();
    }

    /**
     * Create an instance of {@link EmployeeTimeRecordList }
     * 
     */
    public EmployeeTimeRecordList createEmployeeTimeRecordList() {
        return new EmployeeTimeRecordList();
    }

    /**
     * Create an instance of {@link MeterConditions }
     * 
     */
    public MeterConditions createMeterConditions() {
        return new MeterConditions();
    }

    /**
     * Create an instance of {@link ObservationList }
     * 
     */
    public ObservationList createObservationList() {
        return new ObservationList();
    }

    /**
     * Create an instance of {@link ReactivePowerRating }
     * 
     */
    public ReactivePowerRating createReactivePowerRating() {
        return new ReactivePowerRating();
    }

    /**
     * Create an instance of {@link MaterialRequisition }
     * 
     */
    public MaterialRequisition createMaterialRequisition() {
        return new MaterialRequisition();
    }

    /**
     * Create an instance of {@link DERGroup }
     * 
     */
    public DERGroup createDERGroup() {
        return new DERGroup();
    }

    /**
     * Create an instance of {@link ApparentPowerRating }
     * 
     */
    public ApparentPowerRating createApparentPowerRating() {
        return new ApparentPowerRating();
    }

    /**
     * Create an instance of {@link GetDERs }
     * 
     */
    public GetDERs createGetDERs() {
        return new GetDERs();
    }

    /**
     * Create an instance of {@link MessageChoice }
     * 
     */
    public MessageChoice createMessageChoice() {
        return new MessageChoice();
    }

    /**
     * Create an instance of {@link DeleteDERGroupsResponse }
     * 
     */
    public DeleteDERGroupsResponse createDeleteDERGroupsResponse() {
        return new DeleteDERGroupsResponse();
    }

    /**
     * Create an instance of {@link AsFound }
     * 
     */
    public AsFound createAsFound() {
        return new AsFound();
    }

    /**
     * Create an instance of {@link RequestedCapabilities }
     * 
     */
    public RequestedCapabilities createRequestedCapabilities() {
        return new RequestedCapabilities();
    }

    /**
     * Create an instance of {@link TCIntervals }
     * 
     */
    public TCIntervals createTCIntervals() {
        return new TCIntervals();
    }

    /**
     * Create an instance of {@link TransactiveFeedbackSignal }
     * 
     */
    public TransactiveFeedbackSignal createTransactiveFeedbackSignal() {
        return new TransactiveFeedbackSignal();
    }

    /**
     * Create an instance of {@link RealPowerRatings }
     * 
     */
    public RealPowerRatings createRealPowerRatings() {
        return new RealPowerRatings();
    }

    /**
     * Create an instance of {@link GetDERGroupNames }
     * 
     */
    public GetDERGroupNames createGetDERGroupNames() {
        return new GetDERGroupNames();
    }

    /**
     * Create an instance of {@link DeleteDERGroups }
     * 
     */
    public DeleteDERGroups createDeleteDERGroups() {
        return new DeleteDERGroups();
    }

    /**
     * Create an instance of {@link StorageLocation }
     * 
     */
    public StorageLocation createStorageLocation() {
        return new StorageLocation();
    }

    /**
     * Create an instance of {@link DERGroupStatus }
     * 
     */
    public DERGroupStatus createDERGroupStatus() {
        return new DERGroupStatus();
    }

    /**
     * Create an instance of {@link GetDERGroupMembersResponse }
     * 
     */
    public GetDERGroupMembersResponse createGetDERGroupMembersResponse() {
        return new GetDERGroupMembersResponse();
    }

    /**
     * Create an instance of {@link DERType }
     * 
     */
    public DERType createDERType() {
        return new DERType();
    }

    /**
     * Create an instance of {@link RequestedCapability }
     * 
     */
    public RequestedCapability createRequestedCapability() {
        return new RequestedCapability();
    }

    /**
     * Create an instance of {@link ObservedValue }
     * 
     */
    public ObservedValue createObservedValue() {
        return new ObservedValue();
    }

    /**
     * Create an instance of {@link DERGroupDispatchRequest }
     * 
     */
    public DERGroupDispatchRequest createDERGroupDispatchRequest() {
        return new DERGroupDispatchRequest();
    }

    /**
     * Create an instance of {@link InsertDERsInDERGroup }
     * 
     */
    public InsertDERsInDERGroup createInsertDERsInDERGroup() {
        return new InsertDERsInDERGroup();
    }

    /**
     * Create an instance of {@link EndDeviceShipment }
     * 
     */
    public EndDeviceShipment createEndDeviceShipment() {
        return new EndDeviceShipment();
    }

    /**
     * Create an instance of {@link VoltageAlarmItem }
     * 
     */
    public VoltageAlarmItem createVoltageAlarmItem() {
        return new VoltageAlarmItem();
    }

    /**
     * Create an instance of {@link TransactiveIncentiveSignal }
     * 
     */
    public TransactiveIncentiveSignal createTransactiveIncentiveSignal() {
        return new TransactiveIncentiveSignal();
    }

    /**
     * Create an instance of {@link EmployeeTimeRecord }
     * 
     */
    public EmployeeTimeRecord createEmployeeTimeRecord() {
        return new EmployeeTimeRecord();
    }

    /**
     * Create an instance of {@link DERID }
     * 
     */
    public DERID createDERID() {
        return new DERID();
    }

    /**
     * Create an instance of {@link RequisitionResult }
     * 
     */
    public RequisitionResult createRequisitionResult() {
        return new RequisitionResult();
    }

    /**
     * Create an instance of {@link RealPowerRampRate }
     * 
     */
    public RealPowerRampRate createRealPowerRampRate() {
        return new RealPowerRampRate();
    }

    /**
     * Create an instance of {@link PANLinkages }
     * 
     */
    public PANLinkages createPANLinkages() {
        return new PANLinkages();
    }

    /**
     * Create an instance of {@link RealPowerRating }
     * 
     */
    public RealPowerRating createRealPowerRating() {
        return new RealPowerRating();
    }

    /**
     * Create an instance of {@link GetDERsByDERIDsResponse }
     * 
     */
    public GetDERsByDERIDsResponse createGetDERsByDERIDsResponse() {
        return new GetDERsByDERIDsResponse();
    }

    /**
     * Create an instance of {@link ApparentPowerRatings }
     * 
     */
    public ApparentPowerRatings createApparentPowerRatings() {
        return new ApparentPowerRatings();
    }

    /**
     * Create an instance of {@link RemoveDERsFromDERGroup }
     * 
     */
    public RemoveDERsFromDERGroup createRemoveDERsFromDERGroup() {
        return new RemoveDERsFromDERGroup();
    }

    /**
     * Create an instance of {@link RequisitionItems }
     * 
     */
    public RequisitionItems createRequisitionItems() {
        return new RequisitionItems();
    }

    /**
     * Create an instance of {@link DamageAssessment }
     * 
     */
    public DamageAssessment createDamageAssessment() {
        return new DamageAssessment();
    }

    /**
     * Create an instance of {@link RequisitionResultItems }
     * 
     */
    public RequisitionResultItems createRequisitionResultItems() {
        return new RequisitionResultItems();
    }

    /**
     * Create an instance of {@link JobWorkedList }
     * 
     */
    public JobWorkedList createJobWorkedList() {
        return new JobWorkedList();
    }

    /**
     * Create an instance of {@link MaterialRequisitionCancellation }
     * 
     */
    public MaterialRequisitionCancellation createMaterialRequisitionCancellation() {
        return new MaterialRequisitionCancellation();
    }

    /**
     * Create an instance of {@link InsertDERsInDERGroupResponse }
     * 
     */
    public InsertDERsInDERGroupResponse createInsertDERsInDERGroupResponse() {
        return new InsertDERsInDERGroupResponse();
    }

    /**
     * Create an instance of {@link MeterTests }
     * 
     */
    public MeterTests createMeterTests() {
        return new MeterTests();
    }

    /**
     * Create an instance of {@link GetDERGroupForecasts }
     * 
     */
    public GetDERGroupForecasts createGetDERGroupForecasts() {
        return new GetDERGroupForecasts();
    }

    /**
     * Create an instance of {@link DERGroupPrediction }
     * 
     */
    public DERGroupPrediction createDERGroupPrediction() {
        return new DERGroupPrediction();
    }

    /**
     * Create an instance of {@link TestedElectricMeter }
     * 
     */
    public TestedElectricMeter createTestedElectricMeter() {
        return new TestedElectricMeter();
    }

    /**
     * Create an instance of {@link VoltageAlarm }
     * 
     */
    public VoltageAlarm createVoltageAlarm() {
        return new VoltageAlarm();
    }

    /**
     * Create an instance of {@link GeneratingUnits }
     * 
     */
    public GeneratingUnits createGeneratingUnits() {
        return new GeneratingUnits();
    }

    /**
     * Create an instance of {@link JobWorked }
     * 
     */
    public JobWorked createJobWorked() {
        return new JobWorked();
    }

    /**
     * Create an instance of {@link ReactivePowerRatings }
     * 
     */
    public ReactivePowerRatings createReactivePowerRatings() {
        return new ReactivePowerRatings();
    }

    /**
     * Create an instance of {@link DispatchTargets }
     * 
     */
    public DispatchTargets createDispatchTargets() {
        return new DispatchTargets();
    }

    /**
     * Create an instance of {@link CreateDERGroups }
     * 
     */
    public CreateDERGroups createCreateDERGroups() {
        return new CreateDERGroups();
    }

    /**
     * Create an instance of {@link ItemsMaintained }
     * 
     */
    public ItemsMaintained createItemsMaintained() {
        return new ItemsMaintained();
    }

    /**
     * Create an instance of {@link GetDERsByDERIDs }
     * 
     */
    public GetDERsByDERIDs createGetDERsByDERIDs() {
        return new GetDERsByDERIDs();
    }

    /**
     * Create an instance of {@link ObservationDefinition }
     * 
     */
    public ObservationDefinition createObservationDefinition() {
        return new ObservationDefinition();
    }

    /**
     * Create an instance of {@link VoltageAlarmList }
     * 
     */
    public VoltageAlarmList createVoltageAlarmList() {
        return new VoltageAlarmList();
    }

    /**
     * Create an instance of {@link PAN }
     * 
     */
    public PAN createPAN() {
        return new PAN();
    }

    /**
     * Create an instance of {@link OtherCapability }
     * 
     */
    public OtherCapability createOtherCapability() {
        return new OtherCapability();
    }

    /**
     * Create an instance of {@link DERGroupCapabilities }
     * 
     */
    public DERGroupCapabilities createDERGroupCapabilities() {
        return new DERGroupCapabilities();
    }

    /**
     * Create an instance of {@link ElectricMeterTests }
     * 
     */
    public ElectricMeterTests createElectricMeterTests() {
        return new ElectricMeterTests();
    }

    /**
     * Create an instance of {@link TransactiveSignal }
     * 
     */
    public TransactiveSignal createTransactiveSignal() {
        return new TransactiveSignal();
    }

    /**
     * Create an instance of {@link Observation }
     * 
     */
    public Observation createObservation() {
        return new Observation();
    }

    /**
     * Create an instance of {@link TCInterval }
     * 
     */
    public TCInterval createTCInterval() {
        return new TCInterval();
    }

    /**
     * Create an instance of {@link RemoteReconnectSetting }
     * 
     */
    public RemoteReconnectSetting createRemoteReconnectSetting() {
        return new RemoteReconnectSetting();
    }

    /**
     * Create an instance of {@link DERGroupForecast }
     * 
     */
    public DERGroupForecast createDERGroupForecast() {
        return new DERGroupForecast();
    }

    /**
     * Create an instance of {@link GetDERGroupNamesResponse }
     * 
     */
    public GetDERGroupNamesResponse createGetDERGroupNamesResponse() {
        return new GetDERGroupNamesResponse();
    }

    /**
     * Create an instance of {@link Inspection }
     * 
     */
    public Inspection createInspection() {
        return new Inspection();
    }

    /**
     * Create an instance of {@link MaterialRequisitionResult }
     * 
     */
    public MaterialRequisitionResult createMaterialRequisitionResult() {
        return new MaterialRequisitionResult();
    }

    /**
     * Create an instance of {@link DER }
     * 
     */
    public DER createDER() {
        return new DER();
    }

    /**
     * Create an instance of {@link GetDERsResponse }
     * 
     */
    public GetDERsResponse createGetDERsResponse() {
        return new GetDERsResponse();
    }

    /**
     * Create an instance of {@link ItemMaintained }
     * 
     */
    public ItemMaintained createItemMaintained() {
        return new ItemMaintained();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusesResponse }
     * 
     */
    public GetDERGroupStatusesResponse createGetDERGroupStatusesResponse() {
        return new GetDERGroupStatusesResponse();
    }

    /**
     * Create an instance of {@link DERGroupForecasts }
     * 
     */
    public DERGroupForecasts createDERGroupForecasts() {
        return new DERGroupForecasts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shippedToAddress", scope = EndDeviceShipment.class)
    public JAXBElement<Address> createEndDeviceShipmentShippedToAddress(Address value) {
        return new JAXBElement<Address>(_EndDeviceShipmentShippedToAddress_QNAME, Address.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedModules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedModules", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedModules> createEndDeviceShipmentReceivedModules(ReceivedModules value) {
        return new JAXBElement<ReceivedModules>(_EndDeviceShipmentReceivedModules_QNAME, ReceivedModules.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shippedDate", scope = EndDeviceShipment.class)
    public JAXBElement<XMLGregorianCalendar> createEndDeviceShipmentShippedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDeviceShipmentShippedDate_QNAME, XMLGregorianCalendar.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "poReferenceNumber", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentPoReferenceNumber(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentPoReferenceNumber_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransponderIDRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transponderIDRange", scope = EndDeviceShipment.class)
    public JAXBElement<TransponderIDRange> createEndDeviceShipmentTransponderIDRange(TransponderIDRange value) {
        return new JAXBElement<TransponderIDRange>(_EndDeviceShipmentTransponderIDRange_QNAME, TransponderIDRange.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recipient", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentRecipient(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentRecipient_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shippingTicketNumber", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentShippingTicketNumber(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentShippingTicketNumber_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedDate", scope = EndDeviceShipment.class)
    public JAXBElement<XMLGregorianCalendar> createEndDeviceShipmentReceivedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDeviceShipmentReceivedDate_QNAME, XMLGregorianCalendar.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedGasMeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedGasMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedGasMeters> createEndDeviceShipmentReceivedGasMeters(ReceivedGasMeters value) {
        return new JAXBElement<ReceivedGasMeters>(_EndDeviceShipmentReceivedGasMeters_QNAME, ReceivedGasMeters.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "utility", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentUtility(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentUtility_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "manufacturer", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentManufacturer(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentManufacturer_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedWaterMeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedWaterMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedWaterMeters> createEndDeviceShipmentReceivedWaterMeters(ReceivedWaterMeters value) {
        return new JAXBElement<ReceivedWaterMeters>(_EndDeviceShipmentReceivedWaterMeters_QNAME, ReceivedWaterMeters.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedElectricMeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedElectricMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedElectricMeters> createEndDeviceShipmentReceivedElectricMeters(ReceivedElectricMeters value) {
        return new JAXBElement<ReceivedElectricMeters>(_EndDeviceShipmentReceivedElectricMeters_QNAME, ReceivedElectricMeters.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedLoadManagementDevices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedLoadManagementDevices", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedLoadManagementDevices> createEndDeviceShipmentReceivedLoadManagementDevices(ReceivedLoadManagementDevices value) {
        return new JAXBElement<ReceivedLoadManagementDevices>(_EndDeviceShipmentReceivedLoadManagementDevices_QNAME, ReceivedLoadManagementDevices.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedPremisesDisplays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedPremisesDisplays", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedPremisesDisplays> createEndDeviceShipmentReceivedPremisesDisplays(ReceivedPremisesDisplays value) {
        return new JAXBElement<ReceivedPremisesDisplays>(_EndDeviceShipmentReceivedPremisesDisplays_QNAME, ReceivedPremisesDisplays.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedCDDevices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedCDDevices", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedCDDevices> createEndDeviceShipmentReceivedCDDevices(ReceivedCDDevices value) {
        return new JAXBElement<ReceivedCDDevices>(_EndDeviceShipmentReceivedCDDevices_QNAME, ReceivedCDDevices.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedPropaneMeters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "receivedPropaneMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ReceivedPropaneMeters> createEndDeviceShipmentReceivedPropaneMeters(ReceivedPropaneMeters value) {
        return new JAXBElement<ReceivedPropaneMeters>(_EndDeviceShipmentReceivedPropaneMeters_QNAME, ReceivedPropaneMeters.class, EndDeviceShipment.class, value);
    }

}
