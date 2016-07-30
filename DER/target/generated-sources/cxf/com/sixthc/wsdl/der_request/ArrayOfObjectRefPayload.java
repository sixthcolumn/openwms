
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfObjectRef;
import org.multispeak.v5_0.ws.request.MultiSpeakRequestMsgHeader;


/**
 * <p>Java class for ArrayOfObjectRefPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfObjectRefPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multiSpeakMsgHeader" type="{http://www.multispeak.org/V5.0/ws/request}MultiSpeakRequestMsgHeader"/>
 *         &lt;element name="ArrayOfObjectRef" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfObjectRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjectRefPayload", propOrder = {
    "address",
    "multiSpeakMsgHeader",
    "arrayOfObjectRef"
})
public class ArrayOfObjectRefPayload {

    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected MultiSpeakRequestMsgHeader multiSpeakMsgHeader;
    @XmlElement(name = "ArrayOfObjectRef", required = true)
    protected ArrayOfObjectRef arrayOfObjectRef;

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
     * Gets the value of the arrayOfObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef }
     *     
     */
    public ArrayOfObjectRef getArrayOfObjectRef() {
        return arrayOfObjectRef;
    }

    /**
     * Sets the value of the arrayOfObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef }
     *     
     */
    public void setArrayOfObjectRef(ArrayOfObjectRef value) {
        this.arrayOfObjectRef = value;
    }

}
