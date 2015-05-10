
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Connect"/>
 *     &lt;enumeration value="Disconnect"/>
 *     &lt;enumeration value="InitiatePowerLimitation"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Armed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadActionCode")
@XmlEnum
public enum LoadActionCode {

    @XmlEnumValue("Connect")
    CONNECT("Connect"),
    @XmlEnumValue("Disconnect")
    DISCONNECT("Disconnect"),
    @XmlEnumValue("InitiatePowerLimitation")
    INITIATE_POWER_LIMITATION("InitiatePowerLimitation"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Armed")
    ARMED("Armed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LoadActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadActionCode fromValue(String v) {
        for (LoadActionCode c: LoadActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
