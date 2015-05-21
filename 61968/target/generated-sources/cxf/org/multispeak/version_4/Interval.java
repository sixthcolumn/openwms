
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for interval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interval">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="DSTinEffect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="clockForward" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="clockBackward" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="overflow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="partialInterval" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="longInterval" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="testData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="manuallyEntered" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="manuallyModified" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="recorderStopped" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="configChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interval", propOrder = {
    "value"
})
public class Interval {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "DSTinEffect")
    protected Boolean dsTinEffect;
    @XmlAttribute(name = "clockForward")
    protected Boolean clockForward;
    @XmlAttribute(name = "clockBackward")
    protected Boolean clockBackward;
    @XmlAttribute(name = "overflow")
    protected Boolean overflow;
    @XmlAttribute(name = "partialInterval")
    protected Boolean partialInterval;
    @XmlAttribute(name = "longInterval")
    protected Boolean longInterval;
    @XmlAttribute(name = "testData")
    protected Boolean testData;
    @XmlAttribute(name = "invalid")
    protected Boolean invalid;
    @XmlAttribute(name = "manuallyEntered")
    protected Boolean manuallyEntered;
    @XmlAttribute(name = "manuallyModified")
    protected Boolean manuallyModified;
    @XmlAttribute(name = "recorderStopped")
    protected Boolean recorderStopped;
    @XmlAttribute(name = "configChanged")
    protected Boolean configChanged;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the dsTinEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDSTinEffect() {
        if (dsTinEffect == null) {
            return false;
        } else {
            return dsTinEffect;
        }
    }

    /**
     * Sets the value of the dsTinEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDSTinEffect(Boolean value) {
        this.dsTinEffect = value;
    }

    /**
     * Gets the value of the clockForward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClockForward() {
        if (clockForward == null) {
            return false;
        } else {
            return clockForward;
        }
    }

    /**
     * Sets the value of the clockForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClockForward(Boolean value) {
        this.clockForward = value;
    }

    /**
     * Gets the value of the clockBackward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClockBackward() {
        if (clockBackward == null) {
            return false;
        } else {
            return clockBackward;
        }
    }

    /**
     * Sets the value of the clockBackward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClockBackward(Boolean value) {
        this.clockBackward = value;
    }

    /**
     * Gets the value of the overflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverflow() {
        if (overflow == null) {
            return false;
        } else {
            return overflow;
        }
    }

    /**
     * Sets the value of the overflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverflow(Boolean value) {
        this.overflow = value;
    }

    /**
     * Gets the value of the partialInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPartialInterval() {
        if (partialInterval == null) {
            return false;
        } else {
            return partialInterval;
        }
    }

    /**
     * Sets the value of the partialInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialInterval(Boolean value) {
        this.partialInterval = value;
    }

    /**
     * Gets the value of the longInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLongInterval() {
        if (longInterval == null) {
            return false;
        } else {
            return longInterval;
        }
    }

    /**
     * Sets the value of the longInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLongInterval(Boolean value) {
        this.longInterval = value;
    }

    /**
     * Gets the value of the testData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTestData() {
        if (testData == null) {
            return false;
        } else {
            return testData;
        }
    }

    /**
     * Sets the value of the testData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestData(Boolean value) {
        this.testData = value;
    }

    /**
     * Gets the value of the invalid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInvalid() {
        if (invalid == null) {
            return false;
        } else {
            return invalid;
        }
    }

    /**
     * Sets the value of the invalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalid(Boolean value) {
        this.invalid = value;
    }

    /**
     * Gets the value of the manuallyEntered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManuallyEntered() {
        if (manuallyEntered == null) {
            return false;
        } else {
            return manuallyEntered;
        }
    }

    /**
     * Sets the value of the manuallyEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyEntered(Boolean value) {
        this.manuallyEntered = value;
    }

    /**
     * Gets the value of the manuallyModified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isManuallyModified() {
        if (manuallyModified == null) {
            return false;
        } else {
            return manuallyModified;
        }
    }

    /**
     * Sets the value of the manuallyModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyModified(Boolean value) {
        this.manuallyModified = value;
    }

    /**
     * Gets the value of the recorderStopped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecorderStopped() {
        if (recorderStopped == null) {
            return false;
        } else {
            return recorderStopped;
        }
    }

    /**
     * Sets the value of the recorderStopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecorderStopped(Boolean value) {
        this.recorderStopped = value;
    }

    /**
     * Gets the value of the configChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConfigChanged() {
        if (configChanged == null) {
            return false;
        } else {
            return configChanged;
        }
    }

    /**
     * Sets the value of the configChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigChanged(Boolean value) {
        this.configChanged = value;
    }

}
