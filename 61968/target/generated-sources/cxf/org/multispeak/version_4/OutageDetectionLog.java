
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageDetectionLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="loggedODEventList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfLoggedOutageDetectionEvent" minOccurs="0"/>
 *         &lt;element name="outageLocation" type="{http://www.multispeak.org/Version_4.1_Release}outageLocation" minOccurs="0"/>
 *         &lt;element name="messageList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMessage" minOccurs="0"/>
 *         &lt;element name="outageCustomer" type="{http://www.multispeak.org/Version_4.1_Release}outageCustomer" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.multispeak.org/Version_4.1_Release}priorityType" minOccurs="0"/>
 *         &lt;element name="resolvedLevel" type="{http://www.multispeak.org/Version_4.1_Release}resolvedLevel" minOccurs="0"/>
 *         &lt;element name="timeTroubleBegan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeOfInitialEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeOfLastEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventsLogged" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "outageDetectionLog", propOrder = {
    "phaseCode",
    "loggedODEventList",
    "outageLocation",
    "messageList",
    "outageCustomer",
    "priority",
    "resolvedLevel",
    "timeTroubleBegan",
    "timeOfInitialEvent",
    "timeOfLastEvent",
    "eventsLogged"
})
public class OutageDetectionLog
    extends MspObject
{

    protected PhaseCode phaseCode;
    protected ArrayOfLoggedOutageDetectionEvent loggedODEventList;
    protected OutageLocation outageLocation;
    protected ArrayOfMessage messageList;
    protected OutageCustomer outageCustomer;
    protected PriorityType priority;
    protected ResolvedLevel resolvedLevel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeTroubleBegan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfInitialEvent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfLastEvent;
    protected Long eventsLogged;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the loggedODEventList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLoggedOutageDetectionEvent }
     *     
     */
    public ArrayOfLoggedOutageDetectionEvent getLoggedODEventList() {
        return loggedODEventList;
    }

    /**
     * Sets the value of the loggedODEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLoggedOutageDetectionEvent }
     *     
     */
    public void setLoggedODEventList(ArrayOfLoggedOutageDetectionEvent value) {
        this.loggedODEventList = value;
    }

    /**
     * Gets the value of the outageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OutageLocation }
     *     
     */
    public OutageLocation getOutageLocation() {
        return outageLocation;
    }

    /**
     * Sets the value of the outageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageLocation }
     *     
     */
    public void setOutageLocation(OutageLocation value) {
        this.outageLocation = value;
    }

    /**
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessageList(ArrayOfMessage value) {
        this.messageList = value;
    }

    /**
     * Gets the value of the outageCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link OutageCustomer }
     *     
     */
    public OutageCustomer getOutageCustomer() {
        return outageCustomer;
    }

    /**
     * Sets the value of the outageCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageCustomer }
     *     
     */
    public void setOutageCustomer(OutageCustomer value) {
        this.outageCustomer = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the resolvedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ResolvedLevel }
     *     
     */
    public ResolvedLevel getResolvedLevel() {
        return resolvedLevel;
    }

    /**
     * Sets the value of the resolvedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolvedLevel }
     *     
     */
    public void setResolvedLevel(ResolvedLevel value) {
        this.resolvedLevel = value;
    }

    /**
     * Gets the value of the timeTroubleBegan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeTroubleBegan() {
        return timeTroubleBegan;
    }

    /**
     * Sets the value of the timeTroubleBegan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeTroubleBegan(XMLGregorianCalendar value) {
        this.timeTroubleBegan = value;
    }

    /**
     * Gets the value of the timeOfInitialEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfInitialEvent() {
        return timeOfInitialEvent;
    }

    /**
     * Sets the value of the timeOfInitialEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfInitialEvent(XMLGregorianCalendar value) {
        this.timeOfInitialEvent = value;
    }

    /**
     * Gets the value of the timeOfLastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfLastEvent() {
        return timeOfLastEvent;
    }

    /**
     * Sets the value of the timeOfLastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfLastEvent(XMLGregorianCalendar value) {
        this.timeOfLastEvent = value;
    }

    /**
     * Gets the value of the eventsLogged property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventsLogged() {
        return eventsLogged;
    }

    /**
     * Sets the value of the eventsLogged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventsLogged(Long value) {
        this.eventsLogged = value;
    }

}
