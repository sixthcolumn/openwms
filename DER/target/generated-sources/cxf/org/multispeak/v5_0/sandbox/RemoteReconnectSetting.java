
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is the setting in the CIS for the desired
 * 				remote reconnection setting for this meter. The allowable values
 * 				are: Connect, which means that the meter shall be reconnected
 * 				remotely without requiring additional action when a
 * 				connect/reconnect signal is received; Arm, which means that the the
 * 				meter shall be armed for reconnection and the utility's process
 * 				followed for reconnection with arming prior to
 * 				connecting/reconnecting the meter; PowerLimitation, which means that
 * 				the meter shall be reconnected but immediately placed into power
 * 				limitation mode; CISAuthRequired, which means that when payment is
 * 				received, Connect or Arm does not occur automatically. Authorization
 * 				from the CIS application is required before the meter may be
 * 				connected or armed; None, which means that no remote
 * 				connection/reconnection should be completed on this meter even if
 * 				the meter is so configured and enabled; Other, which means that
 * 				there is some other setting that is not included in this list; or
 * 				Unknown, which means that the remoteReconnectSetting is not known or
 * 				not set by the CIS, in which case the AMI head-end system should
 * 				follow its own business rules in determining whether or not to
 * 				connect/reconnect a meter.
 * 
 * <p>Java class for remoteReconnectSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remoteReconnectSetting">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/sandbox>remoteReconnectSettingKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remoteReconnectSetting", propOrder = {
    "value"
})
public class RemoteReconnectSetting {

    @XmlValue
    protected RemoteReconnectSettingKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * This is the setting in the CIS for the desired
     * 				remote reconnection setting for this meter. The allowable values
     * 				are: Connect, which means that the meter shall be reconnected
     * 				remotely without requiring additional action when a
     * 				connect/reconnect signal is received; Arm, which means that the the
     * 				meter shall be armed for reconnection and the utility's process
     * 				followed for reconnection with arming prior to
     * 				connecting/reconnecting the meter; PowerLimitation, which means that
     * 				the meter shall be reconnected but immediately placed into power
     * 				limitation mode; CISAuthRequired, which means that when payment is
     * 				received, Connect or Arm does not occur automatically. Authorization
     * 				from the CIS application is required before the meter may be
     * 				connected or armed; None, which means that no remote
     * 				connection/reconnection should be completed on this meter even if
     * 				the meter is so configured and enabled; Other, which means that
     * 				there is some other setting that is not included in this list; or
     * 				Unknown, which means that the remoteReconnectSetting is not known or
     * 				not set by the CIS, in which case the AMI head-end system should
     * 				follow its own business rules in determining whether or not to
     * 				connect/reconnect a meter.
     * 
     * @return
     *     possible object is
     *     {@link RemoteReconnectSettingKind }
     *     
     */
    public RemoteReconnectSettingKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteReconnectSettingKind }
     *     
     */
    public void setValue(RemoteReconnectSettingKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

}
