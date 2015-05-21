
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
 *         &lt;element name="installedCDDs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCDDevice1" minOccurs="0"/>
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
    "installedCDDs"
})
@XmlRootElement(name = "CDDeviceInstalledNotification")
public class CDDeviceInstalledNotification {

    protected ArrayOfCDDevice1 installedCDDs;

    /**
     * Gets the value of the installedCDDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCDDevice1 }
     *     
     */
    public ArrayOfCDDevice1 getInstalledCDDs() {
        return installedCDDs;
    }

    /**
     * Sets the value of the installedCDDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCDDevice1 }
     *     
     */
    public void setInstalledCDDs(ArrayOfCDDevice1 value) {
        this.installedCDDs = value;
    }

}
