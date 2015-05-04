
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gasMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="gasNameplate" type="{http://www.multispeak.org/Version_4.1_Release}gasNameplate" minOccurs="0"/>
 *         &lt;element name="gasLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}gasLocationFields" minOccurs="0"/>
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
@XmlType(name = "gasMeter", propOrder = {
    "gasNameplate",
    "gasLocationFields"
})
public class GasMeter
    extends MspMeter
{

    protected GasNameplate gasNameplate;
    protected GasLocationFields gasLocationFields;

    /**
     * Gets the value of the gasNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link GasNameplate }
     *     
     */
    public GasNameplate getGasNameplate() {
        return gasNameplate;
    }

    /**
     * Sets the value of the gasNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasNameplate }
     *     
     */
    public void setGasNameplate(GasNameplate value) {
        this.gasNameplate = value;
    }

    /**
     * Gets the value of the gasLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link GasLocationFields }
     *     
     */
    public GasLocationFields getGasLocationFields() {
        return gasLocationFields;
    }

    /**
     * Sets the value of the gasLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasLocationFields }
     *     
     */
    public void setGasLocationFields(GasLocationFields value) {
        this.gasLocationFields = value;
    }

}
