
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speedUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="speedUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mph"/>
 *     &lt;enumeration value="feet per second"/>
 *     &lt;enumeration value="km per hour"/>
 *     &lt;enumeration value="km per second"/>
 *     &lt;enumeration value="m per second"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "speedUnits")
@XmlEnum
public enum SpeedUnits {

    @XmlEnumValue("mph")
    MPH("mph"),
    @XmlEnumValue("feet per second")
    FEET_PER_SECOND("feet per second"),
    @XmlEnumValue("km per hour")
    KM_PER_HOUR("km per hour"),
    @XmlEnumValue("km per second")
    KM_PER_SECOND("km per second"),
    @XmlEnumValue("m per second")
    M_PER_SECOND("m per second"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SpeedUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedUnits fromValue(String v) {
        for (SpeedUnits c: SpeedUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
