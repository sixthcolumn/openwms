
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.WeightUnits;


/**
 * <p>Java class for weight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weight">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="units" type="{http://www.multispeak.org/V5.0/enumerations}weightUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weight", propOrder = {
    "value"
})
public class Weight {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "units")
    protected WeightUnits units;

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link WeightUnits }
     *     
     */
    public WeightUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnits }
     *     
     */
    public void setUnits(WeightUnits value) {
        this.units = value;
    }

}