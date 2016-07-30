
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.Attachments;
import org.multispeak.v5.MspPointObject;
import org.multispeak.v5_0.commontypes.Address;


/**
 * <p>Java class for damageAssessmentLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="damageAssessmentLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.multispeak.org/V5.0/commonTypes}address" minOccurs="0"/>
 *         &lt;element name="locationOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="damageAssessments" type="{http://www.multispeak.org/V5.0/sandbox}damageAssessments" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/V5.0}attachments" minOccurs="0"/>
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
@XmlType(name = "damageAssessmentLocation", propOrder = {
    "address",
    "locationOffset",
    "damageAssessments",
    "attachments"
})
public class DamageAssessmentLocation
    extends MspPointObject
{

    protected Address address;
    protected String locationOffset;
    protected DamageAssessments damageAssessments;
    protected Attachments attachments;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the locationOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationOffset() {
        return locationOffset;
    }

    /**
     * Sets the value of the locationOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationOffset(String value) {
        this.locationOffset = value;
    }

    /**
     * Gets the value of the damageAssessments property.
     * 
     * @return
     *     possible object is
     *     {@link DamageAssessments }
     *     
     */
    public DamageAssessments getDamageAssessments() {
        return damageAssessments;
    }

    /**
     * Sets the value of the damageAssessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageAssessments }
     *     
     */
    public void setDamageAssessments(DamageAssessments value) {
        this.damageAssessments = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

}
