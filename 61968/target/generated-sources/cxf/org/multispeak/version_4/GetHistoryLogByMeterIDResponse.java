
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
 *         &lt;element name="GetHistoryLogByMeterIDResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfHistoryLog" minOccurs="0"/>
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
    "getHistoryLogByMeterIDResult"
})
@XmlRootElement(name = "GetHistoryLogByMeterIDResponse")
public class GetHistoryLogByMeterIDResponse {

    @XmlElement(name = "GetHistoryLogByMeterIDResult")
    protected ArrayOfHistoryLog getHistoryLogByMeterIDResult;

    /**
     * Gets the value of the getHistoryLogByMeterIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoryLog }
     *     
     */
    public ArrayOfHistoryLog getGetHistoryLogByMeterIDResult() {
        return getHistoryLogByMeterIDResult;
    }

    /**
     * Sets the value of the getHistoryLogByMeterIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoryLog }
     *     
     */
    public void setGetHistoryLogByMeterIDResult(ArrayOfHistoryLog value) {
        this.getHistoryLogByMeterIDResult = value;
    }

}
