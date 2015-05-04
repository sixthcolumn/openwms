
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstraintInterval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="daily"/>
 *     &lt;enumeration value="weekly"/>
 *     &lt;enumeration value="hourly"/>
 *     &lt;enumeration value="date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstraintInterval")
@XmlEnum
public enum ConstraintInterval {


    /**
     * enum
     * 
     */
    @XmlEnumValue("daily")
    DAILY("daily"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("hourly")
    HOURLY("hourly"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("date")
    DATE("date");
    private final String value;

    ConstraintInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstraintInterval fromValue(String v) {
        for (ConstraintInterval c: ConstraintInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
