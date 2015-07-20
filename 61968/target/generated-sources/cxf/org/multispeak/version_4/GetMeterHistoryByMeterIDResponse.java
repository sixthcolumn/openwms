
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
 *         &lt;element name="GetMeterHistoryByMeterIDResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterHistoryEvent" minOccurs="0"/>
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
    "getMeterHistoryByMeterIDResult"
})
@XmlRootElement(name = "GetMeterHistoryByMeterIDResponse")
public class GetMeterHistoryByMeterIDResponse {

    @XmlElement(name = "GetMeterHistoryByMeterIDResult")
    protected ArrayOfMeterHistoryEvent getMeterHistoryByMeterIDResult;

    /**
     * Gets the value of the getMeterHistoryByMeterIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterHistoryEvent }
     *     
     */
    public ArrayOfMeterHistoryEvent getGetMeterHistoryByMeterIDResult() {
        return getMeterHistoryByMeterIDResult;
    }

    /**
     * Sets the value of the getMeterHistoryByMeterIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterHistoryEvent }
     *     
     */
    public void setGetMeterHistoryByMeterIDResult(ArrayOfMeterHistoryEvent value) {
        this.getMeterHistoryByMeterIDResult = value;
    }

}