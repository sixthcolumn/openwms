
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for intervalBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="endReadingList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfEndReading" minOccurs="0"/>
 *         &lt;element name="logTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="intervalStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dB" type="{http://www.multispeak.org/Version_4.1_Release}dB" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalBlock", propOrder = {
    "profileID",
    "meterID",
    "endReadingList",
    "logTime",
    "intervalStart",
    "db"
})
public class IntervalBlock {

    protected String profileID;
    protected MeterID meterID;
    protected ArrayOfEndReading endReadingList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar intervalStart;
    @XmlElement(name = "dB")
    protected DB db;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
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
     * Gets the value of the endReadingList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEndReading }
     *     
     */
    public ArrayOfEndReading getEndReadingList() {
        return endReadingList;
    }

    /**
     * Sets the value of the endReadingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEndReading }
     *     
     */
    public void setEndReadingList(ArrayOfEndReading value) {
        this.endReadingList = value;
    }

    /**
     * Gets the value of the logTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogTime() {
        return logTime;
    }

    /**
     * Sets the value of the logTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogTime(XMLGregorianCalendar value) {
        this.logTime = value;
    }

    /**
     * Gets the value of the intervalStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntervalStart() {
        return intervalStart;
    }

    /**
     * Sets the value of the intervalStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntervalStart(XMLGregorianCalendar value) {
        this.intervalStart = value;
    }

    /**
     * Gets the value of the db property.
     * 
     * @return
     *     possible object is
     *     {@link DB }
     *     
     */
    public DB getDB() {
        return db;
    }

    /**
     * Sets the value of the db property.
     * 
     * @param value
     *     allowed object is
     *     {@link DB }
     *     
     */
    public void setDB(DB value) {
        this.db = value;
    }

}
