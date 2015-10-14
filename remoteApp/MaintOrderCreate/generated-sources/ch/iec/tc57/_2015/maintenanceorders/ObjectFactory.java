
package ch.iec.tc57._2015.maintenanceorders;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2015.maintenanceorders package. 
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

    private final static QName _MaintenanceOrders_QNAME = new QName("http://iec.ch/TC57/2015/MaintenanceOrders#", "MaintenanceOrders");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2015.maintenanceorders
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkLocation }
     * 
     */
    public WorkLocation createWorkLocation() {
        return new WorkLocation();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress }
     * 
     */
    public WorkLocation.MainAddress createWorkLocationMainAddress() {
        return new WorkLocation.MainAddress();
    }

    /**
     * Create an instance of {@link WorkTimeSchedule }
     * 
     */
    public WorkTimeSchedule createWorkTimeSchedule() {
        return new WorkTimeSchedule();
    }

    /**
     * Create an instance of {@link Organisation }
     * 
     */
    public Organisation createOrganisation() {
        return new Organisation();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress }
     * 
     */
    public Organisation.StreetAddress createOrganisationStreetAddress() {
        return new Organisation.StreetAddress();
    }

    /**
     * Create an instance of {@link CrewMember }
     * 
     */
    public CrewMember createCrewMember() {
        return new CrewMember();
    }

    /**
     * Create an instance of {@link WorkAsset }
     * 
     */
    public WorkAsset createWorkAsset() {
        return new WorkAsset();
    }

    /**
     * Create an instance of {@link WorkAsset.Procedures }
     * 
     */
    public WorkAsset.Procedures createWorkAssetProcedures() {
        return new WorkAsset.Procedures();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link Asset.Procedures }
     * 
     */
    public Asset.Procedures createAssetProcedures() {
        return new Asset.Procedures();
    }

    /**
     * Create an instance of {@link WorkTask }
     * 
     */
    public WorkTask createWorkTask() {
        return new WorkTask();
    }

    /**
     * Create an instance of {@link WorkTask.MaterialItems }
     * 
     */
    public WorkTask.MaterialItems createWorkTaskMaterialItems() {
        return new WorkTask.MaterialItems();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link MaintenanceOrders }
     * 
     */
    public MaintenanceOrders createMaintenanceOrders() {
        return new MaintenanceOrders();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link TelephoneNumber }
     * 
     */
    public TelephoneNumber createTelephoneNumber() {
        return new TelephoneNumber();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link ActivityRecord }
     * 
     */
    public ActivityRecord createActivityRecord() {
        return new ActivityRecord();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link AssetLocationHazard }
     * 
     */
    public AssetLocationHazard createAssetLocationHazard() {
        return new AssetLocationHazard();
    }

    /**
     * Create an instance of {@link InternalLocation }
     * 
     */
    public InternalLocation createInternalLocation() {
        return new InternalLocation();
    }

    /**
     * Create an instance of {@link MaintenanceOrder }
     * 
     */
    public MaintenanceOrder createMaintenanceOrder() {
        return new MaintenanceOrder();
    }

    /**
     * Create an instance of {@link WorkLocation.CoordinateSystem }
     * 
     */
    public WorkLocation.CoordinateSystem createWorkLocationCoordinateSystem() {
        return new WorkLocation.CoordinateSystem();
    }

    /**
     * Create an instance of {@link WorkLocation.PositionPoints }
     * 
     */
    public WorkLocation.PositionPoints createWorkLocationPositionPoints() {
        return new WorkLocation.PositionPoints();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.StreetDetail }
     * 
     */
    public WorkLocation.MainAddress.StreetDetail createWorkLocationMainAddressStreetDetail() {
        return new WorkLocation.MainAddress.StreetDetail();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.TownDetail }
     * 
     */
    public WorkLocation.MainAddress.TownDetail createWorkLocationMainAddressTownDetail() {
        return new WorkLocation.MainAddress.TownDetail();
    }

    /**
     * Create an instance of {@link WorkTimeSchedule.ScheduleInterval }
     * 
     */
    public WorkTimeSchedule.ScheduleInterval createWorkTimeScheduleScheduleInterval() {
        return new WorkTimeSchedule.ScheduleInterval();
    }

    /**
     * Create an instance of {@link Organisation.Phone1 }
     * 
     */
    public Organisation.Phone1 createOrganisationPhone1() {
        return new Organisation.Phone1();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress.StreetDetail }
     * 
     */
    public Organisation.StreetAddress.StreetDetail createOrganisationStreetAddressStreetDetail() {
        return new Organisation.StreetAddress.StreetDetail();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress.TownDetail }
     * 
     */
    public Organisation.StreetAddress.TownDetail createOrganisationStreetAddressTownDetail() {
        return new Organisation.StreetAddress.TownDetail();
    }

    /**
     * Create an instance of {@link CrewMember.Person }
     * 
     */
    public CrewMember.Person createCrewMemberPerson() {
        return new CrewMember.Person();
    }

    /**
     * Create an instance of {@link WorkAsset.Procedures.Measurements }
     * 
     */
    public WorkAsset.Procedures.Measurements createWorkAssetProceduresMeasurements() {
        return new WorkAsset.Procedures.Measurements();
    }

    /**
     * Create an instance of {@link Asset.Procedures.Measurements }
     * 
     */
    public Asset.Procedures.Measurements createAssetProceduresMeasurements() {
        return new Asset.Procedures.Measurements();
    }

    /**
     * Create an instance of {@link WorkTask.MaterialItems.Quantity }
     * 
     */
    public WorkTask.MaterialItems.Quantity createWorkTaskMaterialItemsQuantity() {
        return new WorkTask.MaterialItems.Quantity();
    }

    /**
     * Create an instance of {@link Work.Priority }
     * 
     */
    public Work.Priority createWorkPriority() {
        return new Work.Priority();
    }

    /**
     * Create an instance of {@link Work.Attachments }
     * 
     */
    public Work.Attachments createWorkAttachments() {
        return new Work.Attachments();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#", name = "MaintenanceOrders")
    public JAXBElement<MaintenanceOrders> createMaintenanceOrders(MaintenanceOrders value) {
        return new JAXBElement<MaintenanceOrders>(_MaintenanceOrders_QNAME, MaintenanceOrders.class, null, value);
    }

}
