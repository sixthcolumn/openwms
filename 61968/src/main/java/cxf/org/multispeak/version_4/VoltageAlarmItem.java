
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="voltageValue" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="unitPrefix" type="{http://www.multispeak.org/Version_4.1_Release}unitPrefix" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/Version_4.1_Release}qualityDescription" minOccurs="0"/>
 *         &lt;element name="analogCondition" type="{http://www.multispeak.org/Version_4.1_Release}analogCondition" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
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
    protected UnitPrefix unitPrefix;
    protected QualityDescription quality;
    protected AnalogCondition analogCondition;
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
     *     {@link AnalogCondition }
     *     
     */
    public AnalogCondition getAnalogCondition() {
        return analogCondition;
    }

    /**
     * Sets the value of the analogCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalogCondition }
     *     
     */
    public void setAnalogCondition(AnalogCondition value) {
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
