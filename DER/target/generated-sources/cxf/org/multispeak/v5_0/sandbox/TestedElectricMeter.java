
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.ReceivedElectricMeter;


/**
 * <p>Java class for testedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testedElectricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}receivedElectricMeter">
 *       &lt;sequence>
 *         &lt;element name="electricMeterTests" type="{http://www.multispeak.org/V5.0/sandbox}electricMeterTests" minOccurs="0"/>
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
@XmlType(name = "testedElectricMeter", propOrder = {
    "electricMeterTests"
})
public class TestedElectricMeter
    extends ReceivedElectricMeter
{

    protected ElectricMeterTests electricMeterTests;

    /**
     * Gets the value of the electricMeterTests property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeterTests }
     *     
     */
    public ElectricMeterTests getElectricMeterTests() {
        return electricMeterTests;
    }

    /**
     * Sets the value of the electricMeterTests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeterTests }
     *     
     */
    public void setElectricMeterTests(ElectricMeterTests value) {
        this.electricMeterTests = value;
    }

}
