
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspPointObject;
import org.multispeak.v5.OrganizationAssociations;
import org.multispeak.v5.ServiceAgreements;
import org.multispeak.v5_0.commontypes.ContactInfo;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.RealEnergy;


/**
 * A distributed energy resource. The name of the DER
 * 				SHALL be carried in the DER.primaryIdentifier.
 * 
 * <p>Java class for DER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DER">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="DERType" type="{http://www.multispeak.org/V5.0/sandbox}DERType"/>
 *         &lt;element name="contactInfo" type="{http://www.multispeak.org/V5.0/commonTypes}contactInfo" minOccurs="0"/>
 *         &lt;element name="serviceAgreements" type="{http://www.multispeak.org/V5.0}serviceAgreements" minOccurs="0"/>
 *         &lt;element name="organizationAssociations" type="{http://www.multispeak.org/V5.0}organizationAssociations" minOccurs="0"/>
 *         &lt;element name="realPowerRatings" type="{http://www.multispeak.org/V5.0/sandbox}realPowerRatings" minOccurs="0"/>
 *         &lt;element name="reactivePowerRatings" type="{http://www.multispeak.org/V5.0/sandbox}reactivePowerRatings" minOccurs="0"/>
 *         &lt;element name="apparentPowerRatings" type="{http://www.multispeak.org/V5.0/sandbox}apparentPowerRatings" minOccurs="0"/>
 *         &lt;element name="storagePowerRating" type="{http://www.multispeak.org/V5.0/commonTypes}realEnergy" minOccurs="0"/>
 *         &lt;element name="notificationTime" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="DERRealPowerRampRate" type="{http://www.multispeak.org/V5.0/sandbox}realPowerRampRate" minOccurs="0"/>
 *         &lt;element name="generatingUnits" type="{http://www.multispeak.org/V5.0/sandbox}generatingUnits" minOccurs="0"/>
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
@XmlType(name = "DER", propOrder = {
    "derType",
    "contactInfo",
    "serviceAgreements",
    "organizationAssociations",
    "realPowerRatings",
    "reactivePowerRatings",
    "apparentPowerRatings",
    "storagePowerRating",
    "notificationTime",
    "derRealPowerRampRate",
    "generatingUnits"
})
public class DER
    extends MspPointObject
{

    @XmlElement(name = "DERType", required = true)
    protected DERType derType;
    protected ContactInfo contactInfo;
    protected ServiceAgreements serviceAgreements;
    protected OrganizationAssociations organizationAssociations;
    protected RealPowerRatings realPowerRatings;
    protected ReactivePowerRatings reactivePowerRatings;
    protected ApparentPowerRatings apparentPowerRatings;
    protected RealEnergy storagePowerRating;
    protected Duration notificationTime;
    @XmlElement(name = "DERRealPowerRampRate")
    protected RealPowerRampRate derRealPowerRampRate;
    protected GeneratingUnits generatingUnits;

    /**
     * Gets the value of the derType property.
     * 
     * @return
     *     possible object is
     *     {@link DERType }
     *     
     */
    public DERType getDERType() {
        return derType;
    }

    /**
     * Sets the value of the derType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERType }
     *     
     */
    public void setDERType(DERType value) {
        this.derType = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the serviceAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAgreements }
     *     
     */
    public ServiceAgreements getServiceAgreements() {
        return serviceAgreements;
    }

    /**
     * Sets the value of the serviceAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAgreements }
     *     
     */
    public void setServiceAgreements(ServiceAgreements value) {
        this.serviceAgreements = value;
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
     * Gets the value of the realPowerRatings property.
     * 
     * @return
     *     possible object is
     *     {@link RealPowerRatings }
     *     
     */
    public RealPowerRatings getRealPowerRatings() {
        return realPowerRatings;
    }

    /**
     * Sets the value of the realPowerRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPowerRatings }
     *     
     */
    public void setRealPowerRatings(RealPowerRatings value) {
        this.realPowerRatings = value;
    }

    /**
     * Gets the value of the reactivePowerRatings property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePowerRatings }
     *     
     */
    public ReactivePowerRatings getReactivePowerRatings() {
        return reactivePowerRatings;
    }

    /**
     * Sets the value of the reactivePowerRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePowerRatings }
     *     
     */
    public void setReactivePowerRatings(ReactivePowerRatings value) {
        this.reactivePowerRatings = value;
    }

    /**
     * Gets the value of the apparentPowerRatings property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPowerRatings }
     *     
     */
    public ApparentPowerRatings getApparentPowerRatings() {
        return apparentPowerRatings;
    }

    /**
     * Sets the value of the apparentPowerRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPowerRatings }
     *     
     */
    public void setApparentPowerRatings(ApparentPowerRatings value) {
        this.apparentPowerRatings = value;
    }

    /**
     * Gets the value of the storagePowerRating property.
     * 
     * @return
     *     possible object is
     *     {@link RealEnergy }
     *     
     */
    public RealEnergy getStoragePowerRating() {
        return storagePowerRating;
    }

    /**
     * Sets the value of the storagePowerRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEnergy }
     *     
     */
    public void setStoragePowerRating(RealEnergy value) {
        this.storagePowerRating = value;
    }

    /**
     * Gets the value of the notificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getNotificationTime() {
        return notificationTime;
    }

    /**
     * Sets the value of the notificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setNotificationTime(Duration value) {
        this.notificationTime = value;
    }

    /**
     * Gets the value of the derRealPowerRampRate property.
     * 
     * @return
     *     possible object is
     *     {@link RealPowerRampRate }
     *     
     */
    public RealPowerRampRate getDERRealPowerRampRate() {
        return derRealPowerRampRate;
    }

    /**
     * Sets the value of the derRealPowerRampRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPowerRampRate }
     *     
     */
    public void setDERRealPowerRampRate(RealPowerRampRate value) {
        this.derRealPowerRampRate = value;
    }

    /**
     * Gets the value of the generatingUnits property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratingUnits }
     *     
     */
    public GeneratingUnits getGeneratingUnits() {
        return generatingUnits;
    }

    /**
     * Sets the value of the generatingUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratingUnits }
     *     
     */
    public void setGeneratingUnits(GeneratingUnits value) {
        this.generatingUnits = value;
    }

}
