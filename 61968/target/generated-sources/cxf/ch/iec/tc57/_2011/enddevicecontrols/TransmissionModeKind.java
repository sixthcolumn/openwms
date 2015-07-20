
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransmissionModeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransmissionModeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anonymous"/>
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransmissionModeKind")
@XmlEnum
public enum TransmissionModeKind {

    @XmlEnumValue("anonymous")
    ANONYMOUS("anonymous"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("normal")
    NORMAL("normal");
    private final String value;

    TransmissionModeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransmissionModeKind fromValue(String v) {
        for (TransmissionModeKind c: TransmissionModeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
