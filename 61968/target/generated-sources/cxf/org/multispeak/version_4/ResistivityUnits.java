
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resistivityUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resistivityUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ohm-meter"/>
 *     &lt;enumeration value="Ohm-inch"/>
 *     &lt;enumeration value="Ohm-centimeter"/>
 *     &lt;enumeration value="Microohm-centimeter"/>
 *     &lt;enumeration value="Microohm-inch"/>
 *     &lt;enumeration value="Statohm-centimeter"/>
 *     &lt;enumeration value="Abohm-centimetercircular"/>
 *     &lt;enumeration value="Circular mil ohm/foot"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resistivityUnits")
@XmlEnum
public enum ResistivityUnits {

    @XmlEnumValue("Ohm-meter")
    OHM_METER("Ohm-meter"),
    @XmlEnumValue("Ohm-inch")
    OHM_INCH("Ohm-inch"),
    @XmlEnumValue("Ohm-centimeter")
    OHM_CENTIMETER("Ohm-centimeter"),
    @XmlEnumValue("Microohm-centimeter")
    MICROOHM_CENTIMETER("Microohm-centimeter"),
    @XmlEnumValue("Microohm-inch")
    MICROOHM_INCH("Microohm-inch"),
    @XmlEnumValue("Statohm-centimeter")
    STATOHM_CENTIMETER("Statohm-centimeter"),
    @XmlEnumValue("Abohm-centimetercircular")
    ABOHM_CENTIMETERCIRCULAR("Abohm-centimetercircular"),
    @XmlEnumValue("Circular mil ohm/foot")
    CIRCULAR_MIL_OHM_FOOT("Circular mil ohm/foot"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResistivityUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResistivityUnits fromValue(String v) {
        for (ResistivityUnits c: ResistivityUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
