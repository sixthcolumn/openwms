
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anySimpleType"/>
 *     &lt;enumeration value="anyType"/>
 *     &lt;enumeration value="anyURI"/>
 *     &lt;enumeration value="base64Binary"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="byte"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="duration"/>
 *     &lt;enumeration value="ENTITIES"/>
 *     &lt;enumeration value="ENTITY"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="gDay"/>
 *     &lt;enumeration value="gMonth"/>
 *     &lt;enumeration value="gMonthDay"/>
 *     &lt;enumeration value="gYear"/>
 *     &lt;enumeration value="gYearMonth"/>
 *     &lt;enumeration value="hexBinary"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IDREF"/>
 *     &lt;enumeration value="IDREFS"/>
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="language"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="NCName"/>
 *     &lt;enumeration value="negativeInteger"/>
 *     &lt;enumeration value="NMTOKEN"/>
 *     &lt;enumeration value="NMTOKENS"/>
 *     &lt;enumeration value="nonNegativeInteger"/>
 *     &lt;enumeration value="nonPositiveInteger"/>
 *     &lt;enumeration value="normalizedString"/>
 *     &lt;enumeration value="NOTATION"/>
 *     &lt;enumeration value="positiveInteger"/>
 *     &lt;enumeration value="QName"/>
 *     &lt;enumeration value="short"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="token"/>
 *     &lt;enumeration value="unsignedByte"/>
 *     &lt;enumeration value="unsignedInt"/>
 *     &lt;enumeration value="unsignedLong"/>
 *     &lt;enumeration value="unsignedShort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extType")
@XmlEnum
public enum ExtType {

    @XmlEnumValue("anySimpleType")
    ANY_SIMPLE_TYPE("anySimpleType"),
    @XmlEnumValue("anyType")
    ANY_TYPE("anyType"),
    @XmlEnumValue("anyURI")
    ANY_URI("anyURI"),
    @XmlEnumValue("base64Binary")
    BASE_64_BINARY("base64Binary"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("byte")
    BYTE("byte"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("duration")
    DURATION("duration"),
    ENTITIES("ENTITIES"),
    ENTITY("ENTITY"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("gDay")
    G_DAY("gDay"),
    @XmlEnumValue("gMonth")
    G_MONTH("gMonth"),
    @XmlEnumValue("gMonthDay")
    G_MONTH_DAY("gMonthDay"),
    @XmlEnumValue("gYear")
    G_YEAR("gYear"),
    @XmlEnumValue("gYearMonth")
    G_YEAR_MONTH("gYearMonth"),
    @XmlEnumValue("hexBinary")
    HEX_BINARY("hexBinary"),
    ID("ID"),
    IDREF("IDREF"),
    IDREFS("IDREFS"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("language")
    LANGUAGE("language"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("NCName")
    NC_NAME("NCName"),
    @XmlEnumValue("negativeInteger")
    NEGATIVE_INTEGER("negativeInteger"),
    NMTOKEN("NMTOKEN"),
    NMTOKENS("NMTOKENS"),
    @XmlEnumValue("nonNegativeInteger")
    NON_NEGATIVE_INTEGER("nonNegativeInteger"),
    @XmlEnumValue("nonPositiveInteger")
    NON_POSITIVE_INTEGER("nonPositiveInteger"),
    @XmlEnumValue("normalizedString")
    NORMALIZED_STRING("normalizedString"),
    NOTATION("NOTATION"),
    @XmlEnumValue("positiveInteger")
    POSITIVE_INTEGER("positiveInteger"),
    @XmlEnumValue("QName")
    Q_NAME("QName"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("token")
    TOKEN("token"),
    @XmlEnumValue("unsignedByte")
    UNSIGNED_BYTE("unsignedByte"),
    @XmlEnumValue("unsignedInt")
    UNSIGNED_INT("unsignedInt"),
    @XmlEnumValue("unsignedLong")
    UNSIGNED_LONG("unsignedLong"),
    @XmlEnumValue("unsignedShort")
    UNSIGNED_SHORT("unsignedShort");
    private final String value;

    ExtType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtType fromValue(String v) {
        for (ExtType c: ExtType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
