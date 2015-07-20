
package _1_release.cpsm_v4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TapChangerNativeAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TapChangerNativeAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="highStep" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lowStep" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="neutralU" type="{cpsm_V4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="neutralStep" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="normalStep" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="stepPhaseShiftIncrement" type="{cpsm_V4.1_Release}angle" minOccurs="0"/>
 *         &lt;element name="stepVoltageIncrement" type="{cpsm_V4.1_Release}PerCent" minOccurs="0"/>
 *         &lt;element name="type" type="{cpsm_V4.1_Release}TapChangerKind" minOccurs="0"/>
 *         &lt;element name="tculControlMode" type="{cpsm_V4.1_Release}TransformerControlMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TapChangerNativeAttributes", propOrder = {
    "highStep",
    "lowStep",
    "neutralU",
    "neutralStep",
    "normalStep",
    "stepPhaseShiftIncrement",
    "stepVoltageIncrement",
    "type",
    "tculControlMode"
})
public class TapChangerNativeAttributes {

    protected BigInteger highStep;
    protected BigInteger lowStep;
    protected Voltage neutralU;
    protected BigInteger neutralStep;
    protected BigInteger normalStep;
    protected Angle stepPhaseShiftIncrement;
    protected PerCent stepVoltageIncrement;
    protected TapChangerKind type;
    protected TransformerControlMode tculControlMode;

    /**
     * Gets the value of the highStep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHighStep() {
        return highStep;
    }

    /**
     * Sets the value of the highStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHighStep(BigInteger value) {
        this.highStep = value;
    }

    /**
     * Gets the value of the lowStep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowStep() {
        return lowStep;
    }

    /**
     * Sets the value of the lowStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowStep(BigInteger value) {
        this.lowStep = value;
    }

    /**
     * Gets the value of the neutralU property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getNeutralU() {
        return neutralU;
    }

    /**
     * Sets the value of the neutralU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setNeutralU(Voltage value) {
        this.neutralU = value;
    }

    /**
     * Gets the value of the neutralStep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeutralStep() {
        return neutralStep;
    }

    /**
     * Sets the value of the neutralStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeutralStep(BigInteger value) {
        this.neutralStep = value;
    }

    /**
     * Gets the value of the normalStep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNormalStep() {
        return normalStep;
    }

    /**
     * Sets the value of the normalStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNormalStep(BigInteger value) {
        this.normalStep = value;
    }

    /**
     * Gets the value of the stepPhaseShiftIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link Angle }
     *     
     */
    public Angle getStepPhaseShiftIncrement() {
        return stepPhaseShiftIncrement;
    }

    /**
     * Sets the value of the stepPhaseShiftIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angle }
     *     
     */
    public void setStepPhaseShiftIncrement(Angle value) {
        this.stepPhaseShiftIncrement = value;
    }

    /**
     * Gets the value of the stepVoltageIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link PerCent }
     *     
     */
    public PerCent getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    /**
     * Sets the value of the stepVoltageIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerCent }
     *     
     */
    public void setStepVoltageIncrement(PerCent value) {
        this.stepVoltageIncrement = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TapChangerKind }
     *     
     */
    public TapChangerKind getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapChangerKind }
     *     
     */
    public void setType(TapChangerKind value) {
        this.type = value;
    }

    /**
     * Gets the value of the tculControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerControlMode }
     *     
     */
    public TransformerControlMode getTculControlMode() {
        return tculControlMode;
    }

    /**
     * Sets the value of the tculControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerControlMode }
     *     
     */
    public void setTculControlMode(TransformerControlMode value) {
        this.tculControlMode = value;
    }

}
