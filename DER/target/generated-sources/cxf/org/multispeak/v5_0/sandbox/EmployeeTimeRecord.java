
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspObject;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for employeeTimeRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employeeTimeRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="employeeID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursWorked" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "employeeTimeRecord", propOrder = {
    "employeeID",
    "employeeName",
    "hoursWorked"
})
public class EmployeeTimeRecord
    extends MspObject
{

    protected ObjectID employeeID;
    protected String employeeName;
    protected Float hoursWorked;

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setEmployeeID(ObjectID value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the hoursWorked property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets the value of the hoursWorked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHoursWorked(Float value) {
        this.hoursWorked = value;
    }

}
