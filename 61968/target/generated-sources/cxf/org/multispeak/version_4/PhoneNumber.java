
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://www.multispeak.org/Version_4.1_Release}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="phoneType" type="{http://www.multispeak.org/Version_4.1_Release}phoneType" minOccurs="0"/>
 *         &lt;element name="prorityOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneNumber", propOrder = {
    "phone",
    "phoneType",
    "prorityOrder"
})
public class PhoneNumber {

    protected TelephoneNumber phone;
    protected PhoneType phoneType;
    protected BigInteger prorityOrder;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setPhone(TelephoneNumber value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhoneType(PhoneType value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the prorityOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProrityOrder() {
        return prorityOrder;
    }

    /**
     * Sets the value of the prorityOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProrityOrder(BigInteger value) {
        this.prorityOrder = value;
    }

}
