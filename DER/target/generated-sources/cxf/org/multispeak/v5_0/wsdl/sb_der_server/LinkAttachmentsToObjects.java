
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commonarrays.ArrayOfAttachmentContainer;


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
 *         &lt;element name="ArrayOfAttachmentContainer" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfAttachmentContainer" minOccurs="0"/>
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
    "arrayOfAttachmentContainer"
})
@XmlRootElement(name = "LinkAttachmentsToObjects")
public class LinkAttachmentsToObjects {

    @XmlElement(name = "ArrayOfAttachmentContainer")
    protected ArrayOfAttachmentContainer arrayOfAttachmentContainer;

    /**
     * Gets the value of the arrayOfAttachmentContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachmentContainer }
     *     
     */
    public ArrayOfAttachmentContainer getArrayOfAttachmentContainer() {
        return arrayOfAttachmentContainer;
    }

    /**
     * Sets the value of the arrayOfAttachmentContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachmentContainer }
     *     
     */
    public void setArrayOfAttachmentContainer(ArrayOfAttachmentContainer value) {
        this.arrayOfAttachmentContainer = value;
    }

}
