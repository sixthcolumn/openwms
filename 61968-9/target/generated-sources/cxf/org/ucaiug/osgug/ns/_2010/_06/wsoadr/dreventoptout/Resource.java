
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * There is a similar CIM class called RegisteredResource, however it is not fitting to wholesale and its needs.  For instance, the name RegisteredResource implies state and that a resource is registered.  This is not always the case in wholesale as a resource can be in several states.  The registered state equivalent in wholesale is enrolled.
 * 
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemandResponseEvent" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}DemandResponseEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDeviceAssets" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}EndDeviceAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferParameters" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}OfferParameters"/>
 *         &lt;element name="Resource" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Resource"/>
 *         &lt;element name="resourceType" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}ResourceType"/>
 *         &lt;element name="Schedule" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Schedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "mrid",
    "demandResponseEvent",
    "endDeviceAssets",
    "name",
    "offerParameters",
    "resource",
    "resourceType",
    "schedule"
})
public class Resource {

    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlElement(name = "DemandResponseEvent")
    protected List<DemandResponseEvent> demandResponseEvent;
    @XmlElement(name = "EndDeviceAssets")
    protected List<EndDeviceAsset> endDeviceAssets;
    protected String name;
    @XmlElement(name = "OfferParameters", required = true)
    protected OfferParameters offerParameters;
    @XmlElement(name = "Resource", required = true)
    protected Resource resource;
    @XmlElement(required = true)
    protected ResourceType resourceType;
    @XmlElement(name = "Schedule")
    protected Schedule schedule;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the demandResponseEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandResponseEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandResponseEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemandResponseEvent }
     * 
     * 
     */
    public List<DemandResponseEvent> getDemandResponseEvent() {
        if (demandResponseEvent == null) {
            demandResponseEvent = new ArrayList<DemandResponseEvent>();
        }
        return this.demandResponseEvent;
    }

    /**
     * Gets the value of the endDeviceAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceAsset }
     * 
     * 
     */
    public List<EndDeviceAsset> getEndDeviceAssets() {
        if (endDeviceAssets == null) {
            endDeviceAssets = new ArrayList<EndDeviceAsset>();
        }
        return this.endDeviceAssets;
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
     * Gets the value of the offerParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OfferParameters }
     *     
     */
    public OfferParameters getOfferParameters() {
        return offerParameters;
    }

    /**
     * Sets the value of the offerParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferParameters }
     *     
     */
    public void setOfferParameters(OfferParameters value) {
        this.offerParameters = value;
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

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setResourceType(ResourceType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

}
