
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for material.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="material">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AAAC"/>
 *     &lt;enumeration value="AAC"/>
 *     &lt;enumeration value="ACAR"/>
 *     &lt;enumeration value="ACSR"/>
 *     &lt;enumeration value="ACSR/T2"/>
 *     &lt;enumeration value="AlumoWeld"/>
 *     &lt;enumeration value="Anaconda"/>
 *     &lt;enumeration value="CopperWeld"/>
 *     &lt;enumeration value="CopperWeld copper"/>
 *     &lt;enumeration value="Expanded ACSR"/>
 *     &lt;enumeration value="Galvanized steel"/>
 *     &lt;enumeration value="Hard drawn aluminum"/>
 *     &lt;enumeration value="Hard drawn copper"/>
 *     &lt;enumeration value="HH hollow copper"/>
 *     &lt;enumeration value="High strength steel"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Stainless steel strand"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "material")
@XmlEnum
public enum Material {

    AAAC("AAAC"),
    AAC("AAC"),
    ACAR("ACAR"),
    ACSR("ACSR"),
    @XmlEnumValue("ACSR/T2")
    ACSR_T_2("ACSR/T2"),
    @XmlEnumValue("AlumoWeld")
    ALUMO_WELD("AlumoWeld"),
    @XmlEnumValue("Anaconda")
    ANACONDA("Anaconda"),
    @XmlEnumValue("CopperWeld")
    COPPER_WELD("CopperWeld"),
    @XmlEnumValue("CopperWeld copper")
    COPPER_WELD_COPPER("CopperWeld copper"),
    @XmlEnumValue("Expanded ACSR")
    EXPANDED_ACSR("Expanded ACSR"),
    @XmlEnumValue("Galvanized steel")
    GALVANIZED_STEEL("Galvanized steel"),
    @XmlEnumValue("Hard drawn aluminum")
    HARD_DRAWN_ALUMINUM("Hard drawn aluminum"),
    @XmlEnumValue("Hard drawn copper")
    HARD_DRAWN_COPPER("Hard drawn copper"),
    @XmlEnumValue("HH hollow copper")
    HH_HOLLOW_COPPER("HH hollow copper"),
    @XmlEnumValue("High strength steel")
    HIGH_STRENGTH_STEEL("High strength steel"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Stainless steel strand")
    STAINLESS_STEEL_STRAND("Stainless steel strand"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    Material(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Material fromValue(String v) {
        for (Material c: Material.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
