
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pickListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pickListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_3.0}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_3.0}extensionsList" minOccurs="0"/>
 *         &lt;element name="stockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="unitAction" type="{http://www.multispeak.org/Version_3.0}unitActn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pickListItem", propOrder = {
    "extensions",
    "extensionsList",
    "stockNumber",
    "quantity",
    "unitAction"
})
public class PickListItem {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;
    protected String stockNumber;
    protected Float quantity;
    protected UnitActn unitAction;

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
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the stockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockNumber() {
        return stockNumber;
    }

    /**
     * Sets the value of the stockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockNumber(String value) {
        this.stockNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitAction property.
     * 
     * @return
     *     possible object is
     *     {@link UnitActn }
     *     
     */
    public UnitActn getUnitAction() {
        return unitAction;
    }

    /**
     * Sets the value of the unitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitActn }
     *     
     */
    public void setUnitAction(UnitActn value) {
        this.unitAction = value;
    }

}
