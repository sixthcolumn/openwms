
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="projectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfDesign" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.multispeak.org/Version_4.1_Release}customer" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationFields" type="{http://www.multispeak.org/Version_4.1_Release}locationFields" minOccurs="0"/>
 *         &lt;element name="systemVolts" type="{http://www.multispeak.org/Version_4.1_Release}voltage" minOccurs="0"/>
 *         &lt;element name="contractor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractorPhone" type="{http://www.multispeak.org/Version_4.1_Release}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="electrician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricianPhone" type="{http://www.multispeak.org/Version_4.1_Release}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="woType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cd740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cwpYr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cwpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetPur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="engrAsnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfmsCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="budgetCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grpCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="crewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="estDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.multispeak.org/Version_4.1_Release}actionCode" minOccurs="0"/>
 *         &lt;element name="laborCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atc" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="loadDistrict" type="{http://www.multispeak.org/Version_4.1_Release}loadDistrict" minOccurs="0"/>
 *         &lt;element name="constGrade" type="{http://www.multispeak.org/Version_4.1_Release}constGrade" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
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
@XmlType(name = "workOrder", propOrder = {
    "projectID",
    "woNumber",
    "jobNumber",
    "jobDescr",
    "workflowStatus",
    "designs",
    "customer",
    "accountNumber",
    "locationFields",
    "systemVolts",
    "contractor",
    "contractorPhone",
    "electrician",
    "electricianPhone",
    "woType",
    "cd740C",
    "ext740C",
    "loanNo",
    "cwpYr",
    "cwpCd",
    "budgetPur",
    "engrAsnd",
    "cfmsCode",
    "acNo",
    "budgetCode",
    "actCode",
    "deptCode",
    "warehouseID",
    "grpCode",
    "crewID",
    "startDate",
    "clsDate",
    "estDate",
    "actionCode",
    "laborCategoryID",
    "atc",
    "loadDistrict",
    "constGrade",
    "duration",
    "attachments"
})
public class WorkOrder
    extends MspObject
{

    protected String projectID;
    protected String woNumber;
    protected String jobNumber;
    protected String jobDescr;
    protected String workflowStatus;
    protected ArrayOfDesign designs;
    protected Customer customer;
    protected String accountNumber;
    protected LocationFields locationFields;
    protected Voltage systemVolts;
    protected String contractor;
    protected TelephoneNumber contractorPhone;
    protected String electrician;
    protected TelephoneNumber electricianPhone;
    protected String woType;
    @XmlElement(name = "cd740c")
    protected String cd740C;
    @XmlElement(name = "ext740c")
    protected String ext740C;
    protected String loanNo;
    protected String cwpYr;
    protected String cwpCd;
    protected String budgetPur;
    protected String engrAsnd;
    protected Long cfmsCode;
    protected Long acNo;
    protected Long budgetCode;
    protected String actCode;
    protected Long deptCode;
    protected String warehouseID;
    protected Long grpCode;
    protected String crewID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estDate;
    protected ActionCode actionCode;
    protected String laborCategoryID;
    protected Money atc;
    protected LoadDistrict loadDistrict;
    protected ConstGrade constGrade;
    protected Duration duration;
    protected ArrayOfAttachment attachments;

    /**
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectID(String value) {
        this.projectID = value;
    }

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
     * Gets the value of the jobDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescr() {
        return jobDescr;
    }

    /**
     * Sets the value of the jobDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescr(String value) {
        this.jobDescr = value;
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
    }

    /**
     * Gets the value of the designs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDesign }
     *     
     */
    public ArrayOfDesign getDesigns() {
        return designs;
    }

    /**
     * Sets the value of the designs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDesign }
     *     
     */
    public void setDesigns(ArrayOfDesign value) {
        this.designs = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the locationFields property.
     * 
     * @return
     *     possible object is
     *     {@link LocationFields }
     *     
     */
    public LocationFields getLocationFields() {
        return locationFields;
    }

    /**
     * Sets the value of the locationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationFields }
     *     
     */
    public void setLocationFields(LocationFields value) {
        this.locationFields = value;
    }

    /**
     * Gets the value of the systemVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getSystemVolts() {
        return systemVolts;
    }

    /**
     * Sets the value of the systemVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setSystemVolts(Voltage value) {
        this.systemVolts = value;
    }

    /**
     * Gets the value of the contractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractor(String value) {
        this.contractor = value;
    }

    /**
     * Gets the value of the contractorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getContractorPhone() {
        return contractorPhone;
    }

    /**
     * Sets the value of the contractorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setContractorPhone(TelephoneNumber value) {
        this.contractorPhone = value;
    }

    /**
     * Gets the value of the electrician property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrician() {
        return electrician;
    }

    /**
     * Sets the value of the electrician property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrician(String value) {
        this.electrician = value;
    }

    /**
     * Gets the value of the electricianPhone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getElectricianPhone() {
        return electricianPhone;
    }

    /**
     * Sets the value of the electricianPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setElectricianPhone(TelephoneNumber value) {
        this.electricianPhone = value;
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
     *     {@link String }
     *     
     */
    public String getBudgetPur() {
        return budgetPur;
    }

    /**
     * Sets the value of the budgetPur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetPur(String value) {
        this.budgetPur = value;
    }

    /**
     * Gets the value of the engrAsnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngrAsnd() {
        return engrAsnd;
    }

    /**
     * Sets the value of the engrAsnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngrAsnd(String value) {
        this.engrAsnd = value;
    }

    /**
     * Gets the value of the cfmsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCfmsCode() {
        return cfmsCode;
    }

    /**
     * Sets the value of the cfmsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCfmsCode(Long value) {
        this.cfmsCode = value;
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
     * Gets the value of the warehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseID(String value) {
        this.warehouseID = value;
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
     * Gets the value of the crewID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewID() {
        return crewID;
    }

    /**
     * Sets the value of the crewID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewID(String value) {
        this.crewID = value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the laborCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborCategoryID() {
        return laborCategoryID;
    }

    /**
     * Sets the value of the laborCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborCategoryID(String value) {
        this.laborCategoryID = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAtc(Money value) {
        this.atc = value;
    }

    /**
     * Gets the value of the loadDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDistrict }
     *     
     */
    public LoadDistrict getLoadDistrict() {
        return loadDistrict;
    }

    /**
     * Sets the value of the loadDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDistrict }
     *     
     */
    public void setLoadDistrict(LoadDistrict value) {
        this.loadDistrict = value;
    }

    /**
     * Gets the value of the constGrade property.
     * 
     * @return
     *     possible object is
     *     {@link ConstGrade }
     *     
     */
    public ConstGrade getConstGrade() {
        return constGrade;
    }

    /**
     * Sets the value of the constGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstGrade }
     *     
     */
    public void setConstGrade(ConstGrade value) {
        this.constGrade = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
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
