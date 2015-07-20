
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterGroup" type="{http://www.multispeak.org/Version_4.1_Release}meterGroup" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/Version_4.1_Release}serviceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meterGroup",
    "serviceType"
})
@XmlRootElement(name = "EstablishMeterGroup")
public class EstablishMeterGroup {

    protected MeterGroup meterGroup;
    @XmlElement(required = true)
    protected ServiceType serviceType;

    /**
     * Gets the value of the meterGroup property.
     * 
     * @return
     *     possible object is
     *     {@link MeterGroup }
     *     
     */
    public MeterGroup getMeterGroup() {
        return meterGroup;
    }

    /**
     * Sets the value of the meterGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterGroup }
     *     
     */
    public void setMeterGroup(MeterGroup value) {
        this.meterGroup = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

}
