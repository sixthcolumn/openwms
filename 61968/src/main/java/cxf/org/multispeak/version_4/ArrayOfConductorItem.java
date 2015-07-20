
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConductorItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConductorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conductorItem" type="{http://www.multispeak.org/Version_4.1_Release}conductorItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConductorItem", propOrder = {
    "conductorItem"
})
public class ArrayOfConductorItem {

    protected List<ConductorItem> conductorItem;

    /**
     * Gets the value of the conductorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conductorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConductorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConductorItem }
     * 
     * 
     */
    public List<ConductorItem> getConductorItem() {
        if (conductorItem == null) {
            conductorItem = new ArrayList<ConductorItem>();
        }
        return this.conductorItem;
    }

}
