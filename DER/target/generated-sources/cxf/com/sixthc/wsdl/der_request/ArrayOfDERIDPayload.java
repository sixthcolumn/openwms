
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERID;
import org.multispeak.v5_0.ws.request.MultiSpeakRequestMsgHeader;


/**
 * <p>Java class for ArrayOfDERIDPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDERIDPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multiSpeakMsgHeader" type="{http://www.multispeak.org/V5.0/ws/request}MultiSpeakRequestMsgHeader"/>
 *         &lt;element name="ArrayOfDERID" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERID"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="derGroup" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDERIDPayload", propOrder = {
    "address",
    "multiSpeakMsgHeader",
    "arrayOfDERID",
    "responseURL",
    "transactionID",
    "derGroup"
})
public class ArrayOfDERIDPayload {

    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected MultiSpeakRequestMsgHeader multiSpeakMsgHeader;
    @XmlElement(name = "ArrayOfDERID", required = true)
    protected ArrayOfDERID arrayOfDERID;
    @XmlElement(required = true)
    protected String responseURL;
    @XmlElement(required = true)
    protected String transactionID;
    @XmlElement(required = true)
    protected ObjectID derGroup;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the multiSpeakMsgHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSpeakRequestMsgHeader }
     *     
     */
    public MultiSpeakRequestMsgHeader getMultiSpeakMsgHeader() {
        return multiSpeakMsgHeader;
    }

    /**
     * Sets the value of the multiSpeakMsgHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSpeakRequestMsgHeader }
     *     
     */
    public void setMultiSpeakMsgHeader(MultiSpeakRequestMsgHeader value) {
        this.multiSpeakMsgHeader = value;
    }

    /**
     * Gets the value of the arrayOfDERID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERID }
     *     
     */
    public ArrayOfDERID getArrayOfDERID() {
        return arrayOfDERID;
    }

    /**
     * Sets the value of the arrayOfDERID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERID }
     *     
     */
    public void setArrayOfDERID(ArrayOfDERID value) {
        this.arrayOfDERID = value;
    }

    /**
     * Gets the value of the responseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseURL() {
        return responseURL;
    }

    /**
     * Sets the value of the responseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseURL(String value) {
        this.responseURL = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the derGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getDerGroup() {
        return derGroup;
    }

    /**
     * Sets the value of the derGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setDerGroup(ObjectID value) {
        this.derGroup = value;
    }

}
