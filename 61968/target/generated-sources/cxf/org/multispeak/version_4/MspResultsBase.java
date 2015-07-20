
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspResultsBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspResultsBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="resultsType" type="{http://www.multispeak.org/Version_4.1_Release}resultsType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_4.1_Release}eaLoc" minOccurs="0"/>
 *         &lt;element name="parentID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="loadCon" type="{http://www.multispeak.org/Version_4.1_Release}loadConnection" minOccurs="0"/>
 *         &lt;element name="equipRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distanceFromSource" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *         &lt;element name="sectionLength" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *         &lt;element name="baseVoltageA" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="baseVoltageB" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="baseVoltageC" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="baseVoltageBalanced" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="basePower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
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
@XmlType(name = "mspResultsBase", propOrder = {
    "resultsType",
    "source",
    "feeder",
    "eaLoc",
    "parentID",
    "phaseCode",
    "loadCon",
    "equipRef",
    "distanceFromSource",
    "sectionLength",
    "baseVoltageA",
    "baseVoltageB",
    "baseVoltageC",
    "baseVoltageBalanced",
    "basePower"
})
@XmlSeeAlso({
    LoadFlowResult.class,
    ShortCircuitAnalysisResult.class
})
public abstract class MspResultsBase
    extends MspObject
{

    protected ResultsType resultsType;
    protected String source;
    protected String feeder;
    protected EaLoc eaLoc;
    protected ObjectRef parentID;
    protected PhaseCode phaseCode;
    protected LoadConnection loadCon;
    protected String equipRef;
    protected Length distanceFromSource;
    protected Length sectionLength;
    protected Voltage baseVoltageA;
    protected Voltage baseVoltageB;
    protected Voltage baseVoltageC;
    protected Voltage baseVoltageBalanced;
    protected ApparentPower basePower;

    /**
     * Gets the value of the resultsType property.
     * 
     * @return
     *     possible object is
     *     {@link ResultsType }
     *     
     */
    public ResultsType getResultsType() {
        return resultsType;
    }

    /**
     * Sets the value of the resultsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsType }
     *     
     */
    public void setResultsType(ResultsType value) {
        this.resultsType = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the eaLoc property.
     * 
     * @return
     *     possible object is
     *     {@link EaLoc }
     *     
     */
    public EaLoc getEaLoc() {
        return eaLoc;
    }

    /**
     * Sets the value of the eaLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaLoc }
     *     
     */
    public void setEaLoc(EaLoc value) {
        this.eaLoc = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setParentID(ObjectRef value) {
        this.parentID = value;
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
     * Gets the value of the loadCon property.
     * 
     * @return
     *     possible object is
     *     {@link LoadConnection }
     *     
     */
    public LoadConnection getLoadCon() {
        return loadCon;
    }

    /**
     * Sets the value of the loadCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadConnection }
     *     
     */
    public void setLoadCon(LoadConnection value) {
        this.loadCon = value;
    }

    /**
     * Gets the value of the equipRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipRef() {
        return equipRef;
    }

    /**
     * Sets the value of the equipRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipRef(String value) {
        this.equipRef = value;
    }

    /**
     * Gets the value of the distanceFromSource property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getDistanceFromSource() {
        return distanceFromSource;
    }

    /**
     * Sets the value of the distanceFromSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setDistanceFromSource(Length value) {
        this.distanceFromSource = value;
    }

    /**
     * Gets the value of the sectionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getSectionLength() {
        return sectionLength;
    }

    /**
     * Sets the value of the sectionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setSectionLength(Length value) {
        this.sectionLength = value;
    }

    /**
     * Gets the value of the baseVoltageA property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageA() {
        return baseVoltageA;
    }

    /**
     * Sets the value of the baseVoltageA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageA(Voltage value) {
        this.baseVoltageA = value;
    }

    /**
     * Gets the value of the baseVoltageB property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageB() {
        return baseVoltageB;
    }

    /**
     * Sets the value of the baseVoltageB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageB(Voltage value) {
        this.baseVoltageB = value;
    }

    /**
     * Gets the value of the baseVoltageC property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageC() {
        return baseVoltageC;
    }

    /**
     * Sets the value of the baseVoltageC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageC(Voltage value) {
        this.baseVoltageC = value;
    }

    /**
     * Gets the value of the baseVoltageBalanced property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageBalanced() {
        return baseVoltageBalanced;
    }

    /**
     * Sets the value of the baseVoltageBalanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageBalanced(Voltage value) {
        this.baseVoltageBalanced = value;
    }

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setBasePower(ApparentPower value) {
        this.basePower = value;
    }

}
