
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gasLocationFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasLocationFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfExtensionsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gasLocationFields", propOrder = {
    "extensionsList"
})
public class GasLocationFields {

    protected ArrayOfExtensionsItem extensionsList;

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public ArrayOfExtensionsItem getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public void setExtensionsList(ArrayOfExtensionsItem value) {
        this.extensionsList = value;
    }

}
