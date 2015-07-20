
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ugSecondaryLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ugSecondaryLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricLine">
 *       &lt;sequence>
 *         &lt;element name="operatingVOltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="uGSecType" type="{http://www.multispeak.org/Version_4.1_Release}uGSecType" minOccurs="0"/>
 *         &lt;element name="isInConduit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ugSecondaryLine", propOrder = {
    "operatingVOltage",
    "ugSecType",
    "isInConduit",
    "manufacturer",
    "lengthSrc"
})
public class UgSecondaryLine
    extends MspElectricLine
{

    protected Voltage operatingVOltage;
    @XmlElement(name = "uGSecType")
    protected UGSecType ugSecType;
    protected Boolean isInConduit;
    protected String manufacturer;
    protected String lengthSrc;

    /**
     * Gets the value of the operatingVOltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getOperatingVOltage() {
        return operatingVOltage;
    }

    /**
     * Sets the value of the operatingVOltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setOperatingVOltage(Voltage value) {
        this.operatingVOltage = value;
    }

    /**
     * Gets the value of the ugSecType property.
     * 
     * @return
     *     possible object is
     *     {@link UGSecType }
     *     
     */
    public UGSecType getUGSecType() {
        return ugSecType;
    }

    /**
     * Sets the value of the ugSecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UGSecType }
     *     
     */
    public void setUGSecType(UGSecType value) {
        this.ugSecType = value;
    }

    /**
     * Gets the value of the isInConduit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInConduit() {
        return isInConduit;
    }

    /**
     * Sets the value of the isInConduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInConduit(Boolean value) {
        this.isInConduit = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
