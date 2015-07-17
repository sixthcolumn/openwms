
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for loggedOutageDetectionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loggedOutageDetectionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageDetectionRecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outageDetectDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDetectDeviceType" type="{http://www.multispeak.org/Version_4.1_Release}outageDetectDeviceType" minOccurs="0"/>
 *         &lt;element name="problemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageEventType" type="{http://www.multispeak.org/Version_4.1_Release}outageEventType" minOccurs="0"/>
 *         &lt;element name="takenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callType" type="{http://www.multispeak.org/Version_4.1_Release}callType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "loggedOutageDetectionEvent", propOrder = {
    "outageDetectionRecordID",
    "eventTime",
    "outageDetectDeviceID",
    "outageDetectDeviceType",
    "problemCode",
    "outageEventType",
    "takenBy",
    "callType",
    "description"
})
public class LoggedOutageDetectionEvent
    extends MspObject
{

    protected String outageDetectionRecordID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String outageDetectDeviceID;
    protected OutageDetectDeviceType outageDetectDeviceType;
    protected String problemCode;
    protected OutageEventType outageEventType;
    protected String takenBy;
    protected CallType callType;
    protected String description;

    /**
     * Gets the value of the outageDetectionRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDetectionRecordID() {
        return outageDetectionRecordID;
    }

    /**
     * Sets the value of the outageDetectionRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDetectionRecordID(String value) {
        this.outageDetectionRecordID = value;
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
     * Gets the value of the outageDetectDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDetectDeviceID() {
        return outageDetectDeviceID;
    }

    /**
     * Sets the value of the outageDetectDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDetectDeviceID(String value) {
        this.outageDetectDeviceID = value;
    }

    /**
     * Gets the value of the outageDetectDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public OutageDetectDeviceType getOutageDetectDeviceType() {
        return outageDetectDeviceType;
    }

    /**
     * Sets the value of the outageDetectDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public void setOutageDetectDeviceType(OutageDetectDeviceType value) {
        this.outageDetectDeviceType = value;
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

}
