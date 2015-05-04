
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
 *         &lt;element name="GetReadingSchedulesResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReadingSchedule" minOccurs="0"/>
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
    "getReadingSchedulesResult"
})
@XmlRootElement(name = "GetReadingSchedulesResponse")
public class GetReadingSchedulesResponse {

    @XmlElement(name = "GetReadingSchedulesResult")
    protected ArrayOfReadingSchedule getReadingSchedulesResult;

    /**
     * Gets the value of the getReadingSchedulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReadingSchedule }
     *     
     */
    public ArrayOfReadingSchedule getGetReadingSchedulesResult() {
        return getReadingSchedulesResult;
    }

    /**
     * Sets the value of the getReadingSchedulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReadingSchedule }
     *     
     */
    public void setGetReadingSchedulesResult(ArrayOfReadingSchedule value) {
        this.getReadingSchedulesResult = value;
    }

}
