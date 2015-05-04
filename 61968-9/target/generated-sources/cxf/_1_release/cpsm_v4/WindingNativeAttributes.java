
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WindingNativeAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindingNativeAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratedU" type="{cpsm_V4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ratedS" type="{cpsm_V4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="windingType" type="{cpsm_V4.1_Release}WindingType" minOccurs="0"/>
 *         &lt;element name="b" type="{cpsm_V4.1_Release}susceptance" minOccurs="0"/>
 *         &lt;element name="r" type="{cpsm_V4.1_Release}resistance" minOccurs="0"/>
 *         &lt;element name="x" type="{cpsm_V4.1_Release}reactance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindingNativeAttributes", propOrder = {
    "ratedU",
    "ratedS",
    "windingType",
    "b",
    "r",
    "x"
})
public class WindingNativeAttributes {

    protected Voltage ratedU;
    protected ApparentPower ratedS;
    protected WindingType windingType;
    protected Susceptance b;
    protected Resistance r;
    protected Reactance x;

    /**
     * Gets the value of the ratedU property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedU() {
        return ratedU;
    }

    /**
     * Sets the value of the ratedU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedU(Voltage value) {
        this.ratedU = value;
    }

    /**
     * Gets the value of the ratedS property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedS() {
        return ratedS;
    }

    /**
     * Sets the value of the ratedS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedS(ApparentPower value) {
        this.ratedS = value;
    }

    /**
     * Gets the value of the windingType property.
     * 
     * @return
     *     possible object is
     *     {@link WindingType }
     *     
     */
    public WindingType getWindingType() {
        return windingType;
    }

    /**
     * Sets the value of the windingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingType }
     *     
     */
    public void setWindingType(WindingType value) {
        this.windingType = value;
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

}
