
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
 *         &lt;element name="GetServiceLocationByPhaseCodeResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceLocation1" minOccurs="0"/>
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
    "getServiceLocationByPhaseCodeResult"
})
@XmlRootElement(name = "GetServiceLocationByPhaseCodeResponse")
public class GetServiceLocationByPhaseCodeResponse {

    @XmlElement(name = "GetServiceLocationByPhaseCodeResult")
    protected ArrayOfServiceLocation1 getServiceLocationByPhaseCodeResult;

    /**
     * Gets the value of the getServiceLocationByPhaseCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocation1 }
     *     
     */
    public ArrayOfServiceLocation1 getGetServiceLocationByPhaseCodeResult() {
        return getServiceLocationByPhaseCodeResult;
    }

    /**
     * Sets the value of the getServiceLocationByPhaseCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocation1 }
     *     
     */
    public void setGetServiceLocationByPhaseCodeResult(ArrayOfServiceLocation1 value) {
        this.getServiceLocationByPhaseCodeResult = value;
    }

}
