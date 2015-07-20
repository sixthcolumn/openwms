
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReasonCodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonCodeList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageCause" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="equipmentFailure" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="voltageLevel" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="weatherCondition" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="systemCharacterization" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="responsibleSystem" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="outageCondition" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="interruptingDevice" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="interruptingDeviceInitiation" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *         &lt;element name="customerResoration" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
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
@XmlType(name = "outageReasonCodeList", propOrder = {
    "outageCause",
    "equipmentFailure",
    "voltageLevel",
    "weatherCondition",
    "systemCharacterization",
    "responsibleSystem",
    "outageCondition",
    "interruptingDevice",
    "interruptingDeviceInitiation",
    "customerResoration"
})
public class OutageReasonCodeList
    extends MspObject
{

    protected OutageReason outageCause;
    protected OutageReason equipmentFailure;
    protected OutageReason voltageLevel;
    protected OutageReason weatherCondition;
    protected OutageReason systemCharacterization;
    protected OutageReason responsibleSystem;
    protected OutageReason outageCondition;
    protected OutageReason interruptingDevice;
    protected OutageReason interruptingDeviceInitiation;
    protected OutageReason customerResoration;

    /**
     * Gets the value of the outageCause property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getOutageCause() {
        return outageCause;
    }

    /**
     * Sets the value of the outageCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setOutageCause(OutageReason value) {
        this.outageCause = value;
    }

    /**
     * Gets the value of the equipmentFailure property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getEquipmentFailure() {
        return equipmentFailure;
    }

    /**
     * Sets the value of the equipmentFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setEquipmentFailure(OutageReason value) {
        this.equipmentFailure = value;
    }

    /**
     * Gets the value of the voltageLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * Sets the value of the voltageLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setVoltageLevel(OutageReason value) {
        this.voltageLevel = value;
    }

    /**
     * Gets the value of the weatherCondition property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * Sets the value of the weatherCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setWeatherCondition(OutageReason value) {
        this.weatherCondition = value;
    }

    /**
     * Gets the value of the systemCharacterization property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getSystemCharacterization() {
        return systemCharacterization;
    }

    /**
     * Sets the value of the systemCharacterization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setSystemCharacterization(OutageReason value) {
        this.systemCharacterization = value;
    }

    /**
     * Gets the value of the responsibleSystem property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getResponsibleSystem() {
        return responsibleSystem;
    }

    /**
     * Sets the value of the responsibleSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setResponsibleSystem(OutageReason value) {
        this.responsibleSystem = value;
    }

    /**
     * Gets the value of the outageCondition property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getOutageCondition() {
        return outageCondition;
    }

    /**
     * Sets the value of the outageCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setOutageCondition(OutageReason value) {
        this.outageCondition = value;
    }

    /**
     * Gets the value of the interruptingDevice property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getInterruptingDevice() {
        return interruptingDevice;
    }

    /**
     * Sets the value of the interruptingDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setInterruptingDevice(OutageReason value) {
        this.interruptingDevice = value;
    }

    /**
     * Gets the value of the interruptingDeviceInitiation property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getInterruptingDeviceInitiation() {
        return interruptingDeviceInitiation;
    }

    /**
     * Sets the value of the interruptingDeviceInitiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setInterruptingDeviceInitiation(OutageReason value) {
        this.interruptingDeviceInitiation = value;
    }

    /**
     * Gets the value of the customerResoration property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getCustomerResoration() {
        return customerResoration;
    }

    /**
     * Sets the value of the customerResoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setCustomerResoration(OutageReason value) {
        this.customerResoration = value;
    }

}
