
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurementDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="measurementDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Emeter"/>
 *     &lt;enumeration value="Gmeter"/>
 *     &lt;enumeration value="Wmeter"/>
 *     &lt;enumeration value="Demand"/>
 *     &lt;enumeration value="Harmonic"/>
 *     &lt;enumeration value="Phaseangle"/>
 *     &lt;enumeration value="BusV"/>
 *     &lt;enumeration value="BusI"/>
 *     &lt;enumeration value="BkrV"/>
 *     &lt;enumeration value="BkrI"/>
 *     &lt;enumeration value="LineV"/>
 *     &lt;enumeration value="LineI"/>
 *     &lt;enumeration value="GPSClock"/>
 *     &lt;enumeration value="Temp"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "measurementDeviceType")
@XmlEnum
public enum MeasurementDeviceType {

    @XmlEnumValue("Emeter")
    EMETER("Emeter"),
    @XmlEnumValue("Gmeter")
    GMETER("Gmeter"),
    @XmlEnumValue("Wmeter")
    WMETER("Wmeter"),
    @XmlEnumValue("Demand")
    DEMAND("Demand"),
    @XmlEnumValue("Harmonic")
    HARMONIC("Harmonic"),
    @XmlEnumValue("Phaseangle")
    PHASEANGLE("Phaseangle"),
    @XmlEnumValue("BusV")
    BUS_V("BusV"),
    @XmlEnumValue("BusI")
    BUS_I("BusI"),
    @XmlEnumValue("BkrV")
    BKR_V("BkrV"),
    @XmlEnumValue("BkrI")
    BKR_I("BkrI"),
    @XmlEnumValue("LineV")
    LINE_V("LineV"),
    @XmlEnumValue("LineI")
    LINE_I("LineI"),
    @XmlEnumValue("GPSClock")
    GPS_CLOCK("GPSClock"),
    @XmlEnumValue("Temp")
    TEMP("Temp"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MeasurementDeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementDeviceType fromValue(String v) {
        for (MeasurementDeviceType c: MeasurementDeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
