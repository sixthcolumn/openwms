
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mspMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="removedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metrologyFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metrologyFirmwareRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMRDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMRVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterStatusList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString1" minOccurs="0"/>
 *         &lt;element name="moduleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfModule" minOccurs="0"/>
 *         &lt;element name="utilityInfo" type="{http://www.multispeak.org/Version_4.1_Release}utilityInfo" minOccurs="0"/>
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
@XmlType(name = "mspMeter", propOrder = {
    "meterNo",
    "installedDate",
    "removedDate",
    "manufacturer",
    "catalogNumber",
    "serialNumber",
    "metrologyFirmwareVersion",
    "metrologyFirmwareRevision",
    "meterType",
    "amrDeviceType",
    "amrVendor",
    "billingCycle",
    "meterStatusList",
    "moduleList",
    "utilityInfo"
})
@XmlSeeAlso({
    ReceivedWaterMeter.class,
    ReceivedPropaneMeter.class,
    WaterMeter.class,
    GasMeter.class,
    ElectricMeter.class,
    PropaneMeter.class,
    ReceivedGasMeter.class,
    OtherMeter.class,
    ReceivedElectricMeter.class
})
public abstract class MspMeter
    extends MspObject
{

    protected String meterNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar installedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar removedDate;
    protected String manufacturer;
    protected String catalogNumber;
    protected String serialNumber;
    protected String metrologyFirmwareVersion;
    protected String metrologyFirmwareRevision;
    protected String meterType;
    @XmlElement(name = "AMRDeviceType")
    protected String amrDeviceType;
    @XmlElement(name = "AMRVendor")
    protected String amrVendor;
    protected String billingCycle;
    protected ArrayOfString1 meterStatusList;
    protected ArrayOfModule moduleList;
    protected UtilityInfo utilityInfo;

    /**
     * Gets the value of the meterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * Sets the value of the meterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNo(String value) {
        this.meterNo = value;
    }

    /**
     * Gets the value of the installedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstalledDate() {
        return installedDate;
    }

    /**
     * Sets the value of the installedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstalledDate(XMLGregorianCalendar value) {
        this.installedDate = value;
    }

    /**
     * Gets the value of the removedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemovedDate() {
        return removedDate;
    }

    /**
     * Sets the value of the removedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemovedDate(XMLGregorianCalendar value) {
        this.removedDate = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the catalogNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogNumber() {
        return catalogNumber;
    }

    /**
     * Sets the value of the catalogNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogNumber(String value) {
        this.catalogNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the metrologyFirmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetrologyFirmwareVersion() {
        return metrologyFirmwareVersion;
    }

    /**
     * Sets the value of the metrologyFirmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetrologyFirmwareVersion(String value) {
        this.metrologyFirmwareVersion = value;
    }

    /**
     * Gets the value of the metrologyFirmwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetrologyFirmwareRevision() {
        return metrologyFirmwareRevision;
    }

    /**
     * Sets the value of the metrologyFirmwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetrologyFirmwareRevision(String value) {
        this.metrologyFirmwareRevision = value;
    }

    /**
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterType(String value) {
        this.meterType = value;
    }

    /**
     * Gets the value of the amrDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMRDeviceType() {
        return amrDeviceType;
    }

    /**
     * Sets the value of the amrDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMRDeviceType(String value) {
        this.amrDeviceType = value;
    }

    /**
     * Gets the value of the amrVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMRVendor() {
        return amrVendor;
    }

    /**
     * Sets the value of the amrVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMRVendor(String value) {
        this.amrVendor = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycle(String value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the meterStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getMeterStatusList() {
        return meterStatusList;
    }

    /**
     * Sets the value of the meterStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setMeterStatusList(ArrayOfString1 value) {
        this.meterStatusList = value;
    }

    /**
     * Gets the value of the moduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModule }
     *     
     */
    public ArrayOfModule getModuleList() {
        return moduleList;
    }

    /**
     * Sets the value of the moduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModule }
     *     
     */
    public void setModuleList(ArrayOfModule value) {
        this.moduleList = value;
    }

    /**
     * Gets the value of the utilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityInfo }
     *     
     */
    public UtilityInfo getUtilityInfo() {
        return utilityInfo;
    }

    /**
     * Sets the value of the utilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityInfo }
     *     
     */
    public void setUtilityInfo(UtilityInfo value) {
        this.utilityInfo = value;
    }

}
