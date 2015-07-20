
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="reactiveRating" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="reactivePerSection" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="maximumSections" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="normalSections" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="assetFields" type="{http://www.multispeak.org/Version_4.1_Release}assetFields" minOccurs="0"/>
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
@XmlType(name = "capacitor", propOrder = {
    "phaseCode",
    "reactiveRating",
    "reactivePerSection",
    "maximumSections",
    "normalSections",
    "assetFields"
})
public class Capacitor
    extends MspObject
{

    protected PhaseCode phaseCode;
    protected ReactivePower reactiveRating;
    protected ReactivePower reactivePerSection;
    protected BigInteger maximumSections;
    protected BigInteger normalSections;
    protected AssetFields assetFields;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the reactiveRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactiveRating() {
        return reactiveRating;
    }

    /**
     * Sets the value of the reactiveRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactiveRating(ReactivePower value) {
        this.reactiveRating = value;
    }

    /**
     * Gets the value of the reactivePerSection property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactivePerSection() {
        return reactivePerSection;
    }

    /**
     * Sets the value of the reactivePerSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactivePerSection(ReactivePower value) {
        this.reactivePerSection = value;
    }

    /**
     * Gets the value of the maximumSections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumSections() {
        return maximumSections;
    }

    /**
     * Sets the value of the maximumSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumSections(BigInteger value) {
        this.maximumSections = value;
    }

    /**
     * Gets the value of the normalSections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNormalSections() {
        return normalSections;
    }

    /**
     * Sets the value of the normalSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNormalSections(BigInteger value) {
        this.normalSections = value;
    }

    /**
     * Gets the value of the assetFields property.
     * 
     * @return
     *     possible object is
     *     {@link AssetFields }
     *     
     */
    public AssetFields getAssetFields() {
        return assetFields;
    }

    /**
     * Sets the value of the assetFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetFields }
     *     
     */
    public void setAssetFields(AssetFields value) {
        this.assetFields = value;
    }

}
