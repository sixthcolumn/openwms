
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crewActionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crewActionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedCrewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignedCrewID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewAction" type="{http://www.multispeak.org/Version_4.1_Release}crewAction" minOccurs="0"/>
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
@XmlType(name = "crewActionEvent", propOrder = {
    "outageEventID",
    "requestedCrewID",
    "assignedCrewID",
    "crewAction"
})
public class CrewActionEvent
    extends MspObject
{

    protected String outageEventID;
    protected String requestedCrewID;
    protected String assignedCrewID;
    protected CrewAction crewAction;

    /**
     * Gets the value of the outageEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageEventID() {
        return outageEventID;
    }

    /**
     * Sets the value of the outageEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageEventID(String value) {
        this.outageEventID = value;
    }

    /**
     * Gets the value of the requestedCrewID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCrewID() {
        return requestedCrewID;
    }

    /**
     * Sets the value of the requestedCrewID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCrewID(String value) {
        this.requestedCrewID = value;
    }

    /**
     * Gets the value of the assignedCrewID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedCrewID() {
        return assignedCrewID;
    }

    /**
     * Sets the value of the assignedCrewID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedCrewID(String value) {
        this.assignedCrewID = value;
    }

    /**
     * Gets the value of the crewAction property.
     * 
     * @return
     *     possible object is
     *     {@link CrewAction }
     *     
     */
    public CrewAction getCrewAction() {
        return crewAction;
    }

    /**
     * Sets the value of the crewAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewAction }
     *     
     */
    public void setCrewAction(CrewAction value) {
        this.crewAction = value;
    }

}
