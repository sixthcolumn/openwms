
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
 *         &lt;element name="GetReadingsByMeterIDAndFieldNameResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfFormattedBlock" minOccurs="0"/>
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
    "getReadingsByMeterIDAndFieldNameResult"
})
@XmlRootElement(name = "GetReadingsByMeterIDAndFieldNameResponse")
public class GetReadingsByMeterIDAndFieldNameResponse {

    @XmlElement(name = "GetReadingsByMeterIDAndFieldNameResult")
    protected ArrayOfFormattedBlock getReadingsByMeterIDAndFieldNameResult;

    /**
     * Gets the value of the getReadingsByMeterIDAndFieldNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public ArrayOfFormattedBlock getGetReadingsByMeterIDAndFieldNameResult() {
        return getReadingsByMeterIDAndFieldNameResult;
    }

    /**
     * Sets the value of the getReadingsByMeterIDAndFieldNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedBlock }
     *     
     */
    public void setGetReadingsByMeterIDAndFieldNameResult(ArrayOfFormattedBlock value) {
        this.getReadingsByMeterIDAndFieldNameResult = value;
    }

}
