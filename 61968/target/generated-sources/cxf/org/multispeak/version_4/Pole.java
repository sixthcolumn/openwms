
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="inspDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfgDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poleHeight" type="{http://www.multispeak.org/Version_4.1_Release}height" minOccurs="0"/>
 *         &lt;element name="poleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poleClass" type="{http://www.multispeak.org/Version_4.1_Release}poleClass" minOccurs="0"/>
 *         &lt;element name="poleType" type="{http://www.multispeak.org/Version_4.1_Release}poleType" minOccurs="0"/>
 *         &lt;element name="poleTreatment" type="{http://www.multispeak.org/Version_4.1_Release}treatment" minOccurs="0"/>
 *         &lt;element name="poleUse" type="{http://www.multispeak.org/Version_4.1_Release}poleUse" minOccurs="0"/>
 *         &lt;element name="jointUseList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfJointUse" minOccurs="0"/>
 *         &lt;element name="guyList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGuy" minOccurs="0"/>
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
@XmlType(name = "pole", propOrder = {
    "inspDate",
    "manufacturer",
    "mfgDate",
    "owner",
    "poleHeight",
    "poleNumber",
    "poleClass",
    "poleType",
    "poleTreatment",
    "poleUse",
    "jointUseList",
    "guyList"
})
public class Pole
    extends MspPointObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inspDate;
    protected String manufacturer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mfgDate;
    protected String owner;
    protected Height poleHeight;
    protected String poleNumber;
    protected PoleClass poleClass;
    protected PoleType poleType;
    protected Treatment poleTreatment;
    protected PoleUse poleUse;
    protected ArrayOfJointUse jointUseList;
    protected ArrayOfGuy guyList;

    /**
     * Gets the value of the inspDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInspDate() {
        return inspDate;
    }

    /**
     * Sets the value of the inspDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInspDate(XMLGregorianCalendar value) {
        this.inspDate = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMfgDate(XMLGregorianCalendar value) {
        this.mfgDate = value;
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
     * Gets the value of the poleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getPoleHeight() {
        return poleHeight;
    }

    /**
     * Sets the value of the poleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setPoleHeight(Height value) {
        this.poleHeight = value;
    }

    /**
     * Gets the value of the poleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoleNumber() {
        return poleNumber;
    }

    /**
     * Sets the value of the poleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoleNumber(String value) {
        this.poleNumber = value;
    }

    /**
     * Gets the value of the poleClass property.
     * 
     * @return
     *     possible object is
     *     {@link PoleClass }
     *     
     */
    public PoleClass getPoleClass() {
        return poleClass;
    }

    /**
     * Sets the value of the poleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleClass }
     *     
     */
    public void setPoleClass(PoleClass value) {
        this.poleClass = value;
    }

    /**
     * Gets the value of the poleType property.
     * 
     * @return
     *     possible object is
     *     {@link PoleType }
     *     
     */
    public PoleType getPoleType() {
        return poleType;
    }

    /**
     * Sets the value of the poleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleType }
     *     
     */
    public void setPoleType(PoleType value) {
        this.poleType = value;
    }

    /**
     * Gets the value of the poleTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link Treatment }
     *     
     */
    public Treatment getPoleTreatment() {
        return poleTreatment;
    }

    /**
     * Sets the value of the poleTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Treatment }
     *     
     */
    public void setPoleTreatment(Treatment value) {
        this.poleTreatment = value;
    }

    /**
     * Gets the value of the poleUse property.
     * 
     * @return
     *     possible object is
     *     {@link PoleUse }
     *     
     */
    public PoleUse getPoleUse() {
        return poleUse;
    }

    /**
     * Sets the value of the poleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleUse }
     *     
     */
    public void setPoleUse(PoleUse value) {
        this.poleUse = value;
    }

    /**
     * Gets the value of the jointUseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJointUse }
     *     
     */
    public ArrayOfJointUse getJointUseList() {
        return jointUseList;
    }

    /**
     * Sets the value of the jointUseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJointUse }
     *     
     */
    public void setJointUseList(ArrayOfJointUse value) {
        this.jointUseList = value;
    }

    /**
     * Gets the value of the guyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuy }
     *     
     */
    public ArrayOfGuy getGuyList() {
        return guyList;
    }

    /**
     * Sets the value of the guyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuy }
     *     
     */
    public void setGuyList(ArrayOfGuy value) {
        this.guyList = value;
    }

}
