
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReasonItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageReason" type="{http://www.multispeak.org/Version_4.1_Release}outageReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReasonItem", propOrder = {
    "category",
    "outageReason"
})
public class OutageReasonItem {

    protected String category;
    protected OutageReason outageReason;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the outageReason property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReason }
     *     
     */
    public OutageReason getOutageReason() {
        return outageReason;
    }

    /**
     * Sets the value of the outageReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReason }
     *     
     */
    public void setOutageReason(OutageReason value) {
        this.outageReason = value;
    }

}
