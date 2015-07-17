
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadFlowResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadFlowResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspResultsBase">
 *       &lt;sequence>
 *         &lt;element name="priKvA" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="priKvB" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="priKvC" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="priKvBal" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="sectionDropA" type="{http://www.multispeak.org/Version_4.1_Release}sectionDrop" minOccurs="0"/>
 *         &lt;element name="sectionDropB" type="{http://www.multispeak.org/Version_4.1_Release}sectionDrop" minOccurs="0"/>
 *         &lt;element name="sectionDropC" type="{http://www.multispeak.org/Version_4.1_Release}sectionDrop" minOccurs="0"/>
 *         &lt;element name="sectionDropBal" type="{http://www.multispeak.org/Version_4.1_Release}sectionDrop" minOccurs="0"/>
 *         &lt;element name="cumulativeDropA" type="{http://www.multispeak.org/Version_4.1_Release}cumulativeDrop" minOccurs="0"/>
 *         &lt;element name="cumulativeDropB" type="{http://www.multispeak.org/Version_4.1_Release}cumulativeDrop" minOccurs="0"/>
 *         &lt;element name="cumulativeDropC" type="{http://www.multispeak.org/Version_4.1_Release}cumulativeDrop" minOccurs="0"/>
 *         &lt;element name="cumulativeDropBal" type="{http://www.multispeak.org/Version_4.1_Release}cumulativeDrop" minOccurs="0"/>
 *         &lt;element name="thruCurrentA" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="thruCurrentB" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="thruCurrentC" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="thruCurrentBal" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="pctCapA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruPowerA" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="thruPowerB" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="thruPowerC" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="thruPowerBal" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="thruReactiveA" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="thruReactiveB" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="thruReactiveC" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="thruReactiveBal" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="pctPfA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctLoss" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectPowerA" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="sectPowerB" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="sectPowerC" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="sectPowerBal" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="secReactiveA" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="secReactiveB" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="secReactiveC" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="secReactiveBal" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="consOnA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consOnB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consOnC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consOnBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
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
@XmlType(name = "loadFlowResult", propOrder = {
    "priKvA",
    "priKvB",
    "priKvC",
    "priKvBal",
    "sectionDropA",
    "sectionDropB",
    "sectionDropC",
    "sectionDropBal",
    "cumulativeDropA",
    "cumulativeDropB",
    "cumulativeDropC",
    "cumulativeDropBal",
    "thruCurrentA",
    "thruCurrentB",
    "thruCurrentC",
    "thruCurrentBal",
    "pctCapA",
    "pctCapB",
    "pctCapC",
    "pctCapBal",
    "thruPowerA",
    "thruPowerB",
    "thruPowerC",
    "thruPowerBal",
    "thruReactiveA",
    "thruReactiveB",
    "thruReactiveC",
    "thruReactiveBal",
    "pctPfA",
    "pctPfB",
    "pctPfC",
    "pctPfBal",
    "pctLoss",
    "sectPowerA",
    "sectPowerB",
    "sectPowerC",
    "sectPowerBal",
    "secReactiveA",
    "secReactiveB",
    "secReactiveC",
    "secReactiveBal",
    "consOnA",
    "consOnB",
    "consOnC",
    "consOnBal",
    "consThruA",
    "consThruB",
    "consThruC",
    "consThruBal",
    "baseVoltage"
})
public class LoadFlowResult
    extends MspResultsBase
{

    protected Voltage priKvA;
    protected Voltage priKvB;
    protected Voltage priKvC;
    protected Voltage priKvBal;
    protected SectionDrop sectionDropA;
    protected SectionDrop sectionDropB;
    protected SectionDrop sectionDropC;
    protected SectionDrop sectionDropBal;
    protected CumulativeDrop cumulativeDropA;
    protected CumulativeDrop cumulativeDropB;
    protected CumulativeDrop cumulativeDropC;
    protected CumulativeDrop cumulativeDropBal;
    protected Current thruCurrentA;
    protected Current thruCurrentB;
    protected Current thruCurrentC;
    protected Current thruCurrentBal;
    protected Float pctCapA;
    protected Float pctCapB;
    protected Float pctCapC;
    protected Float pctCapBal;
    protected RealPower thruPowerA;
    protected RealPower thruPowerB;
    protected RealPower thruPowerC;
    protected RealPower thruPowerBal;
    protected ReactivePower thruReactiveA;
    protected ReactivePower thruReactiveB;
    protected ReactivePower thruReactiveC;
    protected ReactivePower thruReactiveBal;
    protected Float pctPfA;
    protected Float pctPfB;
    protected Float pctPfC;
    protected Float pctPfBal;
    protected Float pctLoss;
    protected RealPower sectPowerA;
    protected RealPower sectPowerB;
    protected RealPower sectPowerC;
    protected RealPower sectPowerBal;
    protected ReactivePower secReactiveA;
    protected ReactivePower secReactiveB;
    protected ReactivePower secReactiveC;
    protected ReactivePower secReactiveBal;
    protected Long consOnA;
    protected Long consOnB;
    protected Long consOnC;
    protected Long consOnBal;
    protected Long consThruA;
    protected Long consThruB;
    protected Long consThruC;
    protected Long consThruBal;
    protected Voltage baseVoltage;

    /**
     * Gets the value of the priKvA property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getPriKvA() {
        return priKvA;
    }

    /**
     * Sets the value of the priKvA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setPriKvA(Voltage value) {
        this.priKvA = value;
    }

    /**
     * Gets the value of the priKvB property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getPriKvB() {
        return priKvB;
    }

    /**
     * Sets the value of the priKvB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setPriKvB(Voltage value) {
        this.priKvB = value;
    }

    /**
     * Gets the value of the priKvC property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getPriKvC() {
        return priKvC;
    }

    /**
     * Sets the value of the priKvC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setPriKvC(Voltage value) {
        this.priKvC = value;
    }

    /**
     * Gets the value of the priKvBal property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getPriKvBal() {
        return priKvBal;
    }

    /**
     * Sets the value of the priKvBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setPriKvBal(Voltage value) {
        this.priKvBal = value;
    }

    /**
     * Gets the value of the sectionDropA property.
     * 
     * @return
     *     possible object is
     *     {@link SectionDrop }
     *     
     */
    public SectionDrop getSectionDropA() {
        return sectionDropA;
    }

    /**
     * Sets the value of the sectionDropA property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionDrop }
     *     
     */
    public void setSectionDropA(SectionDrop value) {
        this.sectionDropA = value;
    }

    /**
     * Gets the value of the sectionDropB property.
     * 
     * @return
     *     possible object is
     *     {@link SectionDrop }
     *     
     */
    public SectionDrop getSectionDropB() {
        return sectionDropB;
    }

    /**
     * Sets the value of the sectionDropB property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionDrop }
     *     
     */
    public void setSectionDropB(SectionDrop value) {
        this.sectionDropB = value;
    }

    /**
     * Gets the value of the sectionDropC property.
     * 
     * @return
     *     possible object is
     *     {@link SectionDrop }
     *     
     */
    public SectionDrop getSectionDropC() {
        return sectionDropC;
    }

    /**
     * Sets the value of the sectionDropC property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionDrop }
     *     
     */
    public void setSectionDropC(SectionDrop value) {
        this.sectionDropC = value;
    }

    /**
     * Gets the value of the sectionDropBal property.
     * 
     * @return
     *     possible object is
     *     {@link SectionDrop }
     *     
     */
    public SectionDrop getSectionDropBal() {
        return sectionDropBal;
    }

    /**
     * Sets the value of the sectionDropBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionDrop }
     *     
     */
    public void setSectionDropBal(SectionDrop value) {
        this.sectionDropBal = value;
    }

    /**
     * Gets the value of the cumulativeDropA property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeDrop }
     *     
     */
    public CumulativeDrop getCumulativeDropA() {
        return cumulativeDropA;
    }

    /**
     * Sets the value of the cumulativeDropA property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeDrop }
     *     
     */
    public void setCumulativeDropA(CumulativeDrop value) {
        this.cumulativeDropA = value;
    }

    /**
     * Gets the value of the cumulativeDropB property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeDrop }
     *     
     */
    public CumulativeDrop getCumulativeDropB() {
        return cumulativeDropB;
    }

    /**
     * Sets the value of the cumulativeDropB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeDrop }
     *     
     */
    public void setCumulativeDropB(CumulativeDrop value) {
        this.cumulativeDropB = value;
    }

    /**
     * Gets the value of the cumulativeDropC property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeDrop }
     *     
     */
    public CumulativeDrop getCumulativeDropC() {
        return cumulativeDropC;
    }

    /**
     * Sets the value of the cumulativeDropC property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeDrop }
     *     
     */
    public void setCumulativeDropC(CumulativeDrop value) {
        this.cumulativeDropC = value;
    }

    /**
     * Gets the value of the cumulativeDropBal property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeDrop }
     *     
     */
    public CumulativeDrop getCumulativeDropBal() {
        return cumulativeDropBal;
    }

    /**
     * Sets the value of the cumulativeDropBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeDrop }
     *     
     */
    public void setCumulativeDropBal(CumulativeDrop value) {
        this.cumulativeDropBal = value;
    }

    /**
     * Gets the value of the thruCurrentA property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getThruCurrentA() {
        return thruCurrentA;
    }

    /**
     * Sets the value of the thruCurrentA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setThruCurrentA(Current value) {
        this.thruCurrentA = value;
    }

    /**
     * Gets the value of the thruCurrentB property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getThruCurrentB() {
        return thruCurrentB;
    }

    /**
     * Sets the value of the thruCurrentB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setThruCurrentB(Current value) {
        this.thruCurrentB = value;
    }

    /**
     * Gets the value of the thruCurrentC property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getThruCurrentC() {
        return thruCurrentC;
    }

    /**
     * Sets the value of the thruCurrentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setThruCurrentC(Current value) {
        this.thruCurrentC = value;
    }

    /**
     * Gets the value of the thruCurrentBal property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getThruCurrentBal() {
        return thruCurrentBal;
    }

    /**
     * Sets the value of the thruCurrentBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setThruCurrentBal(Current value) {
        this.thruCurrentBal = value;
    }

    /**
     * Gets the value of the pctCapA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapA() {
        return pctCapA;
    }

    /**
     * Sets the value of the pctCapA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapA(Float value) {
        this.pctCapA = value;
    }

    /**
     * Gets the value of the pctCapB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapB() {
        return pctCapB;
    }

    /**
     * Sets the value of the pctCapB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapB(Float value) {
        this.pctCapB = value;
    }

    /**
     * Gets the value of the pctCapC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapC() {
        return pctCapC;
    }

    /**
     * Sets the value of the pctCapC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapC(Float value) {
        this.pctCapC = value;
    }

    /**
     * Gets the value of the pctCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapBal() {
        return pctCapBal;
    }

    /**
     * Sets the value of the pctCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapBal(Float value) {
        this.pctCapBal = value;
    }

    /**
     * Gets the value of the thruPowerA property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getThruPowerA() {
        return thruPowerA;
    }

    /**
     * Sets the value of the thruPowerA property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setThruPowerA(RealPower value) {
        this.thruPowerA = value;
    }

    /**
     * Gets the value of the thruPowerB property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getThruPowerB() {
        return thruPowerB;
    }

    /**
     * Sets the value of the thruPowerB property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setThruPowerB(RealPower value) {
        this.thruPowerB = value;
    }

    /**
     * Gets the value of the thruPowerC property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getThruPowerC() {
        return thruPowerC;
    }

    /**
     * Sets the value of the thruPowerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setThruPowerC(RealPower value) {
        this.thruPowerC = value;
    }

    /**
     * Gets the value of the thruPowerBal property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getThruPowerBal() {
        return thruPowerBal;
    }

    /**
     * Sets the value of the thruPowerBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setThruPowerBal(RealPower value) {
        this.thruPowerBal = value;
    }

    /**
     * Gets the value of the thruReactiveA property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getThruReactiveA() {
        return thruReactiveA;
    }

    /**
     * Sets the value of the thruReactiveA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setThruReactiveA(ReactivePower value) {
        this.thruReactiveA = value;
    }

    /**
     * Gets the value of the thruReactiveB property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getThruReactiveB() {
        return thruReactiveB;
    }

    /**
     * Sets the value of the thruReactiveB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setThruReactiveB(ReactivePower value) {
        this.thruReactiveB = value;
    }

    /**
     * Gets the value of the thruReactiveC property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getThruReactiveC() {
        return thruReactiveC;
    }

    /**
     * Sets the value of the thruReactiveC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setThruReactiveC(ReactivePower value) {
        this.thruReactiveC = value;
    }

    /**
     * Gets the value of the thruReactiveBal property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getThruReactiveBal() {
        return thruReactiveBal;
    }

    /**
     * Sets the value of the thruReactiveBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setThruReactiveBal(ReactivePower value) {
        this.thruReactiveBal = value;
    }

    /**
     * Gets the value of the pctPfA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfA() {
        return pctPfA;
    }

    /**
     * Sets the value of the pctPfA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfA(Float value) {
        this.pctPfA = value;
    }

    /**
     * Gets the value of the pctPfB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfB() {
        return pctPfB;
    }

    /**
     * Sets the value of the pctPfB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfB(Float value) {
        this.pctPfB = value;
    }

    /**
     * Gets the value of the pctPfC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfC() {
        return pctPfC;
    }

    /**
     * Sets the value of the pctPfC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfC(Float value) {
        this.pctPfC = value;
    }

    /**
     * Gets the value of the pctPfBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfBal() {
        return pctPfBal;
    }

    /**
     * Sets the value of the pctPfBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfBal(Float value) {
        this.pctPfBal = value;
    }

    /**
     * Gets the value of the pctLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctLoss() {
        return pctLoss;
    }

    /**
     * Sets the value of the pctLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctLoss(Float value) {
        this.pctLoss = value;
    }

    /**
     * Gets the value of the sectPowerA property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getSectPowerA() {
        return sectPowerA;
    }

    /**
     * Sets the value of the sectPowerA property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setSectPowerA(RealPower value) {
        this.sectPowerA = value;
    }

    /**
     * Gets the value of the sectPowerB property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getSectPowerB() {
        return sectPowerB;
    }

    /**
     * Sets the value of the sectPowerB property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setSectPowerB(RealPower value) {
        this.sectPowerB = value;
    }

    /**
     * Gets the value of the sectPowerC property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getSectPowerC() {
        return sectPowerC;
    }

    /**
     * Sets the value of the sectPowerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setSectPowerC(RealPower value) {
        this.sectPowerC = value;
    }

    /**
     * Gets the value of the sectPowerBal property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getSectPowerBal() {
        return sectPowerBal;
    }

    /**
     * Sets the value of the sectPowerBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setSectPowerBal(RealPower value) {
        this.sectPowerBal = value;
    }

    /**
     * Gets the value of the secReactiveA property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getSecReactiveA() {
        return secReactiveA;
    }

    /**
     * Sets the value of the secReactiveA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setSecReactiveA(ReactivePower value) {
        this.secReactiveA = value;
    }

    /**
     * Gets the value of the secReactiveB property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getSecReactiveB() {
        return secReactiveB;
    }

    /**
     * Sets the value of the secReactiveB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setSecReactiveB(ReactivePower value) {
        this.secReactiveB = value;
    }

    /**
     * Gets the value of the secReactiveC property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getSecReactiveC() {
        return secReactiveC;
    }

    /**
     * Sets the value of the secReactiveC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setSecReactiveC(ReactivePower value) {
        this.secReactiveC = value;
    }

    /**
     * Gets the value of the secReactiveBal property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getSecReactiveBal() {
        return secReactiveBal;
    }

    /**
     * Sets the value of the secReactiveBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setSecReactiveBal(ReactivePower value) {
        this.secReactiveBal = value;
    }

    /**
     * Gets the value of the consOnA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnA() {
        return consOnA;
    }

    /**
     * Sets the value of the consOnA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnA(Long value) {
        this.consOnA = value;
    }

    /**
     * Gets the value of the consOnB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnB() {
        return consOnB;
    }

    /**
     * Sets the value of the consOnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnB(Long value) {
        this.consOnB = value;
    }

    /**
     * Gets the value of the consOnC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnC() {
        return consOnC;
    }

    /**
     * Sets the value of the consOnC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnC(Long value) {
        this.consOnC = value;
    }

    /**
     * Gets the value of the consOnBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnBal() {
        return consOnBal;
    }

    /**
     * Sets the value of the consOnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnBal(Long value) {
        this.consOnBal = value;
    }

    /**
     * Gets the value of the consThruA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruA() {
        return consThruA;
    }

    /**
     * Sets the value of the consThruA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruA(Long value) {
        this.consThruA = value;
    }

    /**
     * Gets the value of the consThruB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruB() {
        return consThruB;
    }

    /**
     * Sets the value of the consThruB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruB(Long value) {
        this.consThruB = value;
    }

    /**
     * Gets the value of the consThruC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruC() {
        return consThruC;
    }

    /**
     * Sets the value of the consThruC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruC(Long value) {
        this.consThruC = value;
    }

    /**
     * Gets the value of the consThruBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruBal() {
        return consThruBal;
    }

    /**
     * Sets the value of the consThruBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruBal(Long value) {
        this.consThruBal = value;
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

}
