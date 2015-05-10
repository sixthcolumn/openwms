
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paymentExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payableItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utilityFee" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="extendedTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.multispeak.org/Version_4.1_Release}responseCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentExtension", propOrder = {
    "accountNumber",
    "typeService",
    "payableItemID",
    "utilityFee",
    "extendedTo",
    "responseCode"
})
public class PaymentExtension {

    protected String accountNumber;
    protected String typeService;
    protected String payableItemID;
    protected Money utilityFee;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar extendedTo;
    protected ResponseCode responseCode;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the typeService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeService() {
        return typeService;
    }

    /**
     * Sets the value of the typeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeService(String value) {
        this.typeService = value;
    }

    /**
     * Gets the value of the payableItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayableItemID() {
        return payableItemID;
    }

    /**
     * Sets the value of the payableItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayableItemID(String value) {
        this.payableItemID = value;
    }

    /**
     * Gets the value of the utilityFee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUtilityFee() {
        return utilityFee;
    }

    /**
     * Sets the value of the utilityFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUtilityFee(Money value) {
        this.utilityFee = value;
    }

    /**
     * Gets the value of the extendedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExtendedTo() {
        return extendedTo;
    }

    /**
     * Sets the value of the extendedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExtendedTo(XMLGregorianCalendar value) {
        this.extendedTo = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCode }
     *     
     */
    public ResponseCode getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCode }
     *     
     */
    public void setResponseCode(ResponseCode value) {
        this.responseCode = value;
    }

}
