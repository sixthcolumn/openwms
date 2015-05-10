
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionTaken.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionTaken">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Installed"/>
 *     &lt;enumeration value="PlacedIntoService"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="Removed"/>
 *     &lt;enumeration value="Inspected"/>
 *     &lt;enumeration value="Tested"/>
 *     &lt;enumeration value="Repaired"/>
 *     &lt;enumeration value="Calibrated"/>
 *     &lt;enumeration value="Checked"/>
 *     &lt;enumeration value="ReturnedToInventory"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="Destroyed"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionTaken")
@XmlEnum
public enum ActionTaken {

    @XmlEnumValue("Installed")
    INSTALLED("Installed"),
    @XmlEnumValue("PlacedIntoService")
    PLACED_INTO_SERVICE("PlacedIntoService"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Removed")
    REMOVED("Removed"),
    @XmlEnumValue("Inspected")
    INSPECTED("Inspected"),
    @XmlEnumValue("Tested")
    TESTED("Tested"),
    @XmlEnumValue("Repaired")
    REPAIRED("Repaired"),
    @XmlEnumValue("Calibrated")
    CALIBRATED("Calibrated"),
    @XmlEnumValue("Checked")
    CHECKED("Checked"),
    @XmlEnumValue("ReturnedToInventory")
    RETURNED_TO_INVENTORY("ReturnedToInventory"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    @XmlEnumValue("Destroyed")
    DESTROYED("Destroyed"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ActionTaken(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTaken fromValue(String v) {
        for (ActionTaken c: ActionTaken.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
