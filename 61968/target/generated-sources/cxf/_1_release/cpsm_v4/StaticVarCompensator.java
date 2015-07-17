
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for StaticVarCompensator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaticVarCompensator">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}RegulatingCondEq">
 *       &lt;sequence>
 *         &lt;element name="capacitiveRating" type="{cpsm_V4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="inductiveRating" type="{cpsm_V4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="sVCControlMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ReactivePower"/>
 *               &lt;enumeration value="Voltage"/>
 *               &lt;enumeration value="Off"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="slope" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *                 &lt;attribute name="units">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="kV/MVAr"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="voltageSetPoint" type="{cpsm_V4.1_Release}voltage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticVarCompensator", propOrder = {
    "capacitiveRating",
    "inductiveRating",
    "svcControlMode",
    "slope",
    "voltageSetPoint"
})
public class StaticVarCompensator
    extends RegulatingCondEq
{

    protected ReactivePower capacitiveRating;
    protected ReactivePower inductiveRating;
    @XmlElement(name = "sVCControlMode")
    protected String svcControlMode;
    protected StaticVarCompensator.Slope slope;
    protected Voltage voltageSetPoint;

    /**
     * Gets the value of the capacitiveRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getCapacitiveRating() {
        return capacitiveRating;
    }

    /**
     * Sets the value of the capacitiveRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setCapacitiveRating(ReactivePower value) {
        this.capacitiveRating = value;
    }

    /**
     * Gets the value of the inductiveRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getInductiveRating() {
        return inductiveRating;
    }

    /**
     * Sets the value of the inductiveRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setInductiveRating(ReactivePower value) {
        this.inductiveRating = value;
    }

    /**
     * Gets the value of the svcControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVCControlMode() {
        return svcControlMode;
    }

    /**
     * Sets the value of the svcControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVCControlMode(String value) {
        this.svcControlMode = value;
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link StaticVarCompensator.Slope }
     *     
     */
    public StaticVarCompensator.Slope getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticVarCompensator.Slope }
     *     
     */
    public void setSlope(StaticVarCompensator.Slope value) {
        this.slope = value;
    }

    /**
     * Gets the value of the voltageSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageSetPoint() {
        return voltageSetPoint;
    }

    /**
     * Sets the value of the voltageSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageSetPoint(Voltage value) {
        this.voltageSetPoint = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
     *       &lt;attribute name="units">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="kV/MVAr"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Slope {

        @XmlValue
        protected float value;
        @XmlAttribute(name = "units")
        protected String units;

        /**
         * Gets the value of the value property.
         * 
         */
        public float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(float value) {
            this.value = value;
        }

        /**
         * Gets the value of the units property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnits() {
            return units;
        }

        /**
         * Sets the value of the units property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnits(String value) {
            this.units = value;
        }

    }

}
