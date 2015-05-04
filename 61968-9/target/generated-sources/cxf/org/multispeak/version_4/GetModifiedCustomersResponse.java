
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
 *         &lt;element name="GetModifiedCustomersResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCustomer" minOccurs="0"/>
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
    "getModifiedCustomersResult"
})
@XmlRootElement(name = "GetModifiedCustomersResponse")
public class GetModifiedCustomersResponse {

    @XmlElement(name = "GetModifiedCustomersResult")
    protected ArrayOfCustomer getModifiedCustomersResult;

    /**
     * Gets the value of the getModifiedCustomersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public ArrayOfCustomer getGetModifiedCustomersResult() {
        return getModifiedCustomersResult;
    }

    /**
     * Sets the value of the getModifiedCustomersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public void setGetModifiedCustomersResult(ArrayOfCustomer value) {
        this.getModifiedCustomersResult = value;
    }

}
