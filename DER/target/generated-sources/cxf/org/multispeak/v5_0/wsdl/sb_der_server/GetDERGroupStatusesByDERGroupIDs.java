
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupID;


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
 *         &lt;element name="ArrayOfDERGroupID" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroupID" minOccurs="0"/>
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
    "arrayOfDERGroupID"
})
@XmlRootElement(name = "GetDERGroupStatusesByDERGroupIDs")
public class GetDERGroupStatusesByDERGroupIDs {

    @XmlElement(name = "ArrayOfDERGroupID")
    protected ArrayOfDERGroupID arrayOfDERGroupID;

    /**
     * Gets the value of the arrayOfDERGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroupID }
     *     
     */
    public ArrayOfDERGroupID getArrayOfDERGroupID() {
        return arrayOfDERGroupID;
    }

    /**
     * Sets the value of the arrayOfDERGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroupID }
     *     
     */
    public void setArrayOfDERGroupID(ArrayOfDERGroupID value) {
        this.arrayOfDERGroupID = value;
    }

}
