
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupStatus;


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
 *         &lt;element name="ArrayOfDERGroupStatus" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroupStatus" minOccurs="0"/>
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
    "arrayOfDERGroupStatus"
})
@XmlRootElement(name = "GetDERGroupStatusesByDERGroupIDsResponse")
public class GetDERGroupStatusesByDERGroupIDsResponse {

    @XmlElement(name = "ArrayOfDERGroupStatus")
    protected ArrayOfDERGroupStatus arrayOfDERGroupStatus;

    /**
     * Gets the value of the arrayOfDERGroupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroupStatus }
     *     
     */
    public ArrayOfDERGroupStatus getArrayOfDERGroupStatus() {
        return arrayOfDERGroupStatus;
    }

    /**
     * Sets the value of the arrayOfDERGroupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroupStatus }
     *     
     */
    public void setArrayOfDERGroupStatus(ArrayOfDERGroupStatus value) {
        this.arrayOfDERGroupStatus = value;
    }

}
