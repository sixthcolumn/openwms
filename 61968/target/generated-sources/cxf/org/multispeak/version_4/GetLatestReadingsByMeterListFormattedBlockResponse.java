
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
 *         &lt;element name="GetLatestReadingsByMeterListFormattedBlockResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfFormattedBlock" minOccurs="0"/>
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
    "getLatestReadingsByMeterListFormattedBlockResult"
})
@XmlRootElement(name = "GetLatestReadingsByMeterListFormattedBlockResponse")
public class GetLatestReadingsByMeterListFormattedBlockResponse {

    @XmlElement(name = "GetLatestReadingsByMeterListFormattedBlockResult")
    protected ArrayOfFormattedBlock getLatestReadingsByMeterListFormattedBlockResult;

    /**
     * Gets the value of the getLatestReadingsByMeterListFormattedBlockResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public ArrayOfFormattedBlock getGetLatestReadingsByMeterListFormattedBlockResult() {
        return getLatestReadingsByMeterListFormattedBlockResult;
    }

    /**
     * Sets the value of the getLatestReadingsByMeterListFormattedBlockResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public void setGetLatestReadingsByMeterListFormattedBlockResult(ArrayOfFormattedBlock value) {
        this.getLatestReadingsByMeterListFormattedBlockResult = value;
    }

}
