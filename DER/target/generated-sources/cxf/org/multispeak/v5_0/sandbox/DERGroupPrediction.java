
package org.multispeak.v5_0.sandbox;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DERGroupPrediction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupPrediction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="confidence" type="{http://www.multispeak.org/V5.0/primitives}percent"/>
 *         &lt;element name="DERGroupCapabilities" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupPrediction", propOrder = {
    "sequence",
    "confidence",
    "derGroupCapabilities"
})
public class DERGroupPrediction {

    @XmlElement(required = true)
    protected BigInteger sequence;
    protected float confidence;
    @XmlElement(name = "DERGroupCapabilities", required = true)
    protected DERGroupCapabilities derGroupCapabilities;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     */
    public float getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     */
    public void setConfidence(float value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the derGroupCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupCapabilities }
     *     
     */
    public DERGroupCapabilities getDERGroupCapabilities() {
        return derGroupCapabilities;
    }

    /**
     * Sets the value of the derGroupCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupCapabilities }
     *     
     */
    public void setDERGroupCapabilities(DERGroupCapabilities value) {
        this.derGroupCapabilities = value;
    }

}
