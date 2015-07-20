
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
 *         &lt;element name="GetBillingDataResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfBillingData" minOccurs="0"/>
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
    "getBillingDataResult"
})
@XmlRootElement(name = "GetBillingDataResponse")
public class GetBillingDataResponse {

    @XmlElement(name = "GetBillingDataResult")
    protected ArrayOfBillingData getBillingDataResult;

    /**
     * Gets the value of the getBillingDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingData }
     *     
     */
    public ArrayOfBillingData getGetBillingDataResult() {
        return getBillingDataResult;
    }

    /**
     * Sets the value of the getBillingDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingData }
     *     
     */
    public void setGetBillingDataResult(ArrayOfBillingData value) {
        this.getBillingDataResult = value;
    }

}
