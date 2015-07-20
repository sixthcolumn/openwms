
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geometry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/Version_4.1_Release}GMLLocation" minOccurs="0"/>
 *         &lt;element name="GMLLines" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGMLLine" minOccurs="0"/>
 *         &lt;element name="GMLPolygons" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGMLPolygon" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geometry", propOrder = {
    "gmlLocation",
    "gmlLines",
    "gmlPolygons"
})
public class Geometry {

    @XmlElement(name = "GMLLocation")
    protected GMLLocation gmlLocation;
    @XmlElement(name = "GMLLines")
    protected ArrayOfGMLLine gmlLines;
    @XmlElement(name = "GMLPolygons")
    protected ArrayOfGMLPolygon gmlPolygons;

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLocation }
     *     
     */
    public GMLLocation getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLocation }
     *     
     */
    public void setGMLLocation(GMLLocation value) {
        this.gmlLocation = value;
    }

    /**
     * Gets the value of the gmlLines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGMLLine }
     *     
     */
    public ArrayOfGMLLine getGMLLines() {
        return gmlLines;
    }

    /**
     * Sets the value of the gmlLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGMLLine }
     *     
     */
    public void setGMLLines(ArrayOfGMLLine value) {
        this.gmlLines = value;
    }

    /**
     * Gets the value of the gmlPolygons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGMLPolygon }
     *     
     */
    public ArrayOfGMLPolygon getGMLPolygons() {
        return gmlPolygons;
    }

    /**
     * Sets the value of the gmlPolygons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGMLPolygon }
     *     
     */
    public void setGMLPolygons(ArrayOfGMLPolygon value) {
        this.gmlPolygons = value;
    }

}
