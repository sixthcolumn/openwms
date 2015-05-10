
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZigBeeLoadControlEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZigBeeLoadControlEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="issuerEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceClass" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="utilityEnrollmentGroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="integerDuration" type="{http://www.multispeak.org/Version_4.1_Release}integerDuration" minOccurs="0"/>
 *         &lt;element name="criticalityLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="coolingTemperatureOffset" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="heatingTemperatureOffset" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="coolingTemperatureSetPoint" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="heatingTemperatureSetPoint" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="avgLoadAdjustment" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="dutyCycle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="eventControl" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
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
@XmlType(name = "ZigBeeLoadControlEvent", propOrder = {
    "issuerEventID",
    "deviceClass",
    "utilityEnrollmentGroup",
    "startTime",
    "integerDuration",
    "criticalityLevel",
    "coolingTemperatureOffset",
    "heatingTemperatureOffset",
    "coolingTemperatureSetPoint",
    "heatingTemperatureSetPoint",
    "avgLoadAdjustment",
    "dutyCycle",
    "eventControl"
})
public class ZigBeeLoadControlEvent
    extends MspObject
{

    protected String issuerEventID;
    protected BigInteger deviceClass;
    protected BigInteger utilityEnrollmentGroup;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected IntegerDuration integerDuration;
    @XmlSchemaType(name = "unsignedInt")
    protected long criticalityLevel;
    @XmlSchemaType(name = "unsignedInt")
    protected Long coolingTemperatureOffset;
    @XmlSchemaType(name = "unsignedInt")
    protected Long heatingTemperatureOffset;
    @XmlSchemaType(name = "unsignedInt")
    protected Long coolingTemperatureSetPoint;
    @XmlSchemaType(name = "unsignedInt")
    protected Long heatingTemperatureSetPoint;
    @XmlSchemaType(name = "unsignedInt")
    protected Long avgLoadAdjustment;
    @XmlSchemaType(name = "unsignedInt")
    protected Long dutyCycle;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] eventControl;

    /**
     * Gets the value of the issuerEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerEventID() {
        return issuerEventID;
    }

    /**
     * Sets the value of the issuerEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerEventID(String value) {
        this.issuerEventID = value;
    }

    /**
     * Gets the value of the deviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceClass() {
        return deviceClass;
    }

    /**
     * Sets the value of the deviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceClass(BigInteger value) {
        this.deviceClass = value;
    }

    /**
     * Gets the value of the utilityEnrollmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUtilityEnrollmentGroup() {
        return utilityEnrollmentGroup;
    }

    /**
     * Sets the value of the utilityEnrollmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUtilityEnrollmentGroup(BigInteger value) {
        this.utilityEnrollmentGroup = value;
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
     * Gets the value of the integerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDuration }
     *     
     */
    public IntegerDuration getIntegerDuration() {
        return integerDuration;
    }

    /**
     * Sets the value of the integerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDuration }
     *     
     */
    public void setIntegerDuration(IntegerDuration value) {
        this.integerDuration = value;
    }

    /**
     * Gets the value of the criticalityLevel property.
     * 
     */
    public long getCriticalityLevel() {
        return criticalityLevel;
    }

    /**
     * Sets the value of the criticalityLevel property.
     * 
     */
    public void setCriticalityLevel(long value) {
        this.criticalityLevel = value;
    }

    /**
     * Gets the value of the coolingTemperatureOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoolingTemperatureOffset() {
        return coolingTemperatureOffset;
    }

    /**
     * Sets the value of the coolingTemperatureOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoolingTemperatureOffset(Long value) {
        this.coolingTemperatureOffset = value;
    }

    /**
     * Gets the value of the heatingTemperatureOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeatingTemperatureOffset() {
        return heatingTemperatureOffset;
    }

    /**
     * Sets the value of the heatingTemperatureOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeatingTemperatureOffset(Long value) {
        this.heatingTemperatureOffset = value;
    }

    /**
     * Gets the value of the coolingTemperatureSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoolingTemperatureSetPoint() {
        return coolingTemperatureSetPoint;
    }

    /**
     * Sets the value of the coolingTemperatureSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoolingTemperatureSetPoint(Long value) {
        this.coolingTemperatureSetPoint = value;
    }

    /**
     * Gets the value of the heatingTemperatureSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeatingTemperatureSetPoint() {
        return heatingTemperatureSetPoint;
    }

    /**
     * Sets the value of the heatingTemperatureSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeatingTemperatureSetPoint(Long value) {
        this.heatingTemperatureSetPoint = value;
    }

    /**
     * Gets the value of the avgLoadAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgLoadAdjustment() {
        return avgLoadAdjustment;
    }

    /**
     * Sets the value of the avgLoadAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgLoadAdjustment(Long value) {
        this.avgLoadAdjustment = value;
    }

    /**
     * Gets the value of the dutyCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDutyCycle() {
        return dutyCycle;
    }

    /**
     * Sets the value of the dutyCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDutyCycle(Long value) {
        this.dutyCycle = value;
    }

    /**
     * Gets the value of the eventControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEventControl() {
        return eventControl;
    }

    /**
     * Sets the value of the eventControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventControl(byte[] value) {
        this.eventControl = ((byte[]) value);
    }

}
