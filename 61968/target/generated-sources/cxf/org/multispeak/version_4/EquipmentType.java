
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equipmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="equipmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Conductor"/>
 *     &lt;enumeration value="Concentric neutral cable"/>
 *     &lt;enumeration value="Tape shield cable"/>
 *     &lt;enumeration value="Line construction"/>
 *     &lt;enumeration value="Secondary conductor"/>
 *     &lt;enumeration value="Service drop"/>
 *     &lt;enumeration value="Material attributes"/>
 *     &lt;enumeration value="Line environmental attributes"/>
 *     &lt;enumeration value="ROWAttributes"/>
 *     &lt;enumeration value="Material"/>
 *     &lt;enumeration value="Transformer"/>
 *     &lt;enumeration value="Regulator"/>
 *     &lt;enumeration value="Breaker"/>
 *     &lt;enumeration value="Fuse"/>
 *     &lt;enumeration value="Recloser"/>
 *     &lt;enumeration value="Sectionalizer"/>
 *     &lt;enumeration value="Switch"/>
 *     &lt;enumeration value="Load mix"/>
 *     &lt;enumeration value="Zsm impedance"/>
 *     &lt;enumeration value="InductionMachine"/>
 *     &lt;enumeration value="SynchronousMachine"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "equipmentType")
@XmlEnum
public enum EquipmentType {

    @XmlEnumValue("Conductor")
    CONDUCTOR("Conductor"),
    @XmlEnumValue("Concentric neutral cable")
    CONCENTRIC_NEUTRAL_CABLE("Concentric neutral cable"),
    @XmlEnumValue("Tape shield cable")
    TAPE_SHIELD_CABLE("Tape shield cable"),
    @XmlEnumValue("Line construction")
    LINE_CONSTRUCTION("Line construction"),
    @XmlEnumValue("Secondary conductor")
    SECONDARY_CONDUCTOR("Secondary conductor"),
    @XmlEnumValue("Service drop")
    SERVICE_DROP("Service drop"),
    @XmlEnumValue("Material attributes")
    MATERIAL_ATTRIBUTES("Material attributes"),
    @XmlEnumValue("Line environmental attributes")
    LINE_ENVIRONMENTAL_ATTRIBUTES("Line environmental attributes"),
    @XmlEnumValue("ROWAttributes")
    ROW_ATTRIBUTES("ROWAttributes"),
    @XmlEnumValue("Material")
    MATERIAL("Material"),
    @XmlEnumValue("Transformer")
    TRANSFORMER("Transformer"),
    @XmlEnumValue("Regulator")
    REGULATOR("Regulator"),
    @XmlEnumValue("Breaker")
    BREAKER("Breaker"),
    @XmlEnumValue("Fuse")
    FUSE("Fuse"),
    @XmlEnumValue("Recloser")
    RECLOSER("Recloser"),
    @XmlEnumValue("Sectionalizer")
    SECTIONALIZER("Sectionalizer"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("Load mix")
    LOAD_MIX("Load mix"),
    @XmlEnumValue("Zsm impedance")
    ZSM_IMPEDANCE("Zsm impedance"),
    @XmlEnumValue("InductionMachine")
    INDUCTION_MACHINE("InductionMachine"),
    @XmlEnumValue("SynchronousMachine")
    SYNCHRONOUS_MACHINE("SynchronousMachine"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    EquipmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentType fromValue(String v) {
        for (EquipmentType c: EquipmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
