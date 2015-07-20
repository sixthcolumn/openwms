
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermalCoefficientOfResistanceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thermalCoefficientOfResistanceUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reciprocal degrees C"/>
 *     &lt;enumeration value="Reciprocal degrees K"/>
 *     &lt;enumeration value="Reciprocal degrees F"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thermalCoefficientOfResistanceUnits")
@XmlEnum
public enum ThermalCoefficientOfResistanceUnits {

    @XmlEnumValue("Reciprocal degrees C")
    RECIPROCAL_DEGREES_C("Reciprocal degrees C"),
    @XmlEnumValue("Reciprocal degrees K")
    RECIPROCAL_DEGREES_K("Reciprocal degrees K"),
    @XmlEnumValue("Reciprocal degrees F")
    RECIPROCAL_DEGREES_F("Reciprocal degrees F"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ThermalCoefficientOfResistanceUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalCoefficientOfResistanceUnits fromValue(String v) {
        for (ThermalCoefficientOfResistanceUnits c: ThermalCoefficientOfResistanceUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
