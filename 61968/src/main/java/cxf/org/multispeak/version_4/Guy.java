
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.multispeak.org/Version_4.1_Release}featureStatus" minOccurs="0"/>
 *         &lt;element name="anchorList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAnchor" minOccurs="0"/>
 *         &lt;element name="guyType" type="{http://www.multispeak.org/Version_4.1_Release}guyType" minOccurs="0"/>
 *         &lt;element name="guyAgainst" type="{http://www.multispeak.org/Version_4.1_Release}guyAgainst" minOccurs="0"/>
 *         &lt;element name="attachmentHeight" type="{http://www.multispeak.org/Version_4.1_Release}height" minOccurs="0"/>
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
@XmlType(name = "guy", propOrder = {
    "status",
    "anchorList",
    "guyType",
    "guyAgainst",
    "attachmentHeight"
})
public class Guy
    extends MspPointObject
{

    protected FeatureStatus status;
    protected ArrayOfAnchor anchorList;
    protected GuyType guyType;
    protected GuyAgainst guyAgainst;
    protected Height attachmentHeight;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatus }
     *     
     */
    public FeatureStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatus }
     *     
     */
    public void setStatus(FeatureStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the anchorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnchor }
     *     
     */
    public ArrayOfAnchor getAnchorList() {
        return anchorList;
    }

    /**
     * Sets the value of the anchorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnchor }
     *     
     */
    public void setAnchorList(ArrayOfAnchor value) {
        this.anchorList = value;
    }

    /**
     * Gets the value of the guyType property.
     * 
     * @return
     *     possible object is
     *     {@link GuyType }
     *     
     */
    public GuyType getGuyType() {
        return guyType;
    }

    /**
     * Sets the value of the guyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyType }
     *     
     */
    public void setGuyType(GuyType value) {
        this.guyType = value;
    }

    /**
     * Gets the value of the guyAgainst property.
     * 
     * @return
     *     possible object is
     *     {@link GuyAgainst }
     *     
     */
    public GuyAgainst getGuyAgainst() {
        return guyAgainst;
    }

    /**
     * Sets the value of the guyAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyAgainst }
     *     
     */
    public void setGuyAgainst(GuyAgainst value) {
        this.guyAgainst = value;
    }

    /**
     * Gets the value of the attachmentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getAttachmentHeight() {
        return attachmentHeight;
    }

    /**
     * Sets the value of the attachmentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setAttachmentHeight(Height value) {
        this.attachmentHeight = value;
    }

}
