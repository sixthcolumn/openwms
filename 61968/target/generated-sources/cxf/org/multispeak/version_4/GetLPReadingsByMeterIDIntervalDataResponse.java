
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
 *         &lt;element name="GetLPReadingsByMeterIDIntervalDataResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalData" minOccurs="0"/>
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
    "getLPReadingsByMeterIDIntervalDataResult"
})
@XmlRootElement(name = "GetLPReadingsByMeterIDIntervalDataResponse")
public class GetLPReadingsByMeterIDIntervalDataResponse {

    @XmlElement(name = "GetLPReadingsByMeterIDIntervalDataResult")
    protected ArrayOfIntervalData getLPReadingsByMeterIDIntervalDataResult;

    /**
     * Gets the value of the getLPReadingsByMeterIDIntervalDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public ArrayOfIntervalData getGetLPReadingsByMeterIDIntervalDataResult() {
        return getLPReadingsByMeterIDIntervalDataResult;
    }

    /**
     * Sets the value of the getLPReadingsByMeterIDIntervalDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalData }
     *     
     */
    public void setGetLPReadingsByMeterIDIntervalDataResult(ArrayOfIntervalData value) {
        this.getLPReadingsByMeterIDIntervalDataResult = value;
    }

}