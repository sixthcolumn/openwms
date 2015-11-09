
package org.multispeak.v5_0.sandboxarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandbox.DERGroupID;


/**
 * <p>Java class for ArrayOfDERGroupID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDERGroupID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupID" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDERGroupID", propOrder = {
    "derGroupID"
})
public class ArrayOfDERGroupID {

    @XmlElement(name = "DERGroupID")
    protected List<DERGroupID> derGroupID;

    /**
     * Gets the value of the derGroupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroupID }
     * 
     * 
     */
    public List<DERGroupID> getDERGroupID() {
        if (derGroupID == null) {
            derGroupID = new ArrayList<DERGroupID>();
        }
        return this.derGroupID;
    }

}
