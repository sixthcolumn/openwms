
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitPrefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitPrefix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Instantaneous"/>
 *     &lt;enumeration value="Cumulative"/>
 *     &lt;enumeration value="Quantity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitPrefix")
@XmlEnum
public enum UnitPrefix {

    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Instantaneous")
    INSTANTANEOUS("Instantaneous"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity");
    private final String value;

    UnitPrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitPrefix fromValue(String v) {
        for (UnitPrefix c: UnitPrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
