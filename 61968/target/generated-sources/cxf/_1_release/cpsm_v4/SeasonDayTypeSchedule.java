
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeasonDayTypeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeasonDayTypeSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}RegularIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="dayType" type="{cpsm_V4.1_Release}DayType" minOccurs="0"/>
 *         &lt;element name="seasonType" type="{cpsm_V4.1_Release}Season" minOccurs="0"/>
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
@XmlType(name = "SeasonDayTypeSchedule", propOrder = {
    "dayType",
    "seasonType"
})
@XmlSeeAlso({
    ConformLoadSchedule.class,
    NonConformLoadSchedule.class
})
public class SeasonDayTypeSchedule
    extends RegularIntervalSchedule
{

    protected DayType dayType;
    protected Season seasonType;

    /**
     * Gets the value of the dayType property.
     * 
     * @return
     *     possible object is
     *     {@link DayType }
     *     
     */
    public DayType getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayType }
     *     
     */
    public void setDayType(DayType value) {
        this.dayType = value;
    }

    /**
     * Gets the value of the seasonType property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSeasonType() {
        return seasonType;
    }

    /**
     * Sets the value of the seasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSeasonType(Season value) {
        this.seasonType = value;
    }

}
