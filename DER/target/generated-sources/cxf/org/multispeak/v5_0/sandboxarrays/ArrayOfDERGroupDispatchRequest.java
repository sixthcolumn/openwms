
package org.multispeak.v5_0.sandboxarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandbox.DERGroupDispatchRequest;


/**
 * <p>Java class for ArrayOfDERGroupDispatchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDERGroupDispatchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupDispatchRequest" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupDispatchRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDERGroupDispatchRequest", propOrder = {
    "derGroupDispatchRequest"
})
public class ArrayOfDERGroupDispatchRequest {

    @XmlElement(name = "DERGroupDispatchRequest")
    protected List<DERGroupDispatchRequest> derGroupDispatchRequest;

    /**
     * Gets the value of the derGroupDispatchRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroupDispatchRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroupDispatchRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroupDispatchRequest }
     * 
     * 
     */
    public List<DERGroupDispatchRequest> getDERGroupDispatchRequest() {
        if (derGroupDispatchRequest == null) {
            derGroupDispatchRequest = new ArrayList<DERGroupDispatchRequest>();
        }
        return this.derGroupDispatchRequest;
    }

}
