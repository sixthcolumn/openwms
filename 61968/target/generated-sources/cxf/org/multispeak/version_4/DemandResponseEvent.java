
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for demandResponseEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandResponseEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="loadManagementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlEventType" type="{http://www.multispeak.org/Version_4.1_Release}controlEventType" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
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
@XmlType(name = "demandResponseEvent", propOrder = {
    "meterID",
    "loadManagementID",
    "port",
    "strategy",
    "controlEventType",
    "duration"
})
public class DemandResponseEvent
    extends MspObject
{

    protected MeterID meterID;
    protected String loadManagementID;
    protected String port;
    protected String strategy;
    protected ControlEventType controlEventType;
    protected Duration duration;

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the loadManagementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadManagementID() {
        return loadManagementID;
    }

    /**
     * Sets the value of the loadManagementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadManagementID(String value) {
        this.loadManagementID = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategy(String value) {
        this.strategy = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}
