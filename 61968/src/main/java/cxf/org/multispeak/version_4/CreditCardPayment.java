
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCardPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCardPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditCardInfo" type="{http://www.multispeak.org/Version_4.1_Release}creditCardInfo" minOccurs="0"/>
 *         &lt;element name="tender" type="{http://www.multispeak.org/Version_4.1_Release}tender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardPayment", propOrder = {
    "creditCardInfo",
    "tender"
})
public class CreditCardPayment {

    protected CreditCardInfo creditCardInfo;
    protected Tender tender;

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfo }
     *     
     */
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfo }
     *     
     */
    public void setCreditCardInfo(CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the tender property.
     * 
     * @return
     *     possible object is
     *     {@link Tender }
     *     
     */
    public Tender getTender() {
        return tender;
    }

    /**
     * Sets the value of the tender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tender }
     *     
     */
    public void setTender(Tender value) {
        this.tender = value;
    }

}
