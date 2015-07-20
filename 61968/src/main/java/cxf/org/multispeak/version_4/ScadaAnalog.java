
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for scadaAnalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaAnalog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.multispeak.org/Version_4.1_Release}value" minOccurs="0"/>
 *         &lt;element name="unitPrefix" type="{http://www.multispeak.org/Version_4.1_Release}unitPrefix" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/Version_4.1_Release}qualityDescription" minOccurs="0"/>
 *         &lt;element name="analogCondition" type="{http://www.multispeak.org/Version_4.1_Release}analogCondition" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="scadaAnalogValues" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAnalogValue" minOccurs="0"/>
 *         &lt;element name="unitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positiveFlowIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="analogLimitSetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="powerSystemResourceID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nominalValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "scadaAnalog", propOrder = {
    "value",
    "unitPrefix",
    "quality",
    "analogCondition",
    "timeStamp",
    "phaseCode",
    "scadaAnalogValues",
    "unitID",
    "positiveFlowIn",
    "analogLimitSetID",
    "measurementTypeID",
    "powerSystemResourceID",
    "maxValue",
    "minValue",
    "nominalValue"
})
public class ScadaAnalog
    extends MspObject
{

    protected Value value;
    protected UnitPrefix unitPrefix;
    protected QualityDescription quality;
    protected AnalogCondition analogCondition;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected PhaseCode phaseCode;
    protected ArrayOfAnalogValue scadaAnalogValues;
    protected String unitID;
    protected Boolean positiveFlowIn;
    protected String analogLimitSetID;
    protected String measurementTypeID;
    protected ObjectRef powerSystemResourceID;
    protected Float maxValue;
    protected Float minValue;
    protected Float nominalValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
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
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
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

    /**
     * Gets the value of the scadaAnalogValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnalogValue }
     *     
     */
    public ArrayOfAnalogValue getScadaAnalogValues() {
        return scadaAnalogValues;
    }

    /**
     * Sets the value of the scadaAnalogValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnalogValue }
     *     
     */
    public void setScadaAnalogValues(ArrayOfAnalogValue value) {
        this.scadaAnalogValues = value;
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
     * Gets the value of the positiveFlowIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPositiveFlowIn() {
        return positiveFlowIn;
    }

    /**
     * Sets the value of the positiveFlowIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPositiveFlowIn(Boolean value) {
        this.positiveFlowIn = value;
    }

    /**
     * Gets the value of the analogLimitSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogLimitSetID() {
        return analogLimitSetID;
    }

    /**
     * Sets the value of the analogLimitSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogLimitSetID(String value) {
        this.analogLimitSetID = value;
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

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxValue(Float value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinValue(Float value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the nominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominalValue() {
        return nominalValue;
    }

    /**
     * Sets the value of the nominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNominalValue(Float value) {
        this.nominalValue = value;
    }

}
