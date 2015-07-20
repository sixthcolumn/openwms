
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
 *         &lt;element name="GetCustomerByDBANameResult" type="{http://www.multispeak.org/Version_4.1_Release}customer" minOccurs="0"/>
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
    "getCustomerByDBANameResult"
})
@XmlRootElement(name = "GetCustomerByDBANameResponse")
public class GetCustomerByDBANameResponse {

    @XmlElement(name = "GetCustomerByDBANameResult")
    protected Customer getCustomerByDBANameResult;

    /**
     * Gets the value of the getCustomerByDBANameResult property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getGetCustomerByDBANameResult() {
        return getCustomerByDBANameResult;
    }

    /**
     * Sets the value of the getCustomerByDBANameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setGetCustomerByDBANameResult(Customer value) {
        this.getCustomerByDBANameResult = value;
    }

}
