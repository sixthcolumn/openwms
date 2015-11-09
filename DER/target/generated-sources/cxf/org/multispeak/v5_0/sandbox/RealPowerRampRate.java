
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.RealPowerUnits;
import org.multispeak.v5_0.enumerations.TimeUnits;


/**
 * <p>Java class for realPowerRampRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realPowerRampRate">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="realPowerUnits" type="{http://www.multispeak.org/V5.0/enumerations}realPowerUnits" />
 *       &lt;attribute name="timeUnits" type="{http://www.multispeak.org/V5.0/enumerations}timeUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realPowerRampRate", propOrder = {
    "value"
})
public class RealPowerRampRate {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "realPowerUnits")
    protected RealPowerUnits realPowerUnits;
    @XmlAttribute(name = "timeUnits")
    protected TimeUnits timeUnits;

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
     * Gets the value of the realPowerUnits property.
     * 
     * @return
     *     possible object is
     *     {@link RealPowerUnits }
     *     
     */
    public RealPowerUnits getRealPowerUnits() {
        return realPowerUnits;
    }

    /**
     * Sets the value of the realPowerUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPowerUnits }
     *     
     */
    public void setRealPowerUnits(RealPowerUnits value) {
        this.realPowerUnits = value;
    }

    /**
     * Gets the value of the timeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnits }
     *     
     */
    public TimeUnits getTimeUnits() {
        return timeUnits;
    }

    /**
     * Sets the value of the timeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnits }
     *     
     */
    public void setTimeUnits(TimeUnits value) {
        this.timeUnits = value;
    }

}
