
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billingAccountLoad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingAccountLoad">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_4.1_Release}eaLoc" minOccurs="0"/>
 *         &lt;element name="substation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="kwhUse" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="demand" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kvarDemand" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="stLiteKwh" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="servType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kwhAdj" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kwAdj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="xfmrKva" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="gLCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/Version_4.1_Release}GMLLocation" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "billingAccountLoad", propOrder = {
    "accountNumber",
    "eaLoc",
    "substation",
    "feeder",
    "phaseCode",
    "kwhUse",
    "demand",
    "hp",
    "kvarDemand",
    "stLiteKwh",
    "meterID",
    "servType",
    "revenueClass",
    "kwhAdj",
    "kwAdj",
    "xfmrKva",
    "glCode",
    "zone",
    "gmlLocation",
    "gridLocation"
})
public class BillingAccountLoad
    extends MspObject
{

    protected String accountNumber;
    protected EaLoc eaLoc;
    protected String substation;
    protected String feeder;
    protected PhaseCode phaseCode;
    protected Float kwhUse;
    protected Long demand;
    protected Float hp;
    protected Float kvarDemand;
    protected Long stLiteKwh;
    protected MeterID meterID;
    protected String servType;
    protected String revenueClass;
    protected Float kwhAdj;
    protected Long kwAdj;
    protected Long xfmrKva;
    @XmlElement(name = "gLCode")
    protected String glCode;
    protected String zone;
    @XmlElement(name = "GMLLocation")
    protected GMLLocation gmlLocation;
    protected String gridLocation;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     * Gets the value of the substation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstation() {
        return substation;
    }

    /**
     * Sets the value of the substation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstation(String value) {
        this.substation = value;
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
     * Gets the value of the kwhUse property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwhUse() {
        return kwhUse;
    }

    /**
     * Sets the value of the kwhUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwhUse(Float value) {
        this.kwhUse = value;
    }

    /**
     * Gets the value of the demand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemand() {
        return demand;
    }

    /**
     * Sets the value of the demand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemand(Long value) {
        this.demand = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHp(Float value) {
        this.hp = value;
    }

    /**
     * Gets the value of the kvarDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKvarDemand() {
        return kvarDemand;
    }

    /**
     * Sets the value of the kvarDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKvarDemand(Float value) {
        this.kvarDemand = value;
    }

    /**
     * Gets the value of the stLiteKwh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStLiteKwh() {
        return stLiteKwh;
    }

    /**
     * Sets the value of the stLiteKwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStLiteKwh(Long value) {
        this.stLiteKwh = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the servType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServType() {
        return servType;
    }

    /**
     * Sets the value of the servType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServType(String value) {
        this.servType = value;
    }

    /**
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the kwhAdj property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwhAdj() {
        return kwhAdj;
    }

    /**
     * Sets the value of the kwhAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwhAdj(Float value) {
        this.kwhAdj = value;
    }

    /**
     * Gets the value of the kwAdj property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKwAdj() {
        return kwAdj;
    }

    /**
     * Sets the value of the kwAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKwAdj(Long value) {
        this.kwAdj = value;
    }

    /**
     * Gets the value of the xfmrKva property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getXfmrKva() {
        return xfmrKva;
    }

    /**
     * Sets the value of the xfmrKva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setXfmrKva(Long value) {
        this.xfmrKva = value;
    }

    /**
     * Gets the value of the glCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLCode() {
        return glCode;
    }

    /**
     * Sets the value of the glCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLCode(String value) {
        this.glCode = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLocation }
     *     
     */
    public GMLLocation getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLocation }
     *     
     */
    public void setGMLLocation(GMLLocation value) {
        this.gmlLocation = value;
    }

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
    }

}
