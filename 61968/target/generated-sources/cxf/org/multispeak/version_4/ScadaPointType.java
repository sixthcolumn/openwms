
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scadaPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scadaPointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="analog"/>
 *     &lt;enumeration value="accumulator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scadaPointType")
@XmlEnum
public enum ScadaPointType {

    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("analog")
    ANALOG("analog"),
    @XmlEnumValue("accumulator")
    ACCUMULATOR("accumulator");
    private final String value;

    ScadaPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScadaPointType fromValue(String v) {
        for (ScadaPointType c: ScadaPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
