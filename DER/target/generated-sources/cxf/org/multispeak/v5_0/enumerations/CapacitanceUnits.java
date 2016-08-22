
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitanceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="capacitanceUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="mF"/>
 *     &lt;enumeration value="microF"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "capacitanceUnits")
@XmlEnum
public enum CapacitanceUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    F("F"),
    @XmlEnumValue("mF")
    M_F("mF"),
    @XmlEnumValue("microF")
    MICRO_F("microF"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CapacitanceUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapacitanceUnits fromValue(String v) {
        for (CapacitanceUnits c: CapacitanceUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}