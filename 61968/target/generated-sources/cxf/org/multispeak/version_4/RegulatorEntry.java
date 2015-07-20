
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulatorEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulatorEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ratedPower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="ampacity" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="bil" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="numberOfSteps" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="stepVoltageIncrement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ptRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ctRating" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="windingType" type="{http://www.multispeak.org/Version_4.1_Release}regulatorWindingType" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.multispeak.org/Version_4.1_Release}frequency" minOccurs="0"/>
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
@XmlType(name = "regulatorEntry", propOrder = {
    "ratedVoltage",
    "ratedPower",
    "ampacity",
    "bil",
    "numberOfSteps",
    "stepVoltageIncrement",
    "ptRatio",
    "ctRating",
    "windingType",
    "frequency"
})
public class RegulatorEntry
    extends MspElectricalDefinition
{

    protected Voltage ratedVoltage;
    protected ApparentPower ratedPower;
    protected Current ampacity;
    protected Voltage bil;
    protected BigInteger numberOfSteps;
    protected Float stepVoltageIncrement;
    protected Double ptRatio;
    protected Current ctRating;
    protected RegulatorWindingType windingType;
    protected Frequency frequency;

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

    /**
     * Gets the value of the ratedPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedPower() {
        return ratedPower;
    }

    /**
     * Sets the value of the ratedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedPower(ApparentPower value) {
        this.ratedPower = value;
    }

    /**
     * Gets the value of the ampacity property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getAmpacity() {
        return ampacity;
    }

    /**
     * Sets the value of the ampacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setAmpacity(Current value) {
        this.ampacity = value;
    }

    /**
     * Gets the value of the bil property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBil() {
        return bil;
    }

    /**
     * Sets the value of the bil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBil(Voltage value) {
        this.bil = value;
    }

    /**
     * Gets the value of the numberOfSteps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSteps() {
        return numberOfSteps;
    }

    /**
     * Sets the value of the numberOfSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSteps(BigInteger value) {
        this.numberOfSteps = value;
    }

    /**
     * Gets the value of the stepVoltageIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    /**
     * Sets the value of the stepVoltageIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStepVoltageIncrement(Float value) {
        this.stepVoltageIncrement = value;
    }

    /**
     * Gets the value of the ptRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPtRatio() {
        return ptRatio;
    }

    /**
     * Sets the value of the ptRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPtRatio(Double value) {
        this.ptRatio = value;
    }

    /**
     * Gets the value of the ctRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getCtRating() {
        return ctRating;
    }

    /**
     * Sets the value of the ctRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setCtRating(Current value) {
        this.ctRating = value;
    }

    /**
     * Gets the value of the windingType property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorWindingType }
     *     
     */
    public RegulatorWindingType getWindingType() {
        return windingType;
    }

    /**
     * Sets the value of the windingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorWindingType }
     *     
     */
    public void setWindingType(RegulatorWindingType value) {
        this.windingType = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequency(Frequency value) {
        this.frequency = value;
    }

}
