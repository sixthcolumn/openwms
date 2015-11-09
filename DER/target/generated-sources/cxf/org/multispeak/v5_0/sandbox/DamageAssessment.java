
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5.MspObject;


/**
 * This is a field damage assessment report.
 * 			
 * 
 * <p>Java class for damageAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="damageAssessment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="estimated" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiresOn" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "damageAssessment", propOrder = {
    "estimated",
    "eventID",
    "jobNumber",
    "expiresOn"
})
public class DamageAssessment
    extends MspObject
{

    protected Float estimated;
    protected String eventID;
    protected String jobNumber;
    protected XMLGregorianCalendar expiresOn;

    /**
     * Gets the value of the estimated property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimated() {
        return estimated;
    }

    /**
     * Sets the value of the estimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimated(Float value) {
        this.estimated = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the expiresOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresOn() {
        return expiresOn;
    }

    /**
     * Sets the value of the expiresOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresOn(XMLGregorianCalendar value) {
        this.expiresOn = value;
    }

}
