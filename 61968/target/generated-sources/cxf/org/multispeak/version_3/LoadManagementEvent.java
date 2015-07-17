
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadManagementEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagementEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="substationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="controlEventType" type="{http://www.multispeak.org/Version_3.0}controlEventType" minOccurs="0"/>
 *         &lt;element name="applicationRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cycleTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="dutyCycle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="controlLoad" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;/choice>
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
@XmlType(name = "loadManagementEvent", propOrder = {
    "substationName",
    "feederName",
    "feederNumber",
    "groupName",
    "controlEventType",
    "applicationRate",
    "duration",
    "cycleTime",
    "dutyCycle",
    "controlLoad"
})
public class LoadManagementEvent
    extends MspObject
{

    protected String substationName;
    protected String feederName;
    protected String feederNumber;
    protected Long groupName;
    protected ControlEventType controlEventType;
    protected Float applicationRate;
    protected Float duration;
    protected Float cycleTime;
    protected Long dutyCycle;
    protected Float controlLoad;

    /**
     * Gets the value of the substationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationName() {
        return substationName;
    }

    /**
     * Sets the value of the substationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationName(String value) {
        this.substationName = value;
    }

    /**
     * Gets the value of the feederName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederName() {
        return feederName;
    }

    /**
     * Sets the value of the feederName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederName(String value) {
        this.feederName = value;
    }

    /**
     * Gets the value of the feederNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederNumber() {
        return feederNumber;
    }

    /**
     * Sets the value of the feederNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederNumber(String value) {
        this.feederNumber = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupName(Long value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the controlEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlEventType }
     *     
     */
    public ControlEventType getControlEventType() {
        return controlEventType;
    }

    /**
     * Sets the value of the controlEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlEventType }
     *     
     */
    public void setControlEventType(ControlEventType value) {
        this.controlEventType = value;
    }

    /**
     * Gets the value of the applicationRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setApplicationRate(Float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuration(Float value) {
        this.duration = value;
    }

    /**
     * Gets the value of the cycleTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCycleTime() {
        return cycleTime;
    }

    /**
     * Sets the value of the cycleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCycleTime(Float value) {
        this.cycleTime = value;
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
     * Gets the value of the controlLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getControlLoad() {
        return controlLoad;
    }

    /**
     * Sets the value of the controlLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setControlLoad(Float value) {
        this.controlLoad = value;
    }

}
