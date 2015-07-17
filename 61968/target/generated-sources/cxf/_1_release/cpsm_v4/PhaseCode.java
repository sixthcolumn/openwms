
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phaseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phaseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="ABN"/>
 *     &lt;enumeration value="ACN"/>
 *     &lt;enumeration value="BCN"/>
 *     &lt;enumeration value="ABCN"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phaseCode")
@XmlEnum
public enum PhaseCode {

    A("A"),
    B("B"),
    C("C"),
    N("N"),
    AB("AB"),
    AC("AC"),
    BC("BC"),
    ABC("ABC"),
    AN("AN"),
    BN("BN"),
    CN("CN"),
    ABN("ABN"),
    ACN("ACN"),
    BCN("BCN"),
    ABCN("ABCN"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PhaseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhaseCode fromValue(String v) {
        for (PhaseCode c: PhaseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
