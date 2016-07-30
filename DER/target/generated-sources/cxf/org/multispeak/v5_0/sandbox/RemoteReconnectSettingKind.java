
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remoteReconnectSettingKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="remoteReconnectSettingKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Connect"/>
 *     &lt;enumeration value="Arm"/>
 *     &lt;enumeration value="PowerLimitation"/>
 *     &lt;enumeration value="CISAuthRequired"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "remoteReconnectSettingKind")
@XmlEnum
public enum RemoteReconnectSettingKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Connect")
    CONNECT("Connect"),
    @XmlEnumValue("Arm")
    ARM("Arm"),
    @XmlEnumValue("PowerLimitation")
    POWER_LIMITATION("PowerLimitation"),
    @XmlEnumValue("CISAuthRequired")
    CIS_AUTH_REQUIRED("CISAuthRequired"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RemoteReconnectSettingKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemoteReconnectSettingKind fromValue(String v) {
        for (RemoteReconnectSettingKind c: RemoteReconnectSettingKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
