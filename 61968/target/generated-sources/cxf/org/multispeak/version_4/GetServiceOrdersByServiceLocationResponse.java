
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetServiceOrdersByServiceLocationResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder1" minOccurs="0"/>
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
    "getServiceOrdersByServiceLocationResult"
})
@XmlRootElement(name = "GetServiceOrdersByServiceLocationResponse")
public class GetServiceOrdersByServiceLocationResponse {

    @XmlElement(name = "GetServiceOrdersByServiceLocationResult")
    protected ArrayOfServiceOrder1 getServiceOrdersByServiceLocationResult;

    /**
     * Gets the value of the getServiceOrdersByServiceLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOrder1 }
     *     
     */
    public ArrayOfServiceOrder1 getGetServiceOrdersByServiceLocationResult() {
        return getServiceOrdersByServiceLocationResult;
    }

    /**
     * Sets the value of the getServiceOrdersByServiceLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOrder1 }
     *     
     */
    public void setGetServiceOrdersByServiceLocationResult(ArrayOfServiceOrder1 value) {
        this.getServiceOrdersByServiceLocationResult = value;
    }

}
