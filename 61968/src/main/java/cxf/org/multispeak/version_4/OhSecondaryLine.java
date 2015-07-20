
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ohSecondaryLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ohSecondaryLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricLine">
 *       &lt;sequence>
 *         &lt;element name="secondaryType" type="{http://www.multispeak.org/Version_4.1_Release}secondaryType" minOccurs="0"/>
 *         &lt;element name="operatingVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="lengthSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ohSecondaryLine", propOrder = {
    "secondaryType",
    "operatingVoltage",
    "lengthSrc"
})
public class OhSecondaryLine
    extends MspElectricLine
{

    protected SecondaryType secondaryType;
    protected Voltage operatingVoltage;
    protected String lengthSrc;

    /**
     * Gets the value of the secondaryType property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryType }
     *     
     */
    public SecondaryType getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryType }
     *     
     */
    public void setSecondaryType(SecondaryType value) {
        this.secondaryType = value;
    }

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

}
