
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waterMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="waterNameplate" type="{http://www.multispeak.org/Version_4.1_Release}waterNameplate" minOccurs="0"/>
 *         &lt;element name="waterLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}waterLocationFields" minOccurs="0"/>
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
@XmlType(name = "waterMeter", propOrder = {
    "waterNameplate",
    "waterLocationFields"
})
public class WaterMeter
    extends MspMeter
{

    protected WaterNameplate waterNameplate;
    protected WaterLocationFields waterLocationFields;

    /**
     * Gets the value of the waterNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link WaterNameplate }
     *     
     */
    public WaterNameplate getWaterNameplate() {
        return waterNameplate;
    }

    /**
     * Sets the value of the waterNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterNameplate }
     *     
     */
    public void setWaterNameplate(WaterNameplate value) {
        this.waterNameplate = value;
    }

    /**
     * Gets the value of the waterLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link WaterLocationFields }
     *     
     */
    public WaterLocationFields getWaterLocationFields() {
        return waterLocationFields;
    }

    /**
     * Sets the value of the waterLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterLocationFields }
     *     
     */
    public void setWaterLocationFields(WaterLocationFields value) {
        this.waterLocationFields = value;
    }

}
