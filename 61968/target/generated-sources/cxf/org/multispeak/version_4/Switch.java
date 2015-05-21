
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspSwitchingDevice">
 *       &lt;sequence>
 *         &lt;element name="switchImpedances" type="{http://www.multispeak.org/Version_4.1_Release}switchImpedances" minOccurs="0"/>
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
@XmlType(name = "switch", propOrder = {
    "switchImpedances"
})
public class Switch
    extends MspSwitchingDevice
{

    protected SwitchImpedances switchImpedances;

    /**
     * Gets the value of the switchImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchImpedances }
     *     
     */
    public SwitchImpedances getSwitchImpedances() {
        return switchImpedances;
    }

    /**
     * Sets the value of the switchImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchImpedances }
     *     
     */
    public void setSwitchImpedances(SwitchImpedances value) {
        this.switchImpedances = value;
    }

}
