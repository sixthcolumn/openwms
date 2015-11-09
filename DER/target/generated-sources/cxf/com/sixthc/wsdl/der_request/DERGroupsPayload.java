
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroup;
import org.multispeak.v5_0.ws.request.MultiSpeakRequestMsgHeader;


/**
 * <p>Java class for DERGroupsPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupsPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multiSpeakMsgHeader" type="{http://www.multispeak.org/V5.0/ws/request}MultiSpeakRequestMsgHeader" minOccurs="0"/>
 *         &lt;element name="ArrayOfDERGroup" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupsPayload", propOrder = {
    "address",
    "responseURL",
    "transactionID",
    "multiSpeakMsgHeader",
    "arrayOfDERGroup"
})
public class DERGroupsPayload {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(required = true)
    protected String responseURL;
    @XmlElement(required = true)
    protected String transactionID;
    protected MultiSpeakRequestMsgHeader multiSpeakMsgHeader;
    @XmlElement(name = "ArrayOfDERGroup")
    protected ArrayOfDERGroup arrayOfDERGroup;

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
     * Gets the value of the arrayOfDERGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroup }
     *     
     */
    public ArrayOfDERGroup getArrayOfDERGroup() {
        return arrayOfDERGroup;
    }

    /**
     * Sets the value of the arrayOfDERGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroup }
     *     
     */
    public void setArrayOfDERGroup(ArrayOfDERGroup value) {
        this.arrayOfDERGroup = value;
    }

}
