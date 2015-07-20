
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recloser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recloser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspOverCurrentDevice">
 *       &lt;sequence>
 *         &lt;element name="phaseTripRating" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="groundTripRating" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="groundTripNormalEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recloserImpedances" type="{http://www.multispeak.org/Version_4.1_Release}recloserImpedances" minOccurs="0"/>
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
@XmlType(name = "recloser", propOrder = {
    "phaseTripRating",
    "groundTripRating",
    "groundTripNormalEnabled",
    "recloserImpedances"
})
public class Recloser
    extends MspOverCurrentDevice
{

    protected Current phaseTripRating;
    protected Current groundTripRating;
    protected Boolean groundTripNormalEnabled;
    protected RecloserImpedances recloserImpedances;

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
     * Gets the value of the groundTripRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getGroundTripRating() {
        return groundTripRating;
    }

    /**
     * Sets the value of the groundTripRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setGroundTripRating(Current value) {
        this.groundTripRating = value;
    }

    /**
     * Gets the value of the groundTripNormalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroundTripNormalEnabled() {
        return groundTripNormalEnabled;
    }

    /**
     * Sets the value of the groundTripNormalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroundTripNormalEnabled(Boolean value) {
        this.groundTripNormalEnabled = value;
    }

    /**
     * Gets the value of the recloserImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link RecloserImpedances }
     *     
     */
    public RecloserImpedances getRecloserImpedances() {
        return recloserImpedances;
    }

    /**
     * Sets the value of the recloserImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecloserImpedances }
     *     
     */
    public void setRecloserImpedances(RecloserImpedances value) {
        this.recloserImpedances = value;
    }

}
