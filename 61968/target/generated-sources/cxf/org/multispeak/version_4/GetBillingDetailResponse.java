
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
 *         &lt;element name="GetBillingDetailResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfBillingDetail" minOccurs="0"/>
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
    "getBillingDetailResult"
})
@XmlRootElement(name = "GetBillingDetailResponse")
public class GetBillingDetailResponse {

    @XmlElement(name = "GetBillingDetailResult")
    protected ArrayOfBillingDetail getBillingDetailResult;

    /**
     * Gets the value of the getBillingDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingDetail }
     *     
     */
    public ArrayOfBillingDetail getGetBillingDetailResult() {
        return getBillingDetailResult;
    }

    /**
     * Sets the value of the getBillingDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingDetail }
     *     
     */
    public void setGetBillingDetailResult(ArrayOfBillingDetail value) {
        this.getBillingDetailResult = value;
    }

}
