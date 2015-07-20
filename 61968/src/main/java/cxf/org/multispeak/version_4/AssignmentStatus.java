
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignmentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assignmentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Received Assignment"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Queued"/>
 *     &lt;enumeration value="Timed Out"/>
 *     &lt;enumeration value="Partially Complete"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="On Hold"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assignmentStatus")
@XmlEnum
public enum AssignmentStatus {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Received Assignment")
    RECEIVED_ASSIGNMENT("Received Assignment"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Queued")
    QUEUED("Queued"),
    @XmlEnumValue("Timed Out")
    TIMED_OUT("Timed Out"),
    @XmlEnumValue("Partially Complete")
    PARTIALLY_COMPLETE("Partially Complete"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("On Hold")
    ON_HOLD("On Hold"),
    @XmlEnumValue("Returned")
    RETURNED("Returned"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AssignmentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssignmentStatus fromValue(String v) {
        for (AssignmentStatus c: AssignmentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
