
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="workers" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWorker" minOccurs="0"/>
 *         &lt;element name="crewList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCrew" minOccurs="0"/>
 *         &lt;element name="vehicleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString9" minOccurs="0"/>
 *         &lt;element name="equipmentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString8" minOccurs="0"/>
 *         &lt;element name="vehicles" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfVehicle" minOccurs="0"/>
 *         &lt;element name="crewEquipmentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfEquipment" minOccurs="0"/>
 *         &lt;element name="switchingScheduleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSwitchingSchedule" minOccurs="0"/>
 *         &lt;element name="switchingStepList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSwitchingStep" minOccurs="0"/>
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
@XmlType(name = "resource", propOrder = {
    "workers",
    "crewList",
    "vehicleList",
    "equipmentList",
    "vehicles",
    "crewEquipmentList",
    "switchingScheduleList",
    "switchingStepList"
})
public class Resource
    extends MspObject
{

    protected ArrayOfWorker workers;
    protected ArrayOfCrew crewList;
    protected ArrayOfString9 vehicleList;
    protected ArrayOfString8 equipmentList;
    protected ArrayOfVehicle vehicles;
    protected ArrayOfEquipment crewEquipmentList;
    protected ArrayOfSwitchingSchedule switchingScheduleList;
    protected ArrayOfSwitchingStep switchingStepList;

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
     * Gets the value of the crewList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrew }
     *     
     */
    public ArrayOfCrew getCrewList() {
        return crewList;
    }

    /**
     * Sets the value of the crewList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrew }
     *     
     */
    public void setCrewList(ArrayOfCrew value) {
        this.crewList = value;
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
     * Gets the value of the crewEquipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEquipment }
     *     
     */
    public ArrayOfEquipment getCrewEquipmentList() {
        return crewEquipmentList;
    }

    /**
     * Sets the value of the crewEquipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEquipment }
     *     
     */
    public void setCrewEquipmentList(ArrayOfEquipment value) {
        this.crewEquipmentList = value;
    }

    /**
     * Gets the value of the switchingScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchingSchedule }
     *     
     */
    public ArrayOfSwitchingSchedule getSwitchingScheduleList() {
        return switchingScheduleList;
    }

    /**
     * Sets the value of the switchingScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchingSchedule }
     *     
     */
    public void setSwitchingScheduleList(ArrayOfSwitchingSchedule value) {
        this.switchingScheduleList = value;
    }

    /**
     * Gets the value of the switchingStepList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchingStep }
     *     
     */
    public ArrayOfSwitchingStep getSwitchingStepList() {
        return switchingStepList;
    }

    /**
     * Sets the value of the switchingStepList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchingStep }
     *     
     */
    public void setSwitchingStepList(ArrayOfSwitchingStep value) {
        this.switchingStepList = value;
    }

}
