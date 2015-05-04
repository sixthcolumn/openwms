
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phaseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phaseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_4.1_Release}mspPhase" minOccurs="0"/>
 *         &lt;element name="conductorType" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="positionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phaseItem", propOrder = {
    "phase",
    "conductorType",
    "positionNumber"
})
public class PhaseItem {

    protected MspPhase phase;
    protected EaEquipID conductorType;
    protected String positionNumber;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setPhase(MspPhase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the conductorType property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getConductorType() {
        return conductorType;
    }

    /**
     * Sets the value of the conductorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setConductorType(EaEquipID value) {
        this.conductorType = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

}
