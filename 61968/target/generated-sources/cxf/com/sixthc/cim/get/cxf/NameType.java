
package com.sixthc.cim.get.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * aliasName: A free text alternate name typically used in tabular reports where the column width is limited.
 * 
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameTypeAuthority" type="{http://iec.ch/TC57/2015/GetMaintenanceOrders#}NameTypeAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", namespace = "http://iec.ch/TC57/2015/GetMaintenanceOrders#", propOrder = {
    "description",
    "name",
    "nameTypeAuthority"
})
public class NameType {

    protected String description;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "NameTypeAuthority")
    protected NameTypeAuthority nameTypeAuthority;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameTypeAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeAuthority }
     *     
     */
    public NameTypeAuthority getNameTypeAuthority() {
        return nameTypeAuthority;
    }

    /**
     * Sets the value of the nameTypeAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeAuthority }
     *     
     */
    public void setNameTypeAuthority(NameTypeAuthority value) {
        this.nameTypeAuthority = value;
    }

}
