
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiseServiceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPremiseService" minOccurs="0"/>
 *         &lt;element name="serviceLocations" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceLocation" minOccurs="0"/>
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
@XmlType(name = "premise", propOrder = {
    "description",
    "owner",
    "parcelID",
    "premiseServiceList",
    "serviceLocations"
})
public class Premise
    extends MspPointObject
{

    protected String description;
    protected String owner;
    protected String parcelID;
    protected ArrayOfPremiseService premiseServiceList;
    protected ArrayOfServiceLocation serviceLocations;

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the parcelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelID() {
        return parcelID;
    }

    /**
     * Sets the value of the parcelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelID(String value) {
        this.parcelID = value;
    }

    /**
     * Gets the value of the premiseServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPremiseService }
     *     
     */
    public ArrayOfPremiseService getPremiseServiceList() {
        return premiseServiceList;
    }

    /**
     * Sets the value of the premiseServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPremiseService }
     *     
     */
    public void setPremiseServiceList(ArrayOfPremiseService value) {
        this.premiseServiceList = value;
    }

    /**
     * Gets the value of the serviceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocation }
     *     
     */
    public ArrayOfServiceLocation getServiceLocations() {
        return serviceLocations;
    }

    /**
     * Sets the value of the serviceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocation }
     *     
     */
    public void setServiceLocations(ArrayOfServiceLocation value) {
        this.serviceLocations = value;
    }

}
