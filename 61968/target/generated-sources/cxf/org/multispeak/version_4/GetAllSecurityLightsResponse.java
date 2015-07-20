
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
 *         &lt;element name="GetAllSecurityLightsResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSecurityLight1" minOccurs="0"/>
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
    "getAllSecurityLightsResult"
})
@XmlRootElement(name = "GetAllSecurityLightsResponse")
public class GetAllSecurityLightsResponse {

    @XmlElement(name = "GetAllSecurityLightsResult")
    protected ArrayOfSecurityLight1 getAllSecurityLightsResult;

    /**
     * Gets the value of the getAllSecurityLightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityLight1 }
     *     
     */
    public ArrayOfSecurityLight1 getGetAllSecurityLightsResult() {
        return getAllSecurityLightsResult;
    }

    /**
     * Sets the value of the getAllSecurityLightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityLight1 }
     *     
     */
    public void setGetAllSecurityLightsResult(ArrayOfSecurityLight1 value) {
        this.getAllSecurityLightsResult = value;
    }

}
