
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scadaPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scadaPointType" type="{http://www.multispeak.org/Version_4.1_Release}scadaPointType" minOccurs="0"/>
 *         &lt;element name="GISFeatureID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="GISFeatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "scadaPoint", propOrder = {
    "description",
    "scadaPointType",
    "gisFeatureID",
    "gisFeatureType"
})
public class ScadaPoint
    extends MspPointObject
{

    protected String description;
    protected ScadaPointType scadaPointType;
    @XmlElement(name = "GISFeatureID")
    protected ObjectRef gisFeatureID;
    @XmlElement(name = "GISFeatureType")
    protected String gisFeatureType;

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

    /**
     * Gets the value of the scadaPointType property.
     * 
     * @return
     *     possible object is
     *     {@link ScadaPointType }
     *     
     */
    public ScadaPointType getScadaPointType() {
        return scadaPointType;
    }

    /**
     * Sets the value of the scadaPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScadaPointType }
     *     
     */
    public void setScadaPointType(ScadaPointType value) {
        this.scadaPointType = value;
    }

    /**
     * Gets the value of the gisFeatureID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getGISFeatureID() {
        return gisFeatureID;
    }

    /**
     * Sets the value of the gisFeatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setGISFeatureID(ObjectRef value) {
        this.gisFeatureID = value;
    }

    /**
     * Gets the value of the gisFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGISFeatureType() {
        return gisFeatureType;
    }

    /**
     * Sets the value of the gisFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGISFeatureType(String value) {
        this.gisFeatureType = value;
    }

}
