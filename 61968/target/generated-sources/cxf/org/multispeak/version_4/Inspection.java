
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for inspection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inspection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="elementInspected" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="inspectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="inspectedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.multispeak.org/Version_4.1_Release}geometry" minOccurs="0"/>
 *         &lt;element name="gpsPoint" type="{http://www.multispeak.org/Version_4.1_Release}gpsPoint" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/Version_4.1_Release}GPSLocation" minOccurs="0"/>
 *         &lt;element name="elementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementCondition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serviceOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObservation" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAttachment" minOccurs="0"/>
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
@XmlType(name = "inspection", propOrder = {
    "elementInspected",
    "inspectionDate",
    "inspectedBy",
    "geometry",
    "gpsPoint",
    "gpsLocation",
    "elementStatus",
    "elementCondition",
    "serviceOrderID",
    "observationList",
    "attachments"
})
public class Inspection
    extends MspObject
{

    protected ObjectRef elementInspected;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspectionDate;
    protected String inspectedBy;
    protected Geometry geometry;
    protected GpsPoint gpsPoint;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected String elementStatus;
    protected BigInteger elementCondition;
    protected String serviceOrderID;
    protected ArrayOfObservation observationList;
    protected ArrayOfAttachment attachments;

    /**
     * Gets the value of the elementInspected property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getElementInspected() {
        return elementInspected;
    }

    /**
     * Sets the value of the elementInspected property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setElementInspected(ObjectRef value) {
        this.elementInspected = value;
    }

    /**
     * Gets the value of the inspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets the value of the inspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspectionDate(XMLGregorianCalendar value) {
        this.inspectionDate = value;
    }

    /**
     * Gets the value of the inspectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectedBy() {
        return inspectedBy;
    }

    /**
     * Sets the value of the inspectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectedBy(String value) {
        this.inspectedBy = value;
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
     * Gets the value of the gpsPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GpsPoint }
     *     
     */
    public GpsPoint getGpsPoint() {
        return gpsPoint;
    }

    /**
     * Sets the value of the gpsPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsPoint }
     *     
     */
    public void setGpsPoint(GpsPoint value) {
        this.gpsPoint = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GPSLocation }
     *     
     */
    public GPSLocation getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSLocation }
     *     
     */
    public void setGPSLocation(GPSLocation value) {
        this.gpsLocation = value;
    }

    /**
     * Gets the value of the elementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementStatus() {
        return elementStatus;
    }

    /**
     * Sets the value of the elementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementStatus(String value) {
        this.elementStatus = value;
    }

    /**
     * Gets the value of the elementCondition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElementCondition() {
        return elementCondition;
    }

    /**
     * Sets the value of the elementCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElementCondition(BigInteger value) {
        this.elementCondition = value;
    }

    /**
     * Gets the value of the serviceOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderID() {
        return serviceOrderID;
    }

    /**
     * Sets the value of the serviceOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderID(String value) {
        this.serviceOrderID = value;
    }

    /**
     * Gets the value of the observationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObservation }
     *     
     */
    public ArrayOfObservation getObservationList() {
        return observationList;
    }

    /**
     * Sets the value of the observationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObservation }
     *     
     */
    public void setObservationList(ArrayOfObservation value) {
        this.observationList = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

}
