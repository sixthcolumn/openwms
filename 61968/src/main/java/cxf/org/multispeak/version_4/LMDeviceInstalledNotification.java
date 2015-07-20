
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="installedLMDs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfLoadManagementDevice1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "installedLMDs"
})
@XmlRootElement(name = "LMDeviceInstalledNotification")
public class LMDeviceInstalledNotification {

    protected ArrayOfLoadManagementDevice1 installedLMDs;

    /**
     * Gets the value of the installedLMDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLoadManagementDevice1 }
     *     
     */
    public ArrayOfLoadManagementDevice1 getInstalledLMDs() {
        return installedLMDs;
    }

    /**
     * Sets the value of the installedLMDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLoadManagementDevice1 }
     *     
     */
    public void setInstalledLMDs(ArrayOfLoadManagementDevice1 value) {
        this.installedLMDs = value;
    }

}
