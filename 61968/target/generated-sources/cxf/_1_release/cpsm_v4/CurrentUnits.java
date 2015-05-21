
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currentUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currentUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="mA"/>
 *     &lt;enumeration value="kA"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="Per Unit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currentUnits")
@XmlEnum
public enum CurrentUnits {

    A("A"),
    @XmlEnumValue("mA")
    M_A("mA"),
    @XmlEnumValue("kA")
    K_A("kA"),
    MA("MA"),
    @XmlEnumValue("Per Unit")
    PER_UNIT("Per Unit");
    private final String value;

    CurrentUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrentUnits fromValue(String v) {
        for (CurrentUnits c: CurrentUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
