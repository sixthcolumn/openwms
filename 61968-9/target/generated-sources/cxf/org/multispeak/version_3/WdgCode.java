
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wdgCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wdgCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y-Y"/>
 *     &lt;enumeration value="D-Y"/>
 *     &lt;enumeration value="Grounded Y-D"/>
 *     &lt;enumeration value="Ungrounded Y-D"/>
 *     &lt;enumeration value="Open Y-D"/>
 *     &lt;enumeration value="D-D"/>
 *     &lt;enumeration value="Y-Y Grounded Imp"/>
 *     &lt;enumeration value="Y-Y 3ph core type"/>
 *     &lt;enumeration value="D-D one"/>
 *     &lt;enumeration value="D-D open"/>
 *     &lt;enumeration value="Y-Y-D Ground"/>
 *     &lt;enumeration value="Y-D one"/>
 *     &lt;enumeration value="D-Y open"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wdgCode")
@XmlEnum
public enum WdgCode {

    @XmlEnumValue("Y-Y")
    Y_Y("Y-Y"),
    @XmlEnumValue("D-Y")
    D_Y("D-Y"),
    @XmlEnumValue("Grounded Y-D")
    GROUNDED_Y_D("Grounded Y-D"),
    @XmlEnumValue("Ungrounded Y-D")
    UNGROUNDED_Y_D("Ungrounded Y-D"),
    @XmlEnumValue("Open Y-D")
    OPEN_Y_D("Open Y-D"),
    @XmlEnumValue("D-D")
    D_D("D-D"),
    @XmlEnumValue("Y-Y Grounded Imp")
    Y_Y_GROUNDED_IMP("Y-Y Grounded Imp"),
    @XmlEnumValue("Y-Y 3ph core type")
    Y_Y_3_PH_CORE_TYPE("Y-Y 3ph core type"),
    @XmlEnumValue("D-D one")
    D_D_ONE("D-D one"),
    @XmlEnumValue("D-D open")
    D_D_OPEN("D-D open"),
    @XmlEnumValue("Y-Y-D Ground")
    Y_Y_D_GROUND("Y-Y-D Ground"),
    @XmlEnumValue("Y-D one")
    Y_D_ONE("Y-D one"),
    @XmlEnumValue("D-Y open")
    D_Y_OPEN("D-Y open");
    private final String value;

    WdgCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WdgCode fromValue(String v) {
        for (WdgCode c: WdgCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
