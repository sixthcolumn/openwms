
package org.multispeak.version_4;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Java class for readingStatusCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingStatusCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="originatingSystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingStatusCode", propOrder = {
    "value"
})
public class ReadingStatusCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "originatingSystemID")
    protected String originatingSystemID;
    @XmlAttribute(name = "codeCategory")
    protected String codeCategory;
    @XmlAttribute(name = "codeIndex")
    protected String codeIndex;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the originatingSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingSystemID() {
        return originatingSystemID;
    }

    /**
     * Sets the value of the originatingSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingSystemID(String value) {
        this.originatingSystemID = value;
    }

    /**
     * Gets the value of the codeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCategory() {
        return codeCategory;
    }

    /**
     * Sets the value of the codeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCategory(String value) {
        this.codeCategory = value;
    }

    /**
     * Gets the value of the codeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeIndex() {
        return codeIndex;
    }

    /**
     * Sets the value of the codeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeIndex(String value) {
        this.codeIndex = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
