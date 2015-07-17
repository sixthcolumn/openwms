
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageDurationEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDurationEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{http://www.multispeak.org/Version_4.1_Release}serviceID" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeOfInterruption" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeRestored" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="interruptionDuration" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customerResponsible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="durationDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "outageDurationEvent", propOrder = {
    "outageEventID",
    "outageDescription",
    "meterID",
    "serviceLocationID",
    "serviceID",
    "accountNumber",
    "timeOfInterruption",
    "timeRestored",
    "interruptionDuration",
    "customerResponsible",
    "durationDisplay"
})
public class OutageDurationEvent
    extends MspObject
{

    protected String outageEventID;
    protected String outageDescription;
    protected MeterID meterID;
    protected String serviceLocationID;
    protected ServiceID serviceID;
    protected String accountNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfInterruption;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRestored;
    protected BigInteger interruptionDuration;
    protected Boolean customerResponsible;
    protected String durationDisplay;

    /**
     * Gets the value of the outageEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageEventID() {
        return outageEventID;
    }

    /**
     * Sets the value of the outageEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageEventID(String value) {
        this.outageEventID = value;
    }

    /**
     * Gets the value of the outageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDescription() {
        return outageDescription;
    }

    /**
     * Sets the value of the outageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDescription(String value) {
        this.outageDescription = value;
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
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceID }
     *     
     */
    public ServiceID getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceID }
     *     
     */
    public void setServiceID(ServiceID value) {
        this.serviceID = value;
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
     * Gets the value of the timeOfInterruption property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfInterruption() {
        return timeOfInterruption;
    }

    /**
     * Sets the value of the timeOfInterruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfInterruption(XMLGregorianCalendar value) {
        this.timeOfInterruption = value;
    }

    /**
     * Gets the value of the timeRestored property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRestored() {
        return timeRestored;
    }

    /**
     * Sets the value of the timeRestored property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRestored(XMLGregorianCalendar value) {
        this.timeRestored = value;
    }

    /**
     * Gets the value of the interruptionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterruptionDuration() {
        return interruptionDuration;
    }

    /**
     * Sets the value of the interruptionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterruptionDuration(BigInteger value) {
        this.interruptionDuration = value;
    }

    /**
     * Gets the value of the customerResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerResponsible() {
        return customerResponsible;
    }

    /**
     * Sets the value of the customerResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerResponsible(Boolean value) {
        this.customerResponsible = value;
    }

    /**
     * Gets the value of the durationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDisplay() {
        return durationDisplay;
    }

    /**
     * Sets the value of the durationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDisplay(String value) {
        this.durationDisplay = value;
    }

}
