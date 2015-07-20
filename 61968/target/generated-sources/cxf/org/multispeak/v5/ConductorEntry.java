
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ResistancePerUnitLength;
import org.multispeak.v5_0.commontypes.Thickness;
import org.multispeak.v5_0.commontypes.Weight;
import org.multispeak.v5_0.commontypes.WeightPerLength;
import org.multispeak.v5_0.enumerations.Material;


/**
 * This item is used to define an entry in a conductor catalog.
 * 
 * <p>Java class for conductorEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conductorEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="conductorSize" type="{http://www.multispeak.org/V5.0}conductorSize" minOccurs="0"/>
 *         &lt;element name="ampacity" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="stranding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="material" type="{http://www.multispeak.org/V5.0/enumerations}material" minOccurs="0"/>
 *         &lt;element name="conductorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coreDiameter" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="outsideDiameter" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="GMR" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="rDC1" type="{http://www.multispeak.org/V5.0/commonTypes}resistancePerUnitLength" minOccurs="0"/>
 *         &lt;element name="rAC1" type="{http://www.multispeak.org/V5.0/commonTypes}resistancePerUnitLength" minOccurs="0"/>
 *         &lt;element name="rAC2" type="{http://www.multispeak.org/V5.0/commonTypes}resistancePerUnitLength" minOccurs="0"/>
 *         &lt;element name="rAC3" type="{http://www.multispeak.org/V5.0/commonTypes}resistancePerUnitLength" minOccurs="0"/>
 *         &lt;element name="weightPerLength" type="{http://www.multispeak.org/V5.0/commonTypes}weightPerLength" minOccurs="0"/>
 *         &lt;element name="breakingStrength" type="{http://www.multispeak.org/V5.0/commonTypes}weight" minOccurs="0"/>
 *         &lt;element name="defaultStringingTension" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conductorEntry", propOrder = {
    "conductorSize",
    "ampacity",
    "stranding",
    "material",
    "conductorName",
    "coreDiameter",
    "outsideDiameter",
    "gmr",
    "rdc1",
    "rac1",
    "rac2",
    "rac3",
    "weightPerLength",
    "breakingStrength",
    "defaultStringingTension"
})
public class ConductorEntry
    extends MspElectricalDefinition
{

    protected ConductorSize conductorSize;
    protected Current ampacity;
    protected String stranding;
    protected Material material;
    protected String conductorName;
    protected Thickness coreDiameter;
    protected Thickness outsideDiameter;
    @XmlElement(name = "GMR")
    protected Length gmr;
    @XmlElement(name = "rDC1")
    protected ResistancePerUnitLength rdc1;
    @XmlElement(name = "rAC1")
    protected ResistancePerUnitLength rac1;
    @XmlElement(name = "rAC2")
    protected ResistancePerUnitLength rac2;
    @XmlElement(name = "rAC3")
    protected ResistancePerUnitLength rac3;
    protected WeightPerLength weightPerLength;
    protected Weight breakingStrength;
    protected Float defaultStringingTension;

    /**
     * Gets the value of the conductorSize property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorSize }
     *     
     */
    public ConductorSize getConductorSize() {
        return conductorSize;
    }

    /**
     * Sets the value of the conductorSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorSize }
     *     
     */
    public void setConductorSize(ConductorSize value) {
        this.conductorSize = value;
    }

    /**
     * Gets the value of the ampacity property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getAmpacity() {
        return ampacity;
    }

    /**
     * Sets the value of the ampacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setAmpacity(Current value) {
        this.ampacity = value;
    }

    /**
     * Gets the value of the stranding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStranding() {
        return stranding;
    }

    /**
     * Sets the value of the stranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStranding(String value) {
        this.stranding = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link Material }
     *     
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link Material }
     *     
     */
    public void setMaterial(Material value) {
        this.material = value;
    }

    /**
     * Gets the value of the conductorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductorName() {
        return conductorName;
    }

    /**
     * Sets the value of the conductorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductorName(String value) {
        this.conductorName = value;
    }

    /**
     * Gets the value of the coreDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getCoreDiameter() {
        return coreDiameter;
    }

    /**
     * Sets the value of the coreDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setCoreDiameter(Thickness value) {
        this.coreDiameter = value;
    }

    /**
     * Gets the value of the outsideDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getOutsideDiameter() {
        return outsideDiameter;
    }

    /**
     * Sets the value of the outsideDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setOutsideDiameter(Thickness value) {
        this.outsideDiameter = value;
    }

    /**
     * Gets the value of the gmr property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getGMR() {
        return gmr;
    }

    /**
     * Sets the value of the gmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setGMR(Length value) {
        this.gmr = value;
    }

    /**
     * Gets the value of the rdc1 property.
     * 
     * @return
     *     possible object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public ResistancePerUnitLength getRDC1() {
        return rdc1;
    }

    /**
     * Sets the value of the rdc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public void setRDC1(ResistancePerUnitLength value) {
        this.rdc1 = value;
    }

    /**
     * Gets the value of the rac1 property.
     * 
     * @return
     *     possible object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public ResistancePerUnitLength getRAC1() {
        return rac1;
    }

    /**
     * Sets the value of the rac1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public void setRAC1(ResistancePerUnitLength value) {
        this.rac1 = value;
    }

    /**
     * Gets the value of the rac2 property.
     * 
     * @return
     *     possible object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public ResistancePerUnitLength getRAC2() {
        return rac2;
    }

    /**
     * Sets the value of the rac2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public void setRAC2(ResistancePerUnitLength value) {
        this.rac2 = value;
    }

    /**
     * Gets the value of the rac3 property.
     * 
     * @return
     *     possible object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public ResistancePerUnitLength getRAC3() {
        return rac3;
    }

    /**
     * Sets the value of the rac3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public void setRAC3(ResistancePerUnitLength value) {
        this.rac3 = value;
    }

    /**
     * Gets the value of the weightPerLength property.
     * 
     * @return
     *     possible object is
     *     {@link WeightPerLength }
     *     
     */
    public WeightPerLength getWeightPerLength() {
        return weightPerLength;
    }

    /**
     * Sets the value of the weightPerLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightPerLength }
     *     
     */
    public void setWeightPerLength(WeightPerLength value) {
        this.weightPerLength = value;
    }

    /**
     * Gets the value of the breakingStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getBreakingStrength() {
        return breakingStrength;
    }

    /**
     * Sets the value of the breakingStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setBreakingStrength(Weight value) {
        this.breakingStrength = value;
    }

    /**
     * Gets the value of the defaultStringingTension property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultStringingTension() {
        return defaultStringingTension;
    }

    /**
     * Sets the value of the defaultStringingTension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultStringingTension(Float value) {
        this.defaultStringingTension = value;
    }

}
