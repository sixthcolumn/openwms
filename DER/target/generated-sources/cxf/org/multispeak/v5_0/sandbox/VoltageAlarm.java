
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voltageAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voltageAlarm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/sandbox}mspAlarm">
 *       &lt;sequence>
 *         &lt;element name="voltageAlarmList" type="{http://www.multispeak.org/V5.0/sandbox}voltageAlarmList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voltageAlarm", propOrder = {
    "voltageAlarmList"
})
public class VoltageAlarm
    extends MspAlarm
{

    protected VoltageAlarmList voltageAlarmList;

    /**
     * Gets the value of the voltageAlarmList property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageAlarmList }
     *     
     */
    public VoltageAlarmList getVoltageAlarmList() {
        return voltageAlarmList;
    }

    /**
     * Sets the value of the voltageAlarmList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageAlarmList }
     *     
     */
    public void setVoltageAlarmList(VoltageAlarmList value) {
        this.voltageAlarmList = value;
    }

}
