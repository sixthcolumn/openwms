
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
 *         &lt;element name="GetConfigurationGroupNamesByMeterIDResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString" minOccurs="0"/>
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
    "getConfigurationGroupNamesByMeterIDResult"
})
@XmlRootElement(name = "GetConfigurationGroupNamesByMeterIDResponse")
public class GetConfigurationGroupNamesByMeterIDResponse {

    @XmlElement(name = "GetConfigurationGroupNamesByMeterIDResult")
    protected ArrayOfString getConfigurationGroupNamesByMeterIDResult;

    /**
     * Gets the value of the getConfigurationGroupNamesByMeterIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetConfigurationGroupNamesByMeterIDResult() {
        return getConfigurationGroupNamesByMeterIDResult;
    }

    /**
     * Sets the value of the getConfigurationGroupNamesByMeterIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetConfigurationGroupNamesByMeterIDResult(ArrayOfString value) {
        this.getConfigurationGroupNamesByMeterIDResult = value;
    }

}
