
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DERKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DERKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="BatteryStorage"/>
 *     &lt;enumeration value="Biogas"/>
 *     &lt;enumeration value="Biomass"/>
 *     &lt;enumeration value="Cogeneration"/>
 *     &lt;enumeration value="CombinationDER"/>
 *     &lt;enumeration value="CompressedAir"/>
 *     &lt;enumeration value="Flywheel"/>
 *     &lt;enumeration value="FuelCell"/>
 *     &lt;enumeration value="Hydro"/>
 *     &lt;enumeration value="Photovoltaic"/>
 *     &lt;enumeration value="Thermal"/>
 *     &lt;enumeration value="Wind"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DERKind")
@XmlEnum
public enum DERKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("BatteryStorage")
    BATTERY_STORAGE("BatteryStorage"),
    @XmlEnumValue("Biogas")
    BIOGAS("Biogas"),
    @XmlEnumValue("Biomass")
    BIOMASS("Biomass"),
    @XmlEnumValue("Cogeneration")
    COGENERATION("Cogeneration"),
    @XmlEnumValue("CombinationDER")
    COMBINATION_DER("CombinationDER"),
    @XmlEnumValue("CompressedAir")
    COMPRESSED_AIR("CompressedAir"),
    @XmlEnumValue("Flywheel")
    FLYWHEEL("Flywheel"),
    @XmlEnumValue("FuelCell")
    FUEL_CELL("FuelCell"),
    @XmlEnumValue("Hydro")
    HYDRO("Hydro"),
    @XmlEnumValue("Photovoltaic")
    PHOTOVOLTAIC("Photovoltaic"),
    @XmlEnumValue("Thermal")
    THERMAL("Thermal"),
    @XmlEnumValue("Wind")
    WIND("Wind"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DERKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DERKind fromValue(String v) {
        for (DERKind c: DERKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
