
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assembly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_3.0}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_3.0}extensionsList" minOccurs="0"/>
 *         &lt;element name="featureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitActn" type="{http://www.multispeak.org/Version_3.0}unitActn" minOccurs="0"/>
 *         &lt;element name="spanTyp" type="{http://www.multispeak.org/Version_3.0}spanTyp" minOccurs="0"/>
 *         &lt;element name="unitLength" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="poleVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wireVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="neutVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miscVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="poleHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="poleClass" type="{http://www.multispeak.org/Version_3.0}poleClass" minOccurs="0"/>
 *         &lt;element name="poleType" type="{http://www.multispeak.org/Version_3.0}poleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assembly", propOrder = {
    "extensions",
    "extensionsList",
    "featureType",
    "featureID",
    "unitCode",
    "unitActn",
    "spanTyp",
    "unitLength",
    "poleVar",
    "wireVar",
    "neutVar",
    "miscVar",
    "quantity",
    "poleHeight",
    "poleClass",
    "poleType"
})
public class Assembly {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;
    protected String featureType;
    protected String featureID;
    protected String unitCode;
    protected UnitActn unitActn;
    protected SpanTyp spanTyp;
    protected Float unitLength;
    protected String poleVar;
    protected String wireVar;
    protected String neutVar;
    protected String miscVar;
    protected Float quantity;
    protected Long poleHeight;
    protected PoleClass poleClass;
    protected PoleType poleType;

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
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the featureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureID() {
        return featureID;
    }

    /**
     * Sets the value of the featureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureID(String value) {
        this.featureID = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitActn property.
     * 
     * @return
     *     possible object is
     *     {@link UnitActn }
     *     
     */
    public UnitActn getUnitActn() {
        return unitActn;
    }

    /**
     * Sets the value of the unitActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitActn }
     *     
     */
    public void setUnitActn(UnitActn value) {
        this.unitActn = value;
    }

    /**
     * Gets the value of the spanTyp property.
     * 
     * @return
     *     possible object is
     *     {@link SpanTyp }
     *     
     */
    public SpanTyp getSpanTyp() {
        return spanTyp;
    }

    /**
     * Sets the value of the spanTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpanTyp }
     *     
     */
    public void setSpanTyp(SpanTyp value) {
        this.spanTyp = value;
    }

    /**
     * Gets the value of the unitLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUnitLength() {
        return unitLength;
    }

    /**
     * Sets the value of the unitLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUnitLength(Float value) {
        this.unitLength = value;
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
     * Gets the value of the poleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoleHeight() {
        return poleHeight;
    }

    /**
     * Sets the value of the poleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoleHeight(Long value) {
        this.poleHeight = value;
    }

    /**
     * Gets the value of the poleClass property.
     * 
     * @return
     *     possible object is
     *     {@link PoleClass }
     *     
     */
    public PoleClass getPoleClass() {
        return poleClass;
    }

    /**
     * Sets the value of the poleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleClass }
     *     
     */
    public void setPoleClass(PoleClass value) {
        this.poleClass = value;
    }

    /**
     * Gets the value of the poleType property.
     * 
     * @return
     *     possible object is
     *     {@link PoleType }
     *     
     */
    public PoleType getPoleType() {
        return poleType;
    }

    /**
     * Sets the value of the poleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleType }
     *     
     */
    public void setPoleType(PoleType value) {
        this.poleType = value;
    }

}
