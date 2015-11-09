
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for powerStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powerStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>powerStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powerStatus", propOrder = {
    "value"
})
public class PowerStatus {

    @XmlValue
    protected PowerStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * Outage status for this electric service.
     * 
     * @return
     *     possible object is
     *     {@link PowerStatusKind }
     *     
     */
    public PowerStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerStatusKind }
     *     
     */
    public void setValue(PowerStatusKind value) {
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