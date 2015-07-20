
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ugTransmissionLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ugTransmissionLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricLine">
 *       &lt;sequence>
 *         &lt;element name="operatingVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="lengthSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseVoltageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineImpedances" type="{http://www.multispeak.org/Version_4.1_Release}lineImpedances" minOccurs="0"/>
 *         &lt;element name="lineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ugTransmissionLine", propOrder = {
    "operatingVoltage",
    "rating",
    "lengthSrc",
    "baseVoltageID",
    "lineImpedances",
    "lineID"
})
public class UgTransmissionLine
    extends MspElectricLine
{

    protected Voltage operatingVoltage;
    protected ApparentPower rating;
    protected String lengthSrc;
    protected String baseVoltageID;
    protected LineImpedances lineImpedances;
    protected String lineID;

    /**
     * Gets the value of the operatingVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getOperatingVoltage() {
        return operatingVoltage;
    }

    /**
     * Sets the value of the operatingVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setOperatingVoltage(Voltage value) {
        this.operatingVoltage = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRating(ApparentPower value) {
        this.rating = value;
    }

    /**
     * Gets the value of the lengthSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthSrc() {
        return lengthSrc;
    }

    /**
     * Sets the value of the lengthSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthSrc(String value) {
        this.lengthSrc = value;
    }

    /**
     * Gets the value of the baseVoltageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseVoltageID() {
        return baseVoltageID;
    }

    /**
     * Sets the value of the baseVoltageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseVoltageID(String value) {
        this.baseVoltageID = value;
    }

    /**
     * Gets the value of the lineImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link LineImpedances }
     *     
     */
    public LineImpedances getLineImpedances() {
        return lineImpedances;
    }

    /**
     * Sets the value of the lineImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineImpedances }
     *     
     */
    public void setLineImpedances(LineImpedances value) {
        this.lineImpedances = value;
    }

    /**
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineID(String value) {
        this.lineID = value;
    }

}
