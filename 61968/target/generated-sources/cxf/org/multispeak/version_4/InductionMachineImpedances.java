
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inductionMachineImpedances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inductionMachineImpedances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basePower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="baseVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="statorImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="rotorImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="magnetizingImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inductionMachineImpedances", propOrder = {
    "basePower",
    "baseVoltage",
    "statorImpedance",
    "rotorImpedance",
    "magnetizingImpedance"
})
public class InductionMachineImpedances {

    protected ApparentPower basePower;
    protected Voltage baseVoltage;
    protected ComplexImpedance statorImpedance;
    protected ComplexImpedance rotorImpedance;
    protected ComplexImpedance magnetizingImpedance;

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setBasePower(ApparentPower value) {
        this.basePower = value;
    }

    /**
     * Gets the value of the baseVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * Sets the value of the baseVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltage(Voltage value) {
        this.baseVoltage = value;
    }

    /**
     * Gets the value of the statorImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getStatorImpedance() {
        return statorImpedance;
    }

    /**
     * Sets the value of the statorImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setStatorImpedance(ComplexImpedance value) {
        this.statorImpedance = value;
    }

    /**
     * Gets the value of the rotorImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getRotorImpedance() {
        return rotorImpedance;
    }

    /**
     * Sets the value of the rotorImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setRotorImpedance(ComplexImpedance value) {
        this.rotorImpedance = value;
    }

    /**
     * Gets the value of the magnetizingImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getMagnetizingImpedance() {
        return magnetizingImpedance;
    }

    /**
     * Sets the value of the magnetizingImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setMagnetizingImpedance(ComplexImpedance value) {
        this.magnetizingImpedance = value;
    }

}
