
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankRatings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankRatings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankPowerRating" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="nLLoss" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="fLLoss" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="primaryVoltageHigh" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="primaryVoltageLow" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="secondaryVoltageHigh" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="secondaryVoltageLow" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="tertiaryVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankRatings", propOrder = {
    "bankPowerRating",
    "nlLoss",
    "flLoss",
    "primaryVoltageHigh",
    "primaryVoltageLow",
    "secondaryVoltageHigh",
    "secondaryVoltageLow",
    "tertiaryVoltage"
})
public class BankRatings {

    protected ApparentPower bankPowerRating;
    @XmlElement(name = "nLLoss")
    protected ApparentPower nlLoss;
    @XmlElement(name = "fLLoss")
    protected ApparentPower flLoss;
    protected Voltage primaryVoltageHigh;
    protected Voltage primaryVoltageLow;
    protected Voltage secondaryVoltageHigh;
    protected Voltage secondaryVoltageLow;
    protected Voltage tertiaryVoltage;

    /**
     * Gets the value of the bankPowerRating property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getBankPowerRating() {
        return bankPowerRating;
    }

    /**
     * Sets the value of the bankPowerRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setBankPowerRating(ApparentPower value) {
        this.bankPowerRating = value;
    }

    /**
     * Gets the value of the nlLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getNLLoss() {
        return nlLoss;
    }

    /**
     * Sets the value of the nlLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setNLLoss(ApparentPower value) {
        this.nlLoss = value;
    }

    /**
     * Gets the value of the flLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getFLLoss() {
        return flLoss;
    }

    /**
     * Sets the value of the flLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setFLLoss(ApparentPower value) {
        this.flLoss = value;
    }

    /**
     * Gets the value of the primaryVoltageHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getPrimaryVoltageHigh() {
        return primaryVoltageHigh;
    }

    /**
     * Sets the value of the primaryVoltageHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setPrimaryVoltageHigh(Voltage value) {
        this.primaryVoltageHigh = value;
    }

    /**
     * Gets the value of the primaryVoltageLow property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getPrimaryVoltageLow() {
        return primaryVoltageLow;
    }

    /**
     * Sets the value of the primaryVoltageLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setPrimaryVoltageLow(Voltage value) {
        this.primaryVoltageLow = value;
    }

    /**
     * Gets the value of the secondaryVoltageHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getSecondaryVoltageHigh() {
        return secondaryVoltageHigh;
    }

    /**
     * Sets the value of the secondaryVoltageHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setSecondaryVoltageHigh(Voltage value) {
        this.secondaryVoltageHigh = value;
    }

    /**
     * Gets the value of the secondaryVoltageLow property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getSecondaryVoltageLow() {
        return secondaryVoltageLow;
    }

    /**
     * Sets the value of the secondaryVoltageLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setSecondaryVoltageLow(Voltage value) {
        this.secondaryVoltageLow = value;
    }

    /**
     * Gets the value of the tertiaryVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getTertiaryVoltage() {
        return tertiaryVoltage;
    }

    /**
     * Sets the value of the tertiaryVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setTertiaryVoltage(Voltage value) {
        this.tertiaryVoltage = value;
    }

}
