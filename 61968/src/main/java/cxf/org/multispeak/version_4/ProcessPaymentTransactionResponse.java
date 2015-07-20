
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ProcessPaymentTransactionResult" type="{http://www.multispeak.org/Version_4.1_Release}paymentTransactionList" minOccurs="0"/>
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
    "processPaymentTransactionResult"
})
@XmlRootElement(name = "ProcessPaymentTransactionResponse")
public class ProcessPaymentTransactionResponse {

    @XmlElement(name = "ProcessPaymentTransactionResult")
    protected PaymentTransactionList processPaymentTransactionResult;

    /**
     * Gets the value of the processPaymentTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionList }
     *     
     */
    public PaymentTransactionList getProcessPaymentTransactionResult() {
        return processPaymentTransactionResult;
    }

    /**
     * Sets the value of the processPaymentTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionList }
     *     
     */
    public void setProcessPaymentTransactionResult(PaymentTransactionList value) {
        this.processPaymentTransactionResult = value;
    }

}
