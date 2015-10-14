
package ch.iec.tc57._2015.maintenanceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="approved"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="dispatched"/>
 *     &lt;enumeration value="enroute"/>
 *     &lt;enumeration value="inProgress"/>
 *     &lt;enumeration value="onSite"/>
 *     &lt;enumeration value="scheduled"/>
 *     &lt;enumeration value="waitingOnApproval"/>
 *     &lt;enumeration value="waitingOnMaterial"/>
 *     &lt;enumeration value="waitingToBeScheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkStatusKind")
@XmlEnum
public enum WorkStatusKind {

    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("dispatched")
    DISPATCHED("dispatched"),
    @XmlEnumValue("enroute")
    ENROUTE("enroute"),
    @XmlEnumValue("inProgress")
    IN_PROGRESS("inProgress"),
    @XmlEnumValue("onSite")
    ON_SITE("onSite"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("waitingOnApproval")
    WAITING_ON_APPROVAL("waitingOnApproval"),
    @XmlEnumValue("waitingOnMaterial")
    WAITING_ON_MATERIAL("waitingOnMaterial"),
    @XmlEnumValue("waitingToBeScheduled")
    WAITING_TO_BE_SCHEDULED("waitingToBeScheduled");
    private final String value;

    WorkStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkStatusKind fromValue(String v) {
        for (WorkStatusKind c: WorkStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
