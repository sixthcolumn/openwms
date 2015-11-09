
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupDispatchRequest;
import org.multispeak.v5_0.ws.request.MultiSpeakRequestMsgHeader;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multSpeakMsgHeader" type="{http://www.multispeak.org/V5.0/ws/request}MultiSpeakRequestMsgHeader"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrayOfDERGroupDispatchRequest" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroupDispatchRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "address",
    "multSpeakMsgHeader",
    "responseURL",
    "transactionID",
    "arrayOfDERGroupDispatchRequest"
})
@XmlRootElement(name = "InitiateDERGroupDispatchRequests")
public class InitiateDERGroupDispatchRequests {

    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected MultiSpeakRequestMsgHeader multSpeakMsgHeader;
    @XmlElement(required = true)
    protected String responseURL;
    @XmlElement(required = true)
    protected String transactionID;
    @XmlElement(required = true)
    protected ArrayOfDERGroupDispatchRequest arrayOfDERGroupDispatchRequest;

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
     * Gets the value of the multSpeakMsgHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSpeakRequestMsgHeader }
     *     
     */
    public MultiSpeakRequestMsgHeader getMultSpeakMsgHeader() {
        return multSpeakMsgHeader;
    }

    /**
     * Sets the value of the multSpeakMsgHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSpeakRequestMsgHeader }
     *     
     */
    public void setMultSpeakMsgHeader(MultiSpeakRequestMsgHeader value) {
        this.multSpeakMsgHeader = value;
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
     * Gets the value of the arrayOfDERGroupDispatchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroupDispatchRequest }
     *     
     */
    public ArrayOfDERGroupDispatchRequest getArrayOfDERGroupDispatchRequest() {
        return arrayOfDERGroupDispatchRequest;
    }

    /**
     * Sets the value of the arrayOfDERGroupDispatchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroupDispatchRequest }
     *     
     */
    public void setArrayOfDERGroupDispatchRequest(ArrayOfDERGroupDispatchRequest value) {
        this.arrayOfDERGroupDispatchRequest = value;
    }

}
