
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskIdentifier" type="{http://www.multispeak.org/Version_4.1_Release}multiPartIdentifier" minOccurs="0"/>
 *         &lt;element name="assignmentID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="assignmentStatus" type="{http://www.multispeak.org/Version_4.1_Release}assignmentStatus" minOccurs="0"/>
 *         &lt;element name="acceptedBy" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="workProgress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleModification" type="{http://www.multispeak.org/Version_4.1_Release}scheduleModification" minOccurs="0"/>
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
@XmlType(name = "workStatus", propOrder = {
    "timeStamp",
    "taskIdentifier",
    "assignmentID",
    "assignmentStatus",
    "acceptedBy",
    "workProgress",
    "remarks",
    "scheduleModification"
})
public class WorkStatus
    extends MspObject
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    protected MultiPartIdentifier taskIdentifier;
    protected ObjectRef assignmentID;
    protected AssignmentStatus assignmentStatus;
    protected ObjectRef acceptedBy;
    protected String workProgress;
    protected String remarks;
    protected ScheduleModification scheduleModification;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

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
     * Gets the value of the assignmentID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getAssignmentID() {
        return assignmentID;
    }

    /**
     * Sets the value of the assignmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setAssignmentID(ObjectRef value) {
        this.assignmentID = value;
    }

    /**
     * Gets the value of the assignmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentStatus }
     *     
     */
    public AssignmentStatus getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * Sets the value of the assignmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentStatus }
     *     
     */
    public void setAssignmentStatus(AssignmentStatus value) {
        this.assignmentStatus = value;
    }

    /**
     * Gets the value of the acceptedBy property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getAcceptedBy() {
        return acceptedBy;
    }

    /**
     * Sets the value of the acceptedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setAcceptedBy(ObjectRef value) {
        this.acceptedBy = value;
    }

    /**
     * Gets the value of the workProgress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkProgress() {
        return workProgress;
    }

    /**
     * Sets the value of the workProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkProgress(String value) {
        this.workProgress = value;
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
     * Gets the value of the scheduleModification property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleModification }
     *     
     */
    public ScheduleModification getScheduleModification() {
        return scheduleModification;
    }

    /**
     * Sets the value of the scheduleModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleModification }
     *     
     */
    public void setScheduleModification(ScheduleModification value) {
        this.scheduleModification = value;
    }

}
