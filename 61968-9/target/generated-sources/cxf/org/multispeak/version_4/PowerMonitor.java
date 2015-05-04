
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for powerMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powerMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="callTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://www.multispeak.org/Version_4.1_Release}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="recordNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="eventCode" type="{http://www.multispeak.org/Version_4.1_Release}pmEventCode" minOccurs="0"/>
 *         &lt;element name="voltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ackBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "powerMonitor", propOrder = {
    "callTime",
    "telephoneNumber",
    "recordNum",
    "eventCode",
    "voltage",
    "ack",
    "ackBy",
    "ackTime"
})
public class PowerMonitor
    extends MspObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callTime;
    protected TelephoneNumber telephoneNumber;
    protected BigInteger recordNum;
    protected PmEventCode eventCode;
    protected Voltage voltage;
    protected Boolean ack;
    protected String ackBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackTime;

    /**
     * Gets the value of the callTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallTime() {
        return callTime;
    }

    /**
     * Sets the value of the callTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallTime(XMLGregorianCalendar value) {
        this.callTime = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(TelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the recordNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordNum() {
        return recordNum;
    }

    /**
     * Sets the value of the recordNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordNum(BigInteger value) {
        this.recordNum = value;
    }

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link PmEventCode }
     *     
     */
    public PmEventCode getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmEventCode }
     *     
     */
    public void setEventCode(PmEventCode value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltage(Voltage value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAck(Boolean value) {
        this.ack = value;
    }

    /**
     * Gets the value of the ackBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckBy() {
        return ackBy;
    }

    /**
     * Sets the value of the ackBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckBy(String value) {
        this.ackBy = value;
    }

    /**
     * Gets the value of the ackTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAckTime() {
        return ackTime;
    }

    /**
     * Sets the value of the ackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAckTime(XMLGregorianCalendar value) {
        this.ackTime = value;
    }

}
