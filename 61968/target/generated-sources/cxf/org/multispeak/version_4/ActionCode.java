
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="estimate"/>
 *     &lt;enumeration value="CPR only"/>
 *     &lt;enumeration value="material only"/>
 *     &lt;enumeration value="CPR and material"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionCode")
@XmlEnum
public enum ActionCode {

    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("CPR only")
    CPR_ONLY("CPR only"),
    @XmlEnumValue("material only")
    MATERIAL_ONLY("material only"),
    @XmlEnumValue("CPR and material")
    CPR_AND_MATERIAL("CPR and material"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCode fromValue(String v) {
        for (ActionCode c: ActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
