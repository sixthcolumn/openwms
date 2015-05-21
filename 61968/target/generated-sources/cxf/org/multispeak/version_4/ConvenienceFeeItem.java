
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convenienceFeeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convenienceFeeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convenienceFee" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="utilityFee" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
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
@XmlType(name = "convenienceFeeItem", propOrder = {
    "transactionID",
    "convenienceFee",
    "utilityFee",
    "responseCode"
})
public class ConvenienceFeeItem {

    protected String transactionID;
    protected Money convenienceFee;
    protected Money utilityFee;
    protected ResponseCode responseCode;

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
