
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TapChangerKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TapChangerKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="voltageControl"/>
 *     &lt;enumeration value="phaseControl"/>
 *     &lt;enumeration value="voltageAndPhaseControl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TapChangerKind")
@XmlEnum
public enum TapChangerKind {

    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("voltageControl")
    VOLTAGE_CONTROL("voltageControl"),
    @XmlEnumValue("phaseControl")
    PHASE_CONTROL("phaseControl"),
    @XmlEnumValue("voltageAndPhaseControl")
    VOLTAGE_AND_PHASE_CONTROL("voltageAndPhaseControl");
    private final String value;

    TapChangerKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TapChangerKind fromValue(String v) {
        for (TapChangerKind c: TapChangerKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
