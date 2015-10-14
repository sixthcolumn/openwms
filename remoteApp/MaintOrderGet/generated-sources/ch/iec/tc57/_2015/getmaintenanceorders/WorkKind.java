
package ch.iec.tc57._2015.getmaintenanceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="connect"/>
 *     &lt;enumeration value="construction"/>
 *     &lt;enumeration value="disconnect"/>
 *     &lt;enumeration value="inspection"/>
 *     &lt;enumeration value="maintenance"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="reconnect"/>
 *     &lt;enumeration value="repair"/>
 *     &lt;enumeration value="service"/>
 *     &lt;enumeration value="test"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkKind")
@XmlEnum
public enum WorkKind {

    @XmlEnumValue("connect")
    CONNECT("connect"),
    @XmlEnumValue("construction")
    CONSTRUCTION("construction"),
    @XmlEnumValue("disconnect")
    DISCONNECT("disconnect"),
    @XmlEnumValue("inspection")
    INSPECTION("inspection"),
    @XmlEnumValue("maintenance")
    MAINTENANCE("maintenance"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("reconnect")
    RECONNECT("reconnect"),
    @XmlEnumValue("repair")
    REPAIR("repair"),
    @XmlEnumValue("service")
    SERVICE("service"),
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    WorkKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkKind fromValue(String v) {
        for (WorkKind c: WorkKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
