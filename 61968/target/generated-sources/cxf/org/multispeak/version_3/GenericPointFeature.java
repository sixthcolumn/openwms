
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericPointFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericPointFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="graphicSymbol" type="{http://www.multispeak.org/Version_3.0}graphicSymbol" minOccurs="0"/>
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
@XmlType(name = "genericPointFeature", propOrder = {
    "featureType",
    "featureSubtype",
    "graphicSymbol"
})
public class GenericPointFeature
    extends MspPointObject
{

    protected String featureType;
    protected String featureSubtype;
    protected GraphicSymbol graphicSymbol;

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

    /**
     * Gets the value of the graphicSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicSymbol }
     *     
     */
    public GraphicSymbol getGraphicSymbol() {
        return graphicSymbol;
    }

    /**
     * Sets the value of the graphicSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicSymbol }
     *     
     */
    public void setGraphicSymbol(GraphicSymbol value) {
        this.graphicSymbol = value;
    }

}
