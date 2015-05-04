
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Constraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Constraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraintInterval" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}ConstraintInterval"/>
 *         &lt;element name="constraintType" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}ConstraintType"/>
 *         &lt;element name="constraintValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferParameters" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}OfferParameters" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Constraint", propOrder = {
    "constraintInterval",
    "constraintType",
    "constraintValue",
    "offerParameters"
})
public class Constraint {

    @XmlElement(required = true)
    protected ConstraintInterval constraintInterval;
    @XmlElement(required = true)
    protected ConstraintType constraintType;
    @XmlElement(required = true)
    protected String constraintValue;
    @XmlElement(name = "OfferParameters")
    protected List<OfferParameters> offerParameters;

    /**
     * Gets the value of the constraintInterval property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintInterval }
     *     
     */
    public ConstraintInterval getConstraintInterval() {
        return constraintInterval;
    }

    /**
     * Sets the value of the constraintInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintInterval }
     *     
     */
    public void setConstraintInterval(ConstraintInterval value) {
        this.constraintInterval = value;
    }

    /**
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintType }
     *     
     */
    public ConstraintType getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintType }
     *     
     */
    public void setConstraintType(ConstraintType value) {
        this.constraintType = value;
    }

    /**
     * Gets the value of the constraintValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintValue() {
        return constraintValue;
    }

    /**
     * Sets the value of the constraintValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintValue(String value) {
        this.constraintValue = value;
    }

    /**
     * Gets the value of the offerParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferParameters }
     * 
     * 
     */
    public List<OfferParameters> getOfferParameters() {
        if (offerParameters == null) {
            offerParameters = new ArrayList<OfferParameters>();
        }
        return this.offerParameters;
    }

}
