
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadMixEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadMixEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="constantPower" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="constantImpedance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="constantCurrent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="connection" type="{http://www.multispeak.org/Version_4.1_Release}ldConnection" minOccurs="0"/>
 *         &lt;element name="conformingLoadFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="powerFactor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pFrequencyExponent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pVoltageExponent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="qFrequencyExponent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="qVoltageExponent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CIMLoadCharacteristics" type="{http://www.multispeak.org/Version_4.1_Release}CIMLoadCharacteristics" minOccurs="0"/>
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
@XmlType(name = "loadMixEntry", propOrder = {
    "constantPower",
    "constantImpedance",
    "constantCurrent",
    "connection",
    "conformingLoadFlag",
    "powerFactor",
    "pFrequencyExponent",
    "pVoltageExponent",
    "qFrequencyExponent",
    "qVoltageExponent",
    "cimLoadCharacteristics"
})
public class LoadMixEntry
    extends MspElectricalDefinition
{

    protected Float constantPower;
    protected Float constantImpedance;
    protected Float constantCurrent;
    protected LdConnection connection;
    protected Boolean conformingLoadFlag;
    protected Float powerFactor;
    protected Float pFrequencyExponent;
    protected Float pVoltageExponent;
    protected Float qFrequencyExponent;
    protected Float qVoltageExponent;
    @XmlElement(name = "CIMLoadCharacteristics")
    protected CIMLoadCharacteristics cimLoadCharacteristics;

    /**
     * Gets the value of the constantPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConstantPower() {
        return constantPower;
    }

    /**
     * Sets the value of the constantPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConstantPower(Float value) {
        this.constantPower = value;
    }

    /**
     * Gets the value of the constantImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConstantImpedance() {
        return constantImpedance;
    }

    /**
     * Sets the value of the constantImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConstantImpedance(Float value) {
        this.constantImpedance = value;
    }

    /**
     * Gets the value of the constantCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConstantCurrent() {
        return constantCurrent;
    }

    /**
     * Sets the value of the constantCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConstantCurrent(Float value) {
        this.constantCurrent = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link LdConnection }
     *     
     */
    public LdConnection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdConnection }
     *     
     */
    public void setConnection(LdConnection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the conformingLoadFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConformingLoadFlag() {
        return conformingLoadFlag;
    }

    /**
     * Sets the value of the conformingLoadFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConformingLoadFlag(Boolean value) {
        this.conformingLoadFlag = value;
    }

    /**
     * Gets the value of the powerFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPowerFactor() {
        return powerFactor;
    }

    /**
     * Sets the value of the powerFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPowerFactor(Float value) {
        this.powerFactor = value;
    }

    /**
     * Gets the value of the pFrequencyExponent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPFrequencyExponent() {
        return pFrequencyExponent;
    }

    /**
     * Sets the value of the pFrequencyExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPFrequencyExponent(Float value) {
        this.pFrequencyExponent = value;
    }

    /**
     * Gets the value of the pVoltageExponent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPVoltageExponent() {
        return pVoltageExponent;
    }

    /**
     * Sets the value of the pVoltageExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPVoltageExponent(Float value) {
        this.pVoltageExponent = value;
    }

    /**
     * Gets the value of the qFrequencyExponent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQFrequencyExponent() {
        return qFrequencyExponent;
    }

    /**
     * Sets the value of the qFrequencyExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQFrequencyExponent(Float value) {
        this.qFrequencyExponent = value;
    }

    /**
     * Gets the value of the qVoltageExponent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQVoltageExponent() {
        return qVoltageExponent;
    }

    /**
     * Sets the value of the qVoltageExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQVoltageExponent(Float value) {
        this.qVoltageExponent = value;
    }

    /**
     * Gets the value of the cimLoadCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CIMLoadCharacteristics }
     *     
     */
    public CIMLoadCharacteristics getCIMLoadCharacteristics() {
        return cimLoadCharacteristics;
    }

    /**
     * Sets the value of the cimLoadCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIMLoadCharacteristics }
     *     
     */
    public void setCIMLoadCharacteristics(CIMLoadCharacteristics value) {
        this.cimLoadCharacteristics = value;
    }

}
