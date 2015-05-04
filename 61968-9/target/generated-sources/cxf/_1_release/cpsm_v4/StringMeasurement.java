
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringMeasurement">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="stringMeasurementValue" type="{cpsm_V4.1_Release}StringMeasurementValue" minOccurs="0"/>
 *         &lt;element name="measurementTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementValueSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "StringMeasurement", propOrder = {
    "stringMeasurementValue",
    "measurementTypeID",
    "measurementValueSourceID"
})
public class StringMeasurement
    extends MspCIMObject
{

    protected StringMeasurementValue stringMeasurementValue;
    protected String measurementTypeID;
    protected String measurementValueSourceID;

    /**
     * Gets the value of the stringMeasurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link StringMeasurementValue }
     *     
     */
    public StringMeasurementValue getStringMeasurementValue() {
        return stringMeasurementValue;
    }

    /**
     * Sets the value of the stringMeasurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMeasurementValue }
     *     
     */
    public void setStringMeasurementValue(StringMeasurementValue value) {
        this.stringMeasurementValue = value;
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
     * Gets the value of the measurementValueSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementValueSourceID() {
        return measurementValueSourceID;
    }

    /**
     * Sets the value of the measurementValueSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementValueSourceID(String value) {
        this.measurementValueSourceID = value;
    }

}
