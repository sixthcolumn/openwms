
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for winding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="winding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="windingNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ratedPower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="emergencyRating" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="insulationBIL" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="windingConnection" type="{http://www.multispeak.org/Version_4.1_Release}windingConnection" minOccurs="0"/>
 *         &lt;element name="phaseShift" type="{http://www.multispeak.org/Version_4.1_Release}clockPosition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "winding", propOrder = {
    "windingNumber",
    "ratedVoltage",
    "ratedPower",
    "emergencyRating",
    "insulationBIL",
    "windingConnection",
    "phaseShift"
})
public class Winding {

    protected BigInteger windingNumber;
    protected Voltage ratedVoltage;
    protected ApparentPower ratedPower;
    protected ApparentPower emergencyRating;
    protected Voltage insulationBIL;
    protected WindingConnection windingConnection;
    protected String phaseShift;

    /**
     * Gets the value of the windingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindingNumber() {
        return windingNumber;
    }

    /**
     * Sets the value of the windingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindingNumber(BigInteger value) {
        this.windingNumber = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the ratedPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedPower() {
        return ratedPower;
    }

    /**
     * Sets the value of the ratedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedPower(ApparentPower value) {
        this.ratedPower = value;
    }

    /**
     * Gets the value of the emergencyRating property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getEmergencyRating() {
        return emergencyRating;
    }

    /**
     * Sets the value of the emergencyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setEmergencyRating(ApparentPower value) {
        this.emergencyRating = value;
    }

    /**
     * Gets the value of the insulationBIL property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getInsulationBIL() {
        return insulationBIL;
    }

    /**
     * Sets the value of the insulationBIL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setInsulationBIL(Voltage value) {
        this.insulationBIL = value;
    }

    /**
     * Gets the value of the windingConnection property.
     * 
     * @return
     *     possible object is
     *     {@link WindingConnection }
     *     
     */
    public WindingConnection getWindingConnection() {
        return windingConnection;
    }

    /**
     * Sets the value of the windingConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingConnection }
     *     
     */
    public void setWindingConnection(WindingConnection value) {
        this.windingConnection = value;
    }

    /**
     * Gets the value of the phaseShift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseShift() {
        return phaseShift;
    }

    /**
     * Sets the value of the phaseShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseShift(String value) {
        this.phaseShift = value;
    }

}
