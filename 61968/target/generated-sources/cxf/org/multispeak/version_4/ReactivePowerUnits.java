
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reactivePowerUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reactivePowerUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mVAr"/>
 *     &lt;enumeration value="VAr"/>
 *     &lt;enumeration value="kVAr"/>
 *     &lt;enumeration value="MVAr"/>
 *     &lt;enumeration value="GVAr"/>
 *     &lt;enumeration value="microVAr"/>
 *     &lt;enumeration value="Per Unit"/>
 *     &lt;enumeration value="Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reactivePowerUnits")
@XmlEnum
public enum ReactivePowerUnits {

    @XmlEnumValue("mVAr")
    M_V_AR("mVAr"),
    @XmlEnumValue("VAr")
    V_AR("VAr"),
    @XmlEnumValue("kVAr")
    K_V_AR("kVAr"),
    @XmlEnumValue("MVAr")
    MV_AR("MVAr"),
    @XmlEnumValue("GVAr")
    GV_AR("GVAr"),
    @XmlEnumValue("microVAr")
    MICRO_V_AR("microVAr"),
    @XmlEnumValue("Per Unit")
    PER_UNIT("Per Unit"),
    @XmlEnumValue("Percent")
    PERCENT("Percent");
    private final String value;

    ReactivePowerUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReactivePowerUnits fromValue(String v) {
        for (ReactivePowerUnits c: ReactivePowerUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
