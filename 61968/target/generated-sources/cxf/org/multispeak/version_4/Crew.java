
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crew">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="crewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.multispeak.org/Version_4.1_Release}contactInfo" minOccurs="0"/>
 *         &lt;element name="isForeign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString9" minOccurs="0"/>
 *         &lt;element name="workerList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString12" minOccurs="0"/>
 *         &lt;element name="equipmentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString8" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="capabilityList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString13" minOccurs="0"/>
 *         &lt;element name="vehicles" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfVehicle" minOccurs="0"/>
 *         &lt;element name="workers" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWorker" minOccurs="0"/>
 *         &lt;element name="capabilities" type="{http://www.multispeak.org/Version_4.1_Release}capabilities" minOccurs="0"/>
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
@XmlType(name = "crew", propOrder = {
    "crewName",
    "foreman",
    "contactInfo",
    "isForeign",
    "baseLocation",
    "crewType",
    "vehicleList",
    "workerList",
    "equipmentList",
    "isActive",
    "capabilityList",
    "vehicles",
    "workers",
    "capabilities"
})
public class Crew
    extends MspObject
{

    protected String crewName;
    protected String foreman;
    protected ContactInfo contactInfo;
    protected Boolean isForeign;
    protected String baseLocation;
    protected String crewType;
    protected ArrayOfString9 vehicleList;
    protected ArrayOfString12 workerList;
    protected ArrayOfString8 equipmentList;
    protected Boolean isActive;
    protected ArrayOfString13 capabilityList;
    protected ArrayOfVehicle vehicles;
    protected ArrayOfWorker workers;
    protected Capabilities capabilities;

    /**
     * Gets the value of the crewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewName() {
        return crewName;
    }

    /**
     * Sets the value of the crewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewName(String value) {
        this.crewName = value;
    }

    /**
     * Gets the value of the foreman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeman() {
        return foreman;
    }

    /**
     * Sets the value of the foreman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeman(String value) {
        this.foreman = value;
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
     * Gets the value of the isForeign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForeign() {
        return isForeign;
    }

    /**
     * Sets the value of the isForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForeign(Boolean value) {
        this.isForeign = value;
    }

    /**
     * Gets the value of the baseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLocation() {
        return baseLocation;
    }

    /**
     * Sets the value of the baseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLocation(String value) {
        this.baseLocation = value;
    }

    /**
     * Gets the value of the crewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewType() {
        return crewType;
    }

    /**
     * Sets the value of the crewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewType(String value) {
        this.crewType = value;
    }

    /**
     * Gets the value of the vehicleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString9 }
     *     
     */
    public ArrayOfString9 getVehicleList() {
        return vehicleList;
    }

    /**
     * Sets the value of the vehicleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString9 }
     *     
     */
    public void setVehicleList(ArrayOfString9 value) {
        this.vehicleList = value;
    }

    /**
     * Gets the value of the workerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString12 }
     *     
     */
    public ArrayOfString12 getWorkerList() {
        return workerList;
    }

    /**
     * Sets the value of the workerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString12 }
     *     
     */
    public void setWorkerList(ArrayOfString12 value) {
        this.workerList = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString8 }
     *     
     */
    public ArrayOfString8 getEquipmentList() {
        return equipmentList;
    }

    /**
     * Sets the value of the equipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString8 }
     *     
     */
    public void setEquipmentList(ArrayOfString8 value) {
        this.equipmentList = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the capabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString13 }
     *     
     */
    public ArrayOfString13 getCapabilityList() {
        return capabilityList;
    }

    /**
     * Sets the value of the capabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString13 }
     *     
     */
    public void setCapabilityList(ArrayOfString13 value) {
        this.capabilityList = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicle }
     *     
     */
    public ArrayOfVehicle getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicle }
     *     
     */
    public void setVehicles(ArrayOfVehicle value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the workers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorker }
     *     
     */
    public ArrayOfWorker getWorkers() {
        return workers;
    }

    /**
     * Sets the value of the workers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorker }
     *     
     */
    public void setWorkers(ArrayOfWorker value) {
        this.workers = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities }
     *     
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities }
     *     
     */
    public void setCapabilities(Capabilities value) {
        this.capabilities = value;
    }

}
