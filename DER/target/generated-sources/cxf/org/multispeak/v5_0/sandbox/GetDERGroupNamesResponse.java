
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDERGroupNamesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupNamesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfString" type="{http://www.multispeak.org/V5.0/sandbox}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupNamesResponse", propOrder = {
    "arrayOfString"
})
public class GetDERGroupNamesResponse {

    @XmlElement(name = "ArrayOfString")
    protected ArrayOfString arrayOfString;

    /**
     * Gets the value of the arrayOfString property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getArrayOfString() {
        return arrayOfString;
    }

    /**
     * Sets the value of the arrayOfString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setArrayOfString(ArrayOfString value) {
        this.arrayOfString = value;
    }

}
