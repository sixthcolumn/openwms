
package ch.iec.tc57._2015.serviceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadingReasonKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadingReasonKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="billing"/>
 *     &lt;enumeration value="demandReset"/>
 *     &lt;enumeration value="inquiry"/>
 *     &lt;enumeration value="installation"/>
 *     &lt;enumeration value="loadManagement"/>
 *     &lt;enumeration value="loadResearch"/>
 *     &lt;enumeration value="moveIn"/>
 *     &lt;enumeration value="moveOut"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="removal"/>
 *     &lt;enumeration value="serviceConnect"/>
 *     &lt;enumeration value="serviceDisconnect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadingReasonKind")
@XmlEnum
public enum ReadingReasonKind {

    @XmlEnumValue("billing")
    BILLING("billing"),
    @XmlEnumValue("demandReset")
    DEMAND_RESET("demandReset"),
    @XmlEnumValue("inquiry")
    INQUIRY("inquiry"),
    @XmlEnumValue("installation")
    INSTALLATION("installation"),
    @XmlEnumValue("loadManagement")
    LOAD_MANAGEMENT("loadManagement"),
    @XmlEnumValue("loadResearch")
    LOAD_RESEARCH("loadResearch"),
    @XmlEnumValue("moveIn")
    MOVE_IN("moveIn"),
    @XmlEnumValue("moveOut")
    MOVE_OUT("moveOut"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("removal")
    REMOVAL("removal"),
    @XmlEnumValue("serviceConnect")
    SERVICE_CONNECT("serviceConnect"),
    @XmlEnumValue("serviceDisconnect")
    SERVICE_DISCONNECT("serviceDisconnect");
    private final String value;

    ReadingReasonKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadingReasonKind fromValue(String v) {
        for (ReadingReasonKind c: ReadingReasonKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
