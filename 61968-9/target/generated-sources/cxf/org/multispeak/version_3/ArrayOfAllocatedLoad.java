
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAllocatedLoad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAllocatedLoad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocatedLoad" type="{http://www.multispeak.org/Version_3.0}allocatedLoad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAllocatedLoad", propOrder = {
    "allocatedLoad"
})
public class ArrayOfAllocatedLoad {

    protected List<AllocatedLoad> allocatedLoad;

    /**
     * Gets the value of the allocatedLoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocatedLoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocatedLoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllocatedLoad }
     * 
     * 
     */
    public List<AllocatedLoad> getAllocatedLoad() {
        if (allocatedLoad == null) {
            allocatedLoad = new ArrayList<AllocatedLoad>();
        }
        return this.allocatedLoad;
    }

}
