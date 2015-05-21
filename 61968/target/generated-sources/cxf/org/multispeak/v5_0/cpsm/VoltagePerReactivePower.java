
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for VoltagePerReactivePower complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoltagePerReactivePower">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="multiplier" type="{http://www.multispeak.org/V5.0/cpsm}voltagePerReactivePowerMultiplier" />
 *       &lt;attribute name="units" type="{http://www.multispeak.org/V5.0/cpsm}voltagePerReactivePowerUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoltagePerReactivePower", propOrder = {
    "value"
})
public class VoltagePerReactivePower {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "multiplier")
    protected VoltagePerReactivePowerMultiplier multiplier;
    @XmlAttribute(name = "units")
    protected VoltagePerReactivePowerUnits units;

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
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link VoltagePerReactivePowerMultiplier }
     *     
     */
    public VoltagePerReactivePowerMultiplier getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltagePerReactivePowerMultiplier }
     *     
     */
    public void setMultiplier(VoltagePerReactivePowerMultiplier value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link VoltagePerReactivePowerUnits }
     *     
     */
    public VoltagePerReactivePowerUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltagePerReactivePowerUnits }
     *     
     */
    public void setUnits(VoltagePerReactivePowerUnits value) {
        this.units = value;
    }

}
