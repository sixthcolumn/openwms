
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactiveSignalModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactiveSignalModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Operational"/>
 *     &lt;enumeration value="Testing"/>
 *     &lt;enumeration value="Simulated"/>
 *     &lt;enumeration value="Startup"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactiveSignalModeType")
@XmlEnum
public enum TransactiveSignalModeType {

    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Operational")
    OPERATIONAL("Operational"),
    @XmlEnumValue("Testing")
    TESTING("Testing"),
    @XmlEnumValue("Simulated")
    SIMULATED("Simulated"),
    @XmlEnumValue("Startup")
    STARTUP("Startup"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TransactiveSignalModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactiveSignalModeType fromValue(String v) {
        for (TransactiveSignalModeType c: TransactiveSignalModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
