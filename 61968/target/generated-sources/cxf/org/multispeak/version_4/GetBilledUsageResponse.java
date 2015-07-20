
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
 *         &lt;element name="GetBilledUsageResult" type="{http://www.multispeak.org/Version_4.1_Release}billedUsage" minOccurs="0"/>
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
    "getBilledUsageResult"
})
@XmlRootElement(name = "GetBilledUsageResponse")
public class GetBilledUsageResponse {

    @XmlElement(name = "GetBilledUsageResult")
    protected BilledUsage getBilledUsageResult;

    /**
     * Gets the value of the getBilledUsageResult property.
     * 
     * @return
     *     possible object is
     *     {@link BilledUsage }
     *     
     */
    public BilledUsage getGetBilledUsageResult() {
        return getBilledUsageResult;
    }

    /**
     * Sets the value of the getBilledUsageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilledUsage }
     *     
     */
    public void setGetBilledUsageResult(BilledUsage value) {
        this.getBilledUsageResult = value;
    }

}
