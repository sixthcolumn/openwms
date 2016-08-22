
package ch.iec.tc57._2015.getserviceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="commercialIndustrial"/>
 *     &lt;enumeration value="energyServiceScheduler"/>
 *     &lt;enumeration value="energyServiceSupplier"/>
 *     &lt;enumeration value="internalUse"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="pumpingLoad"/>
 *     &lt;enumeration value="residential"/>
 *     &lt;enumeration value="residentialAndCommercial"/>
 *     &lt;enumeration value="residentialAndStreetlight"/>
 *     &lt;enumeration value="residentialFarmService"/>
 *     &lt;enumeration value="residentialStreetlightOthers"/>
 *     &lt;enumeration value="windMachine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerKind")
@XmlEnum
public enum CustomerKind {

    @XmlEnumValue("commercialIndustrial")
    COMMERCIAL_INDUSTRIAL("commercialIndustrial"),
    @XmlEnumValue("energyServiceScheduler")
    ENERGY_SERVICE_SCHEDULER("energyServiceScheduler"),
    @XmlEnumValue("energyServiceSupplier")
    ENERGY_SERVICE_SUPPLIER("energyServiceSupplier"),
    @XmlEnumValue("internalUse")
    INTERNAL_USE("internalUse"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("pumpingLoad")
    PUMPING_LOAD("pumpingLoad"),
    @XmlEnumValue("residential")
    RESIDENTIAL("residential"),
    @XmlEnumValue("residentialAndCommercial")
    RESIDENTIAL_AND_COMMERCIAL("residentialAndCommercial"),
    @XmlEnumValue("residentialAndStreetlight")
    RESIDENTIAL_AND_STREETLIGHT("residentialAndStreetlight"),
    @XmlEnumValue("residentialFarmService")
    RESIDENTIAL_FARM_SERVICE("residentialFarmService"),
    @XmlEnumValue("residentialStreetlightOthers")
    RESIDENTIAL_STREETLIGHT_OTHERS("residentialStreetlightOthers"),
    @XmlEnumValue("windMachine")
    WIND_MACHINE("windMachine");
    private final String value;

    CustomerKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerKind fromValue(String v) {
        for (CustomerKind c: CustomerKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
