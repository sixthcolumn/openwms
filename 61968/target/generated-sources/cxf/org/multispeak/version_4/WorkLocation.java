
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.multispeak.org/Version_4.1_Release}address" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.multispeak.org/Version_4.1_Release}geometry" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{http://www.multispeak.org/Version_4.1_Release}serviceID" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationReferences" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObjectRef1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workLocation", propOrder = {
    "address",
    "geometry",
    "serviceLocationID",
    "serviceID",
    "gridLocation",
    "locationComment",
    "locationReferences"
})
public class WorkLocation {

    protected Address address;
    protected Geometry geometry;
    protected String serviceLocationID;
    protected ServiceID serviceID;
    protected String gridLocation;
    protected String locationComment;
    protected ArrayOfObjectRef1 locationReferences;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceID }
     *     
     */
    public ServiceID getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceID }
     *     
     */
    public void setServiceID(ServiceID value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
    }

    /**
     * Gets the value of the locationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationComment() {
        return locationComment;
    }

    /**
     * Sets the value of the locationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationComment(String value) {
        this.locationComment = value;
    }

    /**
     * Gets the value of the locationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef1 }
     *     
     */
    public ArrayOfObjectRef1 getLocationReferences() {
        return locationReferences;
    }

    /**
     * Sets the value of the locationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef1 }
     *     
     */
    public void setLocationReferences(ArrayOfObjectRef1 value) {
        this.locationReferences = value;
    }

}
