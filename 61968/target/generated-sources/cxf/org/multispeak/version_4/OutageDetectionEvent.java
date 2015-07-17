
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageDetectionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outageEventType" type="{http://www.multispeak.org/Version_4.1_Release}outageEventType" minOccurs="0"/>
 *         &lt;element name="outageDetectionDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDetectionDeviceType" type="{http://www.multispeak.org/Version_4.1_Release}outageDetectDeviceType" minOccurs="0"/>
 *         &lt;element name="outageLocation" type="{http://www.multispeak.org/Version_4.1_Release}outageLocation" minOccurs="0"/>
 *         &lt;element name="messageList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMessage" minOccurs="0"/>
 *         &lt;element name="outageCustomer" type="{http://www.multispeak.org/Version_4.1_Release}outageCustomer" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.multispeak.org/Version_4.1_Release}priorityType" minOccurs="0"/>
 *         &lt;element name="percentConfident" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="problemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolvedLevel" type="{http://www.multispeak.org/Version_4.1_Release}resolvedLevel" minOccurs="0"/>
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
@XmlType(name = "outageDetectionEvent", propOrder = {
    "phaseCode",
    "eventTime",
    "outageEventType",
    "outageDetectionDeviceID",
    "outageDetectionDeviceType",
    "outageLocation",
    "messageList",
    "outageCustomer",
    "priority",
    "percentConfident",
    "problemCode",
    "resolvedLevel"
})
public class OutageDetectionEvent
    extends MspObject
{

    protected PhaseCode phaseCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected OutageEventType outageEventType;
    protected String outageDetectionDeviceID;
    protected OutageDetectDeviceType outageDetectionDeviceType;
    protected OutageLocation outageLocation;
    protected ArrayOfMessage messageList;
    protected OutageCustomer outageCustomer;
    protected PriorityType priority;
    protected BigInteger percentConfident;
    protected String problemCode;
    protected ResolvedLevel resolvedLevel;

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
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the outageEventType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageEventType }
     *     
     */
    public OutageEventType getOutageEventType() {
        return outageEventType;
    }

    /**
     * Sets the value of the outageEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageEventType }
     *     
     */
    public void setOutageEventType(OutageEventType value) {
        this.outageEventType = value;
    }

    /**
     * Gets the value of the outageDetectionDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDetectionDeviceID() {
        return outageDetectionDeviceID;
    }

    /**
     * Sets the value of the outageDetectionDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDetectionDeviceID(String value) {
        this.outageDetectionDeviceID = value;
    }

    /**
     * Gets the value of the outageDetectionDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public OutageDetectDeviceType getOutageDetectionDeviceType() {
        return outageDetectionDeviceType;
    }

    /**
     * Sets the value of the outageDetectionDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public void setOutageDetectionDeviceType(OutageDetectDeviceType value) {
        this.outageDetectionDeviceType = value;
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
     * Gets the value of the percentConfident property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentConfident() {
        return percentConfident;
    }

    /**
     * Sets the value of the percentConfident property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentConfident(BigInteger value) {
        this.percentConfident = value;
    }

    /**
     * Gets the value of the problemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemCode() {
        return problemCode;
    }

    /**
     * Sets the value of the problemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemCode(String value) {
        this.problemCode = value;
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

}
