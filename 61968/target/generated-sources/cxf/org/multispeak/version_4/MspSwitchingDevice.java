
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspSwitchingDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspSwitchingDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="normalPosition" type="{http://www.multispeak.org/Version_4.1_Release}position" minOccurs="0"/>
 *         &lt;element name="operatingVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="mounting" type="{http://www.multispeak.org/Version_4.1_Release}mounting" minOccurs="0"/>
 *         &lt;element name="assetFields" type="{http://www.multispeak.org/Version_4.1_Release}assetFields" minOccurs="0"/>
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
@XmlType(name = "mspSwitchingDevice", propOrder = {
    "eaEquipment",
    "facilityID",
    "phaseCode",
    "normalPosition",
    "operatingVoltage",
    "mounting",
    "assetFields"
})
@XmlSeeAlso({
    Cut.class,
    Switch.class,
    Jumper.class,
    MspOverCurrentDevice.class,
    Elbow.class
})
public abstract class MspSwitchingDevice
    extends MspObject
{

    protected EaEquipID eaEquipment;
    protected String facilityID;
    protected PhaseCode phaseCode;
    protected Position normalPosition;
    protected Voltage operatingVoltage;
    protected Mounting mounting;
    protected AssetFields assetFields;

    /**
     * Gets the value of the eaEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getEaEquipment() {
        return eaEquipment;
    }

    /**
     * Sets the value of the eaEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setEaEquipment(EaEquipID value) {
        this.eaEquipment = value;
    }

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
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
     * Gets the value of the normalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getNormalPosition() {
        return normalPosition;
    }

    /**
     * Sets the value of the normalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setNormalPosition(Position value) {
        this.normalPosition = value;
    }

    /**
     * Gets the value of the operatingVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getOperatingVoltage() {
        return operatingVoltage;
    }

    /**
     * Sets the value of the operatingVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setOperatingVoltage(Voltage value) {
        this.operatingVoltage = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link Mounting }
     *     
     */
    public Mounting getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mounting }
     *     
     */
    public void setMounting(Mounting value) {
        this.mounting = value;
    }

    /**
     * Gets the value of the assetFields property.
     * 
     * @return
     *     possible object is
     *     {@link AssetFields }
     *     
     */
    public AssetFields getAssetFields() {
        return assetFields;
    }

    /**
     * Sets the value of the assetFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetFields }
     *     
     */
    public void setAssetFields(AssetFields value) {
        this.assetFields = value;
    }

}
