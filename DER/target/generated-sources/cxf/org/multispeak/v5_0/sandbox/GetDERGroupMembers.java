
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDERGroupMembers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetDERGroupMembers", propOrder = {
    "derGroupName",
    "lastReceived"
})
public class GetDERGroupMembers {

    @XmlElement(name = "DERGroupName", required = true)
    protected String derGroupName;
    protected String lastReceived;

    /**
     * Gets the value of the derGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDERGroupName() {
        return derGroupName;
    }

    /**
     * Sets the value of the derGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDERGroupName(String value) {
        this.derGroupName = value;
    }

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
