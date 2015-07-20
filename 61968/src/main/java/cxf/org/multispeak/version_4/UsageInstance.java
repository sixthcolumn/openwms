
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for usageInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usageInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_4.1_Release}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfExtensionsItem" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monthNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.multispeak.org/Version_4.1_Release}uom" minOccurs="0"/>
 *         &lt;element name="useDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/Version_4.1_Release}qualityDescription" minOccurs="0"/>
 *         &lt;element name="unitPrefeix" type="{http://www.multispeak.org/Version_4.1_Release}unitPrefix" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.multispeak.org/Version_4.1_Release}rate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageInstance", propOrder = {
    "extensions",
    "extensionsList",
    "dateTime",
    "monthNumber",
    "value",
    "uom",
    "useDays",
    "quality",
    "unitPrefeix",
    "rate"
})
public class UsageInstance {

    protected Extensions extensions;
    protected ArrayOfExtensionsItem extensionsList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected BigInteger monthNumber;
    protected Float value;
    protected String uom;
    protected BigInteger useDays;
    protected QualityDescription quality;
    protected UnitPrefix unitPrefeix;
    protected Rate rate;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public ArrayOfExtensionsItem getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public void setExtensionsList(ArrayOfExtensionsItem value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the monthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthNumber() {
        return monthNumber;
    }

    /**
     * Sets the value of the monthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthNumber(BigInteger value) {
        this.monthNumber = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
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
     * Gets the value of the useDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUseDays() {
        return useDays;
    }

    /**
     * Sets the value of the useDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUseDays(BigInteger value) {
        this.useDays = value;
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
     * Gets the value of the unitPrefeix property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrefix }
     *     
     */
    public UnitPrefix getUnitPrefeix() {
        return unitPrefeix;
    }

    /**
     * Sets the value of the unitPrefeix property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrefix }
     *     
     */
    public void setUnitPrefeix(UnitPrefix value) {
        this.unitPrefeix = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

}
