
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="form" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseType" type="{http://www.multispeak.org/Version_4.1_Release}baseType" minOccurs="0"/>
 *         &lt;element name="instrumentTransformers" type="{http://www.multispeak.org/Version_4.1_Release}instrumentTransformers" minOccurs="0"/>
 *         &lt;element name="deviceList" type="{http://www.multispeak.org/Version_4.1_Release}deviceList" minOccurs="0"/>
 *         &lt;element name="electricMeter" type="{http://www.multispeak.org/Version_4.1_Release}electricMeter" minOccurs="0"/>
 *         &lt;element name="inHomeDisplays" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplay" minOccurs="0"/>
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
@XmlType(name = "meterBase", propOrder = {
    "meterID",
    "serviceLocationID",
    "electricServiceID",
    "premiseID",
    "form",
    "clazz",
    "baseType",
    "instrumentTransformers",
    "deviceList",
    "electricMeter",
    "inHomeDisplays",
    "assetFields"
})
public class MeterBase
    extends MspPointObject
{

    protected MeterID meterID;
    protected String serviceLocationID;
    protected String electricServiceID;
    protected String premiseID;
    protected String form;
    @XmlElement(name = "class")
    protected String clazz;
    protected BaseType baseType;
    protected InstrumentTransformers instrumentTransformers;
    protected DeviceList deviceList;
    protected ElectricMeter electricMeter;
    protected ArrayOfInHomeDisplay inHomeDisplays;
    protected AssetFields assetFields;

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
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the electricServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectricServiceID() {
        return electricServiceID;
    }

    /**
     * Sets the value of the electricServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricServiceID(String value) {
        this.electricServiceID = value;
    }

    /**
     * Gets the value of the premiseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseID() {
        return premiseID;
    }

    /**
     * Sets the value of the premiseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseID(String value) {
        this.premiseID = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link BaseType }
     *     
     */
    public BaseType getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseType }
     *     
     */
    public void setBaseType(BaseType value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the instrumentTransformers property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTransformers }
     *     
     */
    public InstrumentTransformers getInstrumentTransformers() {
        return instrumentTransformers;
    }

    /**
     * Sets the value of the instrumentTransformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTransformers }
     *     
     */
    public void setInstrumentTransformers(InstrumentTransformers value) {
        this.instrumentTransformers = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setDeviceList(DeviceList value) {
        this.deviceList = value;
    }

    /**
     * Gets the value of the electricMeter property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeter }
     *     
     */
    public ElectricMeter getElectricMeter() {
        return electricMeter;
    }

    /**
     * Sets the value of the electricMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeter }
     *     
     */
    public void setElectricMeter(ElectricMeter value) {
        this.electricMeter = value;
    }

    /**
     * Gets the value of the inHomeDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplay }
     *     
     */
    public ArrayOfInHomeDisplay getInHomeDisplays() {
        return inHomeDisplays;
    }

    /**
     * Sets the value of the inHomeDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplay }
     *     
     */
    public void setInHomeDisplays(ArrayOfInHomeDisplay value) {
        this.inHomeDisplays = value;
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
