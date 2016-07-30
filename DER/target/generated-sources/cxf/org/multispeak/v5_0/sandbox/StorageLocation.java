
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.LocationInformation;
import org.multispeak.v5.MspPointObject;
import org.multispeak.v5.OrganizationAssociations;
import org.multispeak.v5_0.commontypes.AddressItem;


/**
 * This is a location at which assets or inventory are
 * 				stored, for instance, a warehouse, pole yard or job site.
 * 			
 * 
 * <p>Java class for storageLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storageLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="storageLocationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storageLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storageSubLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storageDetailedLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressItem" type="{http://www.multispeak.org/V5.0/commonTypes}addressItem" minOccurs="0"/>
 *         &lt;element name="organizationAssociations" type="{http://www.multispeak.org/V5.0}organizationAssociations" minOccurs="0"/>
 *         &lt;element name="locationInformation" type="{http://www.multispeak.org/V5.0}locationInformation" minOccurs="0"/>
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
@XmlType(name = "storageLocation", propOrder = {
    "storageLocationType",
    "storageLocationDescription",
    "storageSubLocation",
    "storageDetailedLocation",
    "addressItem",
    "organizationAssociations",
    "locationInformation"
})
public class StorageLocation
    extends MspPointObject
{

    @XmlElement(required = true)
    protected String storageLocationType;
    protected String storageLocationDescription;
    protected String storageSubLocation;
    protected String storageDetailedLocation;
    protected AddressItem addressItem;
    protected OrganizationAssociations organizationAssociations;
    protected LocationInformation locationInformation;

    /**
     * Gets the value of the storageLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageLocationType() {
        return storageLocationType;
    }

    /**
     * Sets the value of the storageLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageLocationType(String value) {
        this.storageLocationType = value;
    }

    /**
     * Gets the value of the storageLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageLocationDescription() {
        return storageLocationDescription;
    }

    /**
     * Sets the value of the storageLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageLocationDescription(String value) {
        this.storageLocationDescription = value;
    }

    /**
     * Gets the value of the storageSubLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageSubLocation() {
        return storageSubLocation;
    }

    /**
     * Sets the value of the storageSubLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageSubLocation(String value) {
        this.storageSubLocation = value;
    }

    /**
     * Gets the value of the storageDetailedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageDetailedLocation() {
        return storageDetailedLocation;
    }

    /**
     * Sets the value of the storageDetailedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageDetailedLocation(String value) {
        this.storageDetailedLocation = value;
    }

    /**
     * Gets the value of the addressItem property.
     * 
     * @return
     *     possible object is
     *     {@link AddressItem }
     *     
     */
    public AddressItem getAddressItem() {
        return addressItem;
    }

    /**
     * Sets the value of the addressItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressItem }
     *     
     */
    public void setAddressItem(AddressItem value) {
        this.addressItem = value;
    }

    /**
     * Gets the value of the organizationAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAssociations }
     *     
     */
    public OrganizationAssociations getOrganizationAssociations() {
        return organizationAssociations;
    }

    /**
     * Sets the value of the organizationAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAssociations }
     *     
     */
    public void setOrganizationAssociations(OrganizationAssociations value) {
        this.organizationAssociations = value;
    }

    /**
     * Gets the value of the locationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInformation }
     *     
     */
    public LocationInformation getLocationInformation() {
        return locationInformation;
    }

    /**
     * Sets the value of the locationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInformation }
     *     
     */
    public void setLocationInformation(LocationInformation value) {
        this.locationInformation = value;
    }

}
