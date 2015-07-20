
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quantityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="quantityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="summation"/>
 *     &lt;enumeration value="demand"/>
 *     &lt;enumeration value="consumption"/>
 *     &lt;enumeration value="value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "quantityType")
@XmlEnum
public enum QuantityType {

    @XmlEnumValue("summation")
    SUMMATION("summation"),
    @XmlEnumValue("demand")
    DEMAND("demand"),
    @XmlEnumValue("consumption")
    CONSUMPTION("consumption"),
    @XmlEnumValue("value")
    VALUE("value");
    private final String value;

    QuantityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityType fromValue(String v) {
        for (QuantityType c: QuantityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}