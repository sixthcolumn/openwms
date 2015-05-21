
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusIdentifiers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusIdentifiers">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Travel"/>
 *     &lt;enumeration value="OutofService"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusIdentifiers")
@XmlEnum
public enum StatusIdentifiers {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Travel")
    TRAVEL("Travel"),
    @XmlEnumValue("OutofService")
    OUTOF_SERVICE("OutofService"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    StatusIdentifiers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusIdentifiers fromValue(String v) {
        for (StatusIdentifiers c: StatusIdentifiers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
