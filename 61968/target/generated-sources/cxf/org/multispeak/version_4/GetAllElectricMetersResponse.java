
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
 *         &lt;element name="GetAllElectricMetersResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfElectricMeter1" minOccurs="0"/>
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
    "getAllElectricMetersResult"
})
@XmlRootElement(name = "GetAllElectricMetersResponse")
public class GetAllElectricMetersResponse {

    @XmlElement(name = "GetAllElectricMetersResult")
    protected ArrayOfElectricMeter1 getAllElectricMetersResult;

    /**
     * Gets the value of the getAllElectricMetersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectricMeter1 }
     *     
     */
    public ArrayOfElectricMeter1 getGetAllElectricMetersResult() {
        return getAllElectricMetersResult;
    }

    /**
     * Sets the value of the getAllElectricMetersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectricMeter1 }
     *     
     */
    public void setGetAllElectricMetersResult(ArrayOfElectricMeter1 value) {
        this.getAllElectricMetersResult = value;
    }

}