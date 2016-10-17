
package ch.iec.tc57._2015.maintenanceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkTaskKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkTaskKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exchange"/>
 *     &lt;enumeration value="install"/>
 *     &lt;enumeration value="investigate"/>
 *     &lt;enumeration value="remove"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkTaskKind")
@XmlEnum
public enum WorkTaskKind {

    @XmlEnumValue("exchange")
    EXCHANGE("exchange"),
    @XmlEnumValue("install")
    INSTALL("install"),
    @XmlEnumValue("investigate")
    INVESTIGATE("investigate"),
    @XmlEnumValue("remove")
    REMOVE("remove");
    private final String value;

    WorkTaskKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkTaskKind fromValue(String v) {
        for (WorkTaskKind c: WorkTaskKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
