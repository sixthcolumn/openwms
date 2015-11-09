
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is the data for this transactive incentive
 * 			
 * 
 * <p>Java class for TCInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCInterval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="startDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="confidenceLevel" use="required" type="{http://www.multispeak.org/V5.0/sandbox}confidenceLevelType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCInterval")
public class TCInterval {

    @XmlAttribute(name = "startDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlAttribute(name = "value", required = true)
    protected float value;
    @XmlAttribute(name = "confidenceLevel", required = true)
    protected String confidenceLevel;

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the confidenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Sets the value of the confidenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceLevel(String value) {
        this.confidenceLevel = value;
    }

}
