
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspElectricLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspElectricLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspConnectivityLine">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="phaseList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPhaseItem" minOccurs="0"/>
 *         &lt;element name="condLength" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *         &lt;element name="construction" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="load" type="{http://www.multispeak.org/Version_4.1_Release}mspLoadGroup" minOccurs="0"/>
 *         &lt;element name="equipmentContainerID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
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
@XmlType(name = "mspElectricLine", propOrder = {
    "phaseCode",
    "phaseList",
    "condLength",
    "construction",
    "load",
    "equipmentContainerID"
})
@XmlSeeAlso({
    UgTransmissionLine.class,
    UgSecondaryLine.class,
    UgPrimaryLine.class,
    OhPrimaryLine.class,
    OhSecondaryLine.class,
    OhTransmissionLine.class
})
public abstract class MspElectricLine
    extends MspConnectivityLine
{

    protected PhaseCode phaseCode;
    protected ArrayOfPhaseItem phaseList;
    protected Length condLength;
    protected EaEquipID construction;
    protected MspLoadGroup load;
    protected ObjectRef equipmentContainerID;

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
     * Gets the value of the phaseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhaseItem }
     *     
     */
    public ArrayOfPhaseItem getPhaseList() {
        return phaseList;
    }

    /**
     * Sets the value of the phaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhaseItem }
     *     
     */
    public void setPhaseList(ArrayOfPhaseItem value) {
        this.phaseList = value;
    }

    /**
     * Gets the value of the condLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getCondLength() {
        return condLength;
    }

    /**
     * Sets the value of the condLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setCondLength(Length value) {
        this.condLength = value;
    }

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link EaEquipID }
     *     
     */
    public EaEquipID getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaEquipID }
     *     
     */
    public void setConstruction(EaEquipID value) {
        this.construction = value;
    }

    /**
     * Gets the value of the load property.
     * 
     * @return
     *     possible object is
     *     {@link MspLoadGroup }
     *     
     */
    public MspLoadGroup getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspLoadGroup }
     *     
     */
    public void setLoad(MspLoadGroup value) {
        this.load = value;
    }

    /**
     * Gets the value of the equipmentContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEquipmentContainerID() {
        return equipmentContainerID;
    }

    /**
     * Sets the value of the equipmentContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEquipmentContainerID(ObjectRef value) {
        this.equipmentContainerID = value;
    }

}
