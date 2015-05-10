
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCDState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RCDState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Opened"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Armed"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RCDState")
@XmlEnum
public enum RCDState {

    @XmlEnumValue("Opened")
    OPENED("Opened"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Armed")
    ARMED("Armed"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RCDState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RCDState fromValue(String v) {
        for (RCDState c: RCDState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
