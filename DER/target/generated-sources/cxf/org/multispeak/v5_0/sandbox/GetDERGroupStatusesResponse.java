
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDERGroupStatusesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupStatusesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupStatuses" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupStatuses"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupStatusesResponse", propOrder = {
    "derGroupStatuses"
})
public class GetDERGroupStatusesResponse {

    @XmlElement(name = "DERGroupStatuses", required = true)
    protected DERGroupStatuses derGroupStatuses;

    /**
     * Gets the value of the derGroupStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupStatuses }
     *     
     */
    public DERGroupStatuses getDERGroupStatuses() {
        return derGroupStatuses;
    }

    /**
     * Sets the value of the derGroupStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupStatuses }
     *     
     */
    public void setDERGroupStatuses(DERGroupStatuses value) {
        this.derGroupStatuses = value;
    }

}
