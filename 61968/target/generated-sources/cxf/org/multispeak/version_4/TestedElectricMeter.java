
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testedElectricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}receivedElectricMeter">
 *       &lt;sequence>
 *         &lt;element name="meterTestList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterTest" minOccurs="0"/>
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
@XmlType(name = "testedElectricMeter", propOrder = {
    "meterTestList"
})
public class TestedElectricMeter
    extends ReceivedElectricMeter
{

    protected ArrayOfMeterTest meterTestList;

    /**
     * Gets the value of the meterTestList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterTest }
     *     
     */
    public ArrayOfMeterTest getMeterTestList() {
        return meterTestList;
    }

    /**
     * Sets the value of the meterTestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterTest }
     *     
     */
    public void setMeterTestList(ArrayOfMeterTest value) {
        this.meterTestList = value;
    }

}
