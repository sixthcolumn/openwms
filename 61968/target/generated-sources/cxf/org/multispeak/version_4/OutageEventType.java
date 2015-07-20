
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Instantaneous"/>
 *     &lt;enumeration value="Outage"/>
 *     &lt;enumeration value="Restoration"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="Inferred"/>
 *     &lt;enumeration value="PowerOn"/>
 *     &lt;enumeration value="PowerOff"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageEventType")
@XmlEnum
public enum OutageEventType {

    @XmlEnumValue("Instantaneous")
    INSTANTANEOUS("Instantaneous"),
    @XmlEnumValue("Outage")
    OUTAGE("Outage"),
    @XmlEnumValue("Restoration")
    RESTORATION("Restoration"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("Inferred")
    INFERRED("Inferred"),
    @XmlEnumValue("PowerOn")
    POWER_ON("PowerOn"),
    @XmlEnumValue("PowerOff")
    POWER_OFF("PowerOff"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    OutageEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageEventType fromValue(String v) {
        for (OutageEventType c: OutageEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
