
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="readingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="suspiciousRead"/>
 *     &lt;enumeration value="DSTinEffect"/>
 *     &lt;enumeration value="manuallyUpdated"/>
 *     &lt;enumeration value="manuallyEntered"/>
 *     &lt;enumeration value="reset"/>
 *     &lt;enumeration value="seasonChange"/>
 *     &lt;enumeration value="firstRead"/>
 *     &lt;enumeration value="billingRead"/>
 *     &lt;enumeration value="afterCorrection"/>
 *     &lt;enumeration value="beforeCorrection"/>
 *     &lt;enumeration value="finalRead"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "readingStatus")
@XmlEnum
public enum ReadingStatus {

    @XmlEnumValue("suspiciousRead")
    SUSPICIOUS_READ("suspiciousRead"),
    @XmlEnumValue("DSTinEffect")
    DS_TIN_EFFECT("DSTinEffect"),
    @XmlEnumValue("manuallyUpdated")
    MANUALLY_UPDATED("manuallyUpdated"),
    @XmlEnumValue("manuallyEntered")
    MANUALLY_ENTERED("manuallyEntered"),
    @XmlEnumValue("reset")
    RESET("reset"),
    @XmlEnumValue("seasonChange")
    SEASON_CHANGE("seasonChange"),
    @XmlEnumValue("firstRead")
    FIRST_READ("firstRead"),
    @XmlEnumValue("billingRead")
    BILLING_READ("billingRead"),
    @XmlEnumValue("afterCorrection")
    AFTER_CORRECTION("afterCorrection"),
    @XmlEnumValue("beforeCorrection")
    BEFORE_CORRECTION("beforeCorrection"),
    @XmlEnumValue("finalRead")
    FINAL_READ("finalRead");
    private final String value;

    ReadingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadingStatus fromValue(String v) {
        for (ReadingStatus c: ReadingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
