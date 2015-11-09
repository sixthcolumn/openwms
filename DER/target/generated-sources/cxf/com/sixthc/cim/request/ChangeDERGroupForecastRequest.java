
package com.sixthc.cim.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.dergroupforecastmessage.DERGroupForecastRequestMessageType;


/**
 * <p>Java class for changeDERGroupForecastRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeDERGroupForecastRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payload" type="{http://iec.ch/TC57/2011/DERGroupForecastMessage}DERGroupForecastRequestMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeDERGroupForecastRequest", propOrder = {
    "requestURL",
    "payload"
})
public class ChangeDERGroupForecastRequest {

    @XmlElement(required = true)
    protected String requestURL;
    @XmlElement(required = true)
    protected DERGroupForecastRequestMessageType payload;

    /**
     * Gets the value of the requestURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * Sets the value of the requestURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestURL(String value) {
        this.requestURL = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupForecastRequestMessageType }
     *     
     */
    public DERGroupForecastRequestMessageType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupForecastRequestMessageType }
     *     
     */
    public void setPayload(DERGroupForecastRequestMessageType value) {
        this.payload = value;
    }

}
