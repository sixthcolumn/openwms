
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseVoltage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseVoltage">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="nominalVoltage" type="{cpsm_V4.1_Release}voltage" minOccurs="0"/>
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
@XmlType(name = "BaseVoltage", propOrder = {
    "nominalVoltage"
})
public class BaseVoltage
    extends MspCIMObject
{

    protected Voltage nominalVoltage;

    /**
     * Gets the value of the nominalVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * Sets the value of the nominalVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setNominalVoltage(Voltage value) {
        this.nominalVoltage = value;
    }

}
