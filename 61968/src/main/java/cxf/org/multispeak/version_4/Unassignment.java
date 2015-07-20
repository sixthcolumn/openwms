
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unassignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unassignment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="resources" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfResource" minOccurs="0"/>
 *         &lt;element name="assignmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskIdentifier" type="{http://www.multispeak.org/Version_4.1_Release}multiPartIdentifier" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "unassignment", propOrder = {
    "resources",
    "assignmentID",
    "taskIdentifier",
    "reason",
    "actionBy"
})
public class Unassignment
    extends MspObject
{

    protected ArrayOfResource resources;
    protected String assignmentID;
    protected MultiPartIdentifier taskIdentifier;
    protected String reason;
    protected String actionBy;

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
     * Gets the value of the assignmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentID() {
        return assignmentID;
    }

    /**
     * Sets the value of the assignmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentID(String value) {
        this.assignmentID = value;
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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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

}
