
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
 *         &lt;element name="CommitPaymentTransactionResult" type="{http://www.multispeak.org/Version_4.1_Release}paymentTransactionList" minOccurs="0"/>
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
    "commitPaymentTransactionResult"
})
@XmlRootElement(name = "CommitPaymentTransactionResponse")
public class CommitPaymentTransactionResponse {

    @XmlElement(name = "CommitPaymentTransactionResult")
    protected PaymentTransactionList commitPaymentTransactionResult;

    /**
     * Gets the value of the commitPaymentTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionList }
     *     
     */
    public PaymentTransactionList getCommitPaymentTransactionResult() {
        return commitPaymentTransactionResult;
    }

    /**
     * Sets the value of the commitPaymentTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionList }
     *     
     */
    public void setCommitPaymentTransactionResult(PaymentTransactionList value) {
        this.commitPaymentTransactionResult = value;
    }

}
