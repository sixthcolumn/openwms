
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;


/**
 * <p>Java class for apparentPowerRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apparentPowerRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apparentPower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower"/>
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
@XmlType(name = "apparentPowerRating", propOrder = {
    "apparentPower",
    "description"
})
public class ApparentPowerRating {

    @XmlElement(required = true)
    protected ApparentPower apparentPower;
    protected String description;

    /**
     * Gets the value of the apparentPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getApparentPower() {
        return apparentPower;
    }

    /**
     * Sets the value of the apparentPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setApparentPower(ApparentPower value) {
        this.apparentPower = value;
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
