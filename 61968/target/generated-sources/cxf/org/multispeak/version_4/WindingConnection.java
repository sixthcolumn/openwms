
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windingConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="windingConnection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Delta"/>
 *     &lt;enumeration value="Wye"/>
 *     &lt;enumeration value="Zigzag"/>
 *     &lt;enumeration value="Center tap"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "windingConnection")
@XmlEnum
public enum WindingConnection {

    @XmlEnumValue("Delta")
    DELTA("Delta"),
    @XmlEnumValue("Wye")
    WYE("Wye"),
    @XmlEnumValue("Zigzag")
    ZIGZAG("Zigzag"),
    @XmlEnumValue("Center tap")
    CENTER_TAP("Center tap"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    WindingConnection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WindingConnection fromValue(String v) {
        for (WindingConnection c: WindingConnection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
