
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardPayment" type="{http://www.multispeak.org/Version_4.1_Release}creditCardPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eCheckPayment" type="{http://www.multispeak.org/Version_4.1_Release}eCheckPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="achPayment" type="{http://www.multispeak.org/Version_4.1_Release}achPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cashPayment" type="{http://www.multispeak.org/Version_4.1_Release}cashPayment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentTransaction", propOrder = {
    "accountNumber",
    "typeService",
    "creditCardPayment",
    "eCheckPayment",
    "achPayment",
    "cashPayment"
})
public class PaymentTransaction {

    protected String accountNumber;
    protected String typeService;
    protected List<CreditCardPayment> creditCardPayment;
    protected List<ECheckPayment> eCheckPayment;
    protected List<AchPayment> achPayment;
    protected List<CashPayment> cashPayment;

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
     * Gets the value of the creditCardPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardPayment }
     * 
     * 
     */
    public List<CreditCardPayment> getCreditCardPayment() {
        if (creditCardPayment == null) {
            creditCardPayment = new ArrayList<CreditCardPayment>();
        }
        return this.creditCardPayment;
    }

    /**
     * Gets the value of the eCheckPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eCheckPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECheckPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECheckPayment }
     * 
     * 
     */
    public List<ECheckPayment> getECheckPayment() {
        if (eCheckPayment == null) {
            eCheckPayment = new ArrayList<ECheckPayment>();
        }
        return this.eCheckPayment;
    }

    /**
     * Gets the value of the achPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAchPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AchPayment }
     * 
     * 
     */
    public List<AchPayment> getAchPayment() {
        if (achPayment == null) {
            achPayment = new ArrayList<AchPayment>();
        }
        return this.achPayment;
    }

    /**
     * Gets the value of the cashPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashPayment }
     * 
     * 
     */
    public List<CashPayment> getCashPayment() {
        if (cashPayment == null) {
            cashPayment = new ArrayList<CashPayment>();
        }
        return this.cashPayment;
    }

}
