
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.AnalogConditionKind;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.QualityDescription;
import org.multispeak.v5_0.enumerations.UnitPrefixType;


/**
 * <p>Java class for voltageAlarmItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voltageAlarmItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="voltageValue" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="unitPrefix" type="{http://www.multispeak.org/V5.0/enumerations}unitPrefixType" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/V5.0/enumerations}qualityDescription" minOccurs="0"/>
 *         &lt;element name="analogCondition" type="{http://www.multispeak.org/V5.0/enumerations}analogConditionKind" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voltageAlarmItem", propOrder = {
    "voltageValue",
    "unitPrefix",
    "quality",
    "analogCondition",
    "phaseCode"
})
public class VoltageAlarmItem {

    protected Voltage voltageValue;
    protected UnitPrefixType unitPrefix;
    protected QualityDescription quality;
    protected AnalogConditionKind analogCondition;
    protected PhaseCode phaseCode;

    /**
     * Gets the value of the voltageValue property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageValue() {
        return voltageValue;
    }

    /**
     * Sets the value of the voltageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageValue(Voltage value) {
        this.voltageValue = value;
    }

    /**
     * Gets the value of the unitPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrefixType }
     *     
     */
    public UnitPrefixType getUnitPrefix() {
        return unitPrefix;
    }

    /**
     * Sets the value of the unitPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrefixType }
     *     
     */
    public void setUnitPrefix(UnitPrefixType value) {
        this.unitPrefix = value;
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
     * Gets the value of the analogCondition property.
     * 
     * @return
     *     possible object is
     *     {@link AnalogConditionKind }
     *     
     */
    public AnalogConditionKind getAnalogCondition() {
        return analogCondition;
    }

    /**
     * Sets the value of the analogCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalogConditionKind }
     *     
     */
    public void setAnalogCondition(AnalogConditionKind value) {
        this.analogCondition = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

}
