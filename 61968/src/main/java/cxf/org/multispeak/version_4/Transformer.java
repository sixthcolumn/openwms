
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transformer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/Version_4.1_Release}eaEquipID" minOccurs="0"/>
 *         &lt;element name="assetFields" type="{http://www.multispeak.org/Version_4.1_Release}assetFields" minOccurs="0"/>
 *         &lt;element name="unitRatedPower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="transformerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="pcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcbTestList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTestInstance" minOccurs="0"/>
 *         &lt;element name="windings" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTransformerWinding" minOccurs="0"/>
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
@XmlType(name = "transformer", propOrder = {
    "facilityID",
    "eaEquipment",
    "assetFields",
    "unitRatedPower",
    "transformerType",
    "status",
    "phases",
    "phaseCode",
    "pcb",
    "pcbTestList",
    "windings"
})
public class Transformer
    extends MspObject
{

    protected String facilityID;
    protected EaEquipID eaEquipment;
    protected AssetFields assetFields;
    protected ApparentPower unitRatedPower;
    protected String transformerType;
    protected String status;
    protected Long phases;
    protected PhaseCode phaseCode;
    protected String pcb;
    protected ArrayOfTestInstance pcbTestList;
    protected ArrayOfTransformerWinding windings;

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

    /**
     * Gets the value of the unitRatedPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getUnitRatedPower() {
        return unitRatedPower;
    }

    /**
     * Sets the value of the unitRatedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setUnitRatedPower(ApparentPower value) {
        this.unitRatedPower = value;
    }

    /**
     * Gets the value of the transformerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerType() {
        return transformerType;
    }

    /**
     * Sets the value of the transformerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerType(String value) {
        this.transformerType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhases(Long value) {
        this.phases = value;
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
     * Gets the value of the pcb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcb() {
        return pcb;
    }

    /**
     * Sets the value of the pcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcb(String value) {
        this.pcb = value;
    }

    /**
     * Gets the value of the pcbTestList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTestInstance }
     *     
     */
    public ArrayOfTestInstance getPcbTestList() {
        return pcbTestList;
    }

    /**
     * Sets the value of the pcbTestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTestInstance }
     *     
     */
    public void setPcbTestList(ArrayOfTestInstance value) {
        this.pcbTestList = value;
    }

    /**
     * Gets the value of the windings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformerWinding }
     *     
     */
    public ArrayOfTransformerWinding getWindings() {
        return windings;
    }

    /**
     * Sets the value of the windings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformerWinding }
     *     
     */
    public void setWindings(ArrayOfTransformerWinding value) {
        this.windings = value;
    }

}
