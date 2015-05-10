
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneratingUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneratingUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="equipmentContainerID" type="{cpsm_V4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="GrossToNetActivePowerCurve" type="{cpsm_V4.1_Release}GrossToNetActivePowerCurve" minOccurs="0"/>
 *         &lt;element name="ReactiveCapabilityCurve" type="{cpsm_V4.1_Release}ReactiveCapabilityCurve" minOccurs="0"/>
 *         &lt;element name="efficiency" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="initialP" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="longPF" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxOperatingP" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="minOperatingP" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="normalPF" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="genControlSource" type="{cpsm_V4.1_Release}GeneratorControlSource" minOccurs="0"/>
 *         &lt;element name="ratedGrossMaxP" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="ratedGrossMinP" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="ratedNetMaxP" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="shortPF" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "GeneratingUnit", propOrder = {
    "equipmentContainerID",
    "grossToNetActivePowerCurve",
    "reactiveCapabilityCurve",
    "efficiency",
    "initialP",
    "longPF",
    "maxOperatingP",
    "minOperatingP",
    "normalPF",
    "genControlSource",
    "ratedGrossMaxP",
    "ratedGrossMinP",
    "ratedNetMaxP",
    "shortPF"
})
@XmlSeeAlso({
    HydroGeneratingUnit.class,
    ThermalGeneratingUnit.class
})
public class GeneratingUnit
    extends ConductingEquipment
{

    protected ObjectRef equipmentContainerID;
    @XmlElement(name = "GrossToNetActivePowerCurve")
    protected GrossToNetActivePowerCurve grossToNetActivePowerCurve;
    @XmlElement(name = "ReactiveCapabilityCurve")
    protected ReactiveCapabilityCurve reactiveCapabilityCurve;
    protected Float efficiency;
    protected ActivePower initialP;
    protected Float longPF;
    protected ActivePower maxOperatingP;
    protected ActivePower minOperatingP;
    protected Float normalPF;
    protected GeneratorControlSource genControlSource;
    protected ActivePower ratedGrossMaxP;
    protected ActivePower ratedGrossMinP;
    protected ActivePower ratedNetMaxP;
    protected Float shortPF;

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

    /**
     * Gets the value of the grossToNetActivePowerCurve property.
     * 
     * @return
     *     possible object is
     *     {@link GrossToNetActivePowerCurve }
     *     
     */
    public GrossToNetActivePowerCurve getGrossToNetActivePowerCurve() {
        return grossToNetActivePowerCurve;
    }

    /**
     * Sets the value of the grossToNetActivePowerCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossToNetActivePowerCurve }
     *     
     */
    public void setGrossToNetActivePowerCurve(GrossToNetActivePowerCurve value) {
        this.grossToNetActivePowerCurve = value;
    }

    /**
     * Gets the value of the reactiveCapabilityCurve property.
     * 
     * @return
     *     possible object is
     *     {@link ReactiveCapabilityCurve }
     *     
     */
    public ReactiveCapabilityCurve getReactiveCapabilityCurve() {
        return reactiveCapabilityCurve;
    }

    /**
     * Sets the value of the reactiveCapabilityCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactiveCapabilityCurve }
     *     
     */
    public void setReactiveCapabilityCurve(ReactiveCapabilityCurve value) {
        this.reactiveCapabilityCurve = value;
    }

    /**
     * Gets the value of the efficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEfficiency() {
        return efficiency;
    }

    /**
     * Sets the value of the efficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEfficiency(Float value) {
        this.efficiency = value;
    }

    /**
     * Gets the value of the initialP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getInitialP() {
        return initialP;
    }

    /**
     * Sets the value of the initialP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setInitialP(ActivePower value) {
        this.initialP = value;
    }

    /**
     * Gets the value of the longPF property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongPF() {
        return longPF;
    }

    /**
     * Sets the value of the longPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongPF(Float value) {
        this.longPF = value;
    }

    /**
     * Gets the value of the maxOperatingP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getMaxOperatingP() {
        return maxOperatingP;
    }

    /**
     * Sets the value of the maxOperatingP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setMaxOperatingP(ActivePower value) {
        this.maxOperatingP = value;
    }

    /**
     * Gets the value of the minOperatingP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getMinOperatingP() {
        return minOperatingP;
    }

    /**
     * Sets the value of the minOperatingP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setMinOperatingP(ActivePower value) {
        this.minOperatingP = value;
    }

    /**
     * Gets the value of the normalPF property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNormalPF() {
        return normalPF;
    }

    /**
     * Sets the value of the normalPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNormalPF(Float value) {
        this.normalPF = value;
    }

    /**
     * Gets the value of the genControlSource property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratorControlSource }
     *     
     */
    public GeneratorControlSource getGenControlSource() {
        return genControlSource;
    }

    /**
     * Sets the value of the genControlSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratorControlSource }
     *     
     */
    public void setGenControlSource(GeneratorControlSource value) {
        this.genControlSource = value;
    }

    /**
     * Gets the value of the ratedGrossMaxP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getRatedGrossMaxP() {
        return ratedGrossMaxP;
    }

    /**
     * Sets the value of the ratedGrossMaxP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setRatedGrossMaxP(ActivePower value) {
        this.ratedGrossMaxP = value;
    }

    /**
     * Gets the value of the ratedGrossMinP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getRatedGrossMinP() {
        return ratedGrossMinP;
    }

    /**
     * Sets the value of the ratedGrossMinP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setRatedGrossMinP(ActivePower value) {
        this.ratedGrossMinP = value;
    }

    /**
     * Gets the value of the ratedNetMaxP property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getRatedNetMaxP() {
        return ratedNetMaxP;
    }

    /**
     * Sets the value of the ratedNetMaxP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setRatedNetMaxP(ActivePower value) {
        this.ratedNetMaxP = value;
    }

    /**
     * Gets the value of the shortPF property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getShortPF() {
        return shortPF;
    }

    /**
     * Sets the value of the shortPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShortPF(Float value) {
        this.shortPF = value;
    }

}
