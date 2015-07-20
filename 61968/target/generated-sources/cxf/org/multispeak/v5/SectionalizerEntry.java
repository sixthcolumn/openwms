
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.Frequency;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * This is an electrical equipment catalog entry for a sectionalizer.
 * 
 * <p>Java class for sectionalizerEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sectionalizerEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ratedPower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="ratedCurrent" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="BIL" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.multispeak.org/V5.0/commonTypes}frequency" minOccurs="0"/>
 *         &lt;element name="numberPhases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isGanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maximumCounts" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isLoadBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="resetTime" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectionalizerEntry", propOrder = {
    "ratedVoltage",
    "ratedPower",
    "ratedCurrent",
    "bil",
    "frequency",
    "numberPhases",
    "isGanged",
    "maximumCounts",
    "isLoadBreak",
    "resetTime"
})
public class SectionalizerEntry
    extends MspElectricalDefinition
{

    protected Voltage ratedVoltage;
    protected ApparentPower ratedPower;
    protected Current ratedCurrent;
    @XmlElement(name = "BIL")
    protected Voltage bil;
    protected Frequency frequency;
    protected BigInteger numberPhases;
    protected Boolean isGanged;
    protected BigInteger maximumCounts;
    protected Boolean isLoadBreak;
    protected Duration resetTime;

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
     * Gets the value of the ratedCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * Sets the value of the ratedCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setRatedCurrent(Current value) {
        this.ratedCurrent = value;
    }

    /**
     * Gets the value of the bil property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBIL() {
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
    public void setBIL(Voltage value) {
        this.bil = value;
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

    /**
     * Gets the value of the numberPhases property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberPhases() {
        return numberPhases;
    }

    /**
     * Sets the value of the numberPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberPhases(BigInteger value) {
        this.numberPhases = value;
    }

    /**
     * Gets the value of the isGanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGanged() {
        return isGanged;
    }

    /**
     * Sets the value of the isGanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGanged(Boolean value) {
        this.isGanged = value;
    }

    /**
     * Gets the value of the maximumCounts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumCounts() {
        return maximumCounts;
    }

    /**
     * Sets the value of the maximumCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumCounts(BigInteger value) {
        this.maximumCounts = value;
    }

    /**
     * Gets the value of the isLoadBreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadBreak() {
        return isLoadBreak;
    }

    /**
     * Sets the value of the isLoadBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadBreak(Boolean value) {
        this.isLoadBreak = value;
    }

    /**
     * Gets the value of the resetTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getResetTime() {
        return resetTime;
    }

    /**
     * Sets the value of the resetTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setResetTime(Duration value) {
        this.resetTime = value;
    }

}
