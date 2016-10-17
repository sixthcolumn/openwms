
package ch.iec.tc57._2015.serviceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplierKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="retailer"/>
 *     &lt;enumeration value="utility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplierKind")
@XmlEnum
public enum SupplierKind {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("retailer")
    RETAILER("retailer"),
    @XmlEnumValue("utility")
    UTILITY("utility");
    private final String value;

    SupplierKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplierKind fromValue(String v) {
        for (SupplierKind c: SupplierKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
