
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuitElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circuitElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="elementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementType" type="{http://www.multispeak.org/Version_4.1_Release}circuitElementType" minOccurs="0"/>
 *         &lt;element name="substationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="circuitElementStatus" type="{http://www.multispeak.org/Version_4.1_Release}circuitElementStatus" minOccurs="0"/>
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
@XmlType(name = "circuitElement", propOrder = {
    "elementName",
    "parentName",
    "elementType",
    "substationName",
    "feederName",
    "feederNo",
    "phaseCode",
    "circuitElementStatus"
})
public class CircuitElement
    extends MspObject
{

    protected String elementName;
    protected String parentName;
    protected CircuitElementType elementType;
    protected String substationName;
    protected String feederName;
    protected String feederNo;
    protected PhaseCode phaseCode;
    protected CircuitElementStatus circuitElementStatus;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElementType }
     *     
     */
    public CircuitElementType getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElementType }
     *     
     */
    public void setElementType(CircuitElementType value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the substationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationName() {
        return substationName;
    }

    /**
     * Sets the value of the substationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationName(String value) {
        this.substationName = value;
    }

    /**
     * Gets the value of the feederName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederName() {
        return feederName;
    }

    /**
     * Sets the value of the feederName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederName(String value) {
        this.feederName = value;
    }

    /**
     * Gets the value of the feederNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederNo() {
        return feederNo;
    }

    /**
     * Sets the value of the feederNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederNo(String value) {
        this.feederNo = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the circuitElementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElementStatus }
     *     
     */
    public CircuitElementStatus getCircuitElementStatus() {
        return circuitElementStatus;
    }

    /**
     * Sets the value of the circuitElementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElementStatus }
     *     
     */
    public void setCircuitElementStatus(CircuitElementStatus value) {
        this.circuitElementStatus = value;
    }

}
