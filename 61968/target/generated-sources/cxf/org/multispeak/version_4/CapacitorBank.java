
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitorBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitorBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="capacitorConnectionCode" type="{http://www.multispeak.org/Version_4.1_Release}capacitorConnectionCode" minOccurs="0"/>
 *         &lt;element name="switchType" type="{http://www.multispeak.org/Version_4.1_Release}swType" minOccurs="0"/>
 *         &lt;element name="switchStatus" type="{http://www.multispeak.org/Version_4.1_Release}swStatus" minOccurs="0"/>
 *         &lt;element name="switchOn" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="switchOff" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="switchTimeDelay" type="{http://www.multispeak.org/Version_4.1_Release}seconds" minOccurs="0"/>
 *         &lt;element name="controlCircuitID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="bankRating" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="nominalVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="capacitorList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCapacitor" minOccurs="0"/>
 *         &lt;element name="regulatingControlID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impedances" type="{http://www.multispeak.org/Version_4.1_Release}impedances" minOccurs="0"/>
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
@XmlType(name = "capacitorBank", propOrder = {
    "capacitorConnectionCode",
    "switchType",
    "switchStatus",
    "switchOn",
    "switchOff",
    "switchTimeDelay",
    "controlCircuitID",
    "bankRating",
    "nominalVoltage",
    "capacitorList",
    "regulatingControlID",
    "impedances"
})
public class CapacitorBank
    extends MspBankObject
{

    protected CapacitorConnectionCode capacitorConnectionCode;
    protected SwType switchType;
    protected SwStatus switchStatus;
    protected Float switchOn;
    protected Float switchOff;
    protected Seconds switchTimeDelay;
    protected ObjectRef controlCircuitID;
    protected ReactivePower bankRating;
    protected Voltage nominalVoltage;
    protected ArrayOfCapacitor capacitorList;
    protected String regulatingControlID;
    protected Impedances impedances;

    /**
     * Gets the value of the capacitorConnectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorConnectionCode }
     *     
     */
    public CapacitorConnectionCode getCapacitorConnectionCode() {
        return capacitorConnectionCode;
    }

    /**
     * Sets the value of the capacitorConnectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorConnectionCode }
     *     
     */
    public void setCapacitorConnectionCode(CapacitorConnectionCode value) {
        this.capacitorConnectionCode = value;
    }

    /**
     * Gets the value of the switchType property.
     * 
     * @return
     *     possible object is
     *     {@link SwType }
     *     
     */
    public SwType getSwitchType() {
        return switchType;
    }

    /**
     * Sets the value of the switchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwType }
     *     
     */
    public void setSwitchType(SwType value) {
        this.switchType = value;
    }

    /**
     * Gets the value of the switchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwStatus }
     *     
     */
    public SwStatus getSwitchStatus() {
        return switchStatus;
    }

    /**
     * Sets the value of the switchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwStatus }
     *     
     */
    public void setSwitchStatus(SwStatus value) {
        this.switchStatus = value;
    }

    /**
     * Gets the value of the switchOn property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSwitchOn() {
        return switchOn;
    }

    /**
     * Sets the value of the switchOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSwitchOn(Float value) {
        this.switchOn = value;
    }

    /**
     * Gets the value of the switchOff property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSwitchOff() {
        return switchOff;
    }

    /**
     * Sets the value of the switchOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSwitchOff(Float value) {
        this.switchOff = value;
    }

    /**
     * Gets the value of the switchTimeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getSwitchTimeDelay() {
        return switchTimeDelay;
    }

    /**
     * Sets the value of the switchTimeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setSwitchTimeDelay(Seconds value) {
        this.switchTimeDelay = value;
    }

    /**
     * Gets the value of the controlCircuitID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getControlCircuitID() {
        return controlCircuitID;
    }

    /**
     * Sets the value of the controlCircuitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setControlCircuitID(ObjectRef value) {
        this.controlCircuitID = value;
    }

    /**
     * Gets the value of the bankRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getBankRating() {
        return bankRating;
    }

    /**
     * Sets the value of the bankRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setBankRating(ReactivePower value) {
        this.bankRating = value;
    }

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

    /**
     * Gets the value of the capacitorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCapacitor }
     *     
     */
    public ArrayOfCapacitor getCapacitorList() {
        return capacitorList;
    }

    /**
     * Sets the value of the capacitorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCapacitor }
     *     
     */
    public void setCapacitorList(ArrayOfCapacitor value) {
        this.capacitorList = value;
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
     * Gets the value of the impedances property.
     * 
     * @return
     *     possible object is
     *     {@link Impedances }
     *     
     */
    public Impedances getImpedances() {
        return impedances;
    }

    /**
     * Sets the value of the impedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impedances }
     *     
     */
    public void setImpedances(Impedances value) {
        this.impedances = value;
    }

}
