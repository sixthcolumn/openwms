
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An identified period of time for which demand [reductions] adjustments are requested or required.
 * 
 * "Demand Response Events shall be described using the terminology illustrated in Figure 1 (in the NAESB document).  The terminology used to describe the time periods and transitions in Figure 1 and the durations and applicability are optional unless otherwise specified by the System Operator."
 * 
 * <p>Java class for DemandResponseEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandResponseEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Program" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Program" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Resource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandResponseEvent", propOrder = {
    "mrid",
    "eventID",
    "name",
    "program",
    "resources"
})
public class DemandResponseEvent {

    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlElement(required = true)
    protected String eventID;
    protected String name;
    @XmlElement(name = "Program")
    protected List<Program> program;
    @XmlElement(name = "Resources")
    protected Resource resources;

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
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
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
     * Gets the value of the program property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the program property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Program }
     * 
     * 
     */
    public List<Program> getProgram() {
        if (program == null) {
            program = new ArrayList<Program>();
        }
        return this.program;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResources(Resource value) {
        this.resources = value;
    }

}
