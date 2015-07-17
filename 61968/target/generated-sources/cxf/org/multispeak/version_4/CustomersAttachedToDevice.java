
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customersAttachedToDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customersAttachedToDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="deviceID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="deviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affectedMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAffectedMeter" minOccurs="0"/>
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
@XmlType(name = "customersAttachedToDevice", propOrder = {
    "deviceID",
    "deviceDescription",
    "affectedMeters"
})
public class CustomersAttachedToDevice
    extends MspObject
{

    protected ObjectRef deviceID;
    protected String deviceDescription;
    protected ArrayOfAffectedMeter affectedMeters;

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setDeviceID(ObjectRef value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the affectedMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffectedMeter }
     *     
     */
    public ArrayOfAffectedMeter getAffectedMeters() {
        return affectedMeters;
    }

    /**
     * Sets the value of the affectedMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffectedMeter }
     *     
     */
    public void setAffectedMeters(ArrayOfAffectedMeter value) {
        this.affectedMeters = value;
    }

}
