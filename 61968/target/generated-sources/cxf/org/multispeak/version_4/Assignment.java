
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="resources" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfResource" minOccurs="0"/>
 *         &lt;element name="taskIdentifier" type="{http://www.multispeak.org/Version_4.1_Release}multiPartIdentifier" minOccurs="0"/>
 *         &lt;element name="workSchedule" type="{http://www.multispeak.org/Version_4.1_Release}workSchedule" minOccurs="0"/>
 *         &lt;element name="constraints" type="{http://www.multispeak.org/Version_4.1_Release}constraints" minOccurs="0"/>
 *         &lt;element name="actionBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeToLive" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
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
@XmlType(name = "assignment", propOrder = {
    "resources",
    "taskIdentifier",
    "workSchedule",
    "constraints",
    "actionBy",
    "timeToLive"
})
public class Assignment
    extends MspObject
{

    protected ArrayOfResource resources;
    protected MultiPartIdentifier taskIdentifier;
    protected WorkSchedule workSchedule;
    protected Constraints constraints;
    protected String actionBy;
    protected Duration timeToLive;

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResource }
     *     
     */
    public ArrayOfResource getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResource }
     *     
     */
    public void setResources(ArrayOfResource value) {
        this.resources = value;
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
     * Gets the value of the workSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link WorkSchedule }
     *     
     */
    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    /**
     * Sets the value of the workSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSchedule }
     *     
     */
    public void setWorkSchedule(WorkSchedule value) {
        this.workSchedule = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link Constraints }
     *     
     */
    public Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Constraints }
     *     
     */
    public void setConstraints(Constraints value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the actionBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionBy() {
        return actionBy;
    }

    /**
     * Sets the value of the actionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionBy(String value) {
        this.actionBy = value;
    }

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToLive(Duration value) {
        this.timeToLive = value;
    }

}
