
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstraintType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="maximumCallsPerDay"/>
 *     &lt;enumeration value="minimumAdvancedNotification"/>
 *     &lt;enumeration value="operationalMaximumRuntime"/>
 *     &lt;enumeration value="minimumDowntime"/>
 *     &lt;enumeration value="minimumStarts"/>
 *     &lt;enumeration value="maximumEnergy"/>
 *     &lt;enumeration value="maximumStarts"/>
 *     &lt;enumeration value="timeOfDay "/>
 *     &lt;enumeration value="blackOutDate"/>
 *     &lt;enumeration value="maximumConsecutiveDays"/>
 *     &lt;enumeration value="minimumDuration"/>
 *     &lt;enumeration value="minimumLoad"/>
 *     &lt;enumeration value="maximumLoad"/>
 *     &lt;enumeration value="maximumDuration"/>
 *     &lt;enumeration value="minumumDuration"/>
 *     &lt;enumeration value="operationalMinimumRuntime"/>
 *     &lt;enumeration value="scheduleMinimumRuntime,"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstraintType")
@XmlEnum
public enum ConstraintType {


    /**
     * enum
     * 
     */
    @XmlEnumValue("maximumCallsPerDay")
    MAXIMUM_CALLS_PER_DAY("maximumCallsPerDay"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("minimumAdvancedNotification")
    MINIMUM_ADVANCED_NOTIFICATION("minimumAdvancedNotification"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("operationalMaximumRuntime")
    OPERATIONAL_MAXIMUM_RUNTIME("operationalMaximumRuntime"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("minimumDowntime")
    MINIMUM_DOWNTIME("minimumDowntime"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("minimumStarts")
    MINIMUM_STARTS("minimumStarts"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("maximumEnergy")
    MAXIMUM_ENERGY("maximumEnergy"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("maximumStarts")
    MAXIMUM_STARTS("maximumStarts"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("timeOfDay ")
    TIME_OF_DAY("timeOfDay "),

    /**
     * enum
     * 
     */
    @XmlEnumValue("blackOutDate")
    BLACK_OUT_DATE("blackOutDate"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("maximumConsecutiveDays")
    MAXIMUM_CONSECUTIVE_DAYS("maximumConsecutiveDays"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("minimumDuration")
    MINIMUM_DURATION("minimumDuration"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("minimumLoad")
    MINIMUM_LOAD("minimumLoad"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("maximumLoad")
    MAXIMUM_LOAD("maximumLoad"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("maximumDuration")
    MAXIMUM_DURATION("maximumDuration"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("minumumDuration")
    MINUMUM_DURATION("minumumDuration"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("operationalMinimumRuntime")
    OPERATIONAL_MINIMUM_RUNTIME("operationalMinimumRuntime"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("scheduleMinimumRuntime,")
    SCHEDULE_MINIMUM_RUNTIME("scheduleMinimumRuntime,");
    private final String value;

    ConstraintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstraintType fromValue(String v) {
        for (ConstraintType c: ConstraintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
