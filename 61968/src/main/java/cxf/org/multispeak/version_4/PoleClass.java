
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poleClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="poleClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Class 1"/>
 *     &lt;enumeration value="Class 2"/>
 *     &lt;enumeration value="Class 3"/>
 *     &lt;enumeration value="Class 4"/>
 *     &lt;enumeration value="Class 5"/>
 *     &lt;enumeration value="Class 6"/>
 *     &lt;enumeration value="Class 7"/>
 *     &lt;enumeration value="Class 8"/>
 *     &lt;enumeration value="Class 9"/>
 *     &lt;enumeration value="Class 10"/>
 *     &lt;enumeration value="H1"/>
 *     &lt;enumeration value="H2"/>
 *     &lt;enumeration value="H3"/>
 *     &lt;enumeration value="H4"/>
 *     &lt;enumeration value="H5"/>
 *     &lt;enumeration value="H6"/>
 *     &lt;enumeration value="H7"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "poleClass")
@XmlEnum
public enum PoleClass {

    @XmlEnumValue("Class 1")
    CLASS_1("Class 1"),
    @XmlEnumValue("Class 2")
    CLASS_2("Class 2"),
    @XmlEnumValue("Class 3")
    CLASS_3("Class 3"),
    @XmlEnumValue("Class 4")
    CLASS_4("Class 4"),
    @XmlEnumValue("Class 5")
    CLASS_5("Class 5"),
    @XmlEnumValue("Class 6")
    CLASS_6("Class 6"),
    @XmlEnumValue("Class 7")
    CLASS_7("Class 7"),
    @XmlEnumValue("Class 8")
    CLASS_8("Class 8"),
    @XmlEnumValue("Class 9")
    CLASS_9("Class 9"),
    @XmlEnumValue("Class 10")
    CLASS_10("Class 10"),
    @XmlEnumValue("H1")
    H_1("H1"),
    @XmlEnumValue("H2")
    H_2("H2"),
    @XmlEnumValue("H3")
    H_3("H3"),
    @XmlEnumValue("H4")
    H_4("H4"),
    @XmlEnumValue("H5")
    H_5("H5"),
    @XmlEnumValue("H6")
    H_6("H6"),
    @XmlEnumValue("H7")
    H_7("H7"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PoleClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoleClass fromValue(String v) {
        for (PoleClass c: PoleClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
