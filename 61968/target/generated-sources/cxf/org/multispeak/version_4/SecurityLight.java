
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityLight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityLight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="lightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wattage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.multispeak.org/Version_4.1_Release}securityLightStatus" minOccurs="0"/>
 *         &lt;element name="actionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformerBankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "securityLight", propOrder = {
    "lightType",
    "wattage",
    "brightness",
    "sequence",
    "status",
    "actionTaken",
    "transformerBankID",
    "description",
    "assetFields"
})
public class SecurityLight
    extends MspElectricPoint
{

    protected String lightType;
    protected Long wattage;
    protected Float brightness;
    protected String sequence;
    protected SecurityLightStatus status;
    protected String actionTaken;
    protected String transformerBankID;
    protected String description;
    protected AssetFields assetFields;

    /**
     * Gets the value of the lightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightType() {
        return lightType;
    }

    /**
     * Sets the value of the lightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightType(String value) {
        this.lightType = value;
    }

    /**
     * Gets the value of the wattage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWattage() {
        return wattage;
    }

    /**
     * Sets the value of the wattage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWattage(Long value) {
        this.wattage = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBrightness(Float value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityLightStatus }
     *     
     */
    public SecurityLightStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityLightStatus }
     *     
     */
    public void setStatus(SecurityLightStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTaken(String value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the transformerBankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerBankID() {
        return transformerBankID;
    }

    /**
     * Sets the value of the transformerBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerBankID(String value) {
        this.transformerBankID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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