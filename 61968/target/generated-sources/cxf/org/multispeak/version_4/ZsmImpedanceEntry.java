
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZsmImpedanceEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZsmImpedanceEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="basePower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="baseVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="selfImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedanceWithLeakage" minOccurs="0"/>
 *         &lt;element name="mutualForwardImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedanceWithLeakage" minOccurs="0"/>
 *         &lt;element name="mutualReverseImpedance" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedanceWithLeakage" minOccurs="0"/>
 *         &lt;element name="positiveSequenceZ" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="negativeSequenceZ" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="zeroSequenceZ" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
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
@XmlType(name = "ZsmImpedanceEntry", propOrder = {
    "basePower",
    "baseVoltage",
    "selfImpedance",
    "mutualForwardImpedance",
    "mutualReverseImpedance",
    "positiveSequenceZ",
    "negativeSequenceZ",
    "zeroSequenceZ"
})
public class ZsmImpedanceEntry
    extends MspElectricalDefinition
{

    protected ApparentPower basePower;
    protected Voltage baseVoltage;
    protected ComplexImpedanceWithLeakage selfImpedance;
    protected ComplexImpedanceWithLeakage mutualForwardImpedance;
    protected ComplexImpedanceWithLeakage mutualReverseImpedance;
    protected ComplexImpedance positiveSequenceZ;
    protected ComplexImpedance negativeSequenceZ;
    protected ComplexImpedance zeroSequenceZ;

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
     * Gets the value of the selfImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedanceWithLeakage }
     *     
     */
    public ComplexImpedanceWithLeakage getSelfImpedance() {
        return selfImpedance;
    }

    /**
     * Sets the value of the selfImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedanceWithLeakage }
     *     
     */
    public void setSelfImpedance(ComplexImpedanceWithLeakage value) {
        this.selfImpedance = value;
    }

    /**
     * Gets the value of the mutualForwardImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedanceWithLeakage }
     *     
     */
    public ComplexImpedanceWithLeakage getMutualForwardImpedance() {
        return mutualForwardImpedance;
    }

    /**
     * Sets the value of the mutualForwardImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedanceWithLeakage }
     *     
     */
    public void setMutualForwardImpedance(ComplexImpedanceWithLeakage value) {
        this.mutualForwardImpedance = value;
    }

    /**
     * Gets the value of the mutualReverseImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedanceWithLeakage }
     *     
     */
    public ComplexImpedanceWithLeakage getMutualReverseImpedance() {
        return mutualReverseImpedance;
    }

    /**
     * Sets the value of the mutualReverseImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedanceWithLeakage }
     *     
     */
    public void setMutualReverseImpedance(ComplexImpedanceWithLeakage value) {
        this.mutualReverseImpedance = value;
    }

    /**
     * Gets the value of the positiveSequenceZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getPositiveSequenceZ() {
        return positiveSequenceZ;
    }

    /**
     * Sets the value of the positiveSequenceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setPositiveSequenceZ(ComplexImpedance value) {
        this.positiveSequenceZ = value;
    }

    /**
     * Gets the value of the negativeSequenceZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getNegativeSequenceZ() {
        return negativeSequenceZ;
    }

    /**
     * Sets the value of the negativeSequenceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setNegativeSequenceZ(ComplexImpedance value) {
        this.negativeSequenceZ = value;
    }

    /**
     * Gets the value of the zeroSequenceZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getZeroSequenceZ() {
        return zeroSequenceZ;
    }

    /**
     * Sets the value of the zeroSequenceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setZeroSequenceZ(ComplexImpedance value) {
        this.zeroSequenceZ = value;
    }

}
