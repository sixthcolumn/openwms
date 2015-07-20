
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
 *         &lt;element name="streetLightData" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfStreetLight" minOccurs="0"/>
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
    "streetLightData"
})
@XmlRootElement(name = "ModifyCBDataForStreetLight")
public class ModifyCBDataForStreetLight {

    protected ArrayOfStreetLight streetLightData;

    /**
     * Gets the value of the streetLightData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStreetLight }
     *     
     */
    public ArrayOfStreetLight getStreetLightData() {
        return streetLightData;
    }

    /**
     * Sets the value of the streetLightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStreetLight }
     *     
     */
    public void setStreetLightData(ArrayOfStreetLight value) {
        this.streetLightData = value;
    }

}