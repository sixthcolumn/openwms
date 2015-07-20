
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
 *         &lt;element name="GetHistoryLogsByMeterIDAndEventCodeResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfHistoryLog" minOccurs="0"/>
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
    "getHistoryLogsByMeterIDAndEventCodeResult"
})
@XmlRootElement(name = "GetHistoryLogsByMeterIDAndEventCodeResponse")
public class GetHistoryLogsByMeterIDAndEventCodeResponse {

    @XmlElement(name = "GetHistoryLogsByMeterIDAndEventCodeResult")
    protected ArrayOfHistoryLog getHistoryLogsByMeterIDAndEventCodeResult;

    /**
     * Gets the value of the getHistoryLogsByMeterIDAndEventCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoryLog }
     *     
     */
    public ArrayOfHistoryLog getGetHistoryLogsByMeterIDAndEventCodeResult() {
        return getHistoryLogsByMeterIDAndEventCodeResult;
    }

    /**
     * Sets the value of the getHistoryLogsByMeterIDAndEventCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoryLog }
     *     
     */
    public void setGetHistoryLogsByMeterIDAndEventCodeResult(ArrayOfHistoryLog value) {
        this.getHistoryLogsByMeterIDAndEventCodeResult = value;
    }

}
