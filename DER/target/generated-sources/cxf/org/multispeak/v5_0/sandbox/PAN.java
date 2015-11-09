
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspObject;
import org.multispeak.v5.PANDeviceRefs;
import org.multispeak.v5.PANInterfaceIDs;
import org.multispeak.v5.PANSecurityToken;


/**
 * This is a premises area network (PAN).
 * 			
 * 
 * <p>Java class for PAN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRefs" type="{http://www.multispeak.org/V5.0}PANDeviceRefs" minOccurs="0"/>
 *         &lt;element name="PANInterfaceIDs" type="{http://www.multispeak.org/V5.0}PANInterfaceIDs" minOccurs="0"/>
 *         &lt;element name="PANLinkages" type="{http://www.multispeak.org/V5.0/sandbox}PANLinkages" minOccurs="0"/>
 *         &lt;element name="PANSecurityToken" type="{http://www.multispeak.org/V5.0}PANSecurityToken" minOccurs="0"/>
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
@XmlType(name = "PAN", propOrder = {
    "panDeviceRefs",
    "panInterfaceIDs",
    "panLinkages",
    "panSecurityToken"
})
public class PAN
    extends MspObject
{

    @XmlElement(name = "PANDeviceRefs")
    protected PANDeviceRefs panDeviceRefs;
    @XmlElement(name = "PANInterfaceIDs")
    protected PANInterfaceIDs panInterfaceIDs;
    @XmlElement(name = "PANLinkages")
    protected PANLinkages panLinkages;
    @XmlElement(name = "PANSecurityToken")
    protected PANSecurityToken panSecurityToken;

    /**
     * Gets the value of the panDeviceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRefs }
     *     
     */
    public PANDeviceRefs getPANDeviceRefs() {
        return panDeviceRefs;
    }

    /**
     * Sets the value of the panDeviceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRefs }
     *     
     */
    public void setPANDeviceRefs(PANDeviceRefs value) {
        this.panDeviceRefs = value;
    }

    /**
     * Gets the value of the panInterfaceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PANInterfaceIDs }
     *     
     */
    public PANInterfaceIDs getPANInterfaceIDs() {
        return panInterfaceIDs;
    }

    /**
     * Sets the value of the panInterfaceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANInterfaceIDs }
     *     
     */
    public void setPANInterfaceIDs(PANInterfaceIDs value) {
        this.panInterfaceIDs = value;
    }

    /**
     * Gets the value of the panLinkages property.
     * 
     * @return
     *     possible object is
     *     {@link PANLinkages }
     *     
     */
    public PANLinkages getPANLinkages() {
        return panLinkages;
    }

    /**
     * Sets the value of the panLinkages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANLinkages }
     *     
     */
    public void setPANLinkages(PANLinkages value) {
        this.panLinkages = value;
    }

    /**
     * Gets the value of the panSecurityToken property.
     * 
     * @return
     *     possible object is
     *     {@link PANSecurityToken }
     *     
     */
    public PANSecurityToken getPANSecurityToken() {
        return panSecurityToken;
    }

    /**
     * Sets the value of the panSecurityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANSecurityToken }
     *     
     */
    public void setPANSecurityToken(PANSecurityToken value) {
        this.panSecurityToken = value;
    }

}
