
package com.sixthc.cim.getMaintenanceOrders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhaseCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhaseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="ABCN"/>
 *     &lt;enumeration value="ABN"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACN"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BCN"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="s1"/>
 *     &lt;enumeration value="s12"/>
 *     &lt;enumeration value="s12N"/>
 *     &lt;enumeration value="s1N"/>
 *     &lt;enumeration value="s2"/>
 *     &lt;enumeration value="s2N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhaseCode", namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#")
@XmlEnum
public enum PhaseCode {


    /**
     * Phase A.
     * 
     */
    A("A"),

    /**
     * Phases A and B.
     * 
     */
    AB("AB"),

    /**
     * Phases A, B, and C.
     * 
     */
    ABC("ABC"),

    /**
     * Phases A, B, C, and
     * 						N.
     * 					
     * 
     */
    ABCN("ABCN"),

    /**
     * Phases A, B, and
     * 						neutral.
     * 					
     * 
     */
    ABN("ABN"),

    /**
     * Phases A and C.
     * 
     */
    AC("AC"),

    /**
     * Phases A, C and
     * 						neutral.
     * 					
     * 
     */
    ACN("ACN"),

    /**
     * Phases A and
     * 						neutral.
     * 					
     * 
     */
    AN("AN"),

    /**
     * Phase B.
     * 
     */
    B("B"),

    /**
     * Phases B and C.
     * 
     */
    BC("BC"),

    /**
     * Phases B, C, and
     * 						neutral.
     * 					
     * 
     */
    BCN("BCN"),

    /**
     * Phases B and
     * 						neutral.
     * 					
     * 
     */
    BN("BN"),

    /**
     * Phase C.
     * 
     */
    C("C"),

    /**
     * Phases C and
     * 						neutral.
     * 					
     * 
     */
    CN("CN"),

    /**
     * Neutral phase.
     * 
     */
    N("N"),

    /**
     * No phases
     * 						specified.
     * 					
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Secondary phase 1.
     * 
     */
    @XmlEnumValue("s1")
    S_1("s1"),

    /**
     * Secondary phase 1 and
     * 						2.
     * 					
     * 
     */
    @XmlEnumValue("s12")
    S_12("s12"),

    /**
     * Secondary phases 1, 2, and
     * 						neutral.
     * 					
     * 
     */
    @XmlEnumValue("s12N")
    S_12_N("s12N"),

    /**
     * Secondary phase 1 and
     * 						neutral.
     * 					
     * 
     */
    @XmlEnumValue("s1N")
    S_1_N("s1N"),

    /**
     * Secondary phase 2.
     * 
     */
    @XmlEnumValue("s2")
    S_2("s2"),

    /**
     * Secondary phase 2 and
     * 						neutral.
     * 					
     * 
     */
    @XmlEnumValue("s2N")
    S_2_N("s2N");
    private final String value;

    PhaseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhaseCode fromValue(String v) {
        for (PhaseCode c: PhaseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
