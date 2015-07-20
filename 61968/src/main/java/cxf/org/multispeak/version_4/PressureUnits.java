
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pressureUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pressureUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pascal"/>
 *     &lt;enumeration value="Newton per square meter"/>
 *     &lt;enumeration value="PSI"/>
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="Barye"/>
 *     &lt;enumeration value="Atmosphere"/>
 *     &lt;enumeration value="Millibar"/>
 *     &lt;enumeration value="Inch of Hg"/>
 *     &lt;enumeration value="Millimeter of Hg"/>
 *     &lt;enumeration value="Inch of water"/>
 *     &lt;enumeration value="Millimeter of water"/>
 *     &lt;enumeration value="Kip"/>
 *     &lt;enumeration value="Pound-force"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pressureUnits")
@XmlEnum
public enum PressureUnits {

    @XmlEnumValue("Pascal")
    PASCAL("Pascal"),
    @XmlEnumValue("Newton per square meter")
    NEWTON_PER_SQUARE_METER("Newton per square meter"),
    PSI("PSI"),
    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("Barye")
    BARYE("Barye"),
    @XmlEnumValue("Atmosphere")
    ATMOSPHERE("Atmosphere"),
    @XmlEnumValue("Millibar")
    MILLIBAR("Millibar"),
    @XmlEnumValue("Inch of Hg")
    INCH_OF_HG("Inch of Hg"),
    @XmlEnumValue("Millimeter of Hg")
    MILLIMETER_OF_HG("Millimeter of Hg"),
    @XmlEnumValue("Inch of water")
    INCH_OF_WATER("Inch of water"),
    @XmlEnumValue("Millimeter of water")
    MILLIMETER_OF_WATER("Millimeter of water"),
    @XmlEnumValue("Kip")
    KIP("Kip"),
    @XmlEnumValue("Pound-force")
    POUND_FORCE("Pound-force"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PressureUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureUnits fromValue(String v) {
        for (PressureUnits c: PressureUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
