
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secondaryJunctionBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondaryJunctionBox">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="junctionBoxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "secondaryJunctionBox", propOrder = {
    "junctionBoxType",
    "assetFields"
})
public class SecondaryJunctionBox
    extends MspPointObject
{

    protected String junctionBoxType;
    protected AssetFields assetFields;

    /**
     * Gets the value of the junctionBoxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionBoxType() {
        return junctionBoxType;
    }

    /**
     * Sets the value of the junctionBoxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionBoxType(String value) {
        this.junctionBoxType = value;
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
