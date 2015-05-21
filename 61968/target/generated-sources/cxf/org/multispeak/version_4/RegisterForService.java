
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="registrationDetails" type="{http://www.multispeak.org/Version_4.1_Release}registrationInfo" minOccurs="0"/>
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
    "registrationDetails"
})
@XmlRootElement(name = "RegisterForService")
public class RegisterForService {

    protected RegistrationInfo registrationDetails;

    /**
     * Gets the value of the registrationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationInfo }
     *     
     */
    public RegistrationInfo getRegistrationDetails() {
        return registrationDetails;
    }

    /**
     * Sets the value of the registrationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationInfo }
     *     
     */
    public void setRegistrationDetails(RegistrationInfo value) {
        this.registrationDetails = value;
    }

}
