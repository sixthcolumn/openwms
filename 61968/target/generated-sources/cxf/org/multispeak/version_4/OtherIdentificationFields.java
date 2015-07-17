
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherIdentificationFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherIdentificationFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="budgetCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grpCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherIdentificationFields", propOrder = {
    "deptCode",
    "actCode",
    "acNo",
    "budgetCode",
    "warehouseID",
    "grpCode"
})
public class OtherIdentificationFields {

    protected Long deptCode;
    protected String actCode;
    protected Long acNo;
    protected Long budgetCode;
    protected String warehouseID;
    protected Long grpCode;

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

}
