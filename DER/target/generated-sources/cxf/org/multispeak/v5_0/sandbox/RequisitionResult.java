
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for requisitionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requisitionResult">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/sandbox>requisitionResultKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requisitionResult", propOrder = {
    "value"
})
public class RequisitionResult {

    @XmlValue
    protected RequisitionResultKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * These are possible statuses for the requisition of
     * 				a specific material item.
     * 
     * @return
     *     possible object is
     *     {@link RequisitionResultKind }
     *     
     */
    public RequisitionResultKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequisitionResultKind }
     *     
     */
    public void setValue(RequisitionResultKind value) {
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
