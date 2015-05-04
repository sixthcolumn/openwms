
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inHomeDisplayMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inHomeDisplayMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="inHomeDisplayID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgLineList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMsgLine" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
 *         &lt;element name="priorityOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="isAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inHomeDisplayMessage", propOrder = {
    "inHomeDisplayID",
    "msgLineList",
    "duration",
    "priorityOrder",
    "isAlert",
    "alertLevel",
    "reason"
})
public class InHomeDisplayMessage
    extends MspObject
{

    protected String inHomeDisplayID;
    protected ArrayOfMsgLine msgLineList;
    protected Duration duration;
    protected BigInteger priorityOrder;
    protected Boolean isAlert;
    protected String alertLevel;
    protected String reason;

    /**
     * Gets the value of the inHomeDisplayID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHomeDisplayID() {
        return inHomeDisplayID;
    }

    /**
     * Sets the value of the inHomeDisplayID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHomeDisplayID(String value) {
        this.inHomeDisplayID = value;
    }

    /**
     * Gets the value of the msgLineList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMsgLine }
     *     
     */
    public ArrayOfMsgLine getMsgLineList() {
        return msgLineList;
    }

    /**
     * Sets the value of the msgLineList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMsgLine }
     *     
     */
    public void setMsgLineList(ArrayOfMsgLine value) {
        this.msgLineList = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the priorityOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityOrder() {
        return priorityOrder;
    }

    /**
     * Sets the value of the priorityOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityOrder(BigInteger value) {
        this.priorityOrder = value;
    }

    /**
     * Gets the value of the isAlert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlert() {
        return isAlert;
    }

    /**
     * Sets the value of the isAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlert(Boolean value) {
        this.isAlert = value;
    }

    /**
     * Gets the value of the alertLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertLevel() {
        return alertLevel;
    }

    /**
     * Sets the value of the alertLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertLevel(String value) {
        this.alertLevel = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
