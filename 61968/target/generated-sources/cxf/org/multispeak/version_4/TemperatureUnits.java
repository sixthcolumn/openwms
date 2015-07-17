
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temperatureUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="temperatureUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="degrees C"/>
 *     &lt;enumeration value="degrees K"/>
 *     &lt;enumeration value="degrees F"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "temperatureUnits")
@XmlEnum
public enum TemperatureUnits {

    @XmlEnumValue("degrees C")
    DEGREES_C("degrees C"),
    @XmlEnumValue("degrees K")
    DEGREES_K("degrees K"),
    @XmlEnumValue("degrees F")
    DEGREES_F("degrees F"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TemperatureUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureUnits fromValue(String v) {
        for (TemperatureUnits c: TemperatureUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
