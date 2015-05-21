
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackPhone" type="{http://www.multispeak.org/Version_4.1_Release}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="timeToCall" type="{http://www.multispeak.org/Version_4.1_Release}timeToCall" minOccurs="0"/>
 *         &lt;element name="callBackFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callBackContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackContactMName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackStatus" type="{http://www.multispeak.org/Version_4.1_Release}callBackStatus" minOccurs="0"/>
 *         &lt;element name="callBackCompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="callBackType" type="{http://www.multispeak.org/Version_4.1_Release}callBackType" minOccurs="0"/>
 *         &lt;element name="callRecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerID" type="{http://www.multispeak.org/Version_4.1_Release}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{http://www.multispeak.org/Version_4.1_Release}serviceID" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageCustomer", propOrder = {
    "customerID",
    "callBackPhone",
    "timeToCall",
    "callBackFlag",
    "callBackContactFirstName",
    "callBackContactLastName",
    "callBackContactMName",
    "callBackStatus",
    "callBackCompletedTime",
    "callBackType",
    "callRecordID",
    "outageEventID",
    "callerID",
    "serviceLocationID",
    "serviceID",
    "meterID"
})
public class OutageCustomer {

    protected String customerID;
    protected TelephoneNumber callBackPhone;
    protected TimeToCall timeToCall;
    protected Boolean callBackFlag;
    protected String callBackContactFirstName;
    protected String callBackContactLastName;
    protected String callBackContactMName;
    protected CallBackStatus callBackStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callBackCompletedTime;
    protected CallBackType callBackType;
    protected String callRecordID;
    protected String outageEventID;
    protected TelephoneNumber callerID;
    protected String serviceLocationID;
    protected ServiceID serviceID;
    protected MeterID meterID;

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
     * Gets the value of the callBackPhone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getCallBackPhone() {
        return callBackPhone;
    }

    /**
     * Sets the value of the callBackPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setCallBackPhone(TelephoneNumber value) {
        this.callBackPhone = value;
    }

    /**
     * Gets the value of the timeToCall property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToCall }
     *     
     */
    public TimeToCall getTimeToCall() {
        return timeToCall;
    }

    /**
     * Sets the value of the timeToCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToCall }
     *     
     */
    public void setTimeToCall(TimeToCall value) {
        this.timeToCall = value;
    }

    /**
     * Gets the value of the callBackFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallBackFlag() {
        return callBackFlag;
    }

    /**
     * Sets the value of the callBackFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallBackFlag(Boolean value) {
        this.callBackFlag = value;
    }

    /**
     * Gets the value of the callBackContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackContactFirstName() {
        return callBackContactFirstName;
    }

    /**
     * Sets the value of the callBackContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackContactFirstName(String value) {
        this.callBackContactFirstName = value;
    }

    /**
     * Gets the value of the callBackContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackContactLastName() {
        return callBackContactLastName;
    }

    /**
     * Sets the value of the callBackContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackContactLastName(String value) {
        this.callBackContactLastName = value;
    }

    /**
     * Gets the value of the callBackContactMName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackContactMName() {
        return callBackContactMName;
    }

    /**
     * Sets the value of the callBackContactMName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackContactMName(String value) {
        this.callBackContactMName = value;
    }

    /**
     * Gets the value of the callBackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallBackStatus }
     *     
     */
    public CallBackStatus getCallBackStatus() {
        return callBackStatus;
    }

    /**
     * Sets the value of the callBackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBackStatus }
     *     
     */
    public void setCallBackStatus(CallBackStatus value) {
        this.callBackStatus = value;
    }

    /**
     * Gets the value of the callBackCompletedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallBackCompletedTime() {
        return callBackCompletedTime;
    }

    /**
     * Sets the value of the callBackCompletedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallBackCompletedTime(XMLGregorianCalendar value) {
        this.callBackCompletedTime = value;
    }

    /**
     * Gets the value of the callBackType property.
     * 
     * @return
     *     possible object is
     *     {@link CallBackType }
     *     
     */
    public CallBackType getCallBackType() {
        return callBackType;
    }

    /**
     * Sets the value of the callBackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBackType }
     *     
     */
    public void setCallBackType(CallBackType value) {
        this.callBackType = value;
    }

    /**
     * Gets the value of the callRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecordID() {
        return callRecordID;
    }

    /**
     * Sets the value of the callRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecordID(String value) {
        this.callRecordID = value;
    }

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
     * Gets the value of the callerID property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getCallerID() {
        return callerID;
    }

    /**
     * Sets the value of the callerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setCallerID(TelephoneNumber value) {
        this.callerID = value;
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

}
