
package org.multispeak.v5_0.sandbox;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.multispeak.v5_0.enumerations.CurrencyCode;


/**
 * This is a transactive incentive signal (TIS) that
 * 				is used in Transactive Control. It includes a value vector,
 * 				representing the value of energy delivered to a specific location,
 * 				starting with the current time and increasing the interval size into
 * 				the future. These values may be used by a transactive node to
 * 				calculate the optimal response to the value/price signal. Note,
 * 				transactiveIncentiveSignal.currencyType and
 * 				transactiveIncentiveSignal.energyUnits, together provides the
 * 				equivalent information that is provided in the TISValueUnit in the
 * 				transactive control schema.
 * 
 * <p>Java class for transactiveIncentiveSignal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactiveIncentiveSignal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TCIntervals" type="{http://www.multispeak.org/V5.0/sandbox}TCIntervals"/>
 *       &lt;/sequence>
 *       &lt;attribute name="currencyType" use="required" type="{http://www.multispeak.org/V5.0/enumerations}currencyCode" />
 *       &lt;attribute name="energyUnits" use="required" type="{http://www.multispeak.org/V5.0/enumerations}realEnergyUnits" />
 *       &lt;attribute name="valueMin" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="valueMax" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="totalIntervals" use="required" type="{http://www.multispeak.org/V5.0/sandbox}totalIntervals" />
 *       &lt;attribute name="totalIntervalDuration" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactiveIncentiveSignal", propOrder = {
    "tcIntervals"
})
public class TransactiveIncentiveSignal {

    @XmlElement(name = "TCIntervals", required = true)
    protected TCIntervals tcIntervals;
    @XmlAttribute(name = "currencyType", required = true)
    protected CurrencyCode currencyType;
    @XmlAttribute(name = "energyUnits", required = true)
    protected String energyUnits;
    @XmlAttribute(name = "valueMin", required = true)
    protected float valueMin;
    @XmlAttribute(name = "valueMax", required = true)
    protected float valueMax;
    @XmlAttribute(name = "totalIntervals", required = true)
    protected BigInteger totalIntervals;
    @XmlAttribute(name = "totalIntervalDuration", required = true)
    protected Duration totalIntervalDuration;

    /**
     * Gets the value of the tcIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link TCIntervals }
     *     
     */
    public TCIntervals getTCIntervals() {
        return tcIntervals;
    }

    /**
     * Sets the value of the tcIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCIntervals }
     *     
     */
    public void setTCIntervals(TCIntervals value) {
        this.tcIntervals = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyType(CurrencyCode value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the energyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyUnits() {
        return energyUnits;
    }

    /**
     * Sets the value of the energyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyUnits(String value) {
        this.energyUnits = value;
    }

    /**
     * Gets the value of the valueMin property.
     * 
     */
    public float getValueMin() {
        return valueMin;
    }

    /**
     * Sets the value of the valueMin property.
     * 
     */
    public void setValueMin(float value) {
        this.valueMin = value;
    }

    /**
     * Gets the value of the valueMax property.
     * 
     */
    public float getValueMax() {
        return valueMax;
    }

    /**
     * Sets the value of the valueMax property.
     * 
     */
    public void setValueMax(float value) {
        this.valueMax = value;
    }

    /**
     * Gets the value of the totalIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalIntervals() {
        return totalIntervals;
    }

    /**
     * Sets the value of the totalIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalIntervals(BigInteger value) {
        this.totalIntervals = value;
    }

    /**
     * Gets the value of the totalIntervalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalIntervalDuration() {
        return totalIntervalDuration;
    }

    /**
     * Sets the value of the totalIntervalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalIntervalDuration(Duration value) {
        this.totalIntervalDuration = value;
    }

}
