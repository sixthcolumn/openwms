
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for synchronousMachineImpedances complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="synchronousMachineImpedances">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basePower" type="{http://www.multispeak.org/Version_4.1_Release}apparentPower" minOccurs="0"/>
 *         &lt;element name="baseVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="r" type="{http://www.multispeak.org/Version_4.1_Release}resistance" minOccurs="0"/>
 *         &lt;element name="r0" type="{http://www.multispeak.org/Version_4.1_Release}resistance" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="x0" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="xDirectSync" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="xDirectTrans" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="xDirectSubtrans" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="xQuadSync" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="xQuadTrans" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *         &lt;element name="xQuadSubtrans" type="{http://www.multispeak.org/Version_4.1_Release}reactance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "synchronousMachineImpedances", propOrder = {
    "basePower",
    "baseVoltage",
    "r",
    "r0",
    "x",
    "x0",
    "xDirectSync",
    "xDirectTrans",
    "xDirectSubtrans",
    "xQuadSync",
    "xQuadTrans",
    "xQuadSubtrans"
})
public class SynchronousMachineImpedances {

    protected ApparentPower basePower;
    protected Voltage baseVoltage;
    protected Resistance r;
    protected Resistance r0;
    protected Reactance x;
    protected Reactance x0;
    protected Reactance xDirectSync;
    protected Reactance xDirectTrans;
    protected Reactance xDirectSubtrans;
    protected Reactance xQuadSync;
    protected Reactance xQuadTrans;
    protected Reactance xQuadSubtrans;

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setBasePower(ApparentPower value) {
        this.basePower = value;
    }

    /**
     * Gets the value of the baseVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * Sets the value of the baseVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltage(Voltage value) {
        this.baseVoltage = value;
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
     * Gets the value of the xDirectSync property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getXDirectSync() {
        return xDirectSync;
    }

    /**
     * Sets the value of the xDirectSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setXDirectSync(Reactance value) {
        this.xDirectSync = value;
    }

    /**
     * Gets the value of the xDirectTrans property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getXDirectTrans() {
        return xDirectTrans;
    }

    /**
     * Sets the value of the xDirectTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setXDirectTrans(Reactance value) {
        this.xDirectTrans = value;
    }

    /**
     * Gets the value of the xDirectSubtrans property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getXDirectSubtrans() {
        return xDirectSubtrans;
    }

    /**
     * Sets the value of the xDirectSubtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setXDirectSubtrans(Reactance value) {
        this.xDirectSubtrans = value;
    }

    /**
     * Gets the value of the xQuadSync property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getXQuadSync() {
        return xQuadSync;
    }

    /**
     * Sets the value of the xQuadSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setXQuadSync(Reactance value) {
        this.xQuadSync = value;
    }

    /**
     * Gets the value of the xQuadTrans property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getXQuadTrans() {
        return xQuadTrans;
    }

    /**
     * Sets the value of the xQuadTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setXQuadTrans(Reactance value) {
        this.xQuadTrans = value;
    }

    /**
     * Gets the value of the xQuadSubtrans property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getXQuadSubtrans() {
        return xQuadSubtrans;
    }

    /**
     * Sets the value of the xQuadSubtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setXQuadSubtrans(Reactance value) {
        this.xQuadSubtrans = value;
    }

}
