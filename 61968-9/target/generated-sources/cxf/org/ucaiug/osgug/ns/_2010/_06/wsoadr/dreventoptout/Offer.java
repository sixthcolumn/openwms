
package org.ucaiug.osgug.ns._2010._06.wsoadr.dreventoptout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer to sell.
 * 
 * This term may not be needed, as it is inclusive in the CIM definition of "Bid."
 * 
 * <p>Java class for Offer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commitStatus" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}CommitDispatchStatus"/>
 *         &lt;element name="dispatchStatus" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}CommitDispatchStatus"/>
 *         &lt;element name="Schedules" type="{http://osgug.ucaiug.org/ns/2010/06/wsoadr/DREventOptOut}Schedule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offer", propOrder = {
    "commitStatus",
    "dispatchStatus",
    "schedules"
})
public class Offer {

    @XmlElement(required = true)
    protected CommitDispatchStatus commitStatus;
    @XmlElement(required = true)
    protected CommitDispatchStatus dispatchStatus;
    @XmlElement(name = "Schedules", required = true)
    protected Schedule schedules;

    /**
     * Gets the value of the commitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CommitDispatchStatus }
     *     
     */
    public CommitDispatchStatus getCommitStatus() {
        return commitStatus;
    }

    /**
     * Sets the value of the commitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitDispatchStatus }
     *     
     */
    public void setCommitStatus(CommitDispatchStatus value) {
        this.commitStatus = value;
    }

    /**
     * Gets the value of the dispatchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CommitDispatchStatus }
     *     
     */
    public CommitDispatchStatus getDispatchStatus() {
        return dispatchStatus;
    }

    /**
     * Sets the value of the dispatchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitDispatchStatus }
     *     
     */
    public void setDispatchStatus(CommitDispatchStatus value) {
        this.dispatchStatus = value;
    }

    /**
     * Gets the value of the schedules property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedules() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedules(Schedule value) {
        this.schedules = value;
    }

}
