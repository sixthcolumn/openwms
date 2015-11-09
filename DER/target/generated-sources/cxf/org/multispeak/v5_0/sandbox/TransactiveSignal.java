
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is a signal that is designed to be sent as
 * 				part of a communication between Transactive Control nodes.
 * 			
 * 
 * <p>Java class for transactiveSignal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactiveSignal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TCSchemaVersion" type="{http://www.multispeak.org/V5.0/sandbox}TCSchemaVersion"/>
 *         &lt;element name="XMLCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TCSourceID" type="{http://www.multispeak.org/V5.0/sandbox}TCSourceID"/>
 *         &lt;element name="TCTargetID" type="{http://www.multispeak.org/V5.0/sandbox}TCTargetID"/>
 *         &lt;element name="messageChoice" type="{http://www.multispeak.org/V5.0/sandbox}messageChoice"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transactiveSignalStatus" use="required" type="{http://www.multispeak.org/V5.0/sandbox}transactiveSignalModeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactiveSignal", propOrder = {
    "tcSchemaVersion",
    "xmlCreationDateTime",
    "tcSourceID",
    "tcTargetID",
    "messageChoice"
})
public class TransactiveSignal {

    @XmlElement(name = "TCSchemaVersion", required = true)
    protected String tcSchemaVersion;
    @XmlElement(name = "XMLCreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xmlCreationDateTime;
    @XmlElement(name = "TCSourceID", required = true)
    protected String tcSourceID;
    @XmlElement(name = "TCTargetID", required = true)
    protected String tcTargetID;
    @XmlElement(required = true)
    protected MessageChoice messageChoice;
    @XmlAttribute(name = "transactiveSignalStatus", required = true)
    protected TransactiveSignalModeType transactiveSignalStatus;

    /**
     * Gets the value of the tcSchemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCSchemaVersion() {
        return tcSchemaVersion;
    }

    /**
     * Sets the value of the tcSchemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCSchemaVersion(String value) {
        this.tcSchemaVersion = value;
    }

    /**
     * Gets the value of the xmlCreationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXMLCreationDateTime() {
        return xmlCreationDateTime;
    }

    /**
     * Sets the value of the xmlCreationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXMLCreationDateTime(XMLGregorianCalendar value) {
        this.xmlCreationDateTime = value;
    }

    /**
     * Gets the value of the tcSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCSourceID() {
        return tcSourceID;
    }

    /**
     * Sets the value of the tcSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCSourceID(String value) {
        this.tcSourceID = value;
    }

    /**
     * Gets the value of the tcTargetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCTargetID() {
        return tcTargetID;
    }

    /**
     * Sets the value of the tcTargetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCTargetID(String value) {
        this.tcTargetID = value;
    }

    /**
     * Gets the value of the messageChoice property.
     * 
     * @return
     *     possible object is
     *     {@link MessageChoice }
     *     
     */
    public MessageChoice getMessageChoice() {
        return messageChoice;
    }

    /**
     * Sets the value of the messageChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageChoice }
     *     
     */
    public void setMessageChoice(MessageChoice value) {
        this.messageChoice = value;
    }

    /**
     * Gets the value of the transactiveSignalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiveSignalModeType }
     *     
     */
    public TransactiveSignalModeType getTransactiveSignalStatus() {
        return transactiveSignalStatus;
    }

    /**
     * Sets the value of the transactiveSignalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiveSignalModeType }
     *     
     */
    public void setTransactiveSignalStatus(TransactiveSignalModeType value) {
        this.transactiveSignalStatus = value;
    }

}
