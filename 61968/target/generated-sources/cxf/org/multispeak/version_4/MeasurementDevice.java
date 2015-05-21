
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurementDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurementDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="measurementDeviceType" type="{http://www.multispeak.org/Version_4.1_Release}measurementDeviceType" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_4.1_Release}eaLoc" minOccurs="0"/>
 *         &lt;element name="substation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="measuremrentDeviceStatus" type="{http://www.multispeak.org/Version_4.1_Release}measurementDeviceStatus" minOccurs="0"/>
 *         &lt;element name="pointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "measurementDevice", propOrder = {
    "measurementDeviceType",
    "eaLoc",
    "substation",
    "feeder",
    "phaseCode",
    "measuremrentDeviceStatus",
    "pointID",
    "assetFields"
})
public class MeasurementDevice
    extends MspPointObject
{

    protected MeasurementDeviceType measurementDeviceType;
    protected EaLoc eaLoc;
    protected String substation;
    protected String feeder;
    protected PhaseCode phaseCode;
    protected MeasurementDeviceStatus measuremrentDeviceStatus;
    protected String pointID;
    protected AssetFields assetFields;

    /**
     * Gets the value of the measurementDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDeviceType }
     *     
     */
    public MeasurementDeviceType getMeasurementDeviceType() {
        return measurementDeviceType;
    }

    /**
     * Sets the value of the measurementDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDeviceType }
     *     
     */
    public void setMeasurementDeviceType(MeasurementDeviceType value) {
        this.measurementDeviceType = value;
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
     * Gets the value of the measuremrentDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementDeviceStatus }
     *     
     */
    public MeasurementDeviceStatus getMeasuremrentDeviceStatus() {
        return measuremrentDeviceStatus;
    }

    /**
     * Sets the value of the measuremrentDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementDeviceStatus }
     *     
     */
    public void setMeasuremrentDeviceStatus(MeasurementDeviceStatus value) {
        this.measuremrentDeviceStatus = value;
    }

    /**
     * Gets the value of the pointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointID() {
        return pointID;
    }

    /**
     * Sets the value of the pointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointID(String value) {
        this.pointID = value;
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
