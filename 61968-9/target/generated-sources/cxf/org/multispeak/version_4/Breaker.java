
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for breaker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="breaker">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspOverCurrentDevice">
 *       &lt;sequence>
 *         &lt;element name="phaseTripRating" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="breakerImpedances" type="{http://www.multispeak.org/Version_4.1_Release}breakerImpedances" minOccurs="0"/>
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
@XmlType(name = "breaker", propOrder = {
    "phaseTripRating",
    "breakerImpedances"
})
public class Breaker
    extends MspOverCurrentDevice
{

    protected Current phaseTripRating;
    protected BreakerImpedances breakerImpedances;

    /**
     * Gets the value of the phaseTripRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getPhaseTripRating() {
        return phaseTripRating;
    }

    /**
     * Sets the value of the phaseTripRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setPhaseTripRating(Current value) {
        this.phaseTripRating = value;
    }

    /**
     * Gets the value of the breakerImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link BreakerImpedances }
     *     
     */
    public BreakerImpedances getBreakerImpedances() {
        return breakerImpedances;
    }

    /**
     * Sets the value of the breakerImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakerImpedances }
     *     
     */
    public void setBreakerImpedances(BreakerImpedances value) {
        this.breakerImpedances = value;
    }

}
