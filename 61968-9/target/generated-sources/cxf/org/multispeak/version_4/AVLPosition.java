
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AVLPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVLPosition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="vehicleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMTTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="speed" type="{http://www.multispeak.org/Version_4.1_Release}speed" minOccurs="0"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cardinalHeading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gps" type="{http://www.multispeak.org/Version_4.1_Release}GPS" minOccurs="0"/>
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
@XmlType(name = "AVLPosition", propOrder = {
    "vehicleID",
    "avlid",
    "gmtTime",
    "speed",
    "heading",
    "cardinalHeading",
    "gps",
    "gpsLocation"
})
public class AVLPosition
    extends MspObject
{

    protected String vehicleID;
    @XmlElement(name = "AVLID")
    protected String avlid;
    @XmlElement(name = "GMTTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gmtTime;
    protected Speed speed;
    protected Float heading;
    protected String cardinalHeading;
    protected GPS gps;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleID(String value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the avlid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVLID() {
        return avlid;
    }

    /**
     * Sets the value of the avlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVLID(String value) {
        this.avlid = value;
    }

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
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Speed }
     *     
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speed }
     *     
     */
    public void setSpeed(Speed value) {
        this.speed = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeading(Float value) {
        this.heading = value;
    }

    /**
     * Gets the value of the cardinalHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalHeading() {
        return cardinalHeading;
    }

    /**
     * Sets the value of the cardinalHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalHeading(String value) {
        this.cardinalHeading = value;
    }

    /**
     * Gets the value of the gps property.
     * 
     * @return
     *     possible object is
     *     {@link GPS }
     *     
     */
    public GPS getGps() {
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
    public void setGps(GPS value) {
        this.gps = value;
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
