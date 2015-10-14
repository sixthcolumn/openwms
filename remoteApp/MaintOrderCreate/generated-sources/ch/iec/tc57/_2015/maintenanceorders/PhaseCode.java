
package ch.iec.tc57._2015.maintenanceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhaseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhaseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="ABCN"/>
 *     &lt;enumeration value="ABN"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACN"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BCN"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="s1"/>
 *     &lt;enumeration value="s12"/>
 *     &lt;enumeration value="s12N"/>
 *     &lt;enumeration value="s1N"/>
 *     &lt;enumeration value="s2"/>
 *     &lt;enumeration value="s2N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhaseCode")
@XmlEnum
public enum PhaseCode {

    A("A"),
    AB("AB"),
    ABC("ABC"),
    ABCN("ABCN"),
    ABN("ABN"),
    AC("AC"),
    ACN("ACN"),
    AN("AN"),
    B("B"),
    BC("BC"),
    BCN("BCN"),
    BN("BN"),
    C("C"),
    CN("CN"),
    N("N"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("s1")
    S_1("s1"),
    @XmlEnumValue("s12")
    S_12("s12"),
    @XmlEnumValue("s12N")
    S_12_N("s12N"),
    @XmlEnumValue("s1N")
    S_1_N("s1N"),
    @XmlEnumValue("s2")
    S_2("s2"),
    @XmlEnumValue("s2N")
    S_2_N("s2N");
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
