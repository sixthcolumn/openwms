
package _1_release.cpsm_v4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discrete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discrete">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="normalValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="discreteValue" type="{cpsm_V4.1_Release}DiscreteValue" minOccurs="0"/>
 *         &lt;element name="units" type="{cpsm_V4.1_Release}uom" minOccurs="0"/>
 *         &lt;element name="unitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quality" type="{cpsm_V4.1_Release}qualityDescription" minOccurs="0"/>
 *         &lt;element name="phase" type="{cpsm_V4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="unitPrefix" type="{cpsm_V4.1_Release}unitPrefix" minOccurs="0"/>
 *         &lt;element name="harmonic" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="quadrant" type="{cpsm_V4.1_Release}accountability" minOccurs="0"/>
 *         &lt;element name="measurementTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerSystemResourceID" type="{cpsm_V4.1_Release}objectRef" minOccurs="0"/>
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
@XmlType(name = "Discrete", propOrder = {
    "maxValue",
    "minValue",
    "normalValue",
    "discreteValue",
    "units",
    "unitID",
    "quality",
    "phase",
    "unitPrefix",
    "harmonic",
    "quadrant",
    "measurementTypeID",
    "terminalID",
    "powerSystemResourceID"
})
public class Discrete
    extends MspCIMObject
{

    protected BigInteger maxValue;
    protected BigInteger minValue;
    protected BigInteger normalValue;
    protected DiscreteValue discreteValue;
    protected String units;
    protected String unitID;
    protected QualityDescription quality;
    protected PhaseCode phase;
    protected UnitPrefix unitPrefix;
    protected BigInteger harmonic;
    protected Accountability quadrant;
    protected String measurementTypeID;
    protected String terminalID;
    protected ObjectRef powerSystemResourceID;

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxValue(BigInteger value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinValue(BigInteger value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the normalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNormalValue() {
        return normalValue;
    }

    /**
     * Sets the value of the normalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNormalValue(BigInteger value) {
        this.normalValue = value;
    }

    /**
     * Gets the value of the discreteValue property.
     * 
     * @return
     *     possible object is
     *     {@link DiscreteValue }
     *     
     */
    public DiscreteValue getDiscreteValue() {
        return discreteValue;
    }

    /**
     * Sets the value of the discreteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscreteValue }
     *     
     */
    public void setDiscreteValue(DiscreteValue value) {
        this.discreteValue = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the unitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitID() {
        return unitID;
    }

    /**
     * Sets the value of the unitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitID(String value) {
        this.unitID = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDescription }
     *     
     */
    public QualityDescription getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDescription }
     *     
     */
    public void setQuality(QualityDescription value) {
        this.quality = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhase(PhaseCode value) {
        this.phase = value;
    }

    /**
     * Gets the value of the unitPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrefix }
     *     
     */
    public UnitPrefix getUnitPrefix() {
        return unitPrefix;
    }

    /**
     * Sets the value of the unitPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrefix }
     *     
     */
    public void setUnitPrefix(UnitPrefix value) {
        this.unitPrefix = value;
    }

    /**
     * Gets the value of the harmonic property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHarmonic() {
        return harmonic;
    }

    /**
     * Sets the value of the harmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHarmonic(BigInteger value) {
        this.harmonic = value;
    }

    /**
     * Gets the value of the quadrant property.
     * 
     * @return
     *     possible object is
     *     {@link Accountability }
     *     
     */
    public Accountability getQuadrant() {
        return quadrant;
    }

    /**
     * Sets the value of the quadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountability }
     *     
     */
    public void setQuadrant(Accountability value) {
        this.quadrant = value;
    }

    /**
     * Gets the value of the measurementTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementTypeID() {
        return measurementTypeID;
    }

    /**
     * Sets the value of the measurementTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementTypeID(String value) {
        this.measurementTypeID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the powerSystemResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getPowerSystemResourceID() {
        return powerSystemResourceID;
    }

    /**
     * Sets the value of the powerSystemResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setPowerSystemResourceID(ObjectRef value) {
        this.powerSystemResourceID = value;
    }

}
