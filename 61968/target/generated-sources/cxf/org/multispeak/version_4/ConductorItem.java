
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conductorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conductorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hCoordinate" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *         &lt;element name="vCoordinate" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *         &lt;element name="bundleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="bundleSeparation" type="{http://www.multispeak.org/Version_4.1_Release}length" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conductorItem", propOrder = {
    "positionNumber",
    "hCoordinate",
    "vCoordinate",
    "bundleCount",
    "bundleSeparation"
})
public class ConductorItem {

    protected String positionNumber;
    protected Length hCoordinate;
    protected Length vCoordinate;
    protected BigInteger bundleCount;
    protected Length bundleSeparation;

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the hCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getHCoordinate() {
        return hCoordinate;
    }

    /**
     * Sets the value of the hCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setHCoordinate(Length value) {
        this.hCoordinate = value;
    }

    /**
     * Gets the value of the vCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getVCoordinate() {
        return vCoordinate;
    }

    /**
     * Sets the value of the vCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setVCoordinate(Length value) {
        this.vCoordinate = value;
    }

    /**
     * Gets the value of the bundleCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBundleCount() {
        return bundleCount;
    }

    /**
     * Sets the value of the bundleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBundleCount(BigInteger value) {
        this.bundleCount = value;
    }

    /**
     * Gets the value of the bundleSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getBundleSeparation() {
        return bundleSeparation;
    }

    /**
     * Sets the value of the bundleSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setBundleSeparation(Length value) {
        this.bundleSeparation = value;
    }

}
