
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customerCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerCall">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callType" type="{http://www.multispeak.org/Version_4.1_Release}callType" minOccurs="0"/>
 *         &lt;element name="takenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callPriority" type="{http://www.multispeak.org/Version_4.1_Release}priorityType" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.multispeak.org/Version_4.1_Release}outageLocation" minOccurs="0"/>
 *         &lt;element name="messageList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMessage" minOccurs="0"/>
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
@XmlType(name = "customerCall", propOrder = {
    "customerID",
    "eventTime",
    "description",
    "problemCode",
    "callType",
    "takenBy",
    "callPriority",
    "location",
    "messageList",
    "resolvedLevel"
})
public class CustomerCall
    extends MspObject
{

    protected String customerID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String description;
    protected String problemCode;
    protected CallType callType;
    protected String takenBy;
    protected PriorityType callPriority;
    protected OutageLocation location;
    protected ArrayOfMessage messageList;
    protected ResolvedLevel resolvedLevel;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link CallType }
     *     
     */
    public CallType getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallType }
     *     
     */
    public void setCallType(CallType value) {
        this.callType = value;
    }

    /**
     * Gets the value of the takenBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakenBy() {
        return takenBy;
    }

    /**
     * Sets the value of the takenBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakenBy(String value) {
        this.takenBy = value;
    }

    /**
     * Gets the value of the callPriority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getCallPriority() {
        return callPriority;
    }

    /**
     * Sets the value of the callPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setCallPriority(PriorityType value) {
        this.callPriority = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link OutageLocation }
     *     
     */
    public OutageLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageLocation }
     *     
     */
    public void setLocation(OutageLocation value) {
        this.location = value;
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
