
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mspDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="deviceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "mspDevice", propOrder = {
    "deviceClass",
    "inServiceDate",
    "outServiceDate",
    "facilityID",
    "manufacturer",
    "serialNumber",
    "assetFields"
})
@XmlSeeAlso({
    Module.class,
    CDDevice.class
})
public abstract class MspDevice
    extends MspObject
{

    protected String deviceClass;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inServiceDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outServiceDate;
    protected String facilityID;
    protected String manufacturer;
    protected String serialNumber;
    protected AssetFields assetFields;

    /**
     * Gets the value of the deviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceClass() {
        return deviceClass;
    }

    /**
     * Sets the value of the deviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceClass(String value) {
        this.deviceClass = value;
    }

    /**
     * Gets the value of the inServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInServiceDate() {
        return inServiceDate;
    }

    /**
     * Sets the value of the inServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInServiceDate(XMLGregorianCalendar value) {
        this.inServiceDate = value;
    }

    /**
     * Gets the value of the outServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutServiceDate() {
        return outServiceDate;
    }

    /**
     * Sets the value of the outServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutServiceDate(XMLGregorianCalendar value) {
        this.outServiceDate = value;
    }

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
