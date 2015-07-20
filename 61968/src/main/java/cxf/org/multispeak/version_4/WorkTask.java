
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="taskIdentifier" type="{http://www.multispeak.org/Version_4.1_Release}multiPartIdentifier" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleRequests" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfScheduleRequest" minOccurs="0"/>
 *         &lt;element name="workLocation" type="{http://www.multispeak.org/Version_4.1_Release}workLocation" minOccurs="0"/>
 *         &lt;element name="taskAggregation" type="{http://www.multispeak.org/Version_4.1_Release}taskAggregation" minOccurs="0"/>
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
@XmlType(name = "workTask", propOrder = {
    "taskIdentifier",
    "createdDate",
    "action",
    "priority",
    "description",
    "scheduleRequests",
    "workLocation",
    "taskAggregation"
})
public class WorkTask
    extends MspObject
{

    protected MultiPartIdentifier taskIdentifier;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String action;
    protected String priority;
    protected String description;
    protected ArrayOfScheduleRequest scheduleRequests;
    protected WorkLocation workLocation;
    protected TaskAggregation taskAggregation;

    /**
     * Gets the value of the taskIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPartIdentifier }
     *     
     */
    public MultiPartIdentifier getTaskIdentifier() {
        return taskIdentifier;
    }

    /**
     * Sets the value of the taskIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPartIdentifier }
     *     
     */
    public void setTaskIdentifier(MultiPartIdentifier value) {
        this.taskIdentifier = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
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
     * Gets the value of the scheduleRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScheduleRequest }
     *     
     */
    public ArrayOfScheduleRequest getScheduleRequests() {
        return scheduleRequests;
    }

    /**
     * Sets the value of the scheduleRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScheduleRequest }
     *     
     */
    public void setScheduleRequests(ArrayOfScheduleRequest value) {
        this.scheduleRequests = value;
    }

    /**
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocation }
     *     
     */
    public WorkLocation getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocation }
     *     
     */
    public void setWorkLocation(WorkLocation value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the taskAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link TaskAggregation }
     *     
     */
    public TaskAggregation getTaskAggregation() {
        return taskAggregation;
    }

    /**
     * Sets the value of the taskAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskAggregation }
     *     
     */
    public void setTaskAggregation(TaskAggregation value) {
        this.taskAggregation = value;
    }

}
