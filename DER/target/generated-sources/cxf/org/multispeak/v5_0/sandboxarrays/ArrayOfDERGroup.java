
package org.multispeak.v5_0.sandboxarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandbox.DERGroup;


/**
 * <p>Java class for ArrayOfDERGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDERGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroup" type="{http://www.multispeak.org/V5.0/sandbox}DERGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDERGroup", propOrder = {
    "derGroup"
})
public class ArrayOfDERGroup {

    @XmlElement(name = "DERGroup")
    protected List<DERGroup> derGroup;

    /**
     * Gets the value of the derGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroup }
     * 
     * 
     */
    public List<DERGroup> getDERGroup() {
        if (derGroup == null) {
            derGroup = new ArrayList<DERGroup>();
        }
        return this.derGroup;
    }

}
