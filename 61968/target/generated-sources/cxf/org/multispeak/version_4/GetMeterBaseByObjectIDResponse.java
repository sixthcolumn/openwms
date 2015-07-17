
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
 *         &lt;element name="GetMeterBaseByObjectIDResult" type="{http://www.multispeak.org/Version_4.1_Release}meterBase" minOccurs="0"/>
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
    "getMeterBaseByObjectIDResult"
})
@XmlRootElement(name = "GetMeterBaseByObjectIDResponse")
public class GetMeterBaseByObjectIDResponse {

    @XmlElement(name = "GetMeterBaseByObjectIDResult")
    protected MeterBase getMeterBaseByObjectIDResult;

    /**
     * Gets the value of the getMeterBaseByObjectIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link MeterBase }
     *     
     */
    public MeterBase getGetMeterBaseByObjectIDResult() {
        return getMeterBaseByObjectIDResult;
    }

    /**
     * Sets the value of the getMeterBaseByObjectIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterBase }
     *     
     */
    public void setGetMeterBaseByObjectIDResult(MeterBase value) {
        this.getMeterBaseByObjectIDResult = value;
    }

}
