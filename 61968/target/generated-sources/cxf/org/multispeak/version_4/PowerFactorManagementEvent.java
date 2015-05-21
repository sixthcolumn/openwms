
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerFactorManagementEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powerFactorManagementEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="switchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlEventType" type="{http://www.multispeak.org/Version_4.1_Release}controlEventType" minOccurs="0"/>
 *         &lt;element name="affectedRelay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "powerFactorManagementEvent", propOrder = {
    "switchID",
    "controlEventType",
    "affectedRelay"
})
public class PowerFactorManagementEvent
    extends MspObject
{

    protected String switchID;
    protected ControlEventType controlEventType;
    protected String affectedRelay;

    /**
     * Gets the value of the switchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchID() {
        return switchID;
    }

    /**
     * Sets the value of the switchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchID(String value) {
        this.switchID = value;
    }

    /**
     * Gets the value of the controlEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlEventType }
     *     
     */
    public ControlEventType getControlEventType() {
        return controlEventType;
    }

    /**
     * Sets the value of the controlEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlEventType }
     *     
     */
    public void setControlEventType(ControlEventType value) {
        this.controlEventType = value;
    }

    /**
     * Gets the value of the affectedRelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedRelay() {
        return affectedRelay;
    }

    /**
     * Sets the value of the affectedRelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedRelay(String value) {
        this.affectedRelay = value;
    }

}
