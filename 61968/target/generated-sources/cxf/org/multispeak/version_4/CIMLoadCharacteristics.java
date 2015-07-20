
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.cpsm_v4.ConformLoadSchedule;
import _1_release.cpsm_v4.NonConformLoadSchedule;
import _1_release.cpsm_v4.PerCent;


/**
 * <p>Java class for CIMLoadCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMLoadCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conformLoadSchedule" type="{cpsm_V4.1_Release}ConformLoadSchedule" minOccurs="0"/>
 *         &lt;element name="nonConformLoadSchedule" type="{cpsm_V4.1_Release}NonConformLoadSchedule" minOccurs="0"/>
 *         &lt;element name="feederLoadMgtFactor" type="{cpsm_V4.1_Release}PerCent" minOccurs="0"/>
 *         &lt;element name="mVArColdPickUpFactor" type="{cpsm_V4.1_Release}PerCent" minOccurs="0"/>
 *         &lt;element name="mWColdPickUpFactor" type="{cpsm_V4.1_Release}PerCent" minOccurs="0"/>
 *         &lt;element name="loadAllocationFactor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="subLoadAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMLoadCharacteristics", propOrder = {
    "conformLoadSchedule",
    "nonConformLoadSchedule",
    "feederLoadMgtFactor",
    "mvArColdPickUpFactor",
    "mwColdPickUpFactor",
    "loadAllocationFactor",
    "subLoadAreaID"
})
public class CIMLoadCharacteristics {

    protected ConformLoadSchedule conformLoadSchedule;
    protected NonConformLoadSchedule nonConformLoadSchedule;
    protected PerCent feederLoadMgtFactor;
    @XmlElement(name = "mVArColdPickUpFactor")
    protected PerCent mvArColdPickUpFactor;
    @XmlElement(name = "mWColdPickUpFactor")
    protected PerCent mwColdPickUpFactor;
    protected Float loadAllocationFactor;
    protected String subLoadAreaID;

    /**
     * Gets the value of the conformLoadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public ConformLoadSchedule getConformLoadSchedule() {
        return conformLoadSchedule;
    }

    /**
     * Sets the value of the conformLoadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public void setConformLoadSchedule(ConformLoadSchedule value) {
        this.conformLoadSchedule = value;
    }

    /**
     * Gets the value of the nonConformLoadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link NonConformLoadSchedule }
     *     
     */
    public NonConformLoadSchedule getNonConformLoadSchedule() {
        return nonConformLoadSchedule;
    }

    /**
     * Sets the value of the nonConformLoadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonConformLoadSchedule }
     *     
     */
    public void setNonConformLoadSchedule(NonConformLoadSchedule value) {
        this.nonConformLoadSchedule = value;
    }

    /**
     * Gets the value of the feederLoadMgtFactor property.
     * 
     * @return
     *     possible object is
     *     {@link PerCent }
     *     
     */
    public PerCent getFeederLoadMgtFactor() {
        return feederLoadMgtFactor;
    }

    /**
     * Sets the value of the feederLoadMgtFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCent }
     *     
     */
    public void setFeederLoadMgtFactor(PerCent value) {
        this.feederLoadMgtFactor = value;
    }

    /**
     * Gets the value of the mvArColdPickUpFactor property.
     * 
     * @return
     *     possible object is
     *     {@link PerCent }
     *     
     */
    public PerCent getMVArColdPickUpFactor() {
        return mvArColdPickUpFactor;
    }

    /**
     * Sets the value of the mvArColdPickUpFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCent }
     *     
     */
    public void setMVArColdPickUpFactor(PerCent value) {
        this.mvArColdPickUpFactor = value;
    }

    /**
     * Gets the value of the mwColdPickUpFactor property.
     * 
     * @return
     *     possible object is
     *     {@link PerCent }
     *     
     */
    public PerCent getMWColdPickUpFactor() {
        return mwColdPickUpFactor;
    }

    /**
     * Sets the value of the mwColdPickUpFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCent }
     *     
     */
    public void setMWColdPickUpFactor(PerCent value) {
        this.mwColdPickUpFactor = value;
    }

    /**
     * Gets the value of the loadAllocationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLoadAllocationFactor() {
        return loadAllocationFactor;
    }

    /**
     * Sets the value of the loadAllocationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLoadAllocationFactor(Float value) {
        this.loadAllocationFactor = value;
    }

    /**
     * Gets the value of the subLoadAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLoadAreaID() {
        return subLoadAreaID;
    }

    /**
     * Sets the value of the subLoadAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLoadAreaID(String value) {
        this.subLoadAreaID = value;
    }

}
