
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frequencyUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="frequencyUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hz"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Cycles per second"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "frequencyUnits")
@XmlEnum
public enum FrequencyUnits {

    @XmlEnumValue("Hz")
    HZ("Hz"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Cycles per second")
    CYCLES_PER_SECOND("Cycles per second");
    private final String value;

    FrequencyUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrequencyUnits fromValue(String v) {
        for (FrequencyUnits c: FrequencyUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
