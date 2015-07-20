
package _1_release.cpsm_v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrregularIntervalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrregularIntervalSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}BasicIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="TimePoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IrregularTimePoint" type="{cpsm_V4.1_Release}IrregularTimePoint" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "IrregularIntervalSchedule", propOrder = {
    "timePoints"
})
public class IrregularIntervalSchedule
    extends BasicIntervalSchedule
{

    @XmlElement(name = "TimePoints")
    protected IrregularIntervalSchedule.TimePoints timePoints;

    /**
     * Gets the value of the timePoints property.
     * 
     * @return
     *     possible object is
     *     {@link IrregularIntervalSchedule.TimePoints }
     *     
     */
    public IrregularIntervalSchedule.TimePoints getTimePoints() {
        return timePoints;
    }

    /**
     * Sets the value of the timePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrregularIntervalSchedule.TimePoints }
     *     
     */
    public void setTimePoints(IrregularIntervalSchedule.TimePoints value) {
        this.timePoints = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IrregularTimePoint" type="{cpsm_V4.1_Release}IrregularTimePoint" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "irregularTimePoint"
    })
    public static class TimePoints {

        @XmlElement(name = "IrregularTimePoint")
        protected List<IrregularTimePoint> irregularTimePoint;

        /**
         * Gets the value of the irregularTimePoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the irregularTimePoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIrregularTimePoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IrregularTimePoint }
         * 
         * 
         */
        public List<IrregularTimePoint> getIrregularTimePoint() {
            if (irregularTimePoint == null) {
                irregularTimePoint = new ArrayList<IrregularTimePoint>();
            }
            return this.irregularTimePoint;
        }

    }

}
