
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for electricService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="sectionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentSectionID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromNodeID" type="{http://www.multispeak.org/Version_4.1_Release}nodeIdentifier" minOccurs="0"/>
 *         &lt;element name="toNodeID" type="{http://www.multispeak.org/Version_4.1_Release}nodeIdentifier" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterBaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricMeterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}electricLocationFields" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/Version_4.1_Release}powerStatus" minOccurs="0"/>
 *         &lt;element name="specialNeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadMgmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCogenerationSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="load" type="{http://www.multispeak.org/Version_4.1_Release}mspLoadGroup" minOccurs="0"/>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="meterBase" type="{http://www.multispeak.org/Version_4.1_Release}meterBase" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricService", propOrder = {
    "sectionID",
    "parentSectionID",
    "fromNodeID",
    "toNodeID",
    "customerID",
    "accountNumber",
    "serviceLocationID",
    "meterBaseID",
    "electricMeterID",
    "electricLocationFields",
    "outageStatus",
    "specialNeeds",
    "connection",
    "loadMgmt",
    "isCogenerationSite",
    "load",
    "woNumber",
    "soNumber",
    "revenueClass",
    "serviceStatus",
    "billingCycle",
    "route",
    "budgetBill",
    "shutOffDate",
    "connectDate",
    "disconnectDate",
    "meterBase"
})
public class ElectricService
    extends MspObject
{

    protected String sectionID;
    protected List<ObjectRef> parentSectionID;
    protected NodeIdentifier fromNodeID;
    protected NodeIdentifier toNodeID;
    protected String customerID;
    protected String accountNumber;
    protected String serviceLocationID;
    protected String meterBaseID;
    protected String electricMeterID;
    protected ElectricLocationFields electricLocationFields;
    protected PowerStatus outageStatus;
    protected String specialNeeds;
    protected String connection;
    protected String loadMgmt;
    protected Boolean isCogenerationSite;
    protected MspLoadGroup load;
    protected String woNumber;
    protected String soNumber;
    protected String revenueClass;
    protected String serviceStatus;
    protected String billingCycle;
    protected String route;
    protected String budgetBill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shutOffDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar connectDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectDate;
    protected MeterBase meterBase;

    /**
     * Gets the value of the sectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionID() {
        return sectionID;
    }

    /**
     * Sets the value of the sectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionID(String value) {
        this.sectionID = value;
    }

    /**
     * Gets the value of the parentSectionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentSectionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentSectionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRef }
     * 
     * 
     */
    public List<ObjectRef> getParentSectionID() {
        if (parentSectionID == null) {
            parentSectionID = new ArrayList<ObjectRef>();
        }
        return this.parentSectionID;
    }

    /**
     * Gets the value of the fromNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getFromNodeID() {
        return fromNodeID;
    }

    /**
     * Sets the value of the fromNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setFromNodeID(NodeIdentifier value) {
        this.fromNodeID = value;
    }

    /**
     * Gets the value of the toNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link NodeIdentifier }
     *     
     */
    public NodeIdentifier getToNodeID() {
        return toNodeID;
    }

    /**
     * Sets the value of the toNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeIdentifier }
     *     
     */
    public void setToNodeID(NodeIdentifier value) {
        this.toNodeID = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the meterBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterBaseID() {
        return meterBaseID;
    }

    /**
     * Sets the value of the meterBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterBaseID(String value) {
        this.meterBaseID = value;
    }

    /**
     * Gets the value of the electricMeterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectricMeterID() {
        return electricMeterID;
    }

    /**
     * Sets the value of the electricMeterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricMeterID(String value) {
        this.electricMeterID = value;
    }

    /**
     * Gets the value of the electricLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricLocationFields }
     *     
     */
    public ElectricLocationFields getElectricLocationFields() {
        return electricLocationFields;
    }

    /**
     * Sets the value of the electricLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricLocationFields }
     *     
     */
    public void setElectricLocationFields(ElectricLocationFields value) {
        this.electricLocationFields = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PowerStatus }
     *     
     */
    public PowerStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerStatus }
     *     
     */
    public void setOutageStatus(PowerStatus value) {
        this.outageStatus = value;
    }

    /**
     * Gets the value of the specialNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * Sets the value of the specialNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNeeds(String value) {
        this.specialNeeds = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the loadMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadMgmt() {
        return loadMgmt;
    }

    /**
     * Sets the value of the loadMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadMgmt(String value) {
        this.loadMgmt = value;
    }

    /**
     * Gets the value of the isCogenerationSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCogenerationSite() {
        return isCogenerationSite;
    }

    /**
     * Sets the value of the isCogenerationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCogenerationSite(Boolean value) {
        this.isCogenerationSite = value;
    }

    /**
     * Gets the value of the load property.
     * 
     * @return
     *     possible object is
     *     {@link MspLoadGroup }
     *     
     */
    public MspLoadGroup getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspLoadGroup }
     *     
     */
    public void setLoad(MspLoadGroup value) {
        this.load = value;
    }

    /**
     * Gets the value of the woNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoNumber() {
        return woNumber;
    }

    /**
     * Sets the value of the woNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoNumber(String value) {
        this.woNumber = value;
    }

    /**
     * Gets the value of the soNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoNumber() {
        return soNumber;
    }

    /**
     * Sets the value of the soNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoNumber(String value) {
        this.soNumber = value;
    }

    /**
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycle(String value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the budgetBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetBill() {
        return budgetBill;
    }

    /**
     * Sets the value of the budgetBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetBill(String value) {
        this.budgetBill = value;
    }

    /**
     * Gets the value of the shutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShutOffDate() {
        return shutOffDate;
    }

    /**
     * Sets the value of the shutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShutOffDate(XMLGregorianCalendar value) {
        this.shutOffDate = value;
    }

    /**
     * Gets the value of the connectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectDate() {
        return connectDate;
    }

    /**
     * Sets the value of the connectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectDate(XMLGregorianCalendar value) {
        this.connectDate = value;
    }

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the meterBase property.
     * 
     * @return
     *     possible object is
     *     {@link MeterBase }
     *     
     */
    public MeterBase getMeterBase() {
        return meterBase;
    }

    /**
     * Sets the value of the meterBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterBase }
     *     
     */
    public void setMeterBase(MeterBase value) {
        this.meterBase = value;
    }

}
