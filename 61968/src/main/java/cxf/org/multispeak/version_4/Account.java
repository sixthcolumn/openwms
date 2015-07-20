
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountsReceivable" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAcctsReceivable" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastPaymentAmount" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="billDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculatedCurrentBillAmount" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="calculatedCurrentBillDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calculatedCurrentBillReadings" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterReading" minOccurs="0"/>
 *         &lt;element name="lastBillAmount" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="calculatedUsedYesterday" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="serviceLocations" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceLocation" minOccurs="0"/>
 *         &lt;element name="serviceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder" minOccurs="0"/>
 *         &lt;element name="workList" type="{http://www.multispeak.org/Version_4.1_Release}workList" minOccurs="0"/>
 *         &lt;element name="workOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWorkOrder" minOccurs="0"/>
 *         &lt;element name="mantenanceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMaintenanceOrder" minOccurs="0"/>
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
@XmlType(name = "account", propOrder = {
    "customerID",
    "accountsReceivable",
    "billingCycle",
    "budgetBill",
    "paymentDueDate",
    "lastPaymentDate",
    "lastPaymentAmount",
    "billDate",
    "shutOffDate",
    "isPrePay",
    "billingTerms",
    "calculatedCurrentBillAmount",
    "calculatedCurrentBillDateTime",
    "calculatedCurrentBillReadings",
    "lastBillAmount",
    "calculatedUsedYesterday",
    "serviceLocations",
    "serviceOrderList",
    "workList",
    "workOrderList",
    "mantenanceOrderList"
})
public class Account
    extends MspObject
{

    protected String customerID;
    protected ArrayOfAcctsReceivable accountsReceivable;
    protected String billingCycle;
    protected String budgetBill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;
    protected Money lastPaymentAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shutOffDate;
    protected Boolean isPrePay;
    protected String billingTerms;
    protected Money calculatedCurrentBillAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedCurrentBillDateTime;
    protected ArrayOfMeterReading calculatedCurrentBillReadings;
    protected Money lastBillAmount;
    protected Money calculatedUsedYesterday;
    protected ArrayOfServiceLocation serviceLocations;
    protected ArrayOfServiceOrder serviceOrderList;
    protected WorkList workList;
    protected ArrayOfWorkOrder workOrderList;
    protected ArrayOfMaintenanceOrder mantenanceOrderList;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAcctsReceivable }
     *     
     */
    public ArrayOfAcctsReceivable getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAcctsReceivable }
     *     
     */
    public void setAccountsReceivable(ArrayOfAcctsReceivable value) {
        this.accountsReceivable = value;
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
     * Gets the value of the budgetBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetBill() {
        return budgetBill;
    }

    /**
     * Sets the value of the budgetBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetBill(String value) {
        this.budgetBill = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDueDate(XMLGregorianCalendar value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the lastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLastPaymentAmount(Money value) {
        this.lastPaymentAmount = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the shutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShutOffDate() {
        return shutOffDate;
    }

    /**
     * Sets the value of the shutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShutOffDate(XMLGregorianCalendar value) {
        this.shutOffDate = value;
    }

    /**
     * Gets the value of the isPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrePay() {
        return isPrePay;
    }

    /**
     * Sets the value of the isPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrePay(Boolean value) {
        this.isPrePay = value;
    }

    /**
     * Gets the value of the billingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingTerms() {
        return billingTerms;
    }

    /**
     * Sets the value of the billingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingTerms(String value) {
        this.billingTerms = value;
    }

    /**
     * Gets the value of the calculatedCurrentBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCalculatedCurrentBillAmount() {
        return calculatedCurrentBillAmount;
    }

    /**
     * Sets the value of the calculatedCurrentBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCalculatedCurrentBillAmount(Money value) {
        this.calculatedCurrentBillAmount = value;
    }

    /**
     * Gets the value of the calculatedCurrentBillDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedCurrentBillDateTime() {
        return calculatedCurrentBillDateTime;
    }

    /**
     * Sets the value of the calculatedCurrentBillDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedCurrentBillDateTime(XMLGregorianCalendar value) {
        this.calculatedCurrentBillDateTime = value;
    }

    /**
     * Gets the value of the calculatedCurrentBillReadings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterReading }
     *     
     */
    public ArrayOfMeterReading getCalculatedCurrentBillReadings() {
        return calculatedCurrentBillReadings;
    }

    /**
     * Sets the value of the calculatedCurrentBillReadings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterReading }
     *     
     */
    public void setCalculatedCurrentBillReadings(ArrayOfMeterReading value) {
        this.calculatedCurrentBillReadings = value;
    }

    /**
     * Gets the value of the lastBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLastBillAmount() {
        return lastBillAmount;
    }

    /**
     * Sets the value of the lastBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLastBillAmount(Money value) {
        this.lastBillAmount = value;
    }

    /**
     * Gets the value of the calculatedUsedYesterday property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCalculatedUsedYesterday() {
        return calculatedUsedYesterday;
    }

    /**
     * Sets the value of the calculatedUsedYesterday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCalculatedUsedYesterday(Money value) {
        this.calculatedUsedYesterday = value;
    }

    /**
     * Gets the value of the serviceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocation }
     *     
     */
    public ArrayOfServiceLocation getServiceLocations() {
        return serviceLocations;
    }

    /**
     * Sets the value of the serviceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocation }
     *     
     */
    public void setServiceLocations(ArrayOfServiceLocation value) {
        this.serviceLocations = value;
    }

    /**
     * Gets the value of the serviceOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOrder }
     *     
     */
    public ArrayOfServiceOrder getServiceOrderList() {
        return serviceOrderList;
    }

    /**
     * Sets the value of the serviceOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOrder }
     *     
     */
    public void setServiceOrderList(ArrayOfServiceOrder value) {
        this.serviceOrderList = value;
    }

    /**
     * Gets the value of the workList property.
     * 
     * @return
     *     possible object is
     *     {@link WorkList }
     *     
     */
    public WorkList getWorkList() {
        return workList;
    }

    /**
     * Sets the value of the workList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkList }
     *     
     */
    public void setWorkList(WorkList value) {
        this.workList = value;
    }

    /**
     * Gets the value of the workOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkOrder }
     *     
     */
    public ArrayOfWorkOrder getWorkOrderList() {
        return workOrderList;
    }

    /**
     * Sets the value of the workOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkOrder }
     *     
     */
    public void setWorkOrderList(ArrayOfWorkOrder value) {
        this.workOrderList = value;
    }

    /**
     * Gets the value of the mantenanceOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaintenanceOrder }
     *     
     */
    public ArrayOfMaintenanceOrder getMantenanceOrderList() {
        return mantenanceOrderList;
    }

    /**
     * Sets the value of the mantenanceOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaintenanceOrder }
     *     
     */
    public void setMantenanceOrderList(ArrayOfMaintenanceOrder value) {
        this.mantenanceOrderList = value;
    }

}
