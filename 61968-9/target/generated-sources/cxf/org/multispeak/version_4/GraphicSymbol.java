
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.gml_v4.PointType;


/**
 * <p>Java class for graphicSymbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graphicSymbol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rotation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="GMLLocation" type="{gml_V4.1_Release}PointType" minOccurs="0"/>
 *         &lt;element name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphicSymbol", propOrder = {
    "rotation",
    "scale",
    "gmlLocation",
    "featureType",
    "featureSubtype"
})
public class GraphicSymbol {

    protected Float rotation;
    protected Float scale;
    @XmlElement(name = "GMLLocation")
    protected PointType gmlLocation;
    protected String featureType;
    protected String featureSubtype;

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
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScale(Float value) {
        this.scale = value;
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
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the featureSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureSubtype() {
        return featureSubtype;
    }

    /**
     * Sets the value of the featureSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureSubtype(String value) {
        this.featureSubtype = value;
    }

}
