
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
 *         &lt;element name="GetLatestReadingByMeterIDResult" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
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
    "getLatestReadingByMeterIDResult"
})
@XmlRootElement(name = "GetLatestReadingByMeterIDResponse")
public class GetLatestReadingByMeterIDResponse {

    @XmlElement(name = "GetLatestReadingByMeterIDResult")
    protected MeterReading getLatestReadingByMeterIDResult;

    /**
     * Gets the value of the getLatestReadingByMeterIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getGetLatestReadingByMeterIDResult() {
        return getLatestReadingByMeterIDResult;
    }

    /**
     * Sets the value of the getLatestReadingByMeterIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setGetLatestReadingByMeterIDResult(MeterReading value) {
        this.getLatestReadingByMeterIDResult = value;
    }

}
