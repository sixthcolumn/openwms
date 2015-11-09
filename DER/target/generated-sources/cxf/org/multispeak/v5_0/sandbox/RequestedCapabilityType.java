
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedCapabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestedCapabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ApparentPower"/>
 *     &lt;enumeration value="ReactivePower"/>
 *     &lt;enumeration value="RealPower"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requestedCapabilityType")
@XmlEnum
public enum RequestedCapabilityType {

    @XmlEnumValue("ApparentPower")
    APPARENT_POWER("ApparentPower"),
    @XmlEnumValue("ReactivePower")
    REACTIVE_POWER("ReactivePower"),
    @XmlEnumValue("RealPower")
    REAL_POWER("RealPower"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RequestedCapabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestedCapabilityType fromValue(String v) {
        for (RequestedCapabilityType c: RequestedCapabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
