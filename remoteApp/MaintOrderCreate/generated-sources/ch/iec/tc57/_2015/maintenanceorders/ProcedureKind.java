
package ch.iec.tc57._2015.maintenanceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcedureKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcedureKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="diagnosis"/>
 *     &lt;enumeration value="inspection"/>
 *     &lt;enumeration value="maintenance"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="test"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcedureKind")
@XmlEnum
public enum ProcedureKind {

    @XmlEnumValue("diagnosis")
    DIAGNOSIS("diagnosis"),
    @XmlEnumValue("inspection")
    INSPECTION("inspection"),
    @XmlEnumValue("maintenance")
    MAINTENANCE("maintenance"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    ProcedureKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcedureKind fromValue(String v) {
        for (ProcedureKind c: ProcedureKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
