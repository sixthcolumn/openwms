
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AVLState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVLState">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="GMTTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="triggerEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPS" type="{http://www.multispeak.org/Version_4.1_Release}GPS" minOccurs="0"/>
 *         &lt;element name="AVLAddress" type="{http://www.multispeak.org/Version_4.1_Release}AVLAddress" minOccurs="0"/>
 *         &lt;element name="telemetry" type="{http://www.multispeak.org/Version_4.1_Release}telemetry" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/Version_4.1_Release}GPSLocation" minOccurs="0"/>
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
@XmlType(name = "AVLState", propOrder = {
    "gmtTime",
    "triggerEvent",
    "gps",
    "avlAddress",
    "telemetry",
    "gpsLocation"
})
public class AVLState
    extends MspObject
{

    @XmlElement(name = "GMTTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gmtTime;
    protected String triggerEvent;
    @XmlElement(name = "GPS")
    protected GPS gps;
    @XmlElement(name = "AVLAddress")
    protected AVLAddress avlAddress;
    protected Telemetry telemetry;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;

    /**
     * Gets the value of the gmtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGMTTime() {
        return gmtTime;
    }

    /**
     * Sets the value of the gmtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGMTTime(XMLGregorianCalendar value) {
        this.gmtTime = value;
    }

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerEvent(String value) {
        this.triggerEvent = value;
    }

    /**
     * Gets the value of the gps property.
     * 
     * @return
     *     possible object is
     *     {@link GPS }
     *     
     */
    public GPS getGPS() {
        return gps;
    }

    /**
     * Sets the value of the gps property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPS }
     *     
     */
    public void setGPS(GPS value) {
        this.gps = value;
    }

    /**
     * Gets the value of the avlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AVLAddress }
     *     
     */
    public AVLAddress getAVLAddress() {
        return avlAddress;
    }

    /**
     * Sets the value of the avlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVLAddress }
     *     
     */
    public void setAVLAddress(AVLAddress value) {
        this.avlAddress = value;
    }

    /**
     * Gets the value of the telemetry property.
     * 
     * @return
     *     possible object is
     *     {@link Telemetry }
     *     
     */
    public Telemetry getTelemetry() {
        return telemetry;
    }

    /**
     * Sets the value of the telemetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telemetry }
     *     
     */
    public void setTelemetry(Telemetry value) {
        this.telemetry = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GPSLocation }
     *     
     */
    public GPSLocation getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSLocation }
     *     
     */
    public void setGPSLocation(GPSLocation value) {
        this.gpsLocation = value;
    }

}
