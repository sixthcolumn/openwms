
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
 *         &lt;element name="changedSOs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder1" minOccurs="0"/>
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
    "changedSOs"
})
@XmlRootElement(name = "ServiceOrderClosedNotification")
public class ServiceOrderClosedNotification {

    protected ArrayOfServiceOrder1 changedSOs;

    /**
     * Gets the value of the changedSOs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOrder1 }
     *     
     */
    public ArrayOfServiceOrder1 getChangedSOs() {
        return changedSOs;
    }

    /**
     * Sets the value of the changedSOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOrder1 }
     *     
     */
    public void setChangedSOs(ArrayOfServiceOrder1 value) {
        this.changedSOs = value;
    }

}
