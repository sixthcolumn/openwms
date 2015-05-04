
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
 *         &lt;element name="GetSchedulesResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSchedule" minOccurs="0"/>
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
    "getSchedulesResult"
})
@XmlRootElement(name = "GetSchedulesResponse")
public class GetSchedulesResponse {

    @XmlElement(name = "GetSchedulesResult")
    protected ArrayOfSchedule getSchedulesResult;

    /**
     * Gets the value of the getSchedulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSchedule }
     *     
     */
    public ArrayOfSchedule getGetSchedulesResult() {
        return getSchedulesResult;
    }

    /**
     * Sets the value of the getSchedulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSchedule }
     *     
     */
    public void setGetSchedulesResult(ArrayOfSchedule value) {
        this.getSchedulesResult = value;
    }

}
