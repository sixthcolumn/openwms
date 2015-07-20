
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPerson">
 *       &lt;sequence>
 *         &lt;element name="dBAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialNeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accounts" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAccount" minOccurs="0"/>
 *         &lt;element name="serviceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder" minOccurs="0"/>
 *         &lt;element name="workList" type="{http://www.multispeak.org/Version_4.1_Release}workList" minOccurs="0"/>
 *         &lt;element name="workOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWorkOrder" minOccurs="0"/>
 *         &lt;element name="mantenanceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMaintenanceOrder" minOccurs="0"/>
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
@XmlType(name = "customer", propOrder = {
    "dbaName",
    "specialNeeds",
    "accounts",
    "serviceOrderList",
    "workList",
    "workOrderList",
    "mantenanceOrderList"
})
public class Customer
    extends MspPerson
{

    @XmlElement(name = "dBAName")
    protected String dbaName;
    protected String specialNeeds;
    protected ArrayOfAccount accounts;
    protected ArrayOfServiceOrder serviceOrderList;
    protected WorkList workList;
    protected ArrayOfWorkOrder workOrderList;
    protected ArrayOfMaintenanceOrder mantenanceOrderList;

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBAName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBAName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the specialNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * Sets the value of the specialNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNeeds(String value) {
        this.specialNeeds = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccount }
     *     
     */
    public ArrayOfAccount getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccount }
     *     
     */
    public void setAccounts(ArrayOfAccount value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the serviceOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOrder }
     *     
     */
    public ArrayOfServiceOrder getServiceOrderList() {
        return serviceOrderList;
    }

    /**
     * Sets the value of the serviceOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOrder }
     *     
     */
    public void setServiceOrderList(ArrayOfServiceOrder value) {
        this.serviceOrderList = value;
    }

    /**
     * Gets the value of the workList property.
     * 
     * @return
     *     possible object is
     *     {@link WorkList }
     *     
     */
    public WorkList getWorkList() {
        return workList;
    }

    /**
     * Sets the value of the workList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkList }
     *     
     */
    public void setWorkList(WorkList value) {
        this.workList = value;
    }

    /**
     * Gets the value of the workOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkOrder }
     *     
     */
    public ArrayOfWorkOrder getWorkOrderList() {
        return workOrderList;
    }

    /**
     * Sets the value of the workOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkOrder }
     *     
     */
    public void setWorkOrderList(ArrayOfWorkOrder value) {
        this.workOrderList = value;
    }

    /**
     * Gets the value of the mantenanceOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaintenanceOrder }
     *     
     */
    public ArrayOfMaintenanceOrder getMantenanceOrderList() {
        return mantenanceOrderList;
    }

    /**
     * Sets the value of the mantenanceOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaintenanceOrder }
     *     
     */
    public void setMantenanceOrderList(ArrayOfMaintenanceOrder value) {
        this.mantenanceOrderList = value;
    }

}
