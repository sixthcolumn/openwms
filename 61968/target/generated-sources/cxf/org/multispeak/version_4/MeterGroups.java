
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="electricMeterGroups" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterGroup" minOccurs="0"/>
 *         &lt;element name="gasMeterGroups" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterGroup" minOccurs="0"/>
 *         &lt;element name="waterMeterGroups" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterGroup" minOccurs="0"/>
 *         &lt;element name="propaneMeterGroups" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterGroup" minOccurs="0"/>
 *         &lt;element name="mixedMeterGroups" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterGroup" minOccurs="0"/>
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
@XmlType(name = "meterGroups", propOrder = {
    "electricMeterGroups",
    "gasMeterGroups",
    "waterMeterGroups",
    "propaneMeterGroups",
    "mixedMeterGroups"
})
public class MeterGroups
    extends MspObject
{

    protected ArrayOfMeterGroup electricMeterGroups;
    protected ArrayOfMeterGroup gasMeterGroups;
    protected ArrayOfMeterGroup waterMeterGroups;
    protected ArrayOfMeterGroup propaneMeterGroups;
    protected ArrayOfMeterGroup mixedMeterGroups;

    /**
     * Gets the value of the electricMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public ArrayOfMeterGroup getElectricMeterGroups() {
        return electricMeterGroups;
    }

    /**
     * Sets the value of the electricMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public void setElectricMeterGroups(ArrayOfMeterGroup value) {
        this.electricMeterGroups = value;
    }

    /**
     * Gets the value of the gasMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public ArrayOfMeterGroup getGasMeterGroups() {
        return gasMeterGroups;
    }

    /**
     * Sets the value of the gasMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public void setGasMeterGroups(ArrayOfMeterGroup value) {
        this.gasMeterGroups = value;
    }

    /**
     * Gets the value of the waterMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public ArrayOfMeterGroup getWaterMeterGroups() {
        return waterMeterGroups;
    }

    /**
     * Sets the value of the waterMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public void setWaterMeterGroups(ArrayOfMeterGroup value) {
        this.waterMeterGroups = value;
    }

    /**
     * Gets the value of the propaneMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public ArrayOfMeterGroup getPropaneMeterGroups() {
        return propaneMeterGroups;
    }

    /**
     * Sets the value of the propaneMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public void setPropaneMeterGroups(ArrayOfMeterGroup value) {
        this.propaneMeterGroups = value;
    }

    /**
     * Gets the value of the mixedMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public ArrayOfMeterGroup getMixedMeterGroups() {
        return mixedMeterGroups;
    }

    /**
     * Sets the value of the mixedMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterGroup }
     *     
     */
    public void setMixedMeterGroups(ArrayOfMeterGroup value) {
        this.mixedMeterGroups = value;
    }

}
