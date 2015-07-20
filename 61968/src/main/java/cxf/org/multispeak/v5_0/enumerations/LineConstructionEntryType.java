
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for lineConstructionEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineConstructionEntryType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>lineConstructionEntryKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lineConstructionEntryType", propOrder = {
    "value"
})
public class LineConstructionEntryType {

    @XmlValue
    protected LineConstructionEntryKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The type of line construction entry.  Overhead=Overhead primary line contruction entry, ConcentriNeutral=Concentric neutral cable entry, TapeShield=Tape shield cable entry, Secondary=Secondary conductor entry, ServiceDrop= Service drop entry, Other, Unknown.
     * 
     * @return
     *     possible object is
     *     {@link LineConstructionEntryKind }
     *     
     */
    public LineConstructionEntryKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineConstructionEntryKind }
     *     
     */
    public void setValue(LineConstructionEntryKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

}