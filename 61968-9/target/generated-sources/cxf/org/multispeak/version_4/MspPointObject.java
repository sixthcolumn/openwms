
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import _1_release.gml_v4.PointType;


/**
 * <p>Java class for mspPointObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspPointObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{gml_V4.1_Release}PointType" minOccurs="0"/>
 *         &lt;element name="gpsPoint" type="{http://www.multispeak.org/Version_4.1_Release}gpsPoint" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/Version_4.1_Release}GPSLocation" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rotation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.multispeak.org/Version_4.1_Release}timeZone" minOccurs="0"/>
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
@XmlType(name = "mspPointObject", propOrder = {
    "gmlLocation",
    "gpsPoint",
    "gpsLocation",
    "gridLocation",
    "rotation",
    "facilityID",
    "timeZone"
})
@XmlSeeAlso({
    MeterBase.class,
    Pole.class,
    AssessmentLocation.class,
    OutageEvent.class,
    ServiceLocation.class,
    LoadManagementDevice.class,
    PrimaryCabinet.class,
    InHomeDisplay.class,
    SpatialFeatureGroup.class,
    MeasurementDevice.class,
    Guy.class,
    PowerSystemDevice.class,
    SecondaryJunctionBox.class,
    ScadaPoint.class,
    OutageDetectionDevice.class,
    Premise.class,
    MspAssetHistoryEvent.class,
    GenericPointFeature.class,
    Load.class,
    Riser.class,
    GenericAnnotationFeature.class,
    MspConnectivityPoint.class
})
public abstract class MspPointObject
    extends MspObject
{

    @XmlElement(name = "GMLLocation")
    protected PointType gmlLocation;
    protected GpsPoint gpsPoint;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected String gridLocation;
    protected Float rotation;
    protected String facilityID;
    protected TimeZone timeZone;

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setGMLLocation(PointType value) {
        this.gmlLocation = value;
    }

    /**
     * Gets the value of the gpsPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GpsPoint }
     *     
     */
    public GpsPoint getGpsPoint() {
        return gpsPoint;
    }

    /**
     * Sets the value of the gpsPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsPoint }
     *     
     */
    public void setGpsPoint(GpsPoint value) {
        this.gpsPoint = value;
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

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRotation(Float value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

}
