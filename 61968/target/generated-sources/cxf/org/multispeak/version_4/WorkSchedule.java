
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estimatedStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimatedEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimatedDriveTime" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workSchedule", propOrder = {
    "estimatedStartTime",
    "estimatedEndTime",
    "estimatedDriveTime"
})
public class WorkSchedule {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedStartTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedEndTime;
    protected Duration estimatedDriveTime;

    /**
     * Gets the value of the estimatedStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedStartTime() {
        return estimatedStartTime;
    }

    /**
     * Sets the value of the estimatedStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedStartTime(XMLGregorianCalendar value) {
        this.estimatedStartTime = value;
    }

    /**
     * Gets the value of the estimatedEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedEndTime() {
        return estimatedEndTime;
    }

    /**
     * Sets the value of the estimatedEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedEndTime(XMLGregorianCalendar value) {
        this.estimatedEndTime = value;
    }

    /**
     * Gets the value of the estimatedDriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedDriveTime() {
        return estimatedDriveTime;
    }

    /**
     * Sets the value of the estimatedDriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedDriveTime(Duration value) {
        this.estimatedDriveTime = value;
    }

}
