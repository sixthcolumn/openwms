
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
 *         &lt;element name="GetBillingAccountLoadDataByMonthResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfBillingAccountLoad" minOccurs="0"/>
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
    "getBillingAccountLoadDataByMonthResult"
})
@XmlRootElement(name = "GetBillingAccountLoadDataByMonthResponse")
public class GetBillingAccountLoadDataByMonthResponse {

    @XmlElement(name = "GetBillingAccountLoadDataByMonthResult")
    protected ArrayOfBillingAccountLoad getBillingAccountLoadDataByMonthResult;

    /**
     * Gets the value of the getBillingAccountLoadDataByMonthResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingAccountLoad }
     *     
     */
    public ArrayOfBillingAccountLoad getGetBillingAccountLoadDataByMonthResult() {
        return getBillingAccountLoadDataByMonthResult;
    }

    /**
     * Sets the value of the getBillingAccountLoadDataByMonthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingAccountLoad }
     *     
     */
    public void setGetBillingAccountLoadDataByMonthResult(ArrayOfBillingAccountLoad value) {
        this.getBillingAccountLoadDataByMonthResult = value;
    }

}
