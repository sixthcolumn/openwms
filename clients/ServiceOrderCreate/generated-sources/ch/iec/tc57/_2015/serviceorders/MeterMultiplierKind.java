
package ch.iec.tc57._2015.serviceorders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeterMultiplierKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeterMultiplierKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ctRatio"/>
 *     &lt;enumeration value="kE"/>
 *     &lt;enumeration value="kH"/>
 *     &lt;enumeration value="kR"/>
 *     &lt;enumeration value="ptRatio"/>
 *     &lt;enumeration value="transformerRatio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeterMultiplierKind")
@XmlEnum
public enum MeterMultiplierKind {

    @XmlEnumValue("ctRatio")
    CT_RATIO("ctRatio"),
    @XmlEnumValue("kE")
    K_E("kE"),
    @XmlEnumValue("kH")
    K_H("kH"),
    @XmlEnumValue("kR")
    K_R("kR"),
    @XmlEnumValue("ptRatio")
    PT_RATIO("ptRatio"),
    @XmlEnumValue("transformerRatio")
    TRANSFORMER_RATIO("transformerRatio");
    private final String value;

    MeterMultiplierKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeterMultiplierKind fromValue(String v) {
        for (MeterMultiplierKind c: MeterMultiplierKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
