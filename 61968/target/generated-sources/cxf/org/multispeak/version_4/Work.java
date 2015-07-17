
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for work complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="work">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="projectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTaskListItem" minOccurs="0"/>
 *         &lt;element name="locationFields" type="{http://www.multispeak.org/Version_4.1_Release}locationFields" minOccurs="0"/>
 *         &lt;element name="tasks" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWorkTask" minOccurs="0"/>
 *         &lt;element name="switchingScheduleList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSwitchingSchedule" minOccurs="0"/>
 *         &lt;element name="switchingStepList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSwitchingStep" minOccurs="0"/>
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
@XmlType(name = "work", propOrder = {
    "projectID",
    "description",
    "statusCode",
    "customerID",
    "accountNumber",
    "taskList",
    "locationFields",
    "tasks",
    "switchingScheduleList",
    "switchingStepList"
})
public class Work
    extends MspObject
{

    protected String projectID;
    protected String description;
    protected String statusCode;
    protected String customerID;
    protected String accountNumber;
    protected ArrayOfTaskListItem taskList;
    protected LocationFields locationFields;
    protected ArrayOfWorkTask tasks;
    protected ArrayOfSwitchingSchedule switchingScheduleList;
    protected ArrayOfSwitchingStep switchingStepList;

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
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
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
     * Gets the value of the taskList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaskListItem }
     *     
     */
    public ArrayOfTaskListItem getTaskList() {
        return taskList;
    }

    /**
     * Sets the value of the taskList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaskListItem }
     *     
     */
    public void setTaskList(ArrayOfTaskListItem value) {
        this.taskList = value;
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
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkTask }
     *     
     */
    public ArrayOfWorkTask getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkTask }
     *     
     */
    public void setTasks(ArrayOfWorkTask value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the switchingScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchingSchedule }
     *     
     */
    public ArrayOfSwitchingSchedule getSwitchingScheduleList() {
        return switchingScheduleList;
    }

    /**
     * Sets the value of the switchingScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchingSchedule }
     *     
     */
    public void setSwitchingScheduleList(ArrayOfSwitchingSchedule value) {
        this.switchingScheduleList = value;
    }

    /**
     * Gets the value of the switchingStepList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchingStep }
     *     
     */
    public ArrayOfSwitchingStep getSwitchingStepList() {
        return switchingStepList;
    }

    /**
     * Sets the value of the switchingStepList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchingStep }
     *     
     */
    public void setSwitchingStepList(ArrayOfSwitchingStep value) {
        this.switchingStepList = value;
    }

}
