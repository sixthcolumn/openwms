
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="vOut" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="voltageBandwidth" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="initialDelay" type="{http://www.multispeak.org/Version_4.1_Release}seconds" minOccurs="0"/>
 *         &lt;element name="subsequentDelay" type="{http://www.multispeak.org/Version_4.1_Release}seconds" minOccurs="0"/>
 *         &lt;element name="ldcR" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ldcX" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="fhHi" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="fhLo" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="reverseFlowR" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="reverseFlowX" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="assetFields" type="{http://www.multispeak.org/Version_4.1_Release}assetFields" minOccurs="0"/>
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
@XmlType(name = "regulator", propOrder = {
    "eaEquipment",
    "phaseCode",
    "vOut",
    "voltageBandwidth",
    "initialDelay",
    "subsequentDelay",
    "ldcR",
    "ldcX",
    "fhHi",
    "fhLo",
    "reverseFlowR",
    "reverseFlowX",
    "assetFields"
})
public class Regulator
    extends MspObject
{

    protected EaEquipID eaEquipment;
    protected PhaseCode phaseCode;
    protected Voltage vOut;
    protected Voltage voltageBandwidth;
    protected Seconds initialDelay;
    protected Seconds subsequentDelay;
    protected Voltage ldcR;
    protected Voltage ldcX;
    protected Voltage fhHi;
    protected Voltage fhLo;
    protected Voltage reverseFlowR;
    protected Voltage reverseFlowX;
    protected AssetFields assetFields;

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
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the vOut property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVOut() {
        return vOut;
    }

    /**
     * Sets the value of the vOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVOut(Voltage value) {
        this.vOut = value;
    }

    /**
     * Gets the value of the voltageBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageBandwidth() {
        return voltageBandwidth;
    }

    /**
     * Sets the value of the voltageBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageBandwidth(Voltage value) {
        this.voltageBandwidth = value;
    }

    /**
     * Gets the value of the initialDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getInitialDelay() {
        return initialDelay;
    }

    /**
     * Sets the value of the initialDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setInitialDelay(Seconds value) {
        this.initialDelay = value;
    }

    /**
     * Gets the value of the subsequentDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getSubsequentDelay() {
        return subsequentDelay;
    }

    /**
     * Sets the value of the subsequentDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setSubsequentDelay(Seconds value) {
        this.subsequentDelay = value;
    }

    /**
     * Gets the value of the ldcR property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLdcR() {
        return ldcR;
    }

    /**
     * Sets the value of the ldcR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLdcR(Voltage value) {
        this.ldcR = value;
    }

    /**
     * Gets the value of the ldcX property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLdcX() {
        return ldcX;
    }

    /**
     * Sets the value of the ldcX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLdcX(Voltage value) {
        this.ldcX = value;
    }

    /**
     * Gets the value of the fhHi property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getFhHi() {
        return fhHi;
    }

    /**
     * Sets the value of the fhHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setFhHi(Voltage value) {
        this.fhHi = value;
    }

    /**
     * Gets the value of the fhLo property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getFhLo() {
        return fhLo;
    }

    /**
     * Sets the value of the fhLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setFhLo(Voltage value) {
        this.fhLo = value;
    }

    /**
     * Gets the value of the reverseFlowR property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getReverseFlowR() {
        return reverseFlowR;
    }

    /**
     * Sets the value of the reverseFlowR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setReverseFlowR(Voltage value) {
        this.reverseFlowR = value;
    }

    /**
     * Gets the value of the reverseFlowX property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getReverseFlowX() {
        return reverseFlowX;
    }

    /**
     * Sets the value of the reverseFlowX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setReverseFlowX(Voltage value) {
        this.reverseFlowX = value;
    }

    /**
     * Gets the value of the assetFields property.
     * 
     * @return
     *     possible object is
     *     {@link AssetFields }
     *     
     */
    public AssetFields getAssetFields() {
        return assetFields;
    }

    /**
     * Sets the value of the assetFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetFields }
     *     
     */
    public void setAssetFields(AssetFields value) {
        this.assetFields = value;
    }

}
