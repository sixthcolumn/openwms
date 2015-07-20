
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuitElementStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circuitElementStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outagedPhase" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="circuitElementState" type="{http://www.multispeak.org/Version_4.1_Release}circuitElementState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circuitElementStatus", propOrder = {
    "outageEventID",
    "outagedPhase",
    "circuitElementState"
})
public class CircuitElementStatus {

    protected String outageEventID;
    protected PhaseCode outagedPhase;
    @XmlElement(required = true)
    protected CircuitElementState circuitElementState;

    /**
     * Gets the value of the outageEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageEventID() {
        return outageEventID;
    }

    /**
     * Sets the value of the outageEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageEventID(String value) {
        this.outageEventID = value;
    }

    /**
     * Gets the value of the outagedPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getOutagedPhase() {
        return outagedPhase;
    }

    /**
     * Sets the value of the outagedPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setOutagedPhase(PhaseCode value) {
        this.outagedPhase = value;
    }

    /**
     * Gets the value of the circuitElementState property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElementState }
     *     
     */
    public CircuitElementState getCircuitElementState() {
        return circuitElementState;
    }

    /**
     * Sets the value of the circuitElementState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElementState }
     *     
     */
    public void setCircuitElementState(CircuitElementState value) {
        this.circuitElementState = value;
    }

}
