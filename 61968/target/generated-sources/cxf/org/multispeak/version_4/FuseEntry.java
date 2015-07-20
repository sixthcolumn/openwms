
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fuseEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fuseEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ratedCurrent" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="bil" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="linkRtg" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="fuseSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.multispeak.org/Version_4.1_Release}frequency" minOccurs="0"/>
 *         &lt;element name="numberPhases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isGanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="interruptingRating" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="isLoadBreak" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "fuseEntry", propOrder = {
    "ratedVoltage",
    "ratedCurrent",
    "bil",
    "linkRtg",
    "fuseSpeed",
    "frequency",
    "numberPhases",
    "isGanged",
    "interruptingRating",
    "isLoadBreak"
})
public class FuseEntry
    extends MspElectricalDefinition
{

    protected Voltage ratedVoltage;
    protected Current ratedCurrent;
    protected Voltage bil;
    protected Current linkRtg;
    protected String fuseSpeed;
    protected Frequency frequency;
    protected BigInteger numberPhases;
    protected Boolean isGanged;
    protected Current interruptingRating;
    protected Boolean isLoadBreak;

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
     * Gets the value of the linkRtg property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getLinkRtg() {
        return linkRtg;
    }

    /**
     * Sets the value of the linkRtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setLinkRtg(Current value) {
        this.linkRtg = value;
    }

    /**
     * Gets the value of the fuseSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuseSpeed() {
        return fuseSpeed;
    }

    /**
     * Sets the value of the fuseSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuseSpeed(String value) {
        this.fuseSpeed = value;
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
     * Gets the value of the interruptingRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getInterruptingRating() {
        return interruptingRating;
    }

    /**
     * Sets the value of the interruptingRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setInterruptingRating(Current value) {
        this.interruptingRating = value;
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

}