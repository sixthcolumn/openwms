
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPhoneNumber" minOccurs="0"/>
 *         &lt;element name="eMailList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfEMailAddress" minOccurs="0"/>
 *         &lt;element name="addressList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAddressItem" minOccurs="0"/>
 *         &lt;element name="otherContactInformation" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOtherContactItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfo", propOrder = {
    "phoneList",
    "eMailList",
    "addressList",
    "otherContactInformation"
})
public class ContactInfo {

    protected ArrayOfPhoneNumber phoneList;
    protected ArrayOfEMailAddress eMailList;
    protected ArrayOfAddressItem addressList;
    protected ArrayOfOtherContactItem otherContactInformation;

    /**
     * Gets the value of the phoneList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhoneNumber }
     *     
     */
    public ArrayOfPhoneNumber getPhoneList() {
        return phoneList;
    }

    /**
     * Sets the value of the phoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhoneNumber }
     *     
     */
    public void setPhoneList(ArrayOfPhoneNumber value) {
        this.phoneList = value;
    }

    /**
     * Gets the value of the eMailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEMailAddress }
     *     
     */
    public ArrayOfEMailAddress getEMailList() {
        return eMailList;
    }

    /**
     * Sets the value of the eMailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEMailAddress }
     *     
     */
    public void setEMailList(ArrayOfEMailAddress value) {
        this.eMailList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressItem }
     *     
     */
    public ArrayOfAddressItem getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressItem }
     *     
     */
    public void setAddressList(ArrayOfAddressItem value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the otherContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherContactItem }
     *     
     */
    public ArrayOfOtherContactItem getOtherContactInformation() {
        return otherContactInformation;
    }

    /**
     * Sets the value of the otherContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherContactItem }
     *     
     */
    public void setOtherContactInformation(ArrayOfOtherContactItem value) {
        this.otherContactInformation = value;
    }

}
