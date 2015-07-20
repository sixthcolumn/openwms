
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageEventStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/Version_4.1_Release}outageStatus" minOccurs="0"/>
 *         &lt;element name="crewDispatched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="crewOnSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ETOR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outageAttachments" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOutageAttachment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageEventStatus", propOrder = {
    "outageStatus",
    "crewDispatched",
    "crewOnSite",
    "etor",
    "customerFound",
    "outageAttachments"
})
public class OutageEventStatus
    extends MspObject
{

    protected OutageStatus outageStatus;
    protected Boolean crewDispatched;
    protected Boolean crewOnSite;
    @XmlElement(name = "ETOR")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etor;
    protected Boolean customerFound;
    protected ArrayOfOutageAttachment outageAttachments;

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageStatus }
     *     
     */
    public OutageStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageStatus }
     *     
     */
    public void setOutageStatus(OutageStatus value) {
        this.outageStatus = value;
    }

    /**
     * Gets the value of the crewDispatched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrewDispatched() {
        return crewDispatched;
    }

    /**
     * Sets the value of the crewDispatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrewDispatched(Boolean value) {
        this.crewDispatched = value;
    }

    /**
     * Gets the value of the crewOnSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrewOnSite() {
        return crewOnSite;
    }

    /**
     * Sets the value of the crewOnSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrewOnSite(Boolean value) {
        this.crewOnSite = value;
    }

    /**
     * Gets the value of the etor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETOR() {
        return etor;
    }

    /**
     * Sets the value of the etor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETOR(XMLGregorianCalendar value) {
        this.etor = value;
    }

    /**
     * Gets the value of the customerFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerFound() {
        return customerFound;
    }

    /**
     * Sets the value of the customerFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerFound(Boolean value) {
        this.customerFound = value;
    }

    /**
     * Gets the value of the outageAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageAttachment }
     *     
     */
    public ArrayOfOutageAttachment getOutageAttachments() {
        return outageAttachments;
    }

    /**
     * Sets the value of the outageAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageAttachment }
     *     
     */
    public void setOutageAttachments(ArrayOfOutageAttachment value) {
        this.outageAttachments = value;
    }

}
