
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inductionMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inductionMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMotorGenerator">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.multispeak.org/Version_4.1_Release}machineType" minOccurs="0"/>
 *         &lt;element name="operatingSlip" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pf" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="efficiency" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lgVolts" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="dropout" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nemaType" type="{http://www.multispeak.org/Version_4.1_Release}nemaType" minOccurs="0"/>
 *         &lt;element name="limitVoltage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="softStartType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="softStartR" type="{http://www.multispeak.org/Version_4.1_Release}resistance" minOccurs="0"/>
 *         &lt;element name="softStartX" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="softStartTap" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lockedRotorPF" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lockedRotorMultiplier" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="impedances" type="{http://www.multispeak.org/Version_4.1_Release}inductionMachineImpedances" minOccurs="0"/>
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
@XmlType(name = "inductionMachine", propOrder = {
    "status",
    "type",
    "operatingSlip",
    "hp",
    "pf",
    "efficiency",
    "lgVolts",
    "dropout",
    "nemaType",
    "limitVoltage",
    "softStartType",
    "softStartR",
    "softStartX",
    "softStartTap",
    "lockedRotorPF",
    "lockedRotorMultiplier",
    "impedances"
})
public class InductionMachine
    extends MspMotorGenerator
{

    protected BigInteger status;
    protected MachineType type;
    protected Float operatingSlip;
    protected Float hp;
    protected Float pf;
    protected Float efficiency;
    protected Voltage lgVolts;
    protected Float dropout;
    protected NemaType nemaType;
    protected Float limitVoltage;
    protected BigInteger softStartType;
    protected Resistance softStartR;
    protected Reactance softStartX;
    protected Float softStartTap;
    protected Float lockedRotorPF;
    protected Float lockedRotorMultiplier;
    protected InductionMachineImpedances impedances;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MachineType }
     *     
     */
    public MachineType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineType }
     *     
     */
    public void setType(MachineType value) {
        this.type = value;
    }

    /**
     * Gets the value of the operatingSlip property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOperatingSlip() {
        return operatingSlip;
    }

    /**
     * Sets the value of the operatingSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOperatingSlip(Float value) {
        this.operatingSlip = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHp(Float value) {
        this.hp = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPf() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPf(Float value) {
        this.pf = value;
    }

    /**
     * Gets the value of the efficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEfficiency() {
        return efficiency;
    }

    /**
     * Sets the value of the efficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEfficiency(Float value) {
        this.efficiency = value;
    }

    /**
     * Gets the value of the lgVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLgVolts() {
        return lgVolts;
    }

    /**
     * Sets the value of the lgVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLgVolts(Voltage value) {
        this.lgVolts = value;
    }

    /**
     * Gets the value of the dropout property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDropout() {
        return dropout;
    }

    /**
     * Sets the value of the dropout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDropout(Float value) {
        this.dropout = value;
    }

    /**
     * Gets the value of the nemaType property.
     * 
     * @return
     *     possible object is
     *     {@link NemaType }
     *     
     */
    public NemaType getNemaType() {
        return nemaType;
    }

    /**
     * Sets the value of the nemaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NemaType }
     *     
     */
    public void setNemaType(NemaType value) {
        this.nemaType = value;
    }

    /**
     * Gets the value of the limitVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLimitVoltage() {
        return limitVoltage;
    }

    /**
     * Sets the value of the limitVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLimitVoltage(Float value) {
        this.limitVoltage = value;
    }

    /**
     * Gets the value of the softStartType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSoftStartType() {
        return softStartType;
    }

    /**
     * Sets the value of the softStartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSoftStartType(BigInteger value) {
        this.softStartType = value;
    }

    /**
     * Gets the value of the softStartR property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getSoftStartR() {
        return softStartR;
    }

    /**
     * Sets the value of the softStartR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setSoftStartR(Resistance value) {
        this.softStartR = value;
    }

    /**
     * Gets the value of the softStartX property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getSoftStartX() {
        return softStartX;
    }

    /**
     * Sets the value of the softStartX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setSoftStartX(Reactance value) {
        this.softStartX = value;
    }

    /**
     * Gets the value of the softStartTap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSoftStartTap() {
        return softStartTap;
    }

    /**
     * Sets the value of the softStartTap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSoftStartTap(Float value) {
        this.softStartTap = value;
    }

    /**
     * Gets the value of the lockedRotorPF property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLockedRotorPF() {
        return lockedRotorPF;
    }

    /**
     * Sets the value of the lockedRotorPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLockedRotorPF(Float value) {
        this.lockedRotorPF = value;
    }

    /**
     * Gets the value of the lockedRotorMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLockedRotorMultiplier() {
        return lockedRotorMultiplier;
    }

    /**
     * Sets the value of the lockedRotorMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLockedRotorMultiplier(Float value) {
        this.lockedRotorMultiplier = value;
    }

    /**
     * Gets the value of the impedances property.
     * 
     * @return
     *     possible object is
     *     {@link InductionMachineImpedances }
     *     
     */
    public InductionMachineImpedances getImpedances() {
        return impedances;
    }

    /**
     * Sets the value of the impedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link InductionMachineImpedances }
     *     
     */
    public void setImpedances(InductionMachineImpedances value) {
        this.impedances = value;
    }

}
