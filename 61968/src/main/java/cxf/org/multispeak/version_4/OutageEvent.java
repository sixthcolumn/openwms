
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outagedPhase" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="substationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualFault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCustomerResponsible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPlanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/Version_4.1_Release}outageStatus" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outageDefined" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstDispatch" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ETOR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="completed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.multispeak.org/Version_4.1_Release}message" minOccurs="0"/>
 *         &lt;element name="crewsDispatched" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString2" minOccurs="0"/>
 *         &lt;element name="customersAffected" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priorityCustomersCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ODEventCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customersRestored" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="outageReasonCodeList" type="{http://www.multispeak.org/Version_4.1_Release}outageReasonCodeList" minOccurs="0"/>
 *         &lt;element name="outageEventStatus" type="{http://www.multispeak.org/Version_4.1_Release}outageEventStatus" minOccurs="0"/>
 *         &lt;element name="outageCustomerList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOutageCustomer" minOccurs="0"/>
 *         &lt;element name="crewActionEvents" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCrewActionEvent" minOccurs="0"/>
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
@XmlType(name = "outageEvent", propOrder = {
    "area",
    "problemLocation",
    "deviceID",
    "deviceType",
    "outagedPhase",
    "substationCode",
    "feeder",
    "actualFault",
    "faultType",
    "isCustomerResponsible",
    "isPlanned",
    "outageDescription",
    "outageStatus",
    "priority",
    "startTime",
    "outageDefined",
    "firstDispatch",
    "firstETA",
    "firstArrival",
    "etor",
    "completed",
    "message",
    "crewsDispatched",
    "customersAffected",
    "priorityCustomersCount",
    "odEventCount",
    "customersRestored",
    "outageReasonCodeList",
    "outageEventStatus",
    "outageCustomerList",
    "crewActionEvents"
})
public class OutageEvent
    extends MspPointObject
{

    protected String area;
    protected String problemLocation;
    protected ObjectRef deviceID;
    protected String deviceType;
    protected PhaseCode outagedPhase;
    protected String substationCode;
    protected String feeder;
    protected String actualFault;
    protected String faultType;
    protected Boolean isCustomerResponsible;
    protected Boolean isPlanned;
    protected String outageDescription;
    protected OutageStatus outageStatus;
    protected String priority;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outageDefined;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstDispatch;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstETA;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstArrival;
    @XmlElement(name = "ETOR")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completed;
    protected Message message;
    protected ArrayOfString2 crewsDispatched;
    protected BigInteger customersAffected;
    protected BigInteger priorityCustomersCount;
    @XmlElement(name = "ODEventCount")
    protected BigInteger odEventCount;
    protected BigInteger customersRestored;
    protected OutageReasonCodeList outageReasonCodeList;
    protected OutageEventStatus outageEventStatus;
    protected ArrayOfOutageCustomer outageCustomerList;
    protected ArrayOfCrewActionEvent crewActionEvents;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the problemLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemLocation() {
        return problemLocation;
    }

    /**
     * Sets the value of the problemLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemLocation(String value) {
        this.problemLocation = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setDeviceID(ObjectRef value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the outagedPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getOutagedPhase() {
        return outagedPhase;
    }

    /**
     * Sets the value of the outagedPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setOutagedPhase(PhaseCode value) {
        this.outagedPhase = value;
    }

    /**
     * Gets the value of the substationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationCode() {
        return substationCode;
    }

    /**
     * Sets the value of the substationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationCode(String value) {
        this.substationCode = value;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the actualFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFault() {
        return actualFault;
    }

    /**
     * Sets the value of the actualFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFault(String value) {
        this.actualFault = value;
    }

    /**
     * Gets the value of the faultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * Sets the value of the faultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultType(String value) {
        this.faultType = value;
    }

    /**
     * Gets the value of the isCustomerResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerResponsible() {
        return isCustomerResponsible;
    }

    /**
     * Sets the value of the isCustomerResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerResponsible(Boolean value) {
        this.isCustomerResponsible = value;
    }

    /**
     * Gets the value of the isPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlanned() {
        return isPlanned;
    }

    /**
     * Sets the value of the isPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlanned(Boolean value) {
        this.isPlanned = value;
    }

    /**
     * Gets the value of the outageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDescription() {
        return outageDescription;
    }

    /**
     * Sets the value of the outageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDescription(String value) {
        this.outageDescription = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageStatus }
     *     
     */
    public OutageStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageStatus }
     *     
     */
    public void setOutageStatus(OutageStatus value) {
        this.outageStatus = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the outageDefined property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutageDefined() {
        return outageDefined;
    }

    /**
     * Sets the value of the outageDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutageDefined(XMLGregorianCalendar value) {
        this.outageDefined = value;
    }

    /**
     * Gets the value of the firstDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDispatch() {
        return firstDispatch;
    }

    /**
     * Sets the value of the firstDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDispatch(XMLGregorianCalendar value) {
        this.firstDispatch = value;
    }

    /**
     * Gets the value of the firstETA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstETA() {
        return firstETA;
    }

    /**
     * Sets the value of the firstETA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstETA(XMLGregorianCalendar value) {
        this.firstETA = value;
    }

    /**
     * Gets the value of the firstArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstArrival() {
        return firstArrival;
    }

    /**
     * Sets the value of the firstArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstArrival(XMLGregorianCalendar value) {
        this.firstArrival = value;
    }

    /**
     * Gets the value of the etor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETOR() {
        return etor;
    }

    /**
     * Sets the value of the etor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETOR(XMLGregorianCalendar value) {
        this.etor = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleted(XMLGregorianCalendar value) {
        this.completed = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
    }

    /**
     * Gets the value of the crewsDispatched property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getCrewsDispatched() {
        return crewsDispatched;
    }

    /**
     * Sets the value of the crewsDispatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setCrewsDispatched(ArrayOfString2 value) {
        this.crewsDispatched = value;
    }

    /**
     * Gets the value of the customersAffected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomersAffected() {
        return customersAffected;
    }

    /**
     * Sets the value of the customersAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomersAffected(BigInteger value) {
        this.customersAffected = value;
    }

    /**
     * Gets the value of the priorityCustomersCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityCustomersCount() {
        return priorityCustomersCount;
    }

    /**
     * Sets the value of the priorityCustomersCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityCustomersCount(BigInteger value) {
        this.priorityCustomersCount = value;
    }

    /**
     * Gets the value of the odEventCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getODEventCount() {
        return odEventCount;
    }

    /**
     * Sets the value of the odEventCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setODEventCount(BigInteger value) {
        this.odEventCount = value;
    }

    /**
     * Gets the value of the customersRestored property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomersRestored() {
        return customersRestored;
    }

    /**
     * Sets the value of the customersRestored property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomersRestored(BigInteger value) {
        this.customersRestored = value;
    }

    /**
     * Gets the value of the outageReasonCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonCodeList }
     *     
     */
    public OutageReasonCodeList getOutageReasonCodeList() {
        return outageReasonCodeList;
    }

    /**
     * Sets the value of the outageReasonCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonCodeList }
     *     
     */
    public void setOutageReasonCodeList(OutageReasonCodeList value) {
        this.outageReasonCodeList = value;
    }

    /**
     * Gets the value of the outageEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageEventStatus }
     *     
     */
    public OutageEventStatus getOutageEventStatus() {
        return outageEventStatus;
    }

    /**
     * Sets the value of the outageEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageEventStatus }
     *     
     */
    public void setOutageEventStatus(OutageEventStatus value) {
        this.outageEventStatus = value;
    }

    /**
     * Gets the value of the outageCustomerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageCustomer }
     *     
     */
    public ArrayOfOutageCustomer getOutageCustomerList() {
        return outageCustomerList;
    }

    /**
     * Sets the value of the outageCustomerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageCustomer }
     *     
     */
    public void setOutageCustomerList(ArrayOfOutageCustomer value) {
        this.outageCustomerList = value;
    }

    /**
     * Gets the value of the crewActionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrewActionEvent }
     *     
     */
    public ArrayOfCrewActionEvent getCrewActionEvents() {
        return crewActionEvents;
    }

    /**
     * Sets the value of the crewActionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrewActionEvent }
     *     
     */
    public void setCrewActionEvents(ArrayOfCrewActionEvent value) {
        this.crewActionEvents = value;
    }

}
