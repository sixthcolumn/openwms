
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * A point of service for receiving propane utility service.
 * 
 * <p>Java class for propaneServicePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propaneServicePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPropaneUsagePoint">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="propaneMeterID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="billingStatusInformation" type="{http://www.multispeak.org/V5.0}billingStatusInformation" minOccurs="0"/>
 *         &lt;element name="workOrderIdentifier" type="{http://www.multispeak.org/V5.0}workReference" minOccurs="0"/>
 *         &lt;element name="serviceOrderID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePointStatus" type="{http://www.multispeak.org/V5.0}servicePointStatus" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/V5.0}propaneMeter" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propaneServicePoint", propOrder = {
    "customerID",
    "accountID",
    "serviceLocationID",
    "propaneMeterID",
    "billingStatusInformation",
    "workOrderIdentifier",
    "serviceOrderID",
    "revenueClass",
    "servicePointStatus",
    "billingCycle",
    "route",
    "budgetBill",
    "shutOffDate",
    "connectDate",
    "disconnectDate",
    "propaneMeter",
    "rateCode",
    "serviceSubType"
})
public class PropaneServicePoint
    extends MspPropaneUsagePoint
{

    protected ObjectID customerID;
    protected ObjectID accountID;
    protected ObjectID serviceLocationID;
    protected ObjectID propaneMeterID;
    protected BillingStatusInformation billingStatusInformation;
    protected WorkReference workOrderIdentifier;
    protected ObjectID serviceOrderID;
    protected String revenueClass;
    protected ServicePointStatus servicePointStatus;
    protected String billingCycle;
    protected String route;
    protected String budgetBill;
    protected XMLGregorianCalendar shutOffDate;
    protected XMLGregorianCalendar connectDate;
    protected XMLGregorianCalendar disconnectDate;
    protected PropaneMeter propaneMeter;
    protected String rateCode;
    protected String serviceSubType;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCustomerID(ObjectID value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setAccountID(ObjectID value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the propaneMeterID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getPropaneMeterID() {
        return propaneMeterID;
    }

    /**
     * Sets the value of the propaneMeterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setPropaneMeterID(ObjectID value) {
        this.propaneMeterID = value;
    }

    /**
     * Gets the value of the billingStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BillingStatusInformation }
     *     
     */
    public BillingStatusInformation getBillingStatusInformation() {
        return billingStatusInformation;
    }

    /**
     * Sets the value of the billingStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingStatusInformation }
     *     
     */
    public void setBillingStatusInformation(BillingStatusInformation value) {
        this.billingStatusInformation = value;
    }

    /**
     * Gets the value of the workOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link WorkReference }
     *     
     */
    public WorkReference getWorkOrderIdentifier() {
        return workOrderIdentifier;
    }

    /**
     * Sets the value of the workOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkReference }
     *     
     */
    public void setWorkOrderIdentifier(WorkReference value) {
        this.workOrderIdentifier = value;
    }

    /**
     * Gets the value of the serviceOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceOrderID() {
        return serviceOrderID;
    }

    /**
     * Sets the value of the serviceOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceOrderID(ObjectID value) {
        this.serviceOrderID = value;
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
     * Gets the value of the servicePointStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointStatus }
     *     
     */
    public ServicePointStatus getServicePointStatus() {
        return servicePointStatus;
    }

    /**
     * Sets the value of the servicePointStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointStatus }
     *     
     */
    public void setServicePointStatus(ServicePointStatus value) {
        this.servicePointStatus = value;
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

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the serviceSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubType() {
        return serviceSubType;
    }

    /**
     * Sets the value of the serviceSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubType(String value) {
        this.serviceSubType = value;
    }

}
