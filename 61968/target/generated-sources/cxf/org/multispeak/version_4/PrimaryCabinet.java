
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for primaryCabinet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primaryCabinet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="structType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabinetContentsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObjectRef" minOccurs="0"/>
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
@XmlType(name = "primaryCabinet", propOrder = {
    "structType",
    "cabinetContentsList",
    "assetFields"
})
public class PrimaryCabinet
    extends MspPointObject
{

    protected String structType;
    protected ArrayOfObjectRef cabinetContentsList;
    protected AssetFields assetFields;

    /**
     * Gets the value of the structType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructType() {
        return structType;
    }

    /**
     * Sets the value of the structType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructType(String value) {
        this.structType = value;
    }

    /**
     * Gets the value of the cabinetContentsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef }
     *     
     */
    public ArrayOfObjectRef getCabinetContentsList() {
        return cabinetContentsList;
    }

    /**
     * Sets the value of the cabinetContentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef }
     *     
     */
    public void setCabinetContentsList(ArrayOfObjectRef value) {
        this.cabinetContentsList = value;
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
