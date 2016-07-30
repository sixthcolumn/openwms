
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * <p>Java class for dispatchTargets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dispatchTargets">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="realPowerDispatchTarget" type="{http://www.multispeak.org/V5.0/commonTypes}realPower"/>
 *         &lt;element name="reactivePowerTarget" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dispatchTargets", propOrder = {
    "realPowerDispatchTarget",
    "reactivePowerTarget"
})
public class DispatchTargets
    extends MspExtensible
{

    @XmlElement(required = true)
    protected RealPower realPowerDispatchTarget;
    @XmlElement(required = true)
    protected ReactivePower reactivePowerTarget;

    /**
     * Gets the value of the realPowerDispatchTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getRealPowerDispatchTarget() {
        return realPowerDispatchTarget;
    }

    /**
     * Sets the value of the realPowerDispatchTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setRealPowerDispatchTarget(RealPower value) {
        this.realPowerDispatchTarget = value;
    }

    /**
     * Gets the value of the reactivePowerTarget property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactivePowerTarget() {
        return reactivePowerTarget;
    }

    /**
     * Sets the value of the reactivePowerTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactivePowerTarget(ReactivePower value) {
        this.reactivePowerTarget = value;
    }

}
