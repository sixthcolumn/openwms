
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_3.0}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_3.0}extensionsList" minOccurs="0"/>
 *         &lt;element name="stockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="poleVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wireVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="neutVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miscVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialComponent", propOrder = {
    "extensions",
    "extensionsList",
    "stockNumber",
    "itemCount",
    "poleVar",
    "wireVar",
    "neutVar",
    "miscVar"
})
public class MaterialComponent {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;
    protected String stockNumber;
    protected Float itemCount;
    protected String poleVar;
    protected String wireVar;
    protected String neutVar;
    protected String miscVar;

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
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setItemCount(Float value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the poleVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoleVar() {
        return poleVar;
    }

    /**
     * Sets the value of the poleVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoleVar(String value) {
        this.poleVar = value;
    }

    /**
     * Gets the value of the wireVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireVar() {
        return wireVar;
    }

    /**
     * Sets the value of the wireVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireVar(String value) {
        this.wireVar = value;
    }

    /**
     * Gets the value of the neutVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeutVar() {
        return neutVar;
    }

    /**
     * Sets the value of the neutVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeutVar(String value) {
        this.neutVar = value;
    }

    /**
     * Gets the value of the miscVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscVar() {
        return miscVar;
    }

    /**
     * Sets the value of the miscVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscVar(String value) {
        this.miscVar = value;
    }

}
