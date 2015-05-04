
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
 *         &lt;element name="GetElectricMetersByAccountNumberResult" type="{http://www.multispeak.org/Version_4.1_Release}electricMeters" minOccurs="0"/>
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
    "getElectricMetersByAccountNumberResult"
})
@XmlRootElement(name = "GetElectricMetersByAccountNumberResponse")
public class GetElectricMetersByAccountNumberResponse {

    @XmlElement(name = "GetElectricMetersByAccountNumberResult")
    protected ElectricMeters getElectricMetersByAccountNumberResult;

    /**
     * Gets the value of the getElectricMetersByAccountNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeters }
     *     
     */
    public ElectricMeters getGetElectricMetersByAccountNumberResult() {
        return getElectricMetersByAccountNumberResult;
    }

    /**
     * Sets the value of the getElectricMetersByAccountNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeters }
     *     
     */
    public void setGetElectricMetersByAccountNumberResult(ElectricMeters value) {
        this.getElectricMetersByAccountNumberResult = value;
    }

}
