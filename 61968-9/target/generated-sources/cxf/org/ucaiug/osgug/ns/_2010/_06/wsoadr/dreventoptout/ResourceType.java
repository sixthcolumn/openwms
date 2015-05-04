
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="loadReduction"/>
 *     &lt;enumeration value="generation"/>
 *     &lt;enumeration value="combination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceType")
@XmlEnum
public enum ResourceType {


    /**
     * enum
     * 
     */
    @XmlEnumValue("loadReduction")
    LOAD_REDUCTION("loadReduction"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("generation")
    GENERATION("generation"),

    /**
     * enum
     * 
     */
    @XmlEnumValue("combination")
    COMBINATION("combination");
    private final String value;

    ResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceType fromValue(String v) {
        for (ResourceType c: ResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
