
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request to buy.
 * 
 * The CIM Market Operations package uses bids to represent both bids and offers.
 * 
 * <p>Java class for OfferParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Constraint" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Constraint" minOccurs="0"/>
 *         &lt;element name="Resource" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Resource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferParameters", propOrder = {
    "constraint",
    "resource"
})
public class OfferParameters {

    @XmlElement(name = "Constraint")
    protected Constraint constraint;
    @XmlElement(name = "Resource")
    protected Resource resource;

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link Constraint }
     *     
     */
    public Constraint getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Constraint }
     *     
     */
    public void setConstraint(Constraint value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

}
