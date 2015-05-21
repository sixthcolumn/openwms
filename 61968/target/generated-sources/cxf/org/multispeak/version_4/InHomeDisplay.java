
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inHomeDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inHomeDisplay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterBaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfModule" minOccurs="0"/>
 *         &lt;element name="utilityInfo" type="{http://www.multispeak.org/Version_4.1_Release}utilityInfo" minOccurs="0"/>
 *         &lt;element name="inHomeDisplayBillingMessageList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplayBillingMessage" minOccurs="0"/>
 *         &lt;element name="inHomeDisplayMessageList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplayMessage" minOccurs="0"/>
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
@XmlType(name = "inHomeDisplay", propOrder = {
    "manufacturer",
    "serialNumber",
    "deviceType",
    "meterBaseID",
    "moduleList",
    "utilityInfo",
    "inHomeDisplayBillingMessageList",
    "inHomeDisplayMessageList",
    "assetFields"
})
public class InHomeDisplay
    extends MspPointObject
{

    protected String manufacturer;
    protected String serialNumber;
    protected String deviceType;
    protected String meterBaseID;
    protected ArrayOfModule moduleList;
    protected UtilityInfo utilityInfo;
    protected ArrayOfInHomeDisplayBillingMessage inHomeDisplayBillingMessageList;
    protected ArrayOfInHomeDisplayMessage inHomeDisplayMessageList;
    protected AssetFields assetFields;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the meterBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterBaseID() {
        return meterBaseID;
    }

    /**
     * Sets the value of the meterBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterBaseID(String value) {
        this.meterBaseID = value;
    }

    /**
     * Gets the value of the moduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModule }
     *     
     */
    public ArrayOfModule getModuleList() {
        return moduleList;
    }

    /**
     * Sets the value of the moduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModule }
     *     
     */
    public void setModuleList(ArrayOfModule value) {
        this.moduleList = value;
    }

    /**
     * Gets the value of the utilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityInfo }
     *     
     */
    public UtilityInfo getUtilityInfo() {
        return utilityInfo;
    }

    /**
     * Sets the value of the utilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityInfo }
     *     
     */
    public void setUtilityInfo(UtilityInfo value) {
        this.utilityInfo = value;
    }

    /**
     * Gets the value of the inHomeDisplayBillingMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplayBillingMessage }
     *     
     */
    public ArrayOfInHomeDisplayBillingMessage getInHomeDisplayBillingMessageList() {
        return inHomeDisplayBillingMessageList;
    }

    /**
     * Sets the value of the inHomeDisplayBillingMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplayBillingMessage }
     *     
     */
    public void setInHomeDisplayBillingMessageList(ArrayOfInHomeDisplayBillingMessage value) {
        this.inHomeDisplayBillingMessageList = value;
    }

    /**
     * Gets the value of the inHomeDisplayMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplayMessage }
     *     
     */
    public ArrayOfInHomeDisplayMessage getInHomeDisplayMessageList() {
        return inHomeDisplayMessageList;
    }

    /**
     * Sets the value of the inHomeDisplayMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplayMessage }
     *     
     */
    public void setInHomeDisplayMessageList(ArrayOfInHomeDisplayMessage value) {
        this.inHomeDisplayMessageList = value;
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
