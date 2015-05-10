
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for usageItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usageItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="previousReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="previousReadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="presentReading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="presentReadingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageItem", propOrder = {
    "usageType",
    "multiplier",
    "previousReading",
    "previousReadDate",
    "presentReading",
    "presentReadingDate"
})
public class UsageItem {

    protected String usageType;
    protected Float multiplier;
    protected Float previousReading;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar previousReadDate;
    protected Float presentReading;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar presentReadingDate;

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageType(String value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMultiplier(Float value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the previousReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPreviousReading() {
        return previousReading;
    }

    /**
     * Sets the value of the previousReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPreviousReading(Float value) {
        this.previousReading = value;
    }

    /**
     * Gets the value of the previousReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousReadDate() {
        return previousReadDate;
    }

    /**
     * Sets the value of the previousReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousReadDate(XMLGregorianCalendar value) {
        this.previousReadDate = value;
    }

    /**
     * Gets the value of the presentReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPresentReading() {
        return presentReading;
    }

    /**
     * Sets the value of the presentReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPresentReading(Float value) {
        this.presentReading = value;
    }

    /**
     * Gets the value of the presentReadingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPresentReadingDate() {
        return presentReadingDate;
    }

    /**
     * Sets the value of the presentReadingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPresentReadingDate(XMLGregorianCalendar value) {
        this.presentReadingDate = value;
    }

}
