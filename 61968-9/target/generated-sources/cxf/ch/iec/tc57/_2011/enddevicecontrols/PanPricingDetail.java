
package ch.iec.tc57._2011.enddevicecontrols;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Detail for a single price command/action.
 * 			
 * 
 * <p>Java class for PanPricingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanPricingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alternateCostDelivered" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="alternateCostUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentTimeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="generationPrice" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Money" minOccurs="0"/>
 *         &lt;element name="generationPriceRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="price" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Money" minOccurs="0"/>
 *         &lt;element name="priceRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priceTier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priceTierCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priceTierLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanPricingDetail", propOrder = {
    "alternateCostDelivered",
    "alternateCostUnit",
    "currentTimeDate",
    "generationPrice",
    "generationPriceRatio",
    "price",
    "priceRatio",
    "priceTier",
    "priceTierCount",
    "priceTierLabel",
    "rateLabel",
    "registerTier",
    "unitOfMeasure"
})
public class PanPricingDetail {

    protected Float alternateCostDelivered;
    protected String alternateCostUnit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTimeDate;
    protected BigDecimal generationPrice;
    protected Float generationPriceRatio;
    protected BigDecimal price;
    protected Float priceRatio;
    protected BigInteger priceTier;
    protected BigInteger priceTierCount;
    protected String priceTierLabel;
    protected String rateLabel;
    protected String registerTier;
    protected String unitOfMeasure;

    /**
     * Gets the value of the alternateCostDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAlternateCostDelivered() {
        return alternateCostDelivered;
    }

    /**
     * Sets the value of the alternateCostDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAlternateCostDelivered(Float value) {
        this.alternateCostDelivered = value;
    }

    /**
     * Gets the value of the alternateCostUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateCostUnit() {
        return alternateCostUnit;
    }

    /**
     * Sets the value of the alternateCostUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateCostUnit(String value) {
        this.alternateCostUnit = value;
    }

    /**
     * Gets the value of the currentTimeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentTimeDate() {
        return currentTimeDate;
    }

    /**
     * Sets the value of the currentTimeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentTimeDate(XMLGregorianCalendar value) {
        this.currentTimeDate = value;
    }

    /**
     * Gets the value of the generationPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGenerationPrice() {
        return generationPrice;
    }

    /**
     * Sets the value of the generationPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGenerationPrice(BigDecimal value) {
        this.generationPrice = value;
    }

    /**
     * Gets the value of the generationPriceRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGenerationPriceRatio() {
        return generationPriceRatio;
    }

    /**
     * Sets the value of the generationPriceRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGenerationPriceRatio(Float value) {
        this.generationPriceRatio = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriceRatio() {
        return priceRatio;
    }

    /**
     * Sets the value of the priceRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriceRatio(Float value) {
        this.priceRatio = value;
    }

    /**
     * Gets the value of the priceTier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceTier() {
        return priceTier;
    }

    /**
     * Sets the value of the priceTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriceTier(BigInteger value) {
        this.priceTier = value;
    }

    /**
     * Gets the value of the priceTierCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceTierCount() {
        return priceTierCount;
    }

    /**
     * Sets the value of the priceTierCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriceTierCount(BigInteger value) {
        this.priceTierCount = value;
    }

    /**
     * Gets the value of the priceTierLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTierLabel() {
        return priceTierLabel;
    }

    /**
     * Sets the value of the priceTierLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTierLabel(String value) {
        this.priceTierLabel = value;
    }

    /**
     * Gets the value of the rateLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateLabel() {
        return rateLabel;
    }

    /**
     * Sets the value of the rateLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateLabel(String value) {
        this.rateLabel = value;
    }

    /**
     * Gets the value of the registerTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterTier() {
        return registerTier;
    }

    /**
     * Sets the value of the registerTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterTier(String value) {
        this.registerTier = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

}
