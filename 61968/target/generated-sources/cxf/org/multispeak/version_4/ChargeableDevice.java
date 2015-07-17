
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chargeableDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargeableDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="chargeableDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="actionFlag" type="{http://www.multispeak.org/Version_4.1_Release}actionFlag" minOccurs="0"/>
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
@XmlType(name = "chargeableDevice", propOrder = {
    "chargeableDeviceType",
    "deviceDescription",
    "quantity",
    "actionFlag"
})
public class ChargeableDevice
    extends MspObject
{

    protected String chargeableDeviceType;
    protected String deviceDescription;
    protected BigInteger quantity;
    protected ActionFlag actionFlag;

    /**
     * Gets the value of the chargeableDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeableDeviceType() {
        return chargeableDeviceType;
    }

    /**
     * Sets the value of the chargeableDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeableDeviceType(String value) {
        this.chargeableDeviceType = value;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the actionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link ActionFlag }
     *     
     */
    public ActionFlag getActionFlag() {
        return actionFlag;
    }

    /**
     * Sets the value of the actionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionFlag }
     *     
     */
    public void setActionFlag(ActionFlag value) {
        this.actionFlag = value;
    }

}
