
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for serviceOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="projectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soStatusCode" type="{http://www.multispeak.org/Version_4.1_Release}soStatusCode" minOccurs="0"/>
 *         &lt;element name="soType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="network" type="{http://www.multispeak.org/Version_4.1_Release}network" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="closeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="crewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="associatedMetersList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAssociatedMeters" minOccurs="0"/>
 *         &lt;element name="securityLights" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSecurityLight" minOccurs="0"/>
 *         &lt;element name="serviceStatuses" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfStatusOfService" minOccurs="0"/>
 *         &lt;element name="equipmentStatuses" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfEquipmentStatus" minOccurs="0"/>
 *         &lt;element name="otherIdentificationFields" type="{http://www.multispeak.org/Version_4.1_Release}otherIdentificationFields" minOccurs="0"/>
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
@XmlType(name = "serviceOrder", propOrder = {
    "projectID",
    "woNumber",
    "soNumber",
    "soStatusCode",
    "soType",
    "soDescription",
    "customerID",
    "accountNumber",
    "serviceLocationID",
    "network",
    "startDate",
    "closeDate",
    "crewID",
    "workedBy",
    "associatedMetersList",
    "securityLights",
    "serviceStatuses",
    "equipmentStatuses",
    "otherIdentificationFields"
})
public class ServiceOrder
    extends MspObject
{

    protected String projectID;
    protected String woNumber;
    protected String soNumber;
    protected SoStatusCode soStatusCode;
    protected String soType;
    protected String soDescription;
    protected String customerID;
    protected String accountNumber;
    protected String serviceLocationID;
    protected Network network;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDate;
    protected String crewID;
    protected String workedBy;
    protected ArrayOfAssociatedMeters associatedMetersList;
    protected ArrayOfSecurityLight securityLights;
    protected ArrayOfStatusOfService serviceStatuses;
    protected ArrayOfEquipmentStatus equipmentStatuses;
    protected OtherIdentificationFields otherIdentificationFields;

    /**
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectID(String value) {
        this.projectID = value;
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
     * Gets the value of the soStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link SoStatusCode }
     *     
     */
    public SoStatusCode getSoStatusCode() {
        return soStatusCode;
    }

    /**
     * Sets the value of the soStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoStatusCode }
     *     
     */
    public void setSoStatusCode(SoStatusCode value) {
        this.soStatusCode = value;
    }

    /**
     * Gets the value of the soType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoType() {
        return soType;
    }

    /**
     * Sets the value of the soType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoType(String value) {
        this.soType = value;
    }

    /**
     * Gets the value of the soDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoDescription() {
        return soDescription;
    }

    /**
     * Sets the value of the soDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoDescription(String value) {
        this.soDescription = value;
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
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the crewID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewID() {
        return crewID;
    }

    /**
     * Sets the value of the crewID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewID(String value) {
        this.crewID = value;
    }

    /**
     * Gets the value of the workedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkedBy() {
        return workedBy;
    }

    /**
     * Sets the value of the workedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkedBy(String value) {
        this.workedBy = value;
    }

    /**
     * Gets the value of the associatedMetersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssociatedMeters }
     *     
     */
    public ArrayOfAssociatedMeters getAssociatedMetersList() {
        return associatedMetersList;
    }

    /**
     * Sets the value of the associatedMetersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssociatedMeters }
     *     
     */
    public void setAssociatedMetersList(ArrayOfAssociatedMeters value) {
        this.associatedMetersList = value;
    }

    /**
     * Gets the value of the securityLights property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityLight }
     *     
     */
    public ArrayOfSecurityLight getSecurityLights() {
        return securityLights;
    }

    /**
     * Sets the value of the securityLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityLight }
     *     
     */
    public void setSecurityLights(ArrayOfSecurityLight value) {
        this.securityLights = value;
    }

    /**
     * Gets the value of the serviceStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatusOfService }
     *     
     */
    public ArrayOfStatusOfService getServiceStatuses() {
        return serviceStatuses;
    }

    /**
     * Sets the value of the serviceStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatusOfService }
     *     
     */
    public void setServiceStatuses(ArrayOfStatusOfService value) {
        this.serviceStatuses = value;
    }

    /**
     * Gets the value of the equipmentStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEquipmentStatus }
     *     
     */
    public ArrayOfEquipmentStatus getEquipmentStatuses() {
        return equipmentStatuses;
    }

    /**
     * Sets the value of the equipmentStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEquipmentStatus }
     *     
     */
    public void setEquipmentStatuses(ArrayOfEquipmentStatus value) {
        this.equipmentStatuses = value;
    }

    /**
     * Gets the value of the otherIdentificationFields property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentificationFields }
     *     
     */
    public OtherIdentificationFields getOtherIdentificationFields() {
        return otherIdentificationFields;
    }

    /**
     * Sets the value of the otherIdentificationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentificationFields }
     *     
     */
    public void setOtherIdentificationFields(OtherIdentificationFields value) {
        this.otherIdentificationFields = value;
    }

}
