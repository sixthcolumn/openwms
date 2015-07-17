
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Appliance controlled with a PAN device control.
 * 			
 * 
 * <p>Java class for ControlledAppliance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledAppliance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isElectricVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isExteriorLighting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isGenerationSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isHvacCompressorOrFurnace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInteriorLighting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isIrrigationPump" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isManagedCommercialIndustrialLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPoolPumpSpaJacuzzi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSimpleMiscLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSmartAppliance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isStripAndBaseboardHeater" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isWaterHeater" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledAppliance", propOrder = {
    "isElectricVehicle",
    "isExteriorLighting",
    "isGenerationSystem",
    "isHvacCompressorOrFurnace",
    "isInteriorLighting",
    "isIrrigationPump",
    "isManagedCommercialIndustrialLoad",
    "isPoolPumpSpaJacuzzi",
    "isSimpleMiscLoad",
    "isSmartAppliance",
    "isStripAndBaseboardHeater",
    "isWaterHeater"
})
public class ControlledAppliance {

    protected Boolean isElectricVehicle;
    protected Boolean isExteriorLighting;
    protected Boolean isGenerationSystem;
    protected Boolean isHvacCompressorOrFurnace;
    protected Boolean isInteriorLighting;
    protected Boolean isIrrigationPump;
    protected Boolean isManagedCommercialIndustrialLoad;
    protected Boolean isPoolPumpSpaJacuzzi;
    protected Boolean isSimpleMiscLoad;
    protected Boolean isSmartAppliance;
    protected Boolean isStripAndBaseboardHeater;
    protected Boolean isWaterHeater;

    /**
     * Gets the value of the isElectricVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsElectricVehicle() {
        return isElectricVehicle;
    }

    /**
     * Sets the value of the isElectricVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsElectricVehicle(Boolean value) {
        this.isElectricVehicle = value;
    }

    /**
     * Gets the value of the isExteriorLighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExteriorLighting() {
        return isExteriorLighting;
    }

    /**
     * Sets the value of the isExteriorLighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExteriorLighting(Boolean value) {
        this.isExteriorLighting = value;
    }

    /**
     * Gets the value of the isGenerationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGenerationSystem() {
        return isGenerationSystem;
    }

    /**
     * Sets the value of the isGenerationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGenerationSystem(Boolean value) {
        this.isGenerationSystem = value;
    }

    /**
     * Gets the value of the isHvacCompressorOrFurnace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHvacCompressorOrFurnace() {
        return isHvacCompressorOrFurnace;
    }

    /**
     * Sets the value of the isHvacCompressorOrFurnace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHvacCompressorOrFurnace(Boolean value) {
        this.isHvacCompressorOrFurnace = value;
    }

    /**
     * Gets the value of the isInteriorLighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInteriorLighting() {
        return isInteriorLighting;
    }

    /**
     * Sets the value of the isInteriorLighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInteriorLighting(Boolean value) {
        this.isInteriorLighting = value;
    }

    /**
     * Gets the value of the isIrrigationPump property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIrrigationPump() {
        return isIrrigationPump;
    }

    /**
     * Sets the value of the isIrrigationPump property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIrrigationPump(Boolean value) {
        this.isIrrigationPump = value;
    }

    /**
     * Gets the value of the isManagedCommercialIndustrialLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManagedCommercialIndustrialLoad() {
        return isManagedCommercialIndustrialLoad;
    }

    /**
     * Sets the value of the isManagedCommercialIndustrialLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManagedCommercialIndustrialLoad(Boolean value) {
        this.isManagedCommercialIndustrialLoad = value;
    }

    /**
     * Gets the value of the isPoolPumpSpaJacuzzi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPoolPumpSpaJacuzzi() {
        return isPoolPumpSpaJacuzzi;
    }

    /**
     * Sets the value of the isPoolPumpSpaJacuzzi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPoolPumpSpaJacuzzi(Boolean value) {
        this.isPoolPumpSpaJacuzzi = value;
    }

    /**
     * Gets the value of the isSimpleMiscLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSimpleMiscLoad() {
        return isSimpleMiscLoad;
    }

    /**
     * Sets the value of the isSimpleMiscLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSimpleMiscLoad(Boolean value) {
        this.isSimpleMiscLoad = value;
    }

    /**
     * Gets the value of the isSmartAppliance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSmartAppliance() {
        return isSmartAppliance;
    }

    /**
     * Sets the value of the isSmartAppliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSmartAppliance(Boolean value) {
        this.isSmartAppliance = value;
    }

    /**
     * Gets the value of the isStripAndBaseboardHeater property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStripAndBaseboardHeater() {
        return isStripAndBaseboardHeater;
    }

    /**
     * Sets the value of the isStripAndBaseboardHeater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStripAndBaseboardHeater(Boolean value) {
        this.isStripAndBaseboardHeater = value;
    }

    /**
     * Gets the value of the isWaterHeater property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaterHeater() {
        return isWaterHeater;
    }

    /**
     * Sets the value of the isWaterHeater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaterHeater(Boolean value) {
        this.isWaterHeater = value;
    }

}
