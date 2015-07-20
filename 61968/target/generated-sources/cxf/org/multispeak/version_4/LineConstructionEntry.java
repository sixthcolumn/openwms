
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineConstructionEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineConstructionEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.multispeak.org/Version_4.1_Release}lineConstructionEntryType" minOccurs="0"/>
 *         &lt;element name="maximumVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="conductorList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfConductorItem" minOccurs="0"/>
 *         &lt;element name="neutralConductorList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfConductorItem" minOccurs="0"/>
 *         &lt;element name="downleadConductorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downleadLength" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *         &lt;element name="groundResistance" type="{http://www.multispeak.org/Version_4.1_Release}resistance" minOccurs="0"/>
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
@XmlType(name = "lineConstructionEntry", propOrder = {
    "type",
    "maximumVoltage",
    "conductorList",
    "neutralConductorList",
    "downleadConductorID",
    "downleadLength",
    "groundResistance"
})
public class LineConstructionEntry
    extends MspElectricalDefinition
{

    protected LineConstructionEntryType type;
    protected Voltage maximumVoltage;
    protected ArrayOfConductorItem conductorList;
    protected ArrayOfConductorItem neutralConductorList;
    protected String downleadConductorID;
    protected Length downleadLength;
    protected Resistance groundResistance;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LineConstructionEntryType }
     *     
     */
    public LineConstructionEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineConstructionEntryType }
     *     
     */
    public void setType(LineConstructionEntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the maximumVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getMaximumVoltage() {
        return maximumVoltage;
    }

    /**
     * Sets the value of the maximumVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setMaximumVoltage(Voltage value) {
        this.maximumVoltage = value;
    }

    /**
     * Gets the value of the conductorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConductorItem }
     *     
     */
    public ArrayOfConductorItem getConductorList() {
        return conductorList;
    }

    /**
     * Sets the value of the conductorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConductorItem }
     *     
     */
    public void setConductorList(ArrayOfConductorItem value) {
        this.conductorList = value;
    }

    /**
     * Gets the value of the neutralConductorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConductorItem }
     *     
     */
    public ArrayOfConductorItem getNeutralConductorList() {
        return neutralConductorList;
    }

    /**
     * Sets the value of the neutralConductorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConductorItem }
     *     
     */
    public void setNeutralConductorList(ArrayOfConductorItem value) {
        this.neutralConductorList = value;
    }

    /**
     * Gets the value of the downleadConductorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownleadConductorID() {
        return downleadConductorID;
    }

    /**
     * Sets the value of the downleadConductorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownleadConductorID(String value) {
        this.downleadConductorID = value;
    }

    /**
     * Gets the value of the downleadLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getDownleadLength() {
        return downleadLength;
    }

    /**
     * Sets the value of the downleadLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setDownleadLength(Length value) {
        this.downleadLength = value;
    }

    /**
     * Gets the value of the groundResistance property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getGroundResistance() {
        return groundResistance;
    }

    /**
     * Sets the value of the groundResistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setGroundResistance(Resistance value) {
        this.groundResistance = value;
    }

}
