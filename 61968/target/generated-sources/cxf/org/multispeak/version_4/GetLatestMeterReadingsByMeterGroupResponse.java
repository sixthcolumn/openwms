
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
 *         &lt;element name="GetLatestMeterReadingsByMeterGroupResult" type="{http://www.multispeak.org/Version_4.1_Release}formattedBlock" minOccurs="0"/>
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
    "getLatestMeterReadingsByMeterGroupResult"
})
@XmlRootElement(name = "GetLatestMeterReadingsByMeterGroupResponse")
public class GetLatestMeterReadingsByMeterGroupResponse {

    @XmlElement(name = "GetLatestMeterReadingsByMeterGroupResult")
    protected FormattedBlock getLatestMeterReadingsByMeterGroupResult;

    /**
     * Gets the value of the getLatestMeterReadingsByMeterGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedBlock }
     *     
     */
    public FormattedBlock getGetLatestMeterReadingsByMeterGroupResult() {
        return getLatestMeterReadingsByMeterGroupResult;
    }

    /**
     * Sets the value of the getLatestMeterReadingsByMeterGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedBlock }
     *     
     */
    public void setGetLatestMeterReadingsByMeterGroupResult(FormattedBlock value) {
        this.getLatestMeterReadingsByMeterGroupResult = value;
    }

}
