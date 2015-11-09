
package ch.iec.tc57._2011.getdergroupstatusmessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.schema.message.HeaderType;


/**
 * <p>Java class for GetDERGroupStatusRequestMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupStatusRequestMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://iec.ch/TC57/2011/schema/message}HeaderType"/>
 *         &lt;element name="Request" type="{http://iec.ch/TC57/2011/GetDERGroupStatusMessage}GetDERGroupStatusRequestType"/>
 *         &lt;element name="Payload" type="{http://iec.ch/TC57/2011/GetDERGroupStatusMessage}DERGroupStatusPayloadType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupStatusRequestMessageType", propOrder = {
    "header",
    "request",
    "payload"
})
public class GetDERGroupStatusRequestMessageType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Request", required = true)
    protected GetDERGroupStatusRequestType request;
    @XmlElement(name = "Payload")
    protected DERGroupStatusPayloadType payload;

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
     *     {@link GetDERGroupStatusRequestType }
     *     
     */
    public GetDERGroupStatusRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDERGroupStatusRequestType }
     *     
     */
    public void setRequest(GetDERGroupStatusRequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupStatusPayloadType }
     *     
     */
    public DERGroupStatusPayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupStatusPayloadType }
     *     
     */
    public void setPayload(DERGroupStatusPayloadType value) {
        this.payload = value;
    }

}
