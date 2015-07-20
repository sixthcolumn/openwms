
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurementDeviceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="measurementDeviceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="OutofService"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "measurementDeviceStatus")
@XmlEnum
public enum MeasurementDeviceStatus {

    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("OutofService")
    OUTOF_SERVICE("OutofService"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MeasurementDeviceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementDeviceStatus fromValue(String v) {
        for (MeasurementDeviceStatus c: MeasurementDeviceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
