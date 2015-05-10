
package org.w3._1999.xlink;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometryAssociationTypeActuate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeometryAssociationTypeActuate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onLoad"/>
 *     &lt;enumeration value="onRequest"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeometryAssociationTypeActuate", namespace = "http://www.w3.org/1999/xlink")
@XmlEnum
public enum GeometryAssociationTypeActuate {

    @XmlEnumValue("onLoad")
    ON_LOAD("onLoad"),
    @XmlEnumValue("onRequest")
    ON_REQUEST("onRequest"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    GeometryAssociationTypeActuate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeometryAssociationTypeActuate fromValue(String v) {
        for (GeometryAssociationTypeActuate c: GeometryAssociationTypeActuate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
