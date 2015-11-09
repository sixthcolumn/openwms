
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * Various capabilities that might be returned for
 * 				this DERGroup.
 * 
 * <p>Java class for DERGroupCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupCapabilities">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="realPower" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="reactivePower" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="apparentPower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="otherCapabilities" type="{http://www.multispeak.org/V5.0/sandbox}otherCapabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupCapabilities", propOrder = {
    "realPower",
    "reactivePower",
    "apparentPower",
    "otherCapabilities"
})
public class DERGroupCapabilities
    extends MspExtensible
{

    protected RealPower realPower;
    protected ReactivePower reactivePower;
    protected ApparentPower apparentPower;
    protected OtherCapabilities otherCapabilities;

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
     * Gets the value of the reactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactivePower() {
        return reactivePower;
    }

    /**
     * Sets the value of the reactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactivePower(ReactivePower value) {
        this.reactivePower = value;
    }

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
     * Gets the value of the otherCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCapabilities }
     *     
     */
    public OtherCapabilities getOtherCapabilities() {
        return otherCapabilities;
    }

    /**
     * Sets the value of the otherCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCapabilities }
     *     
     */
    public void setOtherCapabilities(OtherCapabilities value) {
        this.otherCapabilities = value;
    }

}
