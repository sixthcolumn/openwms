
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDER;


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
 *         &lt;element name="ArrayOfDER" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDER" minOccurs="0"/>
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
    "arrayOfDER"
})
@XmlRootElement(name = "GetDERsByDERIDResponse")
public class GetDERsByDERIDResponse {

    @XmlElement(name = "ArrayOfDER")
    protected ArrayOfDER arrayOfDER;

    /**
     * Gets the value of the arrayOfDER property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDER }
     *     
     */
    public ArrayOfDER getArrayOfDER() {
        return arrayOfDER;
    }

    /**
     * Sets the value of the arrayOfDER property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDER }
     *     
     */
    public void setArrayOfDER(ArrayOfDER value) {
        this.arrayOfDER = value;
    }

}
