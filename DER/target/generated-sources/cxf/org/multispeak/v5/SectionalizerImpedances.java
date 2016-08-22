
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Conductance;
import org.multispeak.v5_0.commontypes.Reactance;
import org.multispeak.v5_0.commontypes.Resistance;
import org.multispeak.v5_0.commontypes.Susceptance;


/**
 * <p>Java class for sectionalizerImpedances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sectionalizerImpedances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="r" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.multispeak.org/V5.0/commonTypes}reactance" minOccurs="0"/>
 *         &lt;element name="r0" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
 *         &lt;element name="x0" type="{http://www.multispeak.org/V5.0/commonTypes}reactance" minOccurs="0"/>
 *         &lt;element name="b" type="{http://www.multispeak.org/V5.0/commonTypes}susceptance" minOccurs="0"/>
 *         &lt;element name="b0" type="{http://www.multispeak.org/V5.0/commonTypes}susceptance" minOccurs="0"/>
 *         &lt;element name="g" type="{http://www.multispeak.org/V5.0/commonTypes}conductance" minOccurs="0"/>
 *         &lt;element name="g0" type="{http://www.multispeak.org/V5.0/commonTypes}conductance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectionalizerImpedances", propOrder = {
    "r",
    "x",
    "r0",
    "x0",
    "b",
    "b0",
    "g",
    "g0"
})
public class SectionalizerImpedances {

    protected Resistance r;
    protected Reactance x;
    protected Resistance r0;
    protected Reactance x0;
    protected Susceptance b;
    protected Susceptance b0;
    protected Conductance g;
    protected Conductance g0;

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setR(Resistance value) {
        this.r = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setX(Reactance value) {
        this.x = value;
    }

    /**
     * Gets the value of the r0 property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getR0() {
        return r0;
    }

    /**
     * Sets the value of the r0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setR0(Resistance value) {
        this.r0 = value;
    }

    /**
     * Gets the value of the x0 property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getX0() {
        return x0;
    }

    /**
     * Sets the value of the x0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setX0(Reactance value) {
        this.x0 = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link Susceptance }
     *     
     */
    public Susceptance getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link Susceptance }
     *     
     */
    public void setB(Susceptance value) {
        this.b = value;
    }

    /**
     * Gets the value of the b0 property.
     * 
     * @return
     *     possible object is
     *     {@link Susceptance }
     *     
     */
    public Susceptance getB0() {
        return b0;
    }

    /**
     * Sets the value of the b0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Susceptance }
     *     
     */
    public void setB0(Susceptance value) {
        this.b0 = value;
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link Conductance }
     *     
     */
    public Conductance getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conductance }
     *     
     */
    public void setG(Conductance value) {
        this.g = value;
    }

    /**
     * Gets the value of the g0 property.
     * 
     * @return
     *     possible object is
     *     {@link Conductance }
     *     
     */
    public Conductance getG0() {
        return g0;
    }

    /**
     * Sets the value of the g0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conductance }
     *     
     */
    public void setG0(Conductance value) {
        this.g0 = value;
    }

}