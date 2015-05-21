
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
 *         &lt;element name="GetAllWaterMetersResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWaterMeter1" minOccurs="0"/>
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
    "getAllWaterMetersResult"
})
@XmlRootElement(name = "GetAllWaterMetersResponse")
public class GetAllWaterMetersResponse {

    @XmlElement(name = "GetAllWaterMetersResult")
    protected ArrayOfWaterMeter1 getAllWaterMetersResult;

    /**
     * Gets the value of the getAllWaterMetersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaterMeter1 }
     *     
     */
    public ArrayOfWaterMeter1 getGetAllWaterMetersResult() {
        return getAllWaterMetersResult;
    }

    /**
     * Sets the value of the getAllWaterMetersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaterMeter1 }
     *     
     */
    public void setGetAllWaterMetersResult(ArrayOfWaterMeter1 value) {
        this.getAllWaterMetersResult = value;
    }

}
