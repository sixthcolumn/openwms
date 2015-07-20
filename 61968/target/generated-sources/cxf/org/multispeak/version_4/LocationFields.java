
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="township" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franchiseDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationFields", propOrder = {
    "county",
    "section",
    "township",
    "range",
    "townshipName",
    "subdivision",
    "block",
    "lot",
    "boardDist",
    "taxDist",
    "franchiseDist",
    "schoolDist",
    "district"
})
public class LocationFields {

    protected String county;
    protected String section;
    protected String township;
    protected String range;
    protected String townshipName;
    protected String subdivision;
    protected String block;
    protected String lot;
    protected String boardDist;
    protected String taxDist;
    protected String franchiseDist;
    protected String schoolDist;
    protected String district;

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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
     * Gets the value of the townshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownshipName() {
        return townshipName;
    }

    /**
     * Sets the value of the townshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownshipName(String value) {
        this.townshipName = value;
    }

    /**
     * Gets the value of the subdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * Sets the value of the subdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivision(String value) {
        this.subdivision = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLot(String value) {
        this.lot = value;
    }

    /**
     * Gets the value of the boardDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardDist() {
        return boardDist;
    }

    /**
     * Sets the value of the boardDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardDist(String value) {
        this.boardDist = value;
    }

    /**
     * Gets the value of the taxDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDist() {
        return taxDist;
    }

    /**
     * Sets the value of the taxDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDist(String value) {
        this.taxDist = value;
    }

    /**
     * Gets the value of the franchiseDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchiseDist() {
        return franchiseDist;
    }

    /**
     * Sets the value of the franchiseDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchiseDist(String value) {
        this.franchiseDist = value;
    }

    /**
     * Gets the value of the schoolDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDist() {
        return schoolDist;
    }

    /**
     * Sets the value of the schoolDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDist(String value) {
        this.schoolDist = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

}
