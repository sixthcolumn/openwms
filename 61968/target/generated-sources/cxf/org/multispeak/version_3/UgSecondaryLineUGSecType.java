
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ugSecondaryLineUGSecType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ugSecondaryLineUGSecType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Secondary"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ugSecondaryLineUGSecType")
@XmlEnum
public enum UgSecondaryLineUGSecType {

    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    UgSecondaryLineUGSecType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UgSecondaryLineUGSecType fromValue(String v) {
        for (UgSecondaryLineUGSecType c: UgSecondaryLineUGSecType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
