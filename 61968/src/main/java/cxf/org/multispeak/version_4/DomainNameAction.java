
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domainNameAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="domainNameAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Modify"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "domainNameAction")
@XmlEnum
public enum DomainNameAction {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Modify")
    MODIFY("Modify");
    private final String value;

    DomainNameAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomainNameAction fromValue(String v) {
        for (DomainNameAction c: DomainNameAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
