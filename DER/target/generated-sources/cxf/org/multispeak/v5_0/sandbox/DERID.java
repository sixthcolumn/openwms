
package org.multispeak.v5_0.sandbox;

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
 * This is the identifier for this distributed energy
 * 				resource.
 * 
 * <p>Java class for DERID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERID">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="DERName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectGUID" use="required" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" />
 *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registeredName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;attribute name="systemName" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERID", propOrder = {
    "value"
})
public class DERID {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DERName")
    protected String derName;
    @XmlAttribute(name = "objectGUID", required = true)
    protected String objectGUID;
    @XmlAttribute(name = "owner")
    protected String owner;
    @XmlAttribute(name = "registeredName")
    protected String registeredName;
    @XmlAttribute(name = "systemName")
    protected String systemName;
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
     * Gets the value of the derName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDERName() {
        return derName;
    }

    /**
     * Sets the value of the derName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDERName(String value) {
        this.derName = value;
    }

    /**
     * Gets the value of the objectGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectGUID(String value) {
        this.objectGUID = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the registeredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredName() {
        return registeredName;
    }

    /**
     * Sets the value of the registeredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredName(String value) {
        this.registeredName = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
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
