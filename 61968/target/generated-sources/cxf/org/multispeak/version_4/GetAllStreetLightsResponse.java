
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
 *         &lt;element name="GetAllStreetLightsResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfStreetLight" minOccurs="0"/>
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
    "getAllStreetLightsResult"
})
@XmlRootElement(name = "GetAllStreetLightsResponse")
public class GetAllStreetLightsResponse {

    @XmlElement(name = "GetAllStreetLightsResult")
    protected ArrayOfStreetLight getAllStreetLightsResult;

    /**
     * Gets the value of the getAllStreetLightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStreetLight }
     *     
     */
    public ArrayOfStreetLight getGetAllStreetLightsResult() {
        return getAllStreetLightsResult;
    }

    /**
     * Sets the value of the getAllStreetLightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStreetLight }
     *     
     */
    public void setGetAllStreetLightsResult(ArrayOfStreetLight value) {
        this.getAllStreetLightsResult = value;
    }

}
