
package ch.iec.tc57._2015.serviceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkTimeScheduleKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkTimeScheduleKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="actual"/>
 *     &lt;enumeration value="earliest"/>
 *     &lt;enumeration value="estimate"/>
 *     &lt;enumeration value="latest"/>
 *     &lt;enumeration value="request"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkTimeScheduleKind")
@XmlEnum
public enum WorkTimeScheduleKind {

    @XmlEnumValue("actual")
    ACTUAL("actual"),
    @XmlEnumValue("earliest")
    EARLIEST("earliest"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("latest")
    LATEST("latest"),
    @XmlEnumValue("request")
    REQUEST("request");
    private final String value;

    WorkTimeScheduleKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkTimeScheduleKind fromValue(String v) {
        for (WorkTimeScheduleKind c: WorkTimeScheduleKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
