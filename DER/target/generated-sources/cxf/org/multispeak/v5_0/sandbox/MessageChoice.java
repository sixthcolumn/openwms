
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="transactiveIncentiveSignal" type="{http://www.multispeak.org/V5.0/sandbox}transactiveIncentiveSignal"/>
 *         &lt;element name="transactiveFeedbackSignal" type="{http://www.multispeak.org/V5.0/sandbox}transactiveFeedbackSignal"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageChoice", propOrder = {
    "transactiveIncentiveSignal",
    "transactiveFeedbackSignal"
})
public class MessageChoice {

    protected TransactiveIncentiveSignal transactiveIncentiveSignal;
    protected TransactiveFeedbackSignal transactiveFeedbackSignal;

    /**
     * Gets the value of the transactiveIncentiveSignal property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiveIncentiveSignal }
     *     
     */
    public TransactiveIncentiveSignal getTransactiveIncentiveSignal() {
        return transactiveIncentiveSignal;
    }

    /**
     * Sets the value of the transactiveIncentiveSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiveIncentiveSignal }
     *     
     */
    public void setTransactiveIncentiveSignal(TransactiveIncentiveSignal value) {
        this.transactiveIncentiveSignal = value;
    }

    /**
     * Gets the value of the transactiveFeedbackSignal property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiveFeedbackSignal }
     *     
     */
    public TransactiveFeedbackSignal getTransactiveFeedbackSignal() {
        return transactiveFeedbackSignal;
    }

    /**
     * Sets the value of the transactiveFeedbackSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiveFeedbackSignal }
     *     
     */
    public void setTransactiveFeedbackSignal(TransactiveFeedbackSignal value) {
        this.transactiveFeedbackSignal = value;
    }

}
