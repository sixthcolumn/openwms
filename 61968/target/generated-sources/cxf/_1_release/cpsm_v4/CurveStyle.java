
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurveStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurveStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="constantYValue"/>
 *     &lt;enumeration value="straightLineYValues"/>
 *     &lt;enumeration value="rampYValues"/>
 *     &lt;enumeration value="formula"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurveStyle")
@XmlEnum
public enum CurveStyle {

    @XmlEnumValue("constantYValue")
    CONSTANT_Y_VALUE("constantYValue"),
    @XmlEnumValue("straightLineYValues")
    STRAIGHT_LINE_Y_VALUES("straightLineYValues"),
    @XmlEnumValue("rampYValues")
    RAMP_Y_VALUES("rampYValues"),
    @XmlEnumValue("formula")
    FORMULA("formula");
    private final String value;

    CurveStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurveStyle fromValue(String v) {
        for (CurveStyle c: CurveStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
