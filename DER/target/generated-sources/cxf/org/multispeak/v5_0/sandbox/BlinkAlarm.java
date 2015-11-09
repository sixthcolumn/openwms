
package org.multispeak.v5_0.sandbox;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blinkAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blinkAlarm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/sandbox}mspAlarm">
 *       &lt;sequence>
 *         &lt;element name="countedValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ceilingValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="latchesAtMaximum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blinkAlarm", propOrder = {
    "countedValue",
    "ceilingValue",
    "latchesAtMaximum"
})
public class BlinkAlarm
    extends MspAlarm
{

    protected BigInteger countedValue;
    protected BigInteger ceilingValue;
    protected Boolean latchesAtMaximum;

    /**
     * Gets the value of the countedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountedValue() {
        return countedValue;
    }

    /**
     * Sets the value of the countedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountedValue(BigInteger value) {
        this.countedValue = value;
    }

    /**
     * Gets the value of the ceilingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCeilingValue() {
        return ceilingValue;
    }

    /**
     * Sets the value of the ceilingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCeilingValue(BigInteger value) {
        this.ceilingValue = value;
    }

    /**
     * Gets the value of the latchesAtMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatchesAtMaximum() {
        return latchesAtMaximum;
    }

    /**
     * Sets the value of the latchesAtMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatchesAtMaximum(Boolean value) {
        this.latchesAtMaximum = value;
    }

}
