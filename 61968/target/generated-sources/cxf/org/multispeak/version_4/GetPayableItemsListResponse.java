
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
 *         &lt;element name="GetPayableItemsListResult" type="{http://www.multispeak.org/Version_4.1_Release}payableItemList" minOccurs="0"/>
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
    "getPayableItemsListResult"
})
@XmlRootElement(name = "GetPayableItemsListResponse")
public class GetPayableItemsListResponse {

    @XmlElement(name = "GetPayableItemsListResult")
    protected PayableItemList getPayableItemsListResult;

    /**
     * Gets the value of the getPayableItemsListResult property.
     * 
     * @return
     *     possible object is
     *     {@link PayableItemList }
     *     
     */
    public PayableItemList getGetPayableItemsListResult() {
        return getPayableItemsListResult;
    }

    /**
     * Sets the value of the getPayableItemsListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableItemList }
     *     
     */
    public void setGetPayableItemsListResult(PayableItemList value) {
        this.getPayableItemsListResult = value;
    }

}
