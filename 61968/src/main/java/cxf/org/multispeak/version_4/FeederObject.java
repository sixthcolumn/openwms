
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feederObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feederObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="substationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feederColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObjectRef2" minOccurs="0"/>
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
@XmlType(name = "feederObject", propOrder = {
    "substationName",
    "feederName",
    "feederNo",
    "facilityID",
    "feederColor",
    "bus",
    "contentsList"
})
public class FeederObject
    extends MspObject
{

    protected String substationName;
    protected String feederName;
    protected String feederNo;
    protected String facilityID;
    protected String feederColor;
    protected String bus;
    protected ArrayOfObjectRef2 contentsList;

    /**
     * Gets the value of the substationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationName() {
        return substationName;
    }

    /**
     * Sets the value of the substationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationName(String value) {
        this.substationName = value;
    }

    /**
     * Gets the value of the feederName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederName() {
        return feederName;
    }

    /**
     * Sets the value of the feederName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederName(String value) {
        this.feederName = value;
    }

    /**
     * Gets the value of the feederNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederNo() {
        return feederNo;
    }

    /**
     * Sets the value of the feederNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederNo(String value) {
        this.feederNo = value;
    }

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Gets the value of the feederColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeederColor() {
        return feederColor;
    }

    /**
     * Sets the value of the feederColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeederColor(String value) {
        this.feederColor = value;
    }

    /**
     * Gets the value of the bus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBus(String value) {
        this.bus = value;
    }

    /**
     * Gets the value of the contentsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef2 }
     *     
     */
    public ArrayOfObjectRef2 getContentsList() {
        return contentsList;
    }

    /**
     * Sets the value of the contentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef2 }
     *     
     */
    public void setContentsList(ArrayOfObjectRef2 value) {
        this.contentsList = value;
    }

}
