
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="jobList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObjectRef4" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workList" type="{http://www.multispeak.org/Version_4.1_Release}workList" minOccurs="0"/>
 *         &lt;element name="serviceOrderList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder" minOccurs="0"/>
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
@XmlType(name = "project", propOrder = {
    "jobList",
    "remarks",
    "workList",
    "serviceOrderList",
    "workOrderList",
    "mantenanceOrderList"
})
public class Project
    extends MspObject
{

    protected ArrayOfObjectRef4 jobList;
    protected String remarks;
    protected WorkList workList;
    protected ArrayOfServiceOrder serviceOrderList;
    protected ArrayOfWorkOrder workOrderList;
    protected ArrayOfMaintenanceOrder mantenanceOrderList;

    /**
     * Gets the value of the jobList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef4 }
     *     
     */
    public ArrayOfObjectRef4 getJobList() {
        return jobList;
    }

    /**
     * Sets the value of the jobList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef4 }
     *     
     */
    public void setJobList(ArrayOfObjectRef4 value) {
        this.jobList = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
