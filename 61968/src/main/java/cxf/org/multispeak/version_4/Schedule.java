
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximumRunTime" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
 *         &lt;element name="effectiveWindow" type="{http://www.multispeak.org/Version_4.1_Release}timePeriod" minOccurs="0"/>
 *         &lt;element name="isEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
 *         &lt;element name="absoluteTimeSchedule" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTimePoint" minOccurs="0"/>
 *         &lt;element name="periodicSchedule" type="{http://www.multispeak.org/Version_4.1_Release}periodicSchedule" minOccurs="0"/>
 *         &lt;element name="TimePoints" type="{http://www.multispeak.org/Version_4.1_Release}cimTimePoints" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule", propOrder = {
    "purpose",
    "maximumRunTime",
    "effectiveWindow",
    "isEnabled",
    "offset",
    "absoluteTimeSchedule",
    "periodicSchedule",
    "timePoints"
})
@XmlSeeAlso({
    ReadingSchedule.class
})
public class Schedule
    extends MspObject
{

    protected String purpose;
    protected Duration maximumRunTime;
    protected TimePeriod effectiveWindow;
    protected Boolean isEnabled;
    protected Duration offset;
    protected ArrayOfTimePoint absoluteTimeSchedule;
    protected PeriodicSchedule periodicSchedule;
    @XmlElement(name = "TimePoints")
    protected List<CimTimePoints> timePoints;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the maximumRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumRunTime() {
        return maximumRunTime;
    }

    /**
     * Sets the value of the maximumRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumRunTime(Duration value) {
        this.maximumRunTime = value;
    }

    /**
     * Gets the value of the effectiveWindow property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getEffectiveWindow() {
        return effectiveWindow;
    }

    /**
     * Sets the value of the effectiveWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setEffectiveWindow(TimePeriod value) {
        this.effectiveWindow = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOffset(Duration value) {
        this.offset = value;
    }

    /**
     * Gets the value of the absoluteTimeSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimePoint }
     *     
     */
    public ArrayOfTimePoint getAbsoluteTimeSchedule() {
        return absoluteTimeSchedule;
    }

    /**
     * Sets the value of the absoluteTimeSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimePoint }
     *     
     */
    public void setAbsoluteTimeSchedule(ArrayOfTimePoint value) {
        this.absoluteTimeSchedule = value;
    }

    /**
     * Gets the value of the periodicSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicSchedule }
     *     
     */
    public PeriodicSchedule getPeriodicSchedule() {
        return periodicSchedule;
    }

    /**
     * Sets the value of the periodicSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicSchedule }
     *     
     */
    public void setPeriodicSchedule(PeriodicSchedule value) {
        this.periodicSchedule = value;
    }

    /**
     * Gets the value of the timePoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timePoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CimTimePoints }
     * 
     * 
     */
    public List<CimTimePoints> getTimePoints() {
        if (timePoints == null) {
            timePoints = new ArrayList<CimTimePoints>();
        }
        return this.timePoints;
    }

}
