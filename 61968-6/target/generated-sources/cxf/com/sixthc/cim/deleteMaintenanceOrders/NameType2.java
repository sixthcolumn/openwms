
package com.sixthc.cim.deleteMaintenanceOrders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The localName is a human readable name of the
 * 				object.
 * 				It is a free text name local to a node in a naming hierarchy similar
 * 				to a file directory structure. A power
 * 				system related naming hierarchy may be: Substation, VoltageLevel,
 * 				Equipment etc. Children of the
 * 				same parent in such a hierarchy have names that typically are unique
 * 				among
 * 				them.
 * 			
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
 *         &lt;element name="NameTypeAuthority" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}NameTypeAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#", propOrder = {
    "description",
    "name",
    "nameTypeAuthority"
})
public class NameType2 {

    protected String description;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "NameTypeAuthority")
    protected NameTypeAuthority2 nameTypeAuthority;

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
     *     {@link NameTypeAuthority2 }
     *     
     */
    public NameTypeAuthority2 getNameTypeAuthority() {
        return nameTypeAuthority;
    }

    /**
     * Sets the value of the nameTypeAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeAuthority2 }
     *     
     */
    public void setNameTypeAuthority(NameTypeAuthority2 value) {
        this.nameTypeAuthority = value;
    }

}
