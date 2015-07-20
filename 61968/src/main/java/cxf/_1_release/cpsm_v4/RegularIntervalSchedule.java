
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegularIntervalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularIntervalSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}BasicIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="timeStep" type="{cpsm_V4.1_Release}Seconds" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timePoints" type="{cpsm_V4.1_Release}TimePoints" minOccurs="0"/>
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
@XmlType(name = "RegularIntervalSchedule", propOrder = {
    "timeStep",
    "endTime",
    "timePoints"
})
@XmlSeeAlso({
    RegulationSchedule.class,
    LoadCurve.class,
    SeasonDayTypeSchedule.class
})
public class RegularIntervalSchedule
    extends BasicIntervalSchedule
{

    protected Seconds timeStep;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected TimePoints timePoints;

    /**
     * Gets the value of the timeStep property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getTimeStep() {
        return timeStep;
    }

    /**
     * Sets the value of the timeStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setTimeStep(Seconds value) {
        this.timeStep = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the timePoints property.
     * 
     * @return
     *     possible object is
     *     {@link TimePoints }
     *     
     */
    public TimePoints getTimePoints() {
        return timePoints;
    }

    /**
     * Sets the value of the timePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePoints }
     *     
     */
    public void setTimePoints(TimePoints value) {
        this.timePoints = value;
    }

}
