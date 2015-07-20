
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callBackStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="callBackStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="StillOff"/>
 *     &lt;enumeration value="Undialable"/>
 *     &lt;enumeration value="MaxDial"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "callBackStatus")
@XmlEnum
public enum CallBackStatus {

    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("StillOff")
    STILL_OFF("StillOff"),
    @XmlEnumValue("Undialable")
    UNDIALABLE("Undialable"),
    @XmlEnumValue("MaxDial")
    MAX_DIAL("MaxDial"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CallBackStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallBackStatus fromValue(String v) {
        for (CallBackStatus c: CallBackStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
