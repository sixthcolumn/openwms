
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitDispatchStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommitDispatchStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="notParticipating"/>
 *     &lt;enumeration value="participating"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommitDispatchStatus")
@XmlEnum
public enum CommitDispatchStatus {


    /**
     * enum
     * 
     */
    @XmlEnumValue("notParticipating")
    NOT_PARTICIPATING("notParticipating"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("participating")
    PARTICIPATING("participating");
    private final String value;

    CommitDispatchStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommitDispatchStatus fromValue(String v) {
        for (CommitDispatchStatus c: CommitDispatchStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
