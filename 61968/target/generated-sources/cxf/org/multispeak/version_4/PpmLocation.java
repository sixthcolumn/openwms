
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ppmLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/Version_4.1_Release}serviceType" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuelCostAdjCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixedChargeCodeList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString11" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityBalance" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="sharedArrears" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="initialRead" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.multispeak.org/Version_4.1_Release}customer" minOccurs="0"/>
 *         &lt;element name="totalBalance" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="lastMeterRead" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastReadingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depositAmount" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="depositPaid" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="depositInterest" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterSetDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ppmLocation", propOrder = {
    "serviceType",
    "rateCode",
    "taxDist",
    "fuelCostAdjCode",
    "fixedChargeCodeList",
    "serviceLocationID",
    "priorityBalance",
    "sharedArrears",
    "initialRead",
    "customer",
    "totalBalance",
    "lastMeterRead",
    "lastReadingDate",
    "depositAmount",
    "depositPaid",
    "depositInterest",
    "connectDate",
    "billingCycle",
    "meterSetDate"
})
public class PpmLocation
    extends MspObject
{

    protected ServiceType serviceType;
    protected String rateCode;
    protected String taxDist;
    protected String fuelCostAdjCode;
    protected ArrayOfString11 fixedChargeCodeList;
    protected String serviceLocationID;
    protected Money priorityBalance;
    protected Money sharedArrears;
    protected MeterReading initialRead;
    protected Customer customer;
    protected Money totalBalance;
    protected BigInteger lastMeterRead;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReadingDate;
    protected Money depositAmount;
    protected Money depositPaid;
    protected Float depositInterest;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar connectDate;
    protected String billingCycle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar meterSetDate;

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
     * Gets the value of the taxDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDist() {
        return taxDist;
    }

    /**
     * Sets the value of the taxDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDist(String value) {
        this.taxDist = value;
    }

    /**
     * Gets the value of the fuelCostAdjCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelCostAdjCode() {
        return fuelCostAdjCode;
    }

    /**
     * Sets the value of the fuelCostAdjCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelCostAdjCode(String value) {
        this.fuelCostAdjCode = value;
    }

    /**
     * Gets the value of the fixedChargeCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString11 }
     *     
     */
    public ArrayOfString11 getFixedChargeCodeList() {
        return fixedChargeCodeList;
    }

    /**
     * Sets the value of the fixedChargeCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString11 }
     *     
     */
    public void setFixedChargeCodeList(ArrayOfString11 value) {
        this.fixedChargeCodeList = value;
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
     * Gets the value of the priorityBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPriorityBalance() {
        return priorityBalance;
    }

    /**
     * Sets the value of the priorityBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPriorityBalance(Money value) {
        this.priorityBalance = value;
    }

    /**
     * Gets the value of the sharedArrears property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSharedArrears() {
        return sharedArrears;
    }

    /**
     * Sets the value of the sharedArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSharedArrears(Money value) {
        this.sharedArrears = value;
    }

    /**
     * Gets the value of the initialRead property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getInitialRead() {
        return initialRead;
    }

    /**
     * Sets the value of the initialRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setInitialRead(MeterReading value) {
        this.initialRead = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBalance(Money value) {
        this.totalBalance = value;
    }

    /**
     * Gets the value of the lastMeterRead property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastMeterRead() {
        return lastMeterRead;
    }

    /**
     * Sets the value of the lastMeterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastMeterRead(BigInteger value) {
        this.lastMeterRead = value;
    }

    /**
     * Gets the value of the lastReadingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReadingDate() {
        return lastReadingDate;
    }

    /**
     * Sets the value of the lastReadingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReadingDate(XMLGregorianCalendar value) {
        this.lastReadingDate = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDepositAmount(Money value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDepositPaid() {
        return depositPaid;
    }

    /**
     * Sets the value of the depositPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDepositPaid(Money value) {
        this.depositPaid = value;
    }

    /**
     * Gets the value of the depositInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositInterest() {
        return depositInterest;
    }

    /**
     * Sets the value of the depositInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositInterest(Float value) {
        this.depositInterest = value;
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
     * Gets the value of the meterSetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeterSetDate() {
        return meterSetDate;
    }

    /**
     * Sets the value of the meterSetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeterSetDate(XMLGregorianCalendar value) {
        this.meterSetDate = value;
    }

}
