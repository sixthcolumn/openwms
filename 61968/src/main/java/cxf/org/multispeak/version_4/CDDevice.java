
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspDevice">
 *       &lt;sequence>
 *         &lt;element name="meterBaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="ratedCurrent" type="{http://www.multispeak.org/Version_4.1_Release}current" minOccurs="0"/>
 *         &lt;element name="moduleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfModule" minOccurs="0"/>
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
@XmlType(name = "CDDevice", propOrder = {
    "meterBaseID",
    "ratedVoltage",
    "ratedCurrent",
    "moduleList"
})
public class CDDevice
    extends MspDevice
{

    protected String meterBaseID;
    protected Voltage ratedVoltage;
    protected Current ratedCurrent;
    protected ArrayOfModule moduleList;

    /**
     * Gets the value of the meterBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterBaseID() {
        return meterBaseID;
    }

    /**
     * Sets the value of the meterBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterBaseID(String value) {
        this.meterBaseID = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the ratedCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * Sets the value of the ratedCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setRatedCurrent(Current value) {
        this.ratedCurrent = value;
    }

    /**
     * Gets the value of the moduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfModule }
     *     
     */
    public ArrayOfModule getModuleList() {
        return moduleList;
    }

    /**
     * Sets the value of the moduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfModule }
     *     
     */
    public void setModuleList(ArrayOfModule value) {
        this.moduleList = value;
    }

}
