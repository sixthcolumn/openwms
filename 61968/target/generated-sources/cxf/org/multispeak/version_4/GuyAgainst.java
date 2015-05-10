
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guyAgainst.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="guyAgainst">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dead-end"/>
 *     &lt;enumeration value="Angle"/>
 *     &lt;enumeration value="Storm-right"/>
 *     &lt;enumeration value="Storm-left"/>
 *     &lt;enumeration value="Unkonown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "guyAgainst")
@XmlEnum
public enum GuyAgainst {

    @XmlEnumValue("Dead-end")
    DEAD_END("Dead-end"),
    @XmlEnumValue("Angle")
    ANGLE("Angle"),
    @XmlEnumValue("Storm-right")
    STORM_RIGHT("Storm-right"),
    @XmlEnumValue("Storm-left")
    STORM_LEFT("Storm-left"),
    @XmlEnumValue("Unkonown")
    UNKONOWN("Unkonown"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    GuyAgainst(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuyAgainst fromValue(String v) {
        for (GuyAgainst c: GuyAgainst.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
