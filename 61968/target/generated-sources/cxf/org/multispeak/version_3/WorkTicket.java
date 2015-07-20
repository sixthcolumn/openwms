
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workTicket">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franchiseDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="woType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cd740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cwpYr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cwpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetPur" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="budgetCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="wrhsCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="grpCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="crewCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "workTicket", propOrder = {
    "woNumber",
    "jobNumber",
    "description",
    "statusCode",
    "location",
    "county",
    "taxDist",
    "franchiseDist",
    "schoolDist",
    "district",
    "systemVolts",
    "woType",
    "cd740C",
    "ext740C",
    "loanNo",
    "cwpYr",
    "cwpCd",
    "budgetPur",
    "acNo",
    "budgetCode",
    "actCode",
    "deptCode",
    "wrhsCode",
    "grpCode",
    "crewCode",
    "startDate",
    "clsDate",
    "estDate",
    "contCode",
    "priority",
    "duration"
})
public class WorkTicket
    extends MspObject
{

    protected String woNumber;
    protected String jobNumber;
    protected String description;
    protected String statusCode;
    protected String location;
    protected String county;
    protected String taxDist;
    protected String franchiseDist;
    protected String schoolDist;
    protected String district;
    protected Float systemVolts;
    protected String woType;
    @XmlElement(name = "cd740c")
    protected String cd740C;
    @XmlElement(name = "ext740c")
    protected String ext740C;
    protected String loanNo;
    protected String cwpYr;
    protected String cwpCd;
    protected Long budgetPur;
    protected Long acNo;
    protected Long budgetCode;
    protected String actCode;
    protected Long deptCode;
    protected Long wrhsCode;
    protected Long grpCode;
    protected String crewCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clsDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estDate;
    protected String contCode;
    protected Long priority;
    protected Float duration;

    /**
     * Gets the value of the woNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoNumber() {
        return woNumber;
    }

    /**
     * Sets the value of the woNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoNumber(String value) {
        this.woNumber = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

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
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

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

    /**
     * Gets the value of the systemVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSystemVolts() {
        return systemVolts;
    }

    /**
     * Sets the value of the systemVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSystemVolts(Float value) {
        this.systemVolts = value;
    }

    /**
     * Gets the value of the woType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoType() {
        return woType;
    }

    /**
     * Sets the value of the woType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoType(String value) {
        this.woType = value;
    }

    /**
     * Gets the value of the cd740C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd740C() {
        return cd740C;
    }

    /**
     * Sets the value of the cd740C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd740C(String value) {
        this.cd740C = value;
    }

    /**
     * Gets the value of the ext740C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt740C() {
        return ext740C;
    }

    /**
     * Sets the value of the ext740C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt740C(String value) {
        this.ext740C = value;
    }

    /**
     * Gets the value of the loanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * Sets the value of the loanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNo(String value) {
        this.loanNo = value;
    }

    /**
     * Gets the value of the cwpYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwpYr() {
        return cwpYr;
    }

    /**
     * Sets the value of the cwpYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwpYr(String value) {
        this.cwpYr = value;
    }

    /**
     * Gets the value of the cwpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwpCd() {
        return cwpCd;
    }

    /**
     * Sets the value of the cwpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwpCd(String value) {
        this.cwpCd = value;
    }

    /**
     * Gets the value of the budgetPur property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetPur() {
        return budgetPur;
    }

    /**
     * Sets the value of the budgetPur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetPur(Long value) {
        this.budgetPur = value;
    }

    /**
     * Gets the value of the acNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcNo() {
        return acNo;
    }

    /**
     * Sets the value of the acNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcNo(Long value) {
        this.acNo = value;
    }

    /**
     * Gets the value of the budgetCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetCode() {
        return budgetCode;
    }

    /**
     * Sets the value of the budgetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetCode(Long value) {
        this.budgetCode = value;
    }

    /**
     * Gets the value of the actCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActCode() {
        return actCode;
    }

    /**
     * Sets the value of the actCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActCode(String value) {
        this.actCode = value;
    }

    /**
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeptCode(Long value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the wrhsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWrhsCode() {
        return wrhsCode;
    }

    /**
     * Sets the value of the wrhsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWrhsCode(Long value) {
        this.wrhsCode = value;
    }

    /**
     * Gets the value of the grpCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrpCode() {
        return grpCode;
    }

    /**
     * Sets the value of the grpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrpCode(Long value) {
        this.grpCode = value;
    }

    /**
     * Gets the value of the crewCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewCode() {
        return crewCode;
    }

    /**
     * Sets the value of the crewCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewCode(String value) {
        this.crewCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the clsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsDate() {
        return clsDate;
    }

    /**
     * Sets the value of the clsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsDate(XMLGregorianCalendar value) {
        this.clsDate = value;
    }

    /**
     * Gets the value of the estDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstDate() {
        return estDate;
    }

    /**
     * Sets the value of the estDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstDate(XMLGregorianCalendar value) {
        this.estDate = value;
    }

    /**
     * Gets the value of the contCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContCode() {
        return contCode;
    }

    /**
     * Sets the value of the contCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContCode(String value) {
        this.contCode = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuration(Float value) {
        this.duration = value;
    }

}
