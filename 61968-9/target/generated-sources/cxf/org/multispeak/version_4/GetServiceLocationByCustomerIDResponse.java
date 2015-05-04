
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
 *         &lt;element name="GetServiceLocationByCustomerIDResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceLocation1" minOccurs="0"/>
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
    "getServiceLocationByCustomerIDResult"
})
@XmlRootElement(name = "GetServiceLocationByCustomerIDResponse")
public class GetServiceLocationByCustomerIDResponse {

    @XmlElement(name = "GetServiceLocationByCustomerIDResult")
    protected ArrayOfServiceLocation1 getServiceLocationByCustomerIDResult;

    /**
     * Gets the value of the getServiceLocationByCustomerIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocation1 }
     *     
     */
    public ArrayOfServiceLocation1 getGetServiceLocationByCustomerIDResult() {
        return getServiceLocationByCustomerIDResult;
    }

    /**
     * Sets the value of the getServiceLocationByCustomerIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocation1 }
     *     
     */
    public void setGetServiceLocationByCustomerIDResult(ArrayOfServiceLocation1 value) {
        this.getServiceLocationByCustomerIDResult = value;
    }

}
