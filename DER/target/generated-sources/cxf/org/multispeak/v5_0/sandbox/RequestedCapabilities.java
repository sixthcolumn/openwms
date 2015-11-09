
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestedCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedCapability" type="{http://www.multispeak.org/V5.0/sandbox}requestedCapability" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedCapabilities", propOrder = {
    "requestedCapability"
})
public class RequestedCapabilities {

    @XmlElement(required = true)
    protected List<RequestedCapability> requestedCapability;

    /**
     * Gets the value of the requestedCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedCapability }
     * 
     * 
     */
    public List<RequestedCapability> getRequestedCapability() {
        if (requestedCapability == null) {
            requestedCapability = new ArrayList<RequestedCapability>();
        }
        return this.requestedCapability;
    }

}
