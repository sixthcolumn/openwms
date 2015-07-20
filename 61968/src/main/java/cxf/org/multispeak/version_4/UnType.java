
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Anc"/>
 *     &lt;enumeration value="Cnd"/>
 *     &lt;enumeration value="Guy"/>
 *     &lt;enumeration value="OhA"/>
 *     &lt;enumeration value="OhP"/>
 *     &lt;enumeration value="OhS"/>
 *     &lt;enumeration value="OhT"/>
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="Pol"/>
 *     &lt;enumeration value="Sub"/>
 *     &lt;enumeration value="UgA"/>
 *     &lt;enumeration value="UgP"/>
 *     &lt;enumeration value="UgS"/>
 *     &lt;enumeration value="UgT"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unType")
@XmlEnum
public enum UnType {

    @XmlEnumValue("Anc")
    ANC("Anc"),
    @XmlEnumValue("Cnd")
    CND("Cnd"),
    @XmlEnumValue("Guy")
    GUY("Guy"),
    @XmlEnumValue("OhA")
    OH_A("OhA"),
    @XmlEnumValue("OhP")
    OH_P("OhP"),
    @XmlEnumValue("OhS")
    OH_S("OhS"),
    @XmlEnumValue("OhT")
    OH_T("OhT"),
    OH("OH"),
    @XmlEnumValue("Pol")
    POL("Pol"),
    @XmlEnumValue("Sub")
    SUB("Sub"),
    @XmlEnumValue("UgA")
    UG_A("UgA"),
    @XmlEnumValue("UgP")
    UG_P("UgP"),
    @XmlEnumValue("UgS")
    UG_S("UgS"),
    @XmlEnumValue("UgT")
    UG_T("UgT"),
    UG("UG"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnType fromValue(String v) {
        for (UnType c: UnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
