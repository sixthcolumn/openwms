
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPolygonObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="township" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiseList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString10" minOccurs="0"/>
 *         &lt;element name="premiseObjectList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPremise" minOccurs="0"/>
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
@XmlType(name = "parcel", propOrder = {
    "description",
    "owner",
    "section",
    "township",
    "range",
    "legalDescription",
    "premiseList",
    "premiseObjectList"
})
public class Parcel
    extends MspPolygonObject
{

    protected String description;
    protected String owner;
    protected String section;
    protected String township;
    protected String range;
    protected String legalDescription;
    protected ArrayOfString10 premiseList;
    protected ArrayOfPremise premiseObjectList;

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
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the township property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownship() {
        return township;
    }

    /**
     * Sets the value of the township property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownship(String value) {
        this.township = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the legalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalDescription() {
        return legalDescription;
    }

    /**
     * Sets the value of the legalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalDescription(String value) {
        this.legalDescription = value;
    }

    /**
     * Gets the value of the premiseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString10 }
     *     
     */
    public ArrayOfString10 getPremiseList() {
        return premiseList;
    }

    /**
     * Sets the value of the premiseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString10 }
     *     
     */
    public void setPremiseList(ArrayOfString10 value) {
        this.premiseList = value;
    }

    /**
     * Gets the value of the premiseObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPremise }
     *     
     */
    public ArrayOfPremise getPremiseObjectList() {
        return premiseObjectList;
    }

    /**
     * Sets the value of the premiseObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPremise }
     *     
     */
    public void setPremiseObjectList(ArrayOfPremise value) {
        this.premiseObjectList = value;
    }

}
