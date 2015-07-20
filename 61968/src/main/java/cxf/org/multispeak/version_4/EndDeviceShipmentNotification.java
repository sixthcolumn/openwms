
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="shipment" type="{http://www.multispeak.org/Version_4.1_Release}endDeviceShipment" minOccurs="0"/>
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
    "shipment"
})
@XmlRootElement(name = "EndDeviceShipmentNotification")
public class EndDeviceShipmentNotification {

    protected EndDeviceShipment shipment;

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceShipment }
     *     
     */
    public EndDeviceShipment getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceShipment }
     *     
     */
    public void setShipment(EndDeviceShipment value) {
        this.shipment = value;
    }

}
