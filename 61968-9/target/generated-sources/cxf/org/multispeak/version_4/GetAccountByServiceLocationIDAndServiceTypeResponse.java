
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
 *         &lt;element name="GetAccountByServiceLocationIDAndServiceTypeResult" type="{http://www.multispeak.org/Version_4.1_Release}account" minOccurs="0"/>
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
    "getAccountByServiceLocationIDAndServiceTypeResult"
})
@XmlRootElement(name = "GetAccountByServiceLocationIDAndServiceTypeResponse")
public class GetAccountByServiceLocationIDAndServiceTypeResponse {

    @XmlElement(name = "GetAccountByServiceLocationIDAndServiceTypeResult")
    protected Account getAccountByServiceLocationIDAndServiceTypeResult;

    /**
     * Gets the value of the getAccountByServiceLocationIDAndServiceTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getGetAccountByServiceLocationIDAndServiceTypeResult() {
        return getAccountByServiceLocationIDAndServiceTypeResult;
    }

    /**
     * Sets the value of the getAccountByServiceLocationIDAndServiceTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setGetAccountByServiceLocationIDAndServiceTypeResult(Account value) {
        this.getAccountByServiceLocationIDAndServiceTypeResult = value;
    }

}
