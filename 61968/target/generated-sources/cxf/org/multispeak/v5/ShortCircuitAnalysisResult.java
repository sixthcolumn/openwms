
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ComplexImpedance;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.Impedance;


/**
 * <p>Java class for shortCircuitAnalysisResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shortCircuitAnalysisResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspResultsBase">
 *       &lt;sequence>
 *         &lt;element name="faultImpedance" type="{http://www.multispeak.org/V5.0/commonTypes}complexImpedance" minOccurs="0"/>
 *         &lt;element name="minimumLGFault" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="maximumLGFault" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="maximumLLFault" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="maximumLLGFault" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="maximumLLLGFault" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="positiveSequenceZ" type="{http://www.multispeak.org/V5.0/commonTypes}impedance" minOccurs="0"/>
 *         &lt;element name="negativeSequenceZ" type="{http://www.multispeak.org/V5.0/commonTypes}impedance" minOccurs="0"/>
 *         &lt;element name="zeroSequenceZ" type="{http://www.multispeak.org/V5.0/commonTypes}impedance" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shortCircuitAnalysisResult", propOrder = {
    "faultImpedance",
    "minimumLGFault",
    "maximumLGFault",
    "maximumLLFault",
    "maximumLLGFault",
    "maximumLLLGFault",
    "positiveSequenceZ",
    "negativeSequenceZ",
    "zeroSequenceZ"
})
public class ShortCircuitAnalysisResult
    extends MspResultsBase
{

    protected ComplexImpedance faultImpedance;
    protected Current minimumLGFault;
    protected Current maximumLGFault;
    protected Current maximumLLFault;
    protected Current maximumLLGFault;
    protected Current maximumLLLGFault;
    protected Impedance positiveSequenceZ;
    protected Impedance negativeSequenceZ;
    protected Impedance zeroSequenceZ;

    /**
     * Gets the value of the faultImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getFaultImpedance() {
        return faultImpedance;
    }

    /**
     * Sets the value of the faultImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setFaultImpedance(ComplexImpedance value) {
        this.faultImpedance = value;
    }

    /**
     * Gets the value of the minimumLGFault property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getMinimumLGFault() {
        return minimumLGFault;
    }

    /**
     * Sets the value of the minimumLGFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setMinimumLGFault(Current value) {
        this.minimumLGFault = value;
    }

    /**
     * Gets the value of the maximumLGFault property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getMaximumLGFault() {
        return maximumLGFault;
    }

    /**
     * Sets the value of the maximumLGFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setMaximumLGFault(Current value) {
        this.maximumLGFault = value;
    }

    /**
     * Gets the value of the maximumLLFault property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getMaximumLLFault() {
        return maximumLLFault;
    }

    /**
     * Sets the value of the maximumLLFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setMaximumLLFault(Current value) {
        this.maximumLLFault = value;
    }

    /**
     * Gets the value of the maximumLLGFault property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getMaximumLLGFault() {
        return maximumLLGFault;
    }

    /**
     * Sets the value of the maximumLLGFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setMaximumLLGFault(Current value) {
        this.maximumLLGFault = value;
    }

    /**
     * Gets the value of the maximumLLLGFault property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getMaximumLLLGFault() {
        return maximumLLLGFault;
    }

    /**
     * Sets the value of the maximumLLLGFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setMaximumLLLGFault(Current value) {
        this.maximumLLLGFault = value;
    }

    /**
     * Gets the value of the positiveSequenceZ property.
     * 
     * @return
     *     possible object is
     *     {@link Impedance }
     *     
     */
    public Impedance getPositiveSequenceZ() {
        return positiveSequenceZ;
    }

    /**
     * Sets the value of the positiveSequenceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impedance }
     *     
     */
    public void setPositiveSequenceZ(Impedance value) {
        this.positiveSequenceZ = value;
    }

    /**
     * Gets the value of the negativeSequenceZ property.
     * 
     * @return
     *     possible object is
     *     {@link Impedance }
     *     
     */
    public Impedance getNegativeSequenceZ() {
        return negativeSequenceZ;
    }

    /**
     * Sets the value of the negativeSequenceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impedance }
     *     
     */
    public void setNegativeSequenceZ(Impedance value) {
        this.negativeSequenceZ = value;
    }

    /**
     * Gets the value of the zeroSequenceZ property.
     * 
     * @return
     *     possible object is
     *     {@link Impedance }
     *     
     */
    public Impedance getZeroSequenceZ() {
        return zeroSequenceZ;
    }

    /**
     * Sets the value of the zeroSequenceZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impedance }
     *     
     */
    public void setZeroSequenceZ(Impedance value) {
        this.zeroSequenceZ = value;
    }

}
