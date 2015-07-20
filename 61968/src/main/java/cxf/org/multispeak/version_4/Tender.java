
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tender">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="convenienceFee" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="utilityFee" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payableItemList" type="{http://www.multispeak.org/Version_4.1_Release}payableItemList" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.multispeak.org/Version_4.1_Release}responseCode" minOccurs="0"/>
 *         &lt;element name="financialTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tender", propOrder = {
    "amount",
    "convenienceFee",
    "utilityFee",
    "total",
    "authorizationCode",
    "payableItemList",
    "paymentMode",
    "responseCode",
    "financialTransactionID"
})
public class Tender
    extends MspObject
{

    protected Money amount;
    protected Money convenienceFee;
    protected Money utilityFee;
    protected Money total;
    protected String authorizationCode;
    protected PayableItemList payableItemList;
    protected String paymentMode;
    protected ResponseCode responseCode;
    protected String financialTransactionID;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * Gets the value of the convenienceFee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getConvenienceFee() {
        return convenienceFee;
    }

    /**
     * Sets the value of the convenienceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setConvenienceFee(Money value) {
        this.convenienceFee = value;
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
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotal(Money value) {
        this.total = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the payableItemList property.
     * 
     * @return
     *     possible object is
     *     {@link PayableItemList }
     *     
     */
    public PayableItemList getPayableItemList() {
        return payableItemList;
    }

    /**
     * Sets the value of the payableItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableItemList }
     *     
     */
    public void setPayableItemList(PayableItemList value) {
        this.payableItemList = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
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

    /**
     * Gets the value of the financialTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialTransactionID() {
        return financialTransactionID;
    }

    /**
     * Sets the value of the financialTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialTransactionID(String value) {
        this.financialTransactionID = value;
    }

}
