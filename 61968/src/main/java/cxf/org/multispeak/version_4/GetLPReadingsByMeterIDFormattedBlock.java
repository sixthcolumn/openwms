
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
 *         &lt;element name="profileStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="profileEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "profileStartDate",
    "profileEndDate",
    "lastReceived"
})
@XmlRootElement(name = "GetLPReadingsByMeterIDFormattedBlock")
public class GetLPReadingsByMeterIDFormattedBlock {

    protected MeterID meterID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar profileStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar profileEndDate;
    protected String lastReceived;

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
     * Gets the value of the profileStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileStartDate() {
        return profileStartDate;
    }

    /**
     * Sets the value of the profileStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileStartDate(XMLGregorianCalendar value) {
        this.profileStartDate = value;
    }

    /**
     * Gets the value of the profileEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProfileEndDate() {
        return profileEndDate;
    }

    /**
     * Sets the value of the profileEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProfileEndDate(XMLGregorianCalendar value) {
        this.profileEndDate = value;
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

}
