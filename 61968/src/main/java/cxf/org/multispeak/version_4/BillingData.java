
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for billingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/Version_4.1_Release}serviceType" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ppmLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="CISBalanceAfterBilling" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "billingData", propOrder = {
    "accountNumber",
    "serviceType",
    "serviceLocationID",
    "ppmLocationID",
    "meterID",
    "cisBalanceAfterBilling",
    "billingDate",
    "billFromDate",
    "billToDate"
})
public class BillingData
    extends MspObject
{

    protected String accountNumber;
    protected ServiceType serviceType;
    protected String serviceLocationID;
    protected String ppmLocationID;
    protected MeterID meterID;
    @XmlElement(name = "CISBalanceAfterBilling")
    protected Money cisBalanceAfterBilling;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billFromDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billToDate;

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

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the billFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillFromDate() {
        return billFromDate;
    }

    /**
     * Sets the value of the billFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillFromDate(XMLGregorianCalendar value) {
        this.billFromDate = value;
    }

    /**
     * Gets the value of the billToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillToDate() {
        return billToDate;
    }

    /**
     * Sets the value of the billToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillToDate(XMLGregorianCalendar value) {
        this.billToDate = value;
    }

}
