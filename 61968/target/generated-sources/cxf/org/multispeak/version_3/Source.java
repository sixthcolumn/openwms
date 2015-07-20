
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="quantityType" type="{http://www.multispeak.org/Version_3.0}quantityType" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.multispeak.org/Version_3.0}uom" minOccurs="0"/>
 *         &lt;element name="accountability" type="{http://www.multispeak.org/Version_3.0}accountability" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}phaseAssociation" minOccurs="0"/>
 *         &lt;element name="harmonic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformerRatio" type="{http://www.multispeak.org/Version_3.0}transformerRatio" minOccurs="0"/>
 *         &lt;element name="displayFormat" type="{http://www.multispeak.org/Version_3.0}displayFormat" minOccurs="0"/>
 *         &lt;element name="multiplierApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "source", propOrder = {
    "sourceID",
    "quantityType",
    "uom",
    "accountability",
    "phase",
    "harmonic",
    "transformerRatio",
    "displayFormat",
    "multiplierApplied"
})
public class Source {

    @XmlSchemaType(name = "unsignedInt")
    protected Long sourceID;
    protected QuantityType quantityType;
    protected String uom;
    protected Accountability accountability;
    protected PhaseAssociation phase;
    protected String harmonic;
    protected TransformerRatio transformerRatio;
    protected DisplayFormat displayFormat;
    protected Boolean multiplierApplied;

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceID(Long value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the quantityType property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantityType(QuantityType value) {
        this.quantityType = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the accountability property.
     * 
     * @return
     *     possible object is
     *     {@link Accountability }
     *     
     */
    public Accountability getAccountability() {
        return accountability;
    }

    /**
     * Sets the value of the accountability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountability }
     *     
     */
    public void setAccountability(Accountability value) {
        this.accountability = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseAssociation }
     *     
     */
    public PhaseAssociation getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseAssociation }
     *     
     */
    public void setPhase(PhaseAssociation value) {
        this.phase = value;
    }

    /**
     * Gets the value of the harmonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonic() {
        return harmonic;
    }

    /**
     * Sets the value of the harmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonic(String value) {
        this.harmonic = value;
    }

    /**
     * Gets the value of the transformerRatio property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerRatio }
     *     
     */
    public TransformerRatio getTransformerRatio() {
        return transformerRatio;
    }

    /**
     * Sets the value of the transformerRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerRatio }
     *     
     */
    public void setTransformerRatio(TransformerRatio value) {
        this.transformerRatio = value;
    }

    /**
     * Gets the value of the displayFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayFormat }
     *     
     */
    public DisplayFormat getDisplayFormat() {
        return displayFormat;
    }

    /**
     * Sets the value of the displayFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayFormat }
     *     
     */
    public void setDisplayFormat(DisplayFormat value) {
        this.displayFormat = value;
    }

    /**
     * Gets the value of the multiplierApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiplierApplied() {
        return multiplierApplied;
    }

    /**
     * Sets the value of the multiplierApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiplierApplied(Boolean value) {
        this.multiplierApplied = value;
    }

}
