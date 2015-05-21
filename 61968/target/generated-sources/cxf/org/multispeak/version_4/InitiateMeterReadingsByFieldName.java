
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterID" minOccurs="0"/>
 *         &lt;element name="fieldNames" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expTime" type="{http://www.multispeak.org/Version_4.1_Release}expirationTime" minOccurs="0"/>
 *         &lt;element name="formattedBlockTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meterIDs",
    "fieldNames",
    "responseURL",
    "transactionID",
    "expTime",
    "formattedBlockTemplateName"
})
@XmlRootElement(name = "InitiateMeterReadingsByFieldName")
public class InitiateMeterReadingsByFieldName {

    protected ArrayOfMeterID meterIDs;
    protected ArrayOfString fieldNames;
    protected String responseURL;
    protected String transactionID;
    protected ExpirationTime expTime;
    protected String formattedBlockTemplateName;

    /**
     * Gets the value of the meterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public ArrayOfMeterID getMeterIDs() {
        return meterIDs;
    }

    /**
     * Sets the value of the meterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public void setMeterIDs(ArrayOfMeterID value) {
        this.meterIDs = value;
    }

    /**
     * Gets the value of the fieldNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFieldNames() {
        return fieldNames;
    }

    /**
     * Sets the value of the fieldNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFieldNames(ArrayOfString value) {
        this.fieldNames = value;
    }

    /**
     * Gets the value of the responseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseURL() {
        return responseURL;
    }

    /**
     * Sets the value of the responseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseURL(String value) {
        this.responseURL = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationTime }
     *     
     */
    public ExpirationTime getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationTime }
     *     
     */
    public void setExpTime(ExpirationTime value) {
        this.expTime = value;
    }

    /**
     * Gets the value of the formattedBlockTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedBlockTemplateName() {
        return formattedBlockTemplateName;
    }

    /**
     * Sets the value of the formattedBlockTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedBlockTemplateName(String value) {
        this.formattedBlockTemplateName = value;
    }

}
