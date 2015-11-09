
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllDERsPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllDERsPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllDERsPayload", propOrder = {
    "lastReceived"
})
public class GetAllDERsPayload {

    protected String lastReceived;

    /**
     * Gets the value of the lastReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReceived() {
        return lastReceived;
    }

    /**
     * Sets the value of the lastReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReceived(String value) {
        this.lastReceived = value;
    }

}
