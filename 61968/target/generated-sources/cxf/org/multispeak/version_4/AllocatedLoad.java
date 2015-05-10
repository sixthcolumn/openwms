
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allocatedLoad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allocatedLoad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="realPower" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="reactivePower" type="{http://www.multispeak.org/Version_4.1_Release}reactivePower" minOccurs="0"/>
 *         &lt;element name="noOfCustomers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allocatedLoad", propOrder = {
    "phaseCode",
    "realPower",
    "reactivePower",
    "noOfCustomers"
})
public class AllocatedLoad {

    protected PhaseCode phaseCode;
    protected RealPower realPower;
    protected ReactivePower reactivePower;
    protected BigInteger noOfCustomers;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the realPower property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getRealPower() {
        return realPower;
    }

    /**
     * Sets the value of the realPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setRealPower(RealPower value) {
        this.realPower = value;
    }

    /**
     * Gets the value of the reactivePower property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getReactivePower() {
        return reactivePower;
    }

    /**
     * Sets the value of the reactivePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setReactivePower(ReactivePower value) {
        this.reactivePower = value;
    }

    /**
     * Gets the value of the noOfCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoOfCustomers() {
        return noOfCustomers;
    }

    /**
     * Sets the value of the noOfCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoOfCustomers(BigInteger value) {
        this.noOfCustomers = value;
    }

}
