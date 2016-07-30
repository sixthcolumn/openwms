
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspObject;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * <p>Java class for timesheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timesheet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="timePeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="jobWorkedList" type="{http://www.multispeak.org/V5.0/sandbox}jobWorkedList" minOccurs="0"/>
 *         &lt;element name="employeeTimeRecordList" type="{http://www.multispeak.org/V5.0/sandbox}employeeTimeRecordList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timesheet", propOrder = {
    "timePeriod",
    "jobWorkedList",
    "employeeTimeRecordList"
})
public class Timesheet
    extends MspObject
{

    protected TimePeriod timePeriod;
    protected JobWorkedList jobWorkedList;
    protected EmployeeTimeRecordList employeeTimeRecordList;

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setTimePeriod(TimePeriod value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the jobWorkedList property.
     * 
     * @return
     *     possible object is
     *     {@link JobWorkedList }
     *     
     */
    public JobWorkedList getJobWorkedList() {
        return jobWorkedList;
    }

    /**
     * Sets the value of the jobWorkedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobWorkedList }
     *     
     */
    public void setJobWorkedList(JobWorkedList value) {
        this.jobWorkedList = value;
    }

    /**
     * Gets the value of the employeeTimeRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTimeRecordList }
     *     
     */
    public EmployeeTimeRecordList getEmployeeTimeRecordList() {
        return employeeTimeRecordList;
    }

    /**
     * Sets the value of the employeeTimeRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTimeRecordList }
     *     
     */
    public void setEmployeeTimeRecordList(EmployeeTimeRecordList value) {
        this.employeeTimeRecordList = value;
    }

}
