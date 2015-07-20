
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="currencyCode" type="{http://www.multispeak.org/Version_4.1_Release}currencyCode" />
 *       &lt;attribute name="commodityUnits" type="{http://www.multispeak.org/Version_4.1_Release}uom" />
 *       &lt;attribute name="rateDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate")
public class Rate {

    @XmlAttribute(name = "currencyCode")
    protected CurrencyCode currencyCode;
    @XmlAttribute(name = "commodityUnits")
    protected String commodityUnits;
    @XmlAttribute(name = "rateDescription")
    protected String rateDescription;
    @XmlAttribute(name = "rateCode")
    protected String rateCode;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the commodityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityUnits() {
        return commodityUnits;
    }

    /**
     * Sets the value of the commodityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityUnits(String value) {
        this.commodityUnits = value;
    }

    /**
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDescription(String value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

}
