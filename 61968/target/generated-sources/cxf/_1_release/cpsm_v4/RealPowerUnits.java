
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for realPowerUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="realPowerUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mW"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="kW"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="Per Unit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "realPowerUnits")
@XmlEnum
public enum RealPowerUnits {

    @XmlEnumValue("mW")
    M_W("mW"),
    W("W"),
    @XmlEnumValue("kW")
    K_W("kW"),
    MW("MW"),
    GW("GW"),
    @XmlEnumValue("Per Unit")
    PER_UNIT("Per Unit");
    private final String value;

    RealPowerUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealPowerUnits fromValue(String v) {
        for (RealPowerUnits c: RealPowerUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
