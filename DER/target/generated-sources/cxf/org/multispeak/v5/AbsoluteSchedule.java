
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for absoluteSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="absoluteSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timePoint" type="{http://www.multispeak.org/V5.0}timePoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "absoluteSchedule", propOrder = {
    "timePoint"
})
public class AbsoluteSchedule {

    @XmlElement(required = true)
    protected List<TimePoint> timePoint;

    /**
     * Gets the value of the timePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePoint }
     * 
     * 
     */
    public List<TimePoint> getTimePoint() {
        if (timePoint == null) {
            timePoint = new ArrayList<TimePoint>();
        }
        return this.timePoint;
    }

}