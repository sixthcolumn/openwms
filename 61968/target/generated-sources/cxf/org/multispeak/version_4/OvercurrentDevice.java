
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overcurrentDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overcurrentDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="breaker" type="{http://www.multispeak.org/Version_4.1_Release}breaker" minOccurs="0"/>
 *           &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_4.1_Release}extensionsList" minOccurs="0"/>
 *           &lt;element name="fuse" type="{http://www.multispeak.org/Version_4.1_Release}fuse" minOccurs="0"/>
 *           &lt;element name="sectionalizer" type="{http://www.multispeak.org/Version_4.1_Release}sectionalizer" minOccurs="0"/>
 *           &lt;element name="extensions" type="{http://www.multispeak.org/Version_4.1_Release}extensions" minOccurs="0"/>
 *           &lt;element name="recloser" type="{http://www.multispeak.org/Version_4.1_Release}recloser" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overcurrentDevice", propOrder = {
    "breaker",
    "extensionsList",
    "fuse",
    "sectionalizer",
    "extensions",
    "recloser"
})
public class OvercurrentDevice {

    protected Breaker breaker;
    protected ExtensionsList extensionsList;
    protected Fuse fuse;
    protected Sectionalizer sectionalizer;
    protected Extensions extensions;
    protected Recloser recloser;

    /**
     * Gets the value of the breaker property.
     * 
     * @return
     *     possible object is
     *     {@link Breaker }
     *     
     */
    public Breaker getBreaker() {
        return breaker;
    }

    /**
     * Sets the value of the breaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breaker }
     *     
     */
    public void setBreaker(Breaker value) {
        this.breaker = value;
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
     * Gets the value of the fuse property.
     * 
     * @return
     *     possible object is
     *     {@link Fuse }
     *     
     */
    public Fuse getFuse() {
        return fuse;
    }

    /**
     * Sets the value of the fuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fuse }
     *     
     */
    public void setFuse(Fuse value) {
        this.fuse = value;
    }

    /**
     * Gets the value of the sectionalizer property.
     * 
     * @return
     *     possible object is
     *     {@link Sectionalizer }
     *     
     */
    public Sectionalizer getSectionalizer() {
        return sectionalizer;
    }

    /**
     * Sets the value of the sectionalizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sectionalizer }
     *     
     */
    public void setSectionalizer(Sectionalizer value) {
        this.sectionalizer = value;
    }

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
     * Gets the value of the recloser property.
     * 
     * @return
     *     possible object is
     *     {@link Recloser }
     *     
     */
    public Recloser getRecloser() {
        return recloser;
    }

    /**
     * Sets the value of the recloser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recloser }
     *     
     */
    public void setRecloser(Recloser value) {
        this.recloser = value;
    }

}
