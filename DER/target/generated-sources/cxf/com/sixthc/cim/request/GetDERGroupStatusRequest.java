
package com.sixthc.cim.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.getdergroupstatusmessage.GetDERGroupStatusRequestMessageType;


/**
 * <p>Java class for getDERGroupStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDERGroupStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payload" type="{http://iec.ch/TC57/2011/GetDERGroupStatusMessage}GetDERGroupStatusRequestMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDERGroupStatusRequest", propOrder = {
    "requestURL",
    "payload"
})
public class GetDERGroupStatusRequest {

    @XmlElement(required = true)
    protected String requestURL;
    @XmlElement(required = true)
    protected GetDERGroupStatusRequestMessageType payload;

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
     *     {@link GetDERGroupStatusRequestMessageType }
     *     
     */
    public GetDERGroupStatusRequestMessageType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDERGroupStatusRequestMessageType }
     *     
     */
    public void setPayload(GetDERGroupStatusRequestMessageType value) {
        this.payload = value;
    }

}
