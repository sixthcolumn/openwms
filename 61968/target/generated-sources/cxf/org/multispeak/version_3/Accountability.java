
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accountability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Q1"/>
 *     &lt;enumeration value="Q2"/>
 *     &lt;enumeration value="Q3"/>
 *     &lt;enumeration value="Q4"/>
 *     &lt;enumeration value="Q1-2"/>
 *     &lt;enumeration value="Q1-3"/>
 *     &lt;enumeration value="Q1-4"/>
 *     &lt;enumeration value="Q2-3"/>
 *     &lt;enumeration value="Q2-4"/>
 *     &lt;enumeration value="Q3-4"/>
 *     &lt;enumeration value="Q1-2-3"/>
 *     &lt;enumeration value="Q1-2-4"/>
 *     &lt;enumeration value="Q1-3-4"/>
 *     &lt;enumeration value="Q2-3-4"/>
 *     &lt;enumeration value="Q1-2-3-4"/>
 *     &lt;enumeration value="Q1-2-netFlow"/>
 *     &lt;enumeration value="Q1-3-netFlow"/>
 *     &lt;enumeration value="Q1-4-netFlow"/>
 *     &lt;enumeration value="Q2-3-netFlow"/>
 *     &lt;enumeration value="Q2-4-netFlow"/>
 *     &lt;enumeration value="Q3-4-netFlow"/>
 *     &lt;enumeration value="Q1-2-3-netFlow"/>
 *     &lt;enumeration value="Q1-2-4-netFlow"/>
 *     &lt;enumeration value="Q1-3-4-netFlow"/>
 *     &lt;enumeration value="Q2-3-4-netFlow"/>
 *     &lt;enumeration value="Q1-2-3-4-netFlow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accountability")
@XmlEnum
public enum Accountability {

    @XmlEnumValue("Q1")
    Q_1("Q1"),
    @XmlEnumValue("Q2")
    Q_2("Q2"),
    @XmlEnumValue("Q3")
    Q_3("Q3"),
    @XmlEnumValue("Q4")
    Q_4("Q4"),
    @XmlEnumValue("Q1-2")
    Q_1_2("Q1-2"),
    @XmlEnumValue("Q1-3")
    Q_1_3("Q1-3"),
    @XmlEnumValue("Q1-4")
    Q_1_4("Q1-4"),
    @XmlEnumValue("Q2-3")
    Q_2_3("Q2-3"),
    @XmlEnumValue("Q2-4")
    Q_2_4("Q2-4"),
    @XmlEnumValue("Q3-4")
    Q_3_4("Q3-4"),
    @XmlEnumValue("Q1-2-3")
    Q_1_2_3("Q1-2-3"),
    @XmlEnumValue("Q1-2-4")
    Q_1_2_4("Q1-2-4"),
    @XmlEnumValue("Q1-3-4")
    Q_1_3_4("Q1-3-4"),
    @XmlEnumValue("Q2-3-4")
    Q_2_3_4("Q2-3-4"),
    @XmlEnumValue("Q1-2-3-4")
    Q_1_2_3_4("Q1-2-3-4"),
    @XmlEnumValue("Q1-2-netFlow")
    Q_1_2_NET_FLOW("Q1-2-netFlow"),
    @XmlEnumValue("Q1-3-netFlow")
    Q_1_3_NET_FLOW("Q1-3-netFlow"),
    @XmlEnumValue("Q1-4-netFlow")
    Q_1_4_NET_FLOW("Q1-4-netFlow"),
    @XmlEnumValue("Q2-3-netFlow")
    Q_2_3_NET_FLOW("Q2-3-netFlow"),
    @XmlEnumValue("Q2-4-netFlow")
    Q_2_4_NET_FLOW("Q2-4-netFlow"),
    @XmlEnumValue("Q3-4-netFlow")
    Q_3_4_NET_FLOW("Q3-4-netFlow"),
    @XmlEnumValue("Q1-2-3-netFlow")
    Q_1_2_3_NET_FLOW("Q1-2-3-netFlow"),
    @XmlEnumValue("Q1-2-4-netFlow")
    Q_1_2_4_NET_FLOW("Q1-2-4-netFlow"),
    @XmlEnumValue("Q1-3-4-netFlow")
    Q_1_3_4_NET_FLOW("Q1-3-4-netFlow"),
    @XmlEnumValue("Q2-3-4-netFlow")
    Q_2_3_4_NET_FLOW("Q2-3-4-netFlow"),
    @XmlEnumValue("Q1-2-3-4-netFlow")
    Q_1_2_3_4_NET_FLOW("Q1-2-3-4-netFlow");
    private final String value;

    Accountability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Accountability fromValue(String v) {
        for (Accountability c: Accountability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
