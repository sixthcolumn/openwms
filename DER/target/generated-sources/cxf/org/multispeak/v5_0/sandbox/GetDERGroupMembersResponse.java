
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDERGroupMembersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupMembersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroups" type="{http://www.multispeak.org/V5.0/sandbox}DERGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupMembersResponse", propOrder = {
    "derGroups"
})
public class GetDERGroupMembersResponse {

    @XmlElement(name = "DERGroups")
    protected DERGroups derGroups;

    /**
     * Gets the value of the derGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroups }
     *     
     */
    public DERGroups getDERGroups() {
        return derGroups;
    }

    /**
     * Sets the value of the derGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroups }
     *     
     */
    public void setDERGroups(DERGroups value) {
        this.derGroups = value;
    }

}
