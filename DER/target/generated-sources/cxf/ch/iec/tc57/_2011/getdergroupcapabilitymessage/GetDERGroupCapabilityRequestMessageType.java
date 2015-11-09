
package ch.iec.tc57._2011.getdergroupcapabilitymessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.schema.message.HeaderType;


/**
 * <p>Java class for GetDERGroupCapabilityRequestMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupCapabilityRequestMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://iec.ch/TC57/2011/schema/message}HeaderType"/>
 *         &lt;element name="Request" type="{http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage}GetDERGroupCapabilityRequestType"/>
 *         &lt;element name="Payload" type="{http://iec.ch/TC57/2011/GetDERGroupCapabilityMessage}GetDERGroupCapabilityPayloadType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupCapabilityRequestMessageType", propOrder = {
    "header",
    "request",
    "payload"
})
public class GetDERGroupCapabilityRequestMessageType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Request", required = true)
    protected GetDERGroupCapabilityRequestType request;
    @XmlElement(name = "Payload")
    protected GetDERGroupCapabilityPayloadType payload;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetDERGroupCapabilityRequestType }
     *     
     */
    public GetDERGroupCapabilityRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDERGroupCapabilityRequestType }
     *     
     */
    public void setRequest(GetDERGroupCapabilityRequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link GetDERGroupCapabilityPayloadType }
     *     
     */
    public GetDERGroupCapabilityPayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDERGroupCapabilityPayloadType }
     *     
     */
    public void setPayload(GetDERGroupCapabilityPayloadType value) {
        this.payload = value;
    }

}
