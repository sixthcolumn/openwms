
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
 *         &lt;element name="ModifyCBDataForStreetLightResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfErrorObject" minOccurs="0"/>
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
    "modifyCBDataForStreetLightResult"
})
@XmlRootElement(name = "ModifyCBDataForStreetLightResponse")
public class ModifyCBDataForStreetLightResponse {

    @XmlElement(name = "ModifyCBDataForStreetLightResult")
    protected ArrayOfErrorObject modifyCBDataForStreetLightResult;

    /**
     * Gets the value of the modifyCBDataForStreetLightResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorObject }
     *     
     */
    public ArrayOfErrorObject getModifyCBDataForStreetLightResult() {
        return modifyCBDataForStreetLightResult;
    }

    /**
     * Sets the value of the modifyCBDataForStreetLightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorObject }
     *     
     */
    public void setModifyCBDataForStreetLightResult(ArrayOfErrorObject value) {
        this.modifyCBDataForStreetLightResult = value;
    }

}
