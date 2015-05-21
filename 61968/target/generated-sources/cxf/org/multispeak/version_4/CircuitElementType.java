
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuitElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="circuitElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ohPrimaryLine"/>
 *     &lt;enumeration value="ohSecondaryLine"/>
 *     &lt;enumeration value="ohTransmissionLine"/>
 *     &lt;enumeration value="ugPrimaryLine"/>
 *     &lt;enumeration value="ugSecondaryLine"/>
 *     &lt;enumeration value="ugTransissionLine"/>
 *     &lt;enumeration value="capacitorBank"/>
 *     &lt;enumeration value="overcurrentDeviceBank"/>
 *     &lt;enumeration value="regulatorBank"/>
 *     &lt;enumeration value="switchingDeviceBank"/>
 *     &lt;enumeration value="transformerBank"/>
 *     &lt;enumeration value="equivalentSource"/>
 *     &lt;enumeration value="root"/>
 *     &lt;enumeration value="electricService"/>
 *     &lt;enumeration value="fakeNodeSection"/>
 *     &lt;enumeration value="inducationMachine"/>
 *     &lt;enumeration value="synchronousMachine"/>
 *     &lt;enumeration value="streetLight"/>
 *     &lt;enumeration value="securityLight"/>
 *     &lt;enumeration value="trafficLight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "circuitElementType")
@XmlEnum
public enum CircuitElementType {

    @XmlEnumValue("ohPrimaryLine")
    OH_PRIMARY_LINE("ohPrimaryLine"),
    @XmlEnumValue("ohSecondaryLine")
    OH_SECONDARY_LINE("ohSecondaryLine"),
    @XmlEnumValue("ohTransmissionLine")
    OH_TRANSMISSION_LINE("ohTransmissionLine"),
    @XmlEnumValue("ugPrimaryLine")
    UG_PRIMARY_LINE("ugPrimaryLine"),
    @XmlEnumValue("ugSecondaryLine")
    UG_SECONDARY_LINE("ugSecondaryLine"),
    @XmlEnumValue("ugTransissionLine")
    UG_TRANSISSION_LINE("ugTransissionLine"),
    @XmlEnumValue("capacitorBank")
    CAPACITOR_BANK("capacitorBank"),
    @XmlEnumValue("overcurrentDeviceBank")
    OVERCURRENT_DEVICE_BANK("overcurrentDeviceBank"),
    @XmlEnumValue("regulatorBank")
    REGULATOR_BANK("regulatorBank"),
    @XmlEnumValue("switchingDeviceBank")
    SWITCHING_DEVICE_BANK("switchingDeviceBank"),
    @XmlEnumValue("transformerBank")
    TRANSFORMER_BANK("transformerBank"),
    @XmlEnumValue("equivalentSource")
    EQUIVALENT_SOURCE("equivalentSource"),
    @XmlEnumValue("root")
    ROOT("root"),
    @XmlEnumValue("electricService")
    ELECTRIC_SERVICE("electricService"),
    @XmlEnumValue("fakeNodeSection")
    FAKE_NODE_SECTION("fakeNodeSection"),
    @XmlEnumValue("inducationMachine")
    INDUCATION_MACHINE("inducationMachine"),
    @XmlEnumValue("synchronousMachine")
    SYNCHRONOUS_MACHINE("synchronousMachine"),
    @XmlEnumValue("streetLight")
    STREET_LIGHT("streetLight"),
    @XmlEnumValue("securityLight")
    SECURITY_LIGHT("securityLight"),
    @XmlEnumValue("trafficLight")
    TRAFFIC_LIGHT("trafficLight");
    private final String value;

    CircuitElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CircuitElementType fromValue(String v) {
        for (CircuitElementType c: CircuitElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
