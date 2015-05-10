
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="electricMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfElectricMeter" minOccurs="0"/>
 *         &lt;element name="waterMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWaterMeter" minOccurs="0"/>
 *         &lt;element name="gasMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGasMeter" minOccurs="0"/>
 *         &lt;element name="propaneMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPropaneMeter" minOccurs="0"/>
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
@XmlType(name = "meters", propOrder = {
    "electricMeters",
    "waterMeters",
    "gasMeters",
    "propaneMeters"
})
public class Meters
    extends MspObject
{

    protected ArrayOfElectricMeter electricMeters;
    protected ArrayOfWaterMeter waterMeters;
    protected ArrayOfGasMeter gasMeters;
    protected ArrayOfPropaneMeter propaneMeters;

    /**
     * Gets the value of the electricMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectricMeter }
     *     
     */
    public ArrayOfElectricMeter getElectricMeters() {
        return electricMeters;
    }

    /**
     * Sets the value of the electricMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectricMeter }
     *     
     */
    public void setElectricMeters(ArrayOfElectricMeter value) {
        this.electricMeters = value;
    }

    /**
     * Gets the value of the waterMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaterMeter }
     *     
     */
    public ArrayOfWaterMeter getWaterMeters() {
        return waterMeters;
    }

    /**
     * Sets the value of the waterMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaterMeter }
     *     
     */
    public void setWaterMeters(ArrayOfWaterMeter value) {
        this.waterMeters = value;
    }

    /**
     * Gets the value of the gasMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGasMeter }
     *     
     */
    public ArrayOfGasMeter getGasMeters() {
        return gasMeters;
    }

    /**
     * Sets the value of the gasMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGasMeter }
     *     
     */
    public void setGasMeters(ArrayOfGasMeter value) {
        this.gasMeters = value;
    }

    /**
     * Gets the value of the propaneMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropaneMeter }
     *     
     */
    public ArrayOfPropaneMeter getPropaneMeters() {
        return propaneMeters;
    }

    /**
     * Sets the value of the propaneMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropaneMeter }
     *     
     */
    public void setPropaneMeters(ArrayOfPropaneMeter value) {
        this.propaneMeters = value;
    }

}
