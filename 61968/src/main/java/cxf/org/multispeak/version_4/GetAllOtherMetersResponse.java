
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
 *         &lt;element name="GetAllOtherMetersResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOtherMeter" minOccurs="0"/>
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
    "getAllOtherMetersResult"
})
@XmlRootElement(name = "GetAllOtherMetersResponse")
public class GetAllOtherMetersResponse {

    @XmlElement(name = "GetAllOtherMetersResult")
    protected ArrayOfOtherMeter getAllOtherMetersResult;

    /**
     * Gets the value of the getAllOtherMetersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherMeter }
     *     
     */
    public ArrayOfOtherMeter getGetAllOtherMetersResult() {
        return getAllOtherMetersResult;
    }

    /**
     * Sets the value of the getAllOtherMetersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherMeter }
     *     
     */
    public void setGetAllOtherMetersResult(ArrayOfOtherMeter value) {
        this.getAllOtherMetersResult = value;
    }

}
