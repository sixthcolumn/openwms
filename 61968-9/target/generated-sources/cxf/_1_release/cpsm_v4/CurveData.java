
package _1_release.cpsm_v4;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for CurveData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurveData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xvalue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="y1value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="y2value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveData", propOrder = {
    "xvalue",
    "y1Value",
    "y2Value"
})
public class CurveData {

    protected Float xvalue;
    @XmlElement(name = "y1value")
    protected Float y1Value;
    @XmlElement(name = "y2value")
    protected Float y2Value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the xvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXvalue() {
        return xvalue;
    }

    /**
     * Sets the value of the xvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXvalue(Float value) {
        this.xvalue = value;
    }

    /**
     * Gets the value of the y1Value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY1Value() {
        return y1Value;
    }

    /**
     * Sets the value of the y1Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setY1Value(Float value) {
        this.y1Value = value;
    }

    /**
     * Gets the value of the y2Value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY2Value() {
        return y2Value;
    }

    /**
     * Sets the value of the y2Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setY2Value(Float value) {
        this.y2Value = value;
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
