
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for maintenanceOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintenanceOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="projectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moStatusCode" type="{http://www.multispeak.org/Version_4.1_Release}soStatusCode" minOccurs="0"/>
 *         &lt;element name="moType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="closeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="crewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "maintenanceOrder", propOrder = {
    "projectID",
    "moStatusCode",
    "moType",
    "moDescription",
    "customerID",
    "accountNumber",
    "serviceLocationID",
    "startDate",
    "closeDate",
    "crewID",
    "workedBy",
    "equipmentStatuses",
    "otherIdentificationFields"
})
public class MaintenanceOrder
    extends MspObject
{

    protected String projectID;
    protected SoStatusCode moStatusCode;
    protected String moType;
    protected String moDescription;
    protected String customerID;
    protected String accountNumber;
    protected String serviceLocationID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeDate;
    protected String crewID;
    protected String workedBy;
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
     * Gets the value of the moStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link SoStatusCode }
     *     
     */
    public SoStatusCode getMoStatusCode() {
        return moStatusCode;
    }

    /**
     * Sets the value of the moStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoStatusCode }
     *     
     */
    public void setMoStatusCode(SoStatusCode value) {
        this.moStatusCode = value;
    }

    /**
     * Gets the value of the moType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoType() {
        return moType;
    }

    /**
     * Sets the value of the moType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoType(String value) {
        this.moType = value;
    }

    /**
     * Gets the value of the moDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoDescription() {
        return moDescription;
    }

    /**
     * Sets the value of the moDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoDescription(String value) {
        this.moDescription = value;
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
