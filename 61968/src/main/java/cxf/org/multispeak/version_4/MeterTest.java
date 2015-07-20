
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for meterTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterTest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asFound" type="{http://www.multispeak.org/Version_4.1_Release}asFound" minOccurs="0"/>
 *         &lt;element name="asLeft" type="{http://www.multispeak.org/Version_4.1_Release}asLeft" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testersInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revolutions" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterTest", propOrder = {
    "testDate",
    "asFound",
    "asLeft",
    "reason",
    "testersInitials",
    "testCompany",
    "comments",
    "revolutions"
})
public class MeterTest {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testDate;
    protected AsFound asFound;
    protected AsLeft asLeft;
    protected String reason;
    protected String testersInitials;
    protected String testCompany;
    protected String comments;
    protected Float revolutions;

    /**
     * Gets the value of the testDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDate() {
        return testDate;
    }

    /**
     * Sets the value of the testDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDate(XMLGregorianCalendar value) {
        this.testDate = value;
    }

    /**
     * Gets the value of the asFound property.
     * 
     * @return
     *     possible object is
     *     {@link AsFound }
     *     
     */
    public AsFound getAsFound() {
        return asFound;
    }

    /**
     * Sets the value of the asFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsFound }
     *     
     */
    public void setAsFound(AsFound value) {
        this.asFound = value;
    }

    /**
     * Gets the value of the asLeft property.
     * 
     * @return
     *     possible object is
     *     {@link AsLeft }
     *     
     */
    public AsLeft getAsLeft() {
        return asLeft;
    }

    /**
     * Sets the value of the asLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsLeft }
     *     
     */
    public void setAsLeft(AsLeft value) {
        this.asLeft = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the testersInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestersInitials() {
        return testersInitials;
    }

    /**
     * Sets the value of the testersInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestersInitials(String value) {
        this.testersInitials = value;
    }

    /**
     * Gets the value of the testCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCompany() {
        return testCompany;
    }

    /**
     * Sets the value of the testCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCompany(String value) {
        this.testCompany = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the revolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRevolutions() {
        return revolutions;
    }

    /**
     * Sets the value of the revolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRevolutions(Float value) {
        this.revolutions = value;
    }

}
