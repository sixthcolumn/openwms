
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspPolygonObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspPolygonObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="GMLPolygon" type="{http://www.multispeak.org/Version_4.1_Release}GMLPolygon" minOccurs="0"/>
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
@XmlType(name = "mspPolygonObject", propOrder = {
    "gmlPolygon"
})
@XmlSeeAlso({
    GenericPolygonFeature.class,
    Parcel.class
})
public abstract class MspPolygonObject
    extends MspObject
{

    @XmlElement(name = "GMLPolygon")
    protected GMLPolygon gmlPolygon;

    /**
     * Gets the value of the gmlPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link GMLPolygon }
     *     
     */
    public GMLPolygon getGMLPolygon() {
        return gmlPolygon;
    }

    /**
     * Sets the value of the gmlPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLPolygon }
     *     
     */
    public void setGMLPolygon(GMLPolygon value) {
        this.gmlPolygon = value;
    }

}
