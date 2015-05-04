
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceTiming complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceTiming">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duration" type="{http://iec.ch/TC57/2011/EndDeviceControls#}Minutes" minOccurs="0"/>
 *         &lt;element name="durationIndefinite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="randomisation" type="{http://iec.ch/TC57/2011/EndDeviceControls#}RandomisationKind" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://iec.ch/TC57/2011/EndDeviceControls#}DateTimeInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceTiming", propOrder = {
    "duration",
    "durationIndefinite",
    "randomisation",
    "interval"
})
public class EndDeviceTiming {

    protected Float duration;
    protected Boolean durationIndefinite;
    protected RandomisationKind randomisation;
    protected DateTimeInterval interval;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuration(Float value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationIndefinite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDurationIndefinite() {
        return durationIndefinite;
    }

    /**
     * Sets the value of the durationIndefinite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDurationIndefinite(Boolean value) {
        this.durationIndefinite = value;
    }

    /**
     * Gets the value of the randomisation property.
     * 
     * @return
     *     possible object is
     *     {@link RandomisationKind }
     *     
     */
    public RandomisationKind getRandomisation() {
        return randomisation;
    }

    /**
     * Sets the value of the randomisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomisationKind }
     *     
     */
    public void setRandomisation(RandomisationKind value) {
        this.randomisation = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setInterval(DateTimeInterval value) {
        this.interval = value;
    }

}
