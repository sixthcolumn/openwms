
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="loadFlow"/>
 *     &lt;enumeration value="shortCircuit"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultsType")
@XmlEnum
public enum ResultsType {

    @XmlEnumValue("loadFlow")
    LOAD_FLOW("loadFlow"),
    @XmlEnumValue("shortCircuit")
    SHORT_CIRCUIT("shortCircuit"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResultsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultsType fromValue(String v) {
        for (ResultsType c: ResultsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
