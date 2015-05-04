
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for billingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/Version_4.1_Release}serviceType" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="ppmLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cisBillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorBalance" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="creditCharge" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="debitCharge" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="chargeItemList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfChargeItem" minOccurs="0"/>
 *         &lt;element name="CISBalanceAfterBilling" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
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
@XmlType(name = "billingDetail", propOrder = {
    "accountNumber",
    "serviceType",
    "serviceLocationID",
    "meterID",
    "ppmLocationID",
    "revenueMonth",
    "revenueYear",
    "cisBillDate",
    "billingCycle",
    "priorBalance",
    "payment",
    "creditCharge",
    "debitCharge",
    "chargeItemList",
    "cisBalanceAfterBilling"
})
public class BillingDetail
    extends MspObject
{

    protected String accountNumber;
    protected ServiceType serviceType;
    protected String serviceLocationID;
    protected MeterID meterID;
    protected String ppmLocationID;
    protected String revenueMonth;
    protected String revenueYear;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cisBillDate;
    protected String billingCycle;
    protected Money priorBalance;
    protected Money payment;
    protected Money creditCharge;
    protected Money debitCharge;
    protected ArrayOfChargeItem chargeItemList;
    @XmlElement(name = "CISBalanceAfterBilling")
    protected Money cisBalanceAfterBilling;

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
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the ppmLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpmLocationID() {
        return ppmLocationID;
    }

    /**
     * Sets the value of the ppmLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpmLocationID(String value) {
        this.ppmLocationID = value;
    }

    /**
     * Gets the value of the revenueMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueMonth() {
        return revenueMonth;
    }

    /**
     * Sets the value of the revenueMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueMonth(String value) {
        this.revenueMonth = value;
    }

    /**
     * Gets the value of the revenueYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueYear() {
        return revenueYear;
    }

    /**
     * Sets the value of the revenueYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueYear(String value) {
        this.revenueYear = value;
    }

    /**
     * Gets the value of the cisBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCisBillDate() {
        return cisBillDate;
    }

    /**
     * Sets the value of the cisBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCisBillDate(XMLGregorianCalendar value) {
        this.cisBillDate = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycle(String value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the priorBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPriorBalance() {
        return priorBalance;
    }

    /**
     * Sets the value of the priorBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPriorBalance(Money value) {
        this.priorBalance = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPayment(Money value) {
        this.payment = value;
    }

    /**
     * Gets the value of the creditCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditCharge() {
        return creditCharge;
    }

    /**
     * Sets the value of the creditCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditCharge(Money value) {
        this.creditCharge = value;
    }

    /**
     * Gets the value of the debitCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDebitCharge() {
        return debitCharge;
    }

    /**
     * Sets the value of the debitCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDebitCharge(Money value) {
        this.debitCharge = value;
    }

    /**
     * Gets the value of the chargeItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChargeItem }
     *     
     */
    public ArrayOfChargeItem getChargeItemList() {
        return chargeItemList;
    }

    /**
     * Sets the value of the chargeItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChargeItem }
     *     
     */
    public void setChargeItemList(ArrayOfChargeItem value) {
        this.chargeItemList = value;
    }

    /**
     * Gets the value of the cisBalanceAfterBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCISBalanceAfterBilling() {
        return cisBalanceAfterBilling;
    }

    /**
     * Sets the value of the cisBalanceAfterBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCISBalanceAfterBilling(Money value) {
        this.cisBalanceAfterBilling = value;
    }

}
