
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propaneService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propaneService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propaneMeterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propaneLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}propaneLocationFields" minOccurs="0"/>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/Version_4.1_Release}propaneMeter" minOccurs="0"/>
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
@XmlType(name = "propaneService", propOrder = {
    "customerID",
    "accountNumber",
    "serviceLocationID",
    "propaneMeterID",
    "propaneLocationFields",
    "woNumber",
    "soNumber",
    "revenueClass",
    "serviceStatus",
    "billingCycle",
    "route",
    "budgetBill",
    "shutOffDate",
    "connectDate",
    "disconnectDate",
    "propaneMeter"
})
public class PropaneService
    extends MspObject
{

    protected String customerID;
    protected String accountNumber;
    protected String serviceLocationID;
    protected String propaneMeterID;
    protected PropaneLocationFields propaneLocationFields;
    protected String woNumber;
    protected String soNumber;
    protected String revenueClass;
    protected String serviceStatus;
    protected String billingCycle;
    protected String route;
    protected String budgetBill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shutOffDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar connectDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectDate;
    protected PropaneMeter propaneMeter;

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
     * Gets the value of the propaneMeterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropaneMeterID() {
        return propaneMeterID;
    }

    /**
     * Sets the value of the propaneMeterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropaneMeterID(String value) {
        this.propaneMeterID = value;
    }

    /**
     * Gets the value of the propaneLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneLocationFields }
     *     
     */
    public PropaneLocationFields getPropaneLocationFields() {
        return propaneLocationFields;
    }

    /**
     * Sets the value of the propaneLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneLocationFields }
     *     
     */
    public void setPropaneLocationFields(PropaneLocationFields value) {
        this.propaneLocationFields = value;
    }

    /**
     * Gets the value of the woNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoNumber() {
        return woNumber;
    }

    /**
     * Sets the value of the woNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoNumber(String value) {
        this.woNumber = value;
    }

    /**
     * Gets the value of the soNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoNumber() {
        return soNumber;
    }

    /**
     * Sets the value of the soNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoNumber(String value) {
        this.soNumber = value;
    }

    /**
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
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
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
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
     * Gets the value of the connectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectDate() {
        return connectDate;
    }

    /**
     * Sets the value of the connectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectDate(XMLGregorianCalendar value) {
        this.connectDate = value;
    }

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the propaneMeter property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeter }
     *     
     */
    public PropaneMeter getPropaneMeter() {
        return propaneMeter;
    }

    /**
     * Sets the value of the propaneMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeter }
     *     
     */
    public void setPropaneMeter(PropaneMeter value) {
        this.propaneMeter = value;
    }

}
