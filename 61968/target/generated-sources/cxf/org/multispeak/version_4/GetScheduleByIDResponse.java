
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
 *         &lt;element name="GetScheduleByIDResult" type="{http://www.multispeak.org/Version_4.1_Release}schedule" minOccurs="0"/>
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
    "getScheduleByIDResult"
})
@XmlRootElement(name = "GetScheduleByIDResponse")
public class GetScheduleByIDResponse {

    @XmlElement(name = "GetScheduleByIDResult")
    protected Schedule getScheduleByIDResult;

    /**
     * Gets the value of the getScheduleByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getGetScheduleByIDResult() {
        return getScheduleByIDResult;
    }

    /**
     * Sets the value of the getScheduleByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setGetScheduleByIDResult(Schedule value) {
        this.getScheduleByIDResult = value;
    }

}
