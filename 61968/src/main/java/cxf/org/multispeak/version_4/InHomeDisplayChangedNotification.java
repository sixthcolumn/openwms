
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
 *         &lt;element name="changedIHDs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplay1" minOccurs="0"/>
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
    "changedIHDs"
})
@XmlRootElement(name = "InHomeDisplayChangedNotification")
public class InHomeDisplayChangedNotification {

    protected ArrayOfInHomeDisplay1 changedIHDs;

    /**
     * Gets the value of the changedIHDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplay1 }
     *     
     */
    public ArrayOfInHomeDisplay1 getChangedIHDs() {
        return changedIHDs;
    }

    /**
     * Sets the value of the changedIHDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplay1 }
     *     
     */
    public void setChangedIHDs(ArrayOfInHomeDisplay1 value) {
        this.changedIHDs = value;
    }

}
