
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CDReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PPMBalanceNegative"/>
 *     &lt;enumeration value="PPMBalancePositive"/>
 *     &lt;enumeration value="NonPayment"/>
 *     &lt;enumeration value="ServiceInactive"/>
 *     &lt;enumeration value="PaymentAgreement"/>
 *     &lt;enumeration value="PaymentReceived"/>
 *     &lt;enumeration value="NewCustomer"/>
 *     &lt;enumeration value="ServiceRestored"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CDReasonCode")
@XmlEnum
public enum CDReasonCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PPMBalanceNegative")
    PPM_BALANCE_NEGATIVE("PPMBalanceNegative"),
    @XmlEnumValue("PPMBalancePositive")
    PPM_BALANCE_POSITIVE("PPMBalancePositive"),
    @XmlEnumValue("NonPayment")
    NON_PAYMENT("NonPayment"),
    @XmlEnumValue("ServiceInactive")
    SERVICE_INACTIVE("ServiceInactive"),
    @XmlEnumValue("PaymentAgreement")
    PAYMENT_AGREEMENT("PaymentAgreement"),
    @XmlEnumValue("PaymentReceived")
    PAYMENT_RECEIVED("PaymentReceived"),
    @XmlEnumValue("NewCustomer")
    NEW_CUSTOMER("NewCustomer"),
    @XmlEnumValue("ServiceRestored")
    SERVICE_RESTORED("ServiceRestored"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CDReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDReasonCode fromValue(String v) {
        for (CDReasonCode c: CDReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
