
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RandomisationKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RandomisationKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="end"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="startAndEnd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RandomisationKind")
@XmlEnum
public enum RandomisationKind {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("end")
    END("end"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("startAndEnd")
    START_AND_END("startAndEnd");
    private final String value;

    RandomisationKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RandomisationKind fromValue(String v) {
        for (RandomisationKind c: RandomisationKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
