
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_4.1_Release}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfExtensionsItem" minOccurs="0"/>
 *         &lt;element name="cdDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadManagementDeviceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString3" minOccurs="0"/>
 *         &lt;element name="inHomeDisplayList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceList", propOrder = {
    "extensions",
    "extensionsList",
    "cdDeviceID",
    "loadManagementDeviceList",
    "inHomeDisplayList"
})
public class DeviceList {

    protected Extensions extensions;
    protected ArrayOfExtensionsItem extensionsList;
    protected String cdDeviceID;
    protected ArrayOfString3 loadManagementDeviceList;
    protected ArrayOfString4 inHomeDisplayList;

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
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public ArrayOfExtensionsItem getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public void setExtensionsList(ArrayOfExtensionsItem value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the cdDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDeviceID() {
        return cdDeviceID;
    }

    /**
     * Sets the value of the cdDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDeviceID(String value) {
        this.cdDeviceID = value;
    }

    /**
     * Gets the value of the loadManagementDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString3 }
     *     
     */
    public ArrayOfString3 getLoadManagementDeviceList() {
        return loadManagementDeviceList;
    }

    /**
     * Sets the value of the loadManagementDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString3 }
     *     
     */
    public void setLoadManagementDeviceList(ArrayOfString3 value) {
        this.loadManagementDeviceList = value;
    }

    /**
     * Gets the value of the inHomeDisplayList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString4 }
     *     
     */
    public ArrayOfString4 getInHomeDisplayList() {
        return inHomeDisplayList;
    }

    /**
     * Sets the value of the inHomeDisplayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString4 }
     *     
     */
    public void setInHomeDisplayList(ArrayOfString4 value) {
        this.inHomeDisplayList = value;
    }

}
