
package org.multispeak.v5_0.sandbox;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * This is a transactive feedback signal (TFS) that is
 * 				used in Transactive Control. It includes a value vector,
 * 				representing the current and predicted net energy load at a specific
 * 				point on the system, starting with the current time and increasing
 * 				the interval size into the future.
 * 
 * <p>Java class for transactiveFeedbackSignal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactiveFeedbackSignal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TCIntervals" type="{http://www.multispeak.org/V5.0/sandbox}TCIntervals"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TFSValueUnit" use="required" type="{http://www.multispeak.org/V5.0/sandbox}TFSValueUnitType" />
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
@XmlType(name = "transactiveFeedbackSignal", propOrder = {
    "tcIntervals"
})
public class TransactiveFeedbackSignal {

    @XmlElement(name = "TCIntervals", required = true)
    protected TCIntervals tcIntervals;
    @XmlAttribute(name = "TFSValueUnit", required = true)
    protected TFSValueUnitType tfsValueUnit;
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
     * Gets the value of the tfsValueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TFSValueUnitType }
     *     
     */
    public TFSValueUnitType getTFSValueUnit() {
        return tfsValueUnit;
    }

    /**
     * Sets the value of the tfsValueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFSValueUnitType }
     *     
     */
    public void setTFSValueUnit(TFSValueUnitType value) {
        this.tfsValueUnit = value;
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
