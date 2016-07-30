
package org.multispeak.v5_0.sandbox;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for meterConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="kWhReading" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="kWReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kVArReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="powerFactorReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="resultHigh" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="resultLow" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="resultLL" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kWResult" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kVArResult" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterConditions", propOrder = {
    "kWhReading",
    "kwReading",
    "kvArReading",
    "powerFactorReading",
    "resultHigh",
    "resultLow",
    "resultLL",
    "kwResult",
    "kvArResult"
})
@XmlSeeAlso({
    AsLeft.class,
    AsFound.class
})
public class MeterConditions
    extends MspExtensible
{

    protected BigInteger kWhReading;
    @XmlElement(name = "kWReading")
    protected Float kwReading;
    @XmlElement(name = "kVArReading")
    protected Float kvArReading;
    protected Float powerFactorReading;
    protected Float resultHigh;
    protected Float resultLow;
    protected Float resultLL;
    @XmlElement(name = "kWResult")
    protected Float kwResult;
    @XmlElement(name = "kVArResult")
    protected Float kvArResult;

    /**
     * Gets the value of the kWhReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKWhReading() {
        return kWhReading;
    }

    /**
     * Sets the value of the kWhReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKWhReading(BigInteger value) {
        this.kWhReading = value;
    }

    /**
     * Gets the value of the kwReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKWReading() {
        return kwReading;
    }

    /**
     * Sets the value of the kwReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKWReading(Float value) {
        this.kwReading = value;
    }

    /**
     * Gets the value of the kvArReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKVArReading() {
        return kvArReading;
    }

    /**
     * Sets the value of the kvArReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKVArReading(Float value) {
        this.kvArReading = value;
    }

    /**
     * Gets the value of the powerFactorReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPowerFactorReading() {
        return powerFactorReading;
    }

    /**
     * Sets the value of the powerFactorReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPowerFactorReading(Float value) {
        this.powerFactorReading = value;
    }

    /**
     * Gets the value of the resultHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResultHigh() {
        return resultHigh;
    }

    /**
     * Sets the value of the resultHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResultHigh(Float value) {
        this.resultHigh = value;
    }

    /**
     * Gets the value of the resultLow property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResultLow() {
        return resultLow;
    }

    /**
     * Sets the value of the resultLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResultLow(Float value) {
        this.resultLow = value;
    }

    /**
     * Gets the value of the resultLL property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResultLL() {
        return resultLL;
    }

    /**
     * Sets the value of the resultLL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResultLL(Float value) {
        this.resultLL = value;
    }

    /**
     * Gets the value of the kwResult property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKWResult() {
        return kwResult;
    }

    /**
     * Sets the value of the kwResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKWResult(Float value) {
        this.kwResult = value;
    }

    /**
     * Gets the value of the kvArResult property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKVArResult() {
        return kvArResult;
    }

    /**
     * Sets the value of the kvArResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKVArResult(Float value) {
        this.kvArResult = value;
    }

}
