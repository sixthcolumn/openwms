
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERID;


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
 *         &lt;element name="ArrayOfDERID" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERID" minOccurs="0"/>
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
    "arrayOfDERID"
})
@XmlRootElement(name = "GetDERsByDERID")
public class GetDERsByDERID {

    @XmlElement(name = "ArrayOfDERID")
    protected ArrayOfDERID arrayOfDERID;

    /**
     * Gets the value of the arrayOfDERID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERID }
     *     
     */
    public ArrayOfDERID getArrayOfDERID() {
        return arrayOfDERID;
    }

    /**
     * Sets the value of the arrayOfDERID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERID }
     *     
     */
    public void setArrayOfDERID(ArrayOfDERID value) {
        this.arrayOfDERID = value;
    }

}
