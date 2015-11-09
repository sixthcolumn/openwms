
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentUnlinkContainer;
import org.multispeak.v5_0.ws.request.MultiSpeakRequestMsgHeader;


/**
 * <p>Java class for ArrayOfAttachmentUnlinkContainerPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttachmentUnlinkContainerPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multiSpeakMsgHeader" type="{http://www.multispeak.org/V5.0/ws/request}MultiSpeakRequestMsgHeader"/>
 *         &lt;element name="arrayOfAttachmentUnlinkContainer" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfAttachmentUnlinkContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttachmentUnlinkContainerPayload", propOrder = {
    "address",
    "multiSpeakMsgHeader",
    "arrayOfAttachmentUnlinkContainer"
})
public class ArrayOfAttachmentUnlinkContainerPayload {

    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected MultiSpeakRequestMsgHeader multiSpeakMsgHeader;
    @XmlElement(required = true)
    protected ArrayOfAttachmentUnlinkContainer arrayOfAttachmentUnlinkContainer;

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
     * Gets the value of the arrayOfAttachmentUnlinkContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentUnlinkContainer }
     *     
     */
    public ArrayOfAttachmentUnlinkContainer getArrayOfAttachmentUnlinkContainer() {
        return arrayOfAttachmentUnlinkContainer;
    }

    /**
     * Sets the value of the arrayOfAttachmentUnlinkContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentUnlinkContainer }
     *     
     */
    public void setArrayOfAttachmentUnlinkContainer(ArrayOfAttachmentUnlinkContainer value) {
        this.arrayOfAttachmentUnlinkContainer = value;
    }

}
