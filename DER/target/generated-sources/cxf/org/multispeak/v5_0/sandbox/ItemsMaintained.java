
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemsMaintained complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemsMaintained">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemMaintained" type="{http://www.multispeak.org/V5.0/sandbox}itemMaintained" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemsMaintained", propOrder = {
    "itemMaintained"
})
public class ItemsMaintained {

    @XmlElement(required = true)
    protected List<ItemMaintained> itemMaintained;

    /**
     * Gets the value of the itemMaintained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemMaintained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemMaintained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemMaintained }
     * 
     * 
     */
    public List<ItemMaintained> getItemMaintained() {
        if (itemMaintained == null) {
            itemMaintained = new ArrayList<ItemMaintained>();
        }
        return this.itemMaintained;
    }

}
