
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
 *         &lt;element name="GetPropaneMetersByAccountNumberResult" type="{http://www.multispeak.org/Version_4.1_Release}propaneMeters" minOccurs="0"/>
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
    "getPropaneMetersByAccountNumberResult"
})
@XmlRootElement(name = "GetPropaneMetersByAccountNumberResponse")
public class GetPropaneMetersByAccountNumberResponse {

    @XmlElement(name = "GetPropaneMetersByAccountNumberResult")
    protected PropaneMeters getPropaneMetersByAccountNumberResult;

    /**
     * Gets the value of the getPropaneMetersByAccountNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeters }
     *     
     */
    public PropaneMeters getGetPropaneMetersByAccountNumberResult() {
        return getPropaneMetersByAccountNumberResult;
    }

    /**
     * Sets the value of the getPropaneMetersByAccountNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeters }
     *     
     */
    public void setGetPropaneMetersByAccountNumberResult(PropaneMeters value) {
        this.getPropaneMetersByAccountNumberResult = value;
    }

}
