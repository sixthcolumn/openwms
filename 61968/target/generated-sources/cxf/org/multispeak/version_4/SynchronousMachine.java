
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.cpsm_v4.ReactiveCapabilityCurve;
import _1_release.cpsm_v4.SynchronousMachineOperatingMode;
import _1_release.cpsm_v4.SynchronousMachineType;


/**
 * <p>Java class for synchronousMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="synchronousMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMotorGenerator">
 *       &lt;sequence>
 *         &lt;element name="ssImpedanceID" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="tranImpedanceID" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="stImpedanceID" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="type" type="{cpsm_V4.1_Release}SynchronousMachineType" minOccurs="0"/>
 *         &lt;element name="operatingMode" type="{cpsm_V4.1_Release}SynchronousMachineOperatingMode" minOccurs="0"/>
 *         &lt;element name="holdVoltsZ" type="{http://www.multispeak.org/Version_4.1_Release}complexVoltage" minOccurs="0"/>
 *         &lt;element name="Pout" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="maxLeadQ" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="maxLagQ" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="connection" type="{http://www.multispeak.org/Version_4.1_Release}loadConnection" minOccurs="0"/>
 *         &lt;element name="maximumVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="minimumVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="baseQ" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="maxQ" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="minQ" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="ratedMVA" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="generatingUnitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regulatingControlID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialReactiveCapabilityCurve" type="{cpsm_V4.1_Release}ReactiveCapabilityCurve" minOccurs="0"/>
 *         &lt;element name="impedances" type="{http://www.multispeak.org/Version_4.1_Release}synchronousMachineImpedances" minOccurs="0"/>
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
@XmlType(name = "synchronousMachine", propOrder = {
    "ssImpedanceID",
    "tranImpedanceID",
    "stImpedanceID",
    "model",
    "type",
    "operatingMode",
    "holdVoltsZ",
    "pout",
    "maxLeadQ",
    "maxLagQ",
    "connection",
    "maximumVoltage",
    "minimumVoltage",
    "baseQ",
    "maxQ",
    "minQ",
    "ratedMVA",
    "generatingUnitID",
    "regulatingControlID",
    "initialReactiveCapabilityCurve",
    "impedances"
})
public class SynchronousMachine
    extends MspMotorGenerator
{

    protected EaEquipID ssImpedanceID;
    protected EaEquipID tranImpedanceID;
    protected EaEquipID stImpedanceID;
    protected BigInteger model;
    protected SynchronousMachineType type;
    protected SynchronousMachineOperatingMode operatingMode;
    protected ComplexVoltage holdVoltsZ;
    @XmlElement(name = "Pout")
    protected RealPower pout;
    protected ReactivePower maxLeadQ;
    protected ReactivePower maxLagQ;
    protected LoadConnection connection;
    protected Voltage maximumVoltage;
    protected Voltage minimumVoltage;
    protected ReactivePower baseQ;
    protected ReactivePower maxQ;
    protected ReactivePower minQ;
    protected ApparentPower ratedMVA;
    protected String generatingUnitID;
    protected String regulatingControlID;
    protected ReactiveCapabilityCurve initialReactiveCapabilityCurve;
    protected SynchronousMachineImpedances impedances;

    /**
     * Gets the value of the ssImpedanceID property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getSsImpedanceID() {
        return ssImpedanceID;
    }

    /**
     * Sets the value of the ssImpedanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setSsImpedanceID(EaEquipID value) {
        this.ssImpedanceID = value;
    }

    /**
     * Gets the value of the tranImpedanceID property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getTranImpedanceID() {
        return tranImpedanceID;
    }

    /**
     * Sets the value of the tranImpedanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setTranImpedanceID(EaEquipID value) {
        this.tranImpedanceID = value;
    }

    /**
     * Gets the value of the stImpedanceID property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getStImpedanceID() {
        return stImpedanceID;
    }

    /**
     * Sets the value of the stImpedanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setStImpedanceID(EaEquipID value) {
        this.stImpedanceID = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModel(BigInteger value) {
        this.model = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronousMachineType }
     *     
     */
    public SynchronousMachineType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronousMachineType }
     *     
     */
    public void setType(SynchronousMachineType value) {
        this.type = value;
    }

    /**
     * Gets the value of the operatingMode property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronousMachineOperatingMode }
     *     
     */
    public SynchronousMachineOperatingMode getOperatingMode() {
        return operatingMode;
    }

    /**
     * Sets the value of the operatingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronousMachineOperatingMode }
     *     
     */
    public void setOperatingMode(SynchronousMachineOperatingMode value) {
        this.operatingMode = value;
    }

    /**
     * Gets the value of the holdVoltsZ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexVoltage }
     *     
     */
    public ComplexVoltage getHoldVoltsZ() {
        return holdVoltsZ;
    }

    /**
     * Sets the value of the holdVoltsZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexVoltage }
     *     
     */
    public void setHoldVoltsZ(ComplexVoltage value) {
        this.holdVoltsZ = value;
    }

    /**
     * Gets the value of the pout property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getPout() {
        return pout;
    }

    /**
     * Sets the value of the pout property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setPout(RealPower value) {
        this.pout = value;
    }

    /**
     * Gets the value of the maxLeadQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxLeadQ() {
        return maxLeadQ;
    }

    /**
     * Sets the value of the maxLeadQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxLeadQ(ReactivePower value) {
        this.maxLeadQ = value;
    }

    /**
     * Gets the value of the maxLagQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxLagQ() {
        return maxLagQ;
    }

    /**
     * Sets the value of the maxLagQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxLagQ(ReactivePower value) {
        this.maxLagQ = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link LoadConnection }
     *     
     */
    public LoadConnection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadConnection }
     *     
     */
    public void setConnection(LoadConnection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the maximumVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getMaximumVoltage() {
        return maximumVoltage;
    }

    /**
     * Sets the value of the maximumVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setMaximumVoltage(Voltage value) {
        this.maximumVoltage = value;
    }

    /**
     * Gets the value of the minimumVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getMinimumVoltage() {
        return minimumVoltage;
    }

    /**
     * Sets the value of the minimumVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setMinimumVoltage(Voltage value) {
        this.minimumVoltage = value;
    }

    /**
     * Gets the value of the baseQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getBaseQ() {
        return baseQ;
    }

    /**
     * Sets the value of the baseQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setBaseQ(ReactivePower value) {
        this.baseQ = value;
    }

    /**
     * Gets the value of the maxQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxQ() {
        return maxQ;
    }

    /**
     * Sets the value of the maxQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxQ(ReactivePower value) {
        this.maxQ = value;
    }

    /**
     * Gets the value of the minQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMinQ() {
        return minQ;
    }

    /**
     * Sets the value of the minQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMinQ(ReactivePower value) {
        this.minQ = value;
    }

    /**
     * Gets the value of the ratedMVA property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedMVA() {
        return ratedMVA;
    }

    /**
     * Sets the value of the ratedMVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedMVA(ApparentPower value) {
        this.ratedMVA = value;
    }

    /**
     * Gets the value of the generatingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratingUnitID() {
        return generatingUnitID;
    }

    /**
     * Sets the value of the generatingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratingUnitID(String value) {
        this.generatingUnitID = value;
    }

    /**
     * Gets the value of the regulatingControlID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatingControlID() {
        return regulatingControlID;
    }

    /**
     * Sets the value of the regulatingControlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatingControlID(String value) {
        this.regulatingControlID = value;
    }

    /**
     * Gets the value of the initialReactiveCapabilityCurve property.
     * 
     * @return
     *     possible object is
     *     {@link ReactiveCapabilityCurve }
     *     
     */
    public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
        return initialReactiveCapabilityCurve;
    }

    /**
     * Sets the value of the initialReactiveCapabilityCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactiveCapabilityCurve }
     *     
     */
    public void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve value) {
        this.initialReactiveCapabilityCurve = value;
    }

    /**
     * Gets the value of the impedances property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronousMachineImpedances }
     *     
     */
    public SynchronousMachineImpedances getImpedances() {
        return impedances;
    }

    /**
     * Sets the value of the impedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronousMachineImpedances }
     *     
     */
    public void setImpedances(SynchronousMachineImpedances value) {
        this.impedances = value;
    }

}
