
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_4.1_Release}extensions" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="meterEvent" type="{http://www.multispeak.org/Version_4.1_Release}meterEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventInstance", propOrder = {
    "extensions",
    "meterID",
    "meterEvent"
})
public class EventInstance {

    protected Extensions extensions;
    protected MeterID meterID;
    protected MeterEvent meterEvent;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

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
     * Gets the value of the meterEvent property.
     * 
     * @return
     *     possible object is
     *     {@link MeterEvent }
     *     
     */
    public MeterEvent getMeterEvent() {
        return meterEvent;
    }

    /**
     * Sets the value of the meterEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterEvent }
     *     
     */
    public void setMeterEvent(MeterEvent value) {
        this.meterEvent = value;
    }

}
