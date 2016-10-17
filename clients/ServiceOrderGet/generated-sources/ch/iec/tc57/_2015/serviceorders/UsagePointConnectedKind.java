
package ch.iec.tc57._2015.serviceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsagePointConnectedKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsagePointConnectedKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="connected"/>
 *     &lt;enumeration value="logicallyDisconnected"/>
 *     &lt;enumeration value="physicallyDisconnected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsagePointConnectedKind")
@XmlEnum
public enum UsagePointConnectedKind {

    @XmlEnumValue("connected")
    CONNECTED("connected"),
    @XmlEnumValue("logicallyDisconnected")
    LOGICALLY_DISCONNECTED("logicallyDisconnected"),
    @XmlEnumValue("physicallyDisconnected")
    PHYSICALLY_DISCONNECTED("physicallyDisconnected");
    private final String value;

    UsagePointConnectedKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsagePointConnectedKind fromValue(String v) {
        for (UsagePointConnectedKind c: UsagePointConnectedKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
