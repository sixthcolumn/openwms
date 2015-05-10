
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extensionsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extensionsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="anySimpleType"/>
 *               &lt;enumeration value="anyType"/>
 *               &lt;enumeration value="anyURI"/>
 *               &lt;enumeration value="base64Binary"/>
 *               &lt;enumeration value="boolean"/>
 *               &lt;enumeration value="byte"/>
 *               &lt;enumeration value="date"/>
 *               &lt;enumeration value="dateTime"/>
 *               &lt;enumeration value="decimal"/>
 *               &lt;enumeration value="double"/>
 *               &lt;enumeration value="duration"/>
 *               &lt;enumeration value="ENTITIES"/>
 *               &lt;enumeration value="ENTITY"/>
 *               &lt;enumeration value="float"/>
 *               &lt;enumeration value="gDay"/>
 *               &lt;enumeration value="gMonth"/>
 *               &lt;enumeration value="gMonthDay"/>
 *               &lt;enumeration value="gYear"/>
 *               &lt;enumeration value="gYearMonth"/>
 *               &lt;enumeration value="hexBinary"/>
 *               &lt;enumeration value="ID"/>
 *               &lt;enumeration value="IDREF"/>
 *               &lt;enumeration value="IDREFS"/>
 *               &lt;enumeration value="int"/>
 *               &lt;enumeration value="integer"/>
 *               &lt;enumeration value="language"/>
 *               &lt;enumeration value="long"/>
 *               &lt;enumeration value="Name"/>
 *               &lt;enumeration value="NCName"/>
 *               &lt;enumeration value="negativeInteger"/>
 *               &lt;enumeration value="NMTOKEN"/>
 *               &lt;enumeration value="NMTOKENS"/>
 *               &lt;enumeration value="nonNegativeInteger"/>
 *               &lt;enumeration value="nonPositiveInteger"/>
 *               &lt;enumeration value="normalizedString"/>
 *               &lt;enumeration value="NOTATION"/>
 *               &lt;enumeration value="positiveInteger"/>
 *               &lt;enumeration value="QName"/>
 *               &lt;enumeration value="short"/>
 *               &lt;enumeration value="string"/>
 *               &lt;enumeration value="time"/>
 *               &lt;enumeration value="token"/>
 *               &lt;enumeration value="unsignedByte"/>
 *               &lt;enumeration value="unsignedInt"/>
 *               &lt;enumeration value="unsignedLong"/>
 *               &lt;enumeration value="unsignedShort"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extensionsItem", propOrder = {
    "extName",
    "extValue",
    "extType"
})
public class ExtensionsItem {

    protected String extName;
    protected String extValue;
    protected String extType;

    /**
     * Gets the value of the extName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtName() {
        return extName;
    }

    /**
     * Sets the value of the extName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtName(String value) {
        this.extName = value;
    }

    /**
     * Gets the value of the extValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtValue() {
        return extValue;
    }

    /**
     * Sets the value of the extValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtValue(String value) {
        this.extValue = value;
    }

    /**
     * Gets the value of the extType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtType() {
        return extType;
    }

    /**
     * Sets the value of the extType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtType(String value) {
        this.extType = value;
    }

}
