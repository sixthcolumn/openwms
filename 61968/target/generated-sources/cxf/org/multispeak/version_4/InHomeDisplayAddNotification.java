
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
 *         &lt;element name="addedIHDs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplay1" minOccurs="0"/>
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
    "addedIHDs"
})
@XmlRootElement(name = "InHomeDisplayAddNotification")
public class InHomeDisplayAddNotification {

    protected ArrayOfInHomeDisplay1 addedIHDs;

    /**
     * Gets the value of the addedIHDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplay1 }
     *     
     */
    public ArrayOfInHomeDisplay1 getAddedIHDs() {
        return addedIHDs;
    }

    /**
     * Sets the value of the addedIHDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplay1 }
     *     
     */
    public void setAddedIHDs(ArrayOfInHomeDisplay1 value) {
        this.addedIHDs = value;
    }

}