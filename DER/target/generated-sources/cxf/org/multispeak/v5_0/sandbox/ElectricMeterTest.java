
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5.MspReferable;
import org.multispeak.v5_0.commontypes.MeterID;


/**
 * <p>Java class for electricMeterTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeterTest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="testDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="asFound" type="{http://www.multispeak.org/V5.0/sandbox}asFound" minOccurs="0"/>
 *         &lt;element name="asLeft" type="{http://www.multispeak.org/V5.0/sandbox}asLeft" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testersInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revolutions" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricMeterTest", propOrder = {
    "meterID",
    "testDate",
    "asFound",
    "asLeft",
    "reason",
    "testersInitials",
    "testCompany",
    "revolutions",
    "comments"
})
public class ElectricMeterTest
    extends MspReferable
{

    @XmlElement(required = true)
    protected MeterID meterID;
    @XmlElement(required = true)
    protected XMLGregorianCalendar testDate;
    protected AsFound asFound;
    protected AsLeft asLeft;
    protected String reason;
    protected String testersInitials;
    protected String testCompany;
    protected Float revolutions;
    protected String comments;

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

}
