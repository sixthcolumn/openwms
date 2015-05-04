
package org.ucaiug.osgug.ns._2010._06.wsoadr.schema.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.ucaiug.osgug._2010._06.schema.header.MessageHeaderType;
import org.ucaiug.osgug._2010._06.schema.reply.ReplyType;
import org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout.DREventOptOut;


/**
 * <p>Java class for MessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://osgug.ucaiug.org/2010/06/schema/header}MessageHeaderType"/>
 *         &lt;element name="Reply" type="{http://osgug.ucaiug.org/2010/06/schema/reply}ReplyType" minOccurs="0"/>
 *         &lt;element name="Payload" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}DREventOptOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
    "header",
    "reply",
    "payload"
})
public class MessageType {

    @XmlElement(name = "Header", required = true)
    protected MessageHeaderType header;
    @XmlElement(name = "Reply")
    protected ReplyType reply;
    @XmlElement(name = "Payload")
    protected DREventOptOut payload;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderType }
     *     
     */
    public MessageHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderType }
     *     
     */
    public void setHeader(MessageHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the reply property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyType }
     *     
     */
    public ReplyType getReply() {
        return reply;
    }

    /**
     * Sets the value of the reply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyType }
     *     
     */
    public void setReply(ReplyType value) {
        this.reply = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link DREventOptOut }
     *     
     */
    public DREventOptOut getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link DREventOptOut }
     *     
     */
    public void setPayload(DREventOptOut value) {
        this.payload = value;
    }

}
