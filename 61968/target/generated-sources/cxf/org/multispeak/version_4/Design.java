
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for design complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="design">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="designIdentifier" type="{http://www.multispeak.org/Version_4.1_Release}designIdentifier" minOccurs="0"/>
 *         &lt;element name="designRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfStation" minOccurs="0"/>
 *         &lt;element name="backgroundGraphics" type="{http://www.multispeak.org/Version_4.1_Release}backgroundGraphics" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAttachment" minOccurs="0"/>
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
@XmlType(name = "design", propOrder = {
    "designIdentifier",
    "designRole",
    "workflowStatus",
    "stationList",
    "backgroundGraphics",
    "attachments"
})
public class Design
    extends MspObject
{

    protected DesignIdentifier designIdentifier;
    protected String designRole;
    protected String workflowStatus;
    protected ArrayOfStation stationList;
    protected BackgroundGraphics backgroundGraphics;
    protected ArrayOfAttachment attachments;

    /**
     * Gets the value of the designIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link DesignIdentifier }
     *     
     */
    public DesignIdentifier getDesignIdentifier() {
        return designIdentifier;
    }

    /**
     * Sets the value of the designIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignIdentifier }
     *     
     */
    public void setDesignIdentifier(DesignIdentifier value) {
        this.designIdentifier = value;
    }

    /**
     * Gets the value of the designRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRole() {
        return designRole;
    }

    /**
     * Sets the value of the designRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRole(String value) {
        this.designRole = value;
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
    }

    /**
     * Gets the value of the stationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStation }
     *     
     */
    public ArrayOfStation getStationList() {
        return stationList;
    }

    /**
     * Sets the value of the stationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStation }
     *     
     */
    public void setStationList(ArrayOfStation value) {
        this.stationList = value;
    }

    /**
     * Gets the value of the backgroundGraphics property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundGraphics }
     *     
     */
    public BackgroundGraphics getBackgroundGraphics() {
        return backgroundGraphics;
    }

    /**
     * Sets the value of the backgroundGraphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundGraphics }
     *     
     */
    public void setBackgroundGraphics(BackgroundGraphics value) {
        this.backgroundGraphics = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

}
