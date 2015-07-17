
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * If it is desirable to send metadata about how this GPSLocation was collected, that data is documented in this element.
 * 
 * <p>Java class for GPSMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="easting" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="northing" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isRealTimeDiffCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="diffID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collected" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numSat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSMetadata", propOrder = {
    "easting",
    "northing",
    "source",
    "number",
    "isRealTimeDiffCorrection",
    "hdop",
    "vdop",
    "diffID",
    "collected",
    "numSat"
})
public class GPSMetadata
    extends MspExtensible
{

    protected Double easting;
    protected Double northing;
    protected String source;
    protected Long number;
    protected Boolean isRealTimeDiffCorrection;
    protected Float hdop;
    protected Float vdop;
    protected String diffID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collected;
    protected Long numSat;

    /**
     * Gets the value of the easting property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEasting() {
        return easting;
    }

    /**
     * Sets the value of the easting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEasting(Double value) {
        this.easting = value;
    }

    /**
     * Gets the value of the northing property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNorthing() {
        return northing;
    }

    /**
     * Sets the value of the northing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNorthing(Double value) {
        this.northing = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumber(Long value) {
        this.number = value;
    }

    /**
     * Gets the value of the isRealTimeDiffCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRealTimeDiffCorrection() {
        return isRealTimeDiffCorrection;
    }

    /**
     * Sets the value of the isRealTimeDiffCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRealTimeDiffCorrection(Boolean value) {
        this.isRealTimeDiffCorrection = value;
    }

    /**
     * Gets the value of the hdop property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHdop() {
        return hdop;
    }

    /**
     * Sets the value of the hdop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHdop(Float value) {
        this.hdop = value;
    }

    /**
     * Gets the value of the vdop property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVdop() {
        return vdop;
    }

    /**
     * Sets the value of the vdop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVdop(Float value) {
        this.vdop = value;
    }

    /**
     * Gets the value of the diffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffID() {
        return diffID;
    }

    /**
     * Sets the value of the diffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffID(String value) {
        this.diffID = value;
    }

    /**
     * Gets the value of the collected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollected() {
        return collected;
    }

    /**
     * Sets the value of the collected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollected(XMLGregorianCalendar value) {
        this.collected = value;
    }

    /**
     * Gets the value of the numSat property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSat() {
        return numSat;
    }

    /**
     * Sets the value of the numSat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSat(Long value) {
        this.numSat = value;
    }

}
