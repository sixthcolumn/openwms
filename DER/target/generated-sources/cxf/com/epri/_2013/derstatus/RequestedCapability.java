
package com.epri._2013.derstatus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestedCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Watts"/>
 *     &lt;enumeration value="RealPower"/>
 *     &lt;enumeration value="ApparentPower"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestedCapability")
@XmlEnum
public enum RequestedCapability {

    @XmlEnumValue("Watts")
    WATTS("Watts"),
    @XmlEnumValue("RealPower")
    REAL_POWER("RealPower"),
    @XmlEnumValue("ApparentPower")
    APPARENT_POWER("ApparentPower");
    private final String value;

    RequestedCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedCapability fromValue(String v) {
        for (RequestedCapability c: RequestedCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
