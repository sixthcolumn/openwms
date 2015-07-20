
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="billingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="kWhLookBack" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kWLookBack" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kWLookForward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedBlockTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString" minOccurs="0"/>
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
    "meterID",
    "billingDate",
    "kWhLookBack",
    "kwLookBack",
    "kwLookForward",
    "lastReceived",
    "formattedBlockTemplateName",
    "fieldName"
})
@XmlRootElement(name = "GetReadingByMeterIDFormattedBlock")
public class GetReadingByMeterIDFormattedBlock {

    protected MeterID meterID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingDate;
    protected int kWhLookBack;
    @XmlElement(name = "kWLookBack")
    protected int kwLookBack;
    @XmlElement(name = "kWLookForward")
    protected int kwLookForward;
    protected String lastReceived;
    protected String formattedBlockTemplateName;
    protected ArrayOfString fieldName;

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
     * Gets the value of the kWhLookBack property.
     * 
     */
    public int getKWhLookBack() {
        return kWhLookBack;
    }

    /**
     * Sets the value of the kWhLookBack property.
     * 
     */
    public void setKWhLookBack(int value) {
        this.kWhLookBack = value;
    }

    /**
     * Gets the value of the kwLookBack property.
     * 
     */
    public int getKWLookBack() {
        return kwLookBack;
    }

    /**
     * Sets the value of the kwLookBack property.
     * 
     */
    public void setKWLookBack(int value) {
        this.kwLookBack = value;
    }

    /**
     * Gets the value of the kwLookForward property.
     * 
     */
    public int getKWLookForward() {
        return kwLookForward;
    }

    /**
     * Sets the value of the kwLookForward property.
     * 
     */
    public void setKWLookForward(int value) {
        this.kwLookForward = value;
    }

    /**
     * Gets the value of the lastReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReceived() {
        return lastReceived;
    }

    /**
     * Sets the value of the lastReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReceived(String value) {
        this.lastReceived = value;
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

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFieldName(ArrayOfString value) {
        this.fieldName = value;
    }

}
