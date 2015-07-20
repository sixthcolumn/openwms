
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equivalentSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equivalentSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basePower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="baseVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="zMin" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="zMax" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="posSeqZ" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="zeroSeqZ" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="negSeqZ" type="{http://www.multispeak.org/Version_4.1_Release}complexImpedance" minOccurs="0"/>
 *         &lt;element name="voltageMagnitude" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="voltageAngle" type="{http://www.multispeak.org/Version_4.1_Release}angle" minOccurs="0"/>
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
@XmlType(name = "equivalentSource", propOrder = {
    "name",
    "basePower",
    "baseVoltage",
    "zMin",
    "zMax",
    "posSeqZ",
    "zeroSeqZ",
    "negSeqZ",
    "voltageMagnitude",
    "voltageAngle"
})
public class EquivalentSource
    extends MspElectricPoint
{

    protected String name;
    protected ApparentPower basePower;
    protected Voltage baseVoltage;
    protected ComplexImpedance zMin;
    protected ComplexImpedance zMax;
    protected ComplexImpedance posSeqZ;
    protected ComplexImpedance zeroSeqZ;
    protected ComplexImpedance negSeqZ;
    protected Voltage voltageMagnitude;
    protected Angle voltageAngle;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the zMin property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getZMin() {
        return zMin;
    }

    /**
     * Sets the value of the zMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setZMin(ComplexImpedance value) {
        this.zMin = value;
    }

    /**
     * Gets the value of the zMax property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getZMax() {
        return zMax;
    }

    /**
     * Sets the value of the zMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setZMax(ComplexImpedance value) {
        this.zMax = value;
    }

    /**
     * Gets the value of the posSeqZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getPosSeqZ() {
        return posSeqZ;
    }

    /**
     * Sets the value of the posSeqZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setPosSeqZ(ComplexImpedance value) {
        this.posSeqZ = value;
    }

    /**
     * Gets the value of the zeroSeqZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getZeroSeqZ() {
        return zeroSeqZ;
    }

    /**
     * Sets the value of the zeroSeqZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setZeroSeqZ(ComplexImpedance value) {
        this.zeroSeqZ = value;
    }

    /**
     * Gets the value of the negSeqZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getNegSeqZ() {
        return negSeqZ;
    }

    /**
     * Sets the value of the negSeqZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setNegSeqZ(ComplexImpedance value) {
        this.negSeqZ = value;
    }

    /**
     * Gets the value of the voltageMagnitude property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageMagnitude() {
        return voltageMagnitude;
    }

    /**
     * Sets the value of the voltageMagnitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageMagnitude(Voltage value) {
        this.voltageMagnitude = value;
    }

    /**
     * Gets the value of the voltageAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Angle }
     *     
     */
    public Angle getVoltageAngle() {
        return voltageAngle;
    }

    /**
     * Sets the value of the voltageAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angle }
     *     
     */
    public void setVoltageAngle(Angle value) {
        this.voltageAngle = value;
    }

}
