
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CDStatesChangedNotificationResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfErrorObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cdStatesChangedNotificationResult"
})
@XmlRootElement(name = "CDStatesChangedNotificationResponse")
public class CDStatesChangedNotificationResponse {

    @XmlElement(name = "CDStatesChangedNotificationResult")
    protected ArrayOfErrorObject cdStatesChangedNotificationResult;

    /**
     * Gets the value of the cdStatesChangedNotificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorObject }
     *     
     */
    public ArrayOfErrorObject getCDStatesChangedNotificationResult() {
        return cdStatesChangedNotificationResult;
    }

    /**
     * Sets the value of the cdStatesChangedNotificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorObject }
     *     
     */
    public void setCDStatesChangedNotificationResult(ArrayOfErrorObject value) {
        this.cdStatesChangedNotificationResult = value;
    }

}
