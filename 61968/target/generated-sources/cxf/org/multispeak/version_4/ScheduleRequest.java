
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for scheduleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestByType" type="{http://www.multispeak.org/Version_4.1_Release}requestByType" minOccurs="0"/>
 *         &lt;element name="requestByValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleRequest", propOrder = {
    "requestByType",
    "requestByValue"
})
public class ScheduleRequest {

    protected RequestByType requestByType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestByValue;

    /**
     * Gets the value of the requestByType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestByType }
     *     
     */
    public RequestByType getRequestByType() {
        return requestByType;
    }

    /**
     * Sets the value of the requestByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestByType }
     *     
     */
    public void setRequestByType(RequestByType value) {
        this.requestByType = value;
    }

    /**
     * Gets the value of the requestByValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestByValue() {
        return requestByValue;
    }

    /**
     * Sets the value of the requestByValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestByValue(XMLGregorianCalendar value) {
        this.requestByValue = value;
    }

}
