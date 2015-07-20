
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.gml_v4.PointType;
import _1_release.gml_v4.PolygonType;


/**
 * <p>Java class for substation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="substation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="GMLPolygon" type="{gml_V4.1_Release}PolygonType" minOccurs="0"/>
 *         &lt;element name="GMLLocation" type="{gml_V4.1_Release}PointType" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGenericAnnotationFeature" minOccurs="0"/>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busVolts" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="nominalVolts" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="feederList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfFeederObject" minOccurs="0"/>
 *         &lt;element name="contentsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObjectRef2" minOccurs="0"/>
 *         &lt;element name="bayList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfBay" minOccurs="0"/>
 *         &lt;element name="voltageLevels" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfVoltageLevel" minOccurs="0"/>
 *         &lt;element name="regionID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
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
@XmlType(name = "substation", propOrder = {
    "gmlPolygon",
    "gmlLocation",
    "annotationList",
    "facilityID",
    "name",
    "busVolts",
    "nominalVolts",
    "feederList",
    "contentsList",
    "bayList",
    "voltageLevels",
    "regionID"
})
public class Substation
    extends MspObject
{

    @XmlElement(name = "GMLPolygon")
    protected PolygonType gmlPolygon;
    @XmlElement(name = "GMLLocation")
    protected PointType gmlLocation;
    protected ArrayOfGenericAnnotationFeature annotationList;
    protected String facilityID;
    protected String name;
    protected Voltage busVolts;
    protected Voltage nominalVolts;
    protected ArrayOfFeederObject feederList;
    protected ArrayOfObjectRef2 contentsList;
    protected ArrayOfBay bayList;
    protected ArrayOfVoltageLevel voltageLevels;
    protected ObjectRef regionID;

    /**
     * Gets the value of the gmlPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link PolygonType }
     *     
     */
    public PolygonType getGMLPolygon() {
        return gmlPolygon;
    }

    /**
     * Sets the value of the gmlPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonType }
     *     
     */
    public void setGMLPolygon(PolygonType value) {
        this.gmlPolygon = value;
    }

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
     * Gets the value of the annotationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public ArrayOfGenericAnnotationFeature getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericAnnotationFeature }
     *     
     */
    public void setAnnotationList(ArrayOfGenericAnnotationFeature value) {
        this.annotationList = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the busVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBusVolts() {
        return busVolts;
    }

    /**
     * Sets the value of the busVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBusVolts(Voltage value) {
        this.busVolts = value;
    }

    /**
     * Gets the value of the nominalVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getNominalVolts() {
        return nominalVolts;
    }

    /**
     * Sets the value of the nominalVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setNominalVolts(Voltage value) {
        this.nominalVolts = value;
    }

    /**
     * Gets the value of the feederList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeederObject }
     *     
     */
    public ArrayOfFeederObject getFeederList() {
        return feederList;
    }

    /**
     * Sets the value of the feederList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeederObject }
     *     
     */
    public void setFeederList(ArrayOfFeederObject value) {
        this.feederList = value;
    }

    /**
     * Gets the value of the contentsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef2 }
     *     
     */
    public ArrayOfObjectRef2 getContentsList() {
        return contentsList;
    }

    /**
     * Sets the value of the contentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef2 }
     *     
     */
    public void setContentsList(ArrayOfObjectRef2 value) {
        this.contentsList = value;
    }

    /**
     * Gets the value of the bayList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBay }
     *     
     */
    public ArrayOfBay getBayList() {
        return bayList;
    }

    /**
     * Sets the value of the bayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBay }
     *     
     */
    public void setBayList(ArrayOfBay value) {
        this.bayList = value;
    }

    /**
     * Gets the value of the voltageLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVoltageLevel }
     *     
     */
    public ArrayOfVoltageLevel getVoltageLevels() {
        return voltageLevels;
    }

    /**
     * Sets the value of the voltageLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVoltageLevel }
     *     
     */
    public void setVoltageLevels(ArrayOfVoltageLevel value) {
        this.voltageLevels = value;
    }

    /**
     * Gets the value of the regionID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getRegionID() {
        return regionID;
    }

    /**
     * Sets the value of the regionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setRegionID(ObjectRef value) {
        this.regionID = value;
    }

}
