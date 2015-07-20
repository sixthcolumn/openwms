
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capacitorConnectionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="capacitorConnectionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ShuntWye"/>
 *     &lt;enumeration value="ShuntUngroundedWye"/>
 *     &lt;enumeration value="ShuntDelta"/>
 *     &lt;enumeration value="ShuntSameAsParent"/>
 *     &lt;enumeration value="Series"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "capacitorConnectionCode")
@XmlEnum
public enum CapacitorConnectionCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ShuntWye")
    SHUNT_WYE("ShuntWye"),
    @XmlEnumValue("ShuntUngroundedWye")
    SHUNT_UNGROUNDED_WYE("ShuntUngroundedWye"),
    @XmlEnumValue("ShuntDelta")
    SHUNT_DELTA("ShuntDelta"),
    @XmlEnumValue("ShuntSameAsParent")
    SHUNT_SAME_AS_PARENT("ShuntSameAsParent"),
    @XmlEnumValue("Series")
    SERIES("Series");
    private final String value;

    CapacitorConnectionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapacitorConnectionCode fromValue(String v) {
        for (CapacitorConnectionCode c: CapacitorConnectionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}