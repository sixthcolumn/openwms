
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * <p>Java class for realPowerRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realPowerRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realPower" type="{http://www.multispeak.org/V5.0/commonTypes}realPower"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realPowerRating", propOrder = {
    "realPower",
    "description"
})
public class RealPowerRating {

    @XmlElement(required = true)
    protected RealPower realPower;
    protected String description;

    /**
     * Gets the value of the realPower property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getRealPower() {
        return realPower;
    }

    /**
     * Sets the value of the realPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setRealPower(RealPower value) {
        this.realPower = value;
    }

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

}
