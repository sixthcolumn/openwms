
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspMotorGenerator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMotorGenerator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
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
@XmlType(name = "mspMotorGenerator", propOrder = {
    "eaEquipment",
    "ratedVoltage"
})
@XmlSeeAlso({
    InductionMachine.class,
    SynchronousMachine.class
})
public abstract class MspMotorGenerator
    extends MspElectricPoint
{

    protected EaEquipID eaEquipment;
    protected Voltage ratedVoltage;

    /**
     * Gets the value of the eaEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getEaEquipment() {
        return eaEquipment;
    }

    /**
     * Sets the value of the eaEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setEaEquipment(EaEquipID value) {
        this.eaEquipment = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

}
