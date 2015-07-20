
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterExchanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterExchanges">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="electricMeterExchanges" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfElectricMeterExchange" minOccurs="0"/>
 *         &lt;element name="waterMeterExchanges" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWaterMeterExchange" minOccurs="0"/>
 *         &lt;element name="gasMeterExchanges" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGasMeterExchange" minOccurs="0"/>
 *         &lt;element name="propaneMeterExchanges" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPropaneMeterExchange" minOccurs="0"/>
 *         &lt;element name="otherMeterExchanges" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOtherMeterExchange" minOccurs="0"/>
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
@XmlType(name = "meterExchanges", propOrder = {
    "electricMeterExchanges",
    "waterMeterExchanges",
    "gasMeterExchanges",
    "propaneMeterExchanges",
    "otherMeterExchanges"
})
public class MeterExchanges
    extends MspObject
{

    protected ArrayOfElectricMeterExchange electricMeterExchanges;
    protected ArrayOfWaterMeterExchange waterMeterExchanges;
    protected ArrayOfGasMeterExchange gasMeterExchanges;
    protected ArrayOfPropaneMeterExchange propaneMeterExchanges;
    protected ArrayOfOtherMeterExchange otherMeterExchanges;

    /**
     * Gets the value of the electricMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectricMeterExchange }
     *     
     */
    public ArrayOfElectricMeterExchange getElectricMeterExchanges() {
        return electricMeterExchanges;
    }

    /**
     * Sets the value of the electricMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectricMeterExchange }
     *     
     */
    public void setElectricMeterExchanges(ArrayOfElectricMeterExchange value) {
        this.electricMeterExchanges = value;
    }

    /**
     * Gets the value of the waterMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaterMeterExchange }
     *     
     */
    public ArrayOfWaterMeterExchange getWaterMeterExchanges() {
        return waterMeterExchanges;
    }

    /**
     * Sets the value of the waterMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaterMeterExchange }
     *     
     */
    public void setWaterMeterExchanges(ArrayOfWaterMeterExchange value) {
        this.waterMeterExchanges = value;
    }

    /**
     * Gets the value of the gasMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGasMeterExchange }
     *     
     */
    public ArrayOfGasMeterExchange getGasMeterExchanges() {
        return gasMeterExchanges;
    }

    /**
     * Sets the value of the gasMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGasMeterExchange }
     *     
     */
    public void setGasMeterExchanges(ArrayOfGasMeterExchange value) {
        this.gasMeterExchanges = value;
    }

    /**
     * Gets the value of the propaneMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropaneMeterExchange }
     *     
     */
    public ArrayOfPropaneMeterExchange getPropaneMeterExchanges() {
        return propaneMeterExchanges;
    }

    /**
     * Sets the value of the propaneMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropaneMeterExchange }
     *     
     */
    public void setPropaneMeterExchanges(ArrayOfPropaneMeterExchange value) {
        this.propaneMeterExchanges = value;
    }

    /**
     * Gets the value of the otherMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherMeterExchange }
     *     
     */
    public ArrayOfOtherMeterExchange getOtherMeterExchanges() {
        return otherMeterExchanges;
    }

    /**
     * Sets the value of the otherMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherMeterExchange }
     *     
     */
    public void setOtherMeterExchanges(ArrayOfOtherMeterExchange value) {
        this.otherMeterExchanges = value;
    }

}
