
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for binaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="binaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="audio"/>
 *     &lt;enumeration value="video"/>
 *     &lt;enumeration value="application"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "binaryType")
@XmlEnum
public enum BinaryType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("audio")
    AUDIO("audio"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("application")
    APPLICATION("application");
    private final String value;

    BinaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BinaryType fromValue(String v) {
        for (BinaryType c: BinaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
