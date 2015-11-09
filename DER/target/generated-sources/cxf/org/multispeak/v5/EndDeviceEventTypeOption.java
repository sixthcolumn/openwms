
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endDeviceEventTypeOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEventTypeOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="endDeviceEventType" type="{http://www.multispeak.org/V5.0}endDeviceEventType"/>
 *         &lt;element name="endDeviceEventTypeRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEventTypeOption", propOrder = {
    "endDeviceEventType",
    "endDeviceEventTypeRef"
})
public class EndDeviceEventTypeOption {

    protected EndDeviceEventType endDeviceEventType;
    protected String endDeviceEventTypeRef;

    /**
     * Gets the value of the endDeviceEventType property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEventType }
     *     
     */
    public EndDeviceEventType getEndDeviceEventType() {
        return endDeviceEventType;
    }

    /**
     * Sets the value of the endDeviceEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEventType }
     *     
     */
    public void setEndDeviceEventType(EndDeviceEventType value) {
        this.endDeviceEventType = value;
    }

    /**
     * Gets the value of the endDeviceEventTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDeviceEventTypeRef() {
        return endDeviceEventTypeRef;
    }

    /**
     * Sets the value of the endDeviceEventTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDeviceEventTypeRef(String value) {
        this.endDeviceEventTypeRef = value;
    }

}