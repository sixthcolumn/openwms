
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electric"/>
 *     &lt;enumeration value="Gas"/>
 *     &lt;enumeration value="Water"/>
 *     &lt;enumeration value="Propane"/>
 *     &lt;enumeration value="Refuse"/>
 *     &lt;enumeration value="Sewer"/>
 *     &lt;enumeration value="Telecom"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="Cable"/>
 *     &lt;enumeration value="Heating"/>
 *     &lt;enumeration value="Steam"/>
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceType")
@XmlEnum
public enum ServiceType {

    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    @XmlEnumValue("Gas")
    GAS("Gas"),
    @XmlEnumValue("Water")
    WATER("Water"),
    @XmlEnumValue("Propane")
    PROPANE("Propane"),
    @XmlEnumValue("Refuse")
    REFUSE("Refuse"),
    @XmlEnumValue("Sewer")
    SEWER("Sewer"),
    @XmlEnumValue("Telecom")
    TELECOM("Telecom"),
    TV("TV"),
    @XmlEnumValue("Cable")
    CABLE("Cable"),
    @XmlEnumValue("Heating")
    HEATING("Heating"),
    @XmlEnumValue("Steam")
    STEAM("Steam"),
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceType fromValue(String v) {
        for (ServiceType c: ServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
