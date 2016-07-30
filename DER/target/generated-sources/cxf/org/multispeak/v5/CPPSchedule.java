
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPPSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPPSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="CPPScheduleVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.multispeak.org/V5.0}effectiveDate"/>
 *         &lt;element name="daysOfWeek" type="{http://www.multispeak.org/V5.0}daysOfWeek"/>
 *         &lt;element name="exceptionDays" type="{http://www.multispeak.org/V5.0}exceptionDays" minOccurs="0"/>
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
@XmlType(name = "CPPSchedule", propOrder = {
    "cppScheduleVersion",
    "effectiveDate",
    "daysOfWeek",
    "exceptionDays"
})
public class CPPSchedule
    extends MspObject
{

    @XmlElement(name = "CPPScheduleVersion")
    protected String cppScheduleVersion;
    @XmlElement(required = true)
    protected EffectiveDate effectiveDate;
    @XmlElement(required = true)
    protected DaysOfWeek daysOfWeek;
    protected ExceptionDays exceptionDays;

    /**
     * Gets the value of the cppScheduleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPPScheduleVersion() {
        return cppScheduleVersion;
    }

    /**
     * Sets the value of the cppScheduleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPPScheduleVersion(String value) {
        this.cppScheduleVersion = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDate }
     *     
     */
    public EffectiveDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDate }
     *     
     */
    public void setEffectiveDate(EffectiveDate value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DaysOfWeek }
     *     
     */
    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysOfWeek }
     *     
     */
    public void setDaysOfWeek(DaysOfWeek value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the exceptionDays property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionDays }
     *     
     */
    public ExceptionDays getExceptionDays() {
        return exceptionDays;
    }

    /**
     * Sets the value of the exceptionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionDays }
     *     
     */
    public void setExceptionDays(ExceptionDays value) {
        this.exceptionDays = value;
    }

}
