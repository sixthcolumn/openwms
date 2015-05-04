
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoltageLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoltageLevel">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}EquipmentContainer">
 *       &lt;sequence>
 *         &lt;element name="baseVoltageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highVoltageLimit" type="{cpsm_V4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="lowVoltageLimit" type="{cpsm_V4.1_Release}voltage" minOccurs="0"/>
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
@XmlType(name = "VoltageLevel", propOrder = {
    "baseVoltageID",
    "highVoltageLimit",
    "lowVoltageLimit"
})
public class VoltageLevel
    extends EquipmentContainer
{

    protected String baseVoltageID;
    protected Voltage highVoltageLimit;
    protected Voltage lowVoltageLimit;

    /**
     * Gets the value of the baseVoltageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseVoltageID() {
        return baseVoltageID;
    }

    /**
     * Sets the value of the baseVoltageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseVoltageID(String value) {
        this.baseVoltageID = value;
    }

    /**
     * Gets the value of the highVoltageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getHighVoltageLimit() {
        return highVoltageLimit;
    }

    /**
     * Sets the value of the highVoltageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setHighVoltageLimit(Voltage value) {
        this.highVoltageLimit = value;
    }

    /**
     * Gets the value of the lowVoltageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLowVoltageLimit() {
        return lowVoltageLimit;
    }

    /**
     * Sets the value of the lowVoltageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLowVoltageLimit(Voltage value) {
        this.lowVoltageLimit = value;
    }

}
