
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is similar to a CIM IrregularIntervalSchedule. This is an area of ongoing standardization efforts.
 * 
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endTime" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}AbsoluteDateTime"/>
 *         &lt;element name="Offers" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Offer" minOccurs="0"/>
 *         &lt;element name="Resource" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Resource" maxOccurs="unbounded"/>
 *         &lt;element name="startTime" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}AbsoluteDateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule", propOrder = {
    "endTime",
    "offers",
    "resource",
    "startTime",
    "status"
})
public class Schedule {

    @XmlElement(required = true)
    protected AbsoluteDateTime endTime;
    @XmlElement(name = "Offers")
    protected Offer offers;
    @XmlElement(name = "Resource", required = true)
    protected List<Resource> resource;
    @XmlElement(required = true)
    protected AbsoluteDateTime startTime;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteDateTime }
     *     
     */
    public AbsoluteDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteDateTime }
     *     
     */
    public void setEndTime(AbsoluteDateTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link Offer }
     *     
     */
    public Offer getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offer }
     *     
     */
    public void setOffers(Offer value) {
        this.offers = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getResource() {
        if (resource == null) {
            resource = new ArrayList<Resource>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteDateTime }
     *     
     */
    public AbsoluteDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteDateTime }
     *     
     */
    public void setStartTime(AbsoluteDateTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
