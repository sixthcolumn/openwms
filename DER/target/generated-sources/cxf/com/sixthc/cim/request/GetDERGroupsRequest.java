
package com.sixthc.cim.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.getdergroupmessage.GetDERGroupRequestMessageType;


/**
 * <p>Java class for getDERGroupsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDERGroupsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payload" type="{http://iec.ch/TC57/2011/GetDERGroupMessage}GetDERGroupRequestMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDERGroupsRequest", propOrder = {
    "requestURL",
    "payload"
})
public class GetDERGroupsRequest {

    @XmlElement(required = true)
    protected String requestURL;
    @XmlElement(required = true)
    protected GetDERGroupRequestMessageType payload;

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
     *     {@link GetDERGroupRequestMessageType }
     *     
     */
    public GetDERGroupRequestMessageType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDERGroupRequestMessageType }
     *     
     */
    public void setPayload(GetDERGroupRequestMessageType value) {
        this.payload = value;
    }

}
