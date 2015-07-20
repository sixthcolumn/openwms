
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
 *         &lt;element name="GetAllConnectDisconnectEventsByReasonCodeResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfConnectDisconnectEvent" minOccurs="0"/>
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
    "getAllConnectDisconnectEventsByReasonCodeResult"
})
@XmlRootElement(name = "GetAllConnectDisconnectEventsByReasonCodeResponse")
public class GetAllConnectDisconnectEventsByReasonCodeResponse {

    @XmlElement(name = "GetAllConnectDisconnectEventsByReasonCodeResult")
    protected ArrayOfConnectDisconnectEvent getAllConnectDisconnectEventsByReasonCodeResult;

    /**
     * Gets the value of the getAllConnectDisconnectEventsByReasonCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConnectDisconnectEvent }
     *     
     */
    public ArrayOfConnectDisconnectEvent getGetAllConnectDisconnectEventsByReasonCodeResult() {
        return getAllConnectDisconnectEventsByReasonCodeResult;
    }

    /**
     * Sets the value of the getAllConnectDisconnectEventsByReasonCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConnectDisconnectEvent }
     *     
     */
    public void setGetAllConnectDisconnectEventsByReasonCodeResult(ArrayOfConnectDisconnectEvent value) {
        this.getAllConnectDisconnectEventsByReasonCodeResult = value;
    }

}