
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
 *         &lt;element name="GetPPMCustomerResult" type="{http://www.multispeak.org/Version_4.1_Release}ppmLocation" minOccurs="0"/>
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
    "getPPMCustomerResult"
})
@XmlRootElement(name = "GetPPMCustomerResponse")
public class GetPPMCustomerResponse {

    @XmlElement(name = "GetPPMCustomerResult")
    protected PpmLocation getPPMCustomerResult;

    /**
     * Gets the value of the getPPMCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link PpmLocation }
     *     
     */
    public PpmLocation getGetPPMCustomerResult() {
        return getPPMCustomerResult;
    }

    /**
     * Sets the value of the getPPMCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PpmLocation }
     *     
     */
    public void setGetPPMCustomerResult(PpmLocation value) {
        this.getPPMCustomerResult = value;
    }

}
