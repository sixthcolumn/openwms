
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFSValueUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TFSValueUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kW"/>
 *     &lt;enumeration value="MW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TFSValueUnitType")
@XmlEnum
public enum TFSValueUnitType {

    @XmlEnumValue("kW")
    K_W("kW"),
    MW("MW");
    private final String value;

    TFSValueUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TFSValueUnitType fromValue(String v) {
        for (TFSValueUnitType c: TFSValueUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
