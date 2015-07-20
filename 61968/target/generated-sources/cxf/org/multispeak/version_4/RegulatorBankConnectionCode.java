
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulatorBankConnectionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regulatorBankConnectionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wye 3ph"/>
 *     &lt;enumeration value="Delta 3ph"/>
 *     &lt;enumeration value="Line-neutral"/>
 *     &lt;enumeration value="Open delta"/>
 *     &lt;enumeration value="Closed delta"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Uknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regulatorBankConnectionCode")
@XmlEnum
public enum RegulatorBankConnectionCode {

    @XmlEnumValue("Wye 3ph")
    WYE_3_PH("Wye 3ph"),
    @XmlEnumValue("Delta 3ph")
    DELTA_3_PH("Delta 3ph"),
    @XmlEnumValue("Line-neutral")
    LINE_NEUTRAL("Line-neutral"),
    @XmlEnumValue("Open delta")
    OPEN_DELTA("Open delta"),
    @XmlEnumValue("Closed delta")
    CLOSED_DELTA("Closed delta"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Uknown")
    UKNOWN("Uknown");
    private final String value;

    RegulatorBankConnectionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegulatorBankConnectionCode fromValue(String v) {
        for (RegulatorBankConnectionCode c: RegulatorBankConnectionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
