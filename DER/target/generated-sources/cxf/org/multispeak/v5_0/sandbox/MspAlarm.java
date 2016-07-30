
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.EndDeviceEventTypeOption;
import org.multispeak.v5.MspEvent;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for mspAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspAlarm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="sourceIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="endDeviceEventTypeOption" type="{http://www.multispeak.org/V5.0}endDeviceEventTypeOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspAlarm", propOrder = {
    "sourceIdentifier",
    "endDeviceEventTypeOption"
})
@XmlSeeAlso({
    VoltageAlarm.class,
    BlinkAlarm.class
})
public abstract class MspAlarm
    extends MspEvent
{

    @XmlElement(required = true)
    protected ObjectRef sourceIdentifier;
    protected EndDeviceEventTypeOption endDeviceEventTypeOption;

    /**
     * Gets the value of the sourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setSourceIdentifier(ObjectRef value) {
        this.sourceIdentifier = value;
    }

    /**
     * Gets the value of the endDeviceEventTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEventTypeOption }
     *     
     */
    public EndDeviceEventTypeOption getEndDeviceEventTypeOption() {
        return endDeviceEventTypeOption;
    }

    /**
     * Sets the value of the endDeviceEventTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEventTypeOption }
     *     
     */
    public void setEndDeviceEventTypeOption(EndDeviceEventTypeOption value) {
        this.endDeviceEventTypeOption = value;
    }

}
