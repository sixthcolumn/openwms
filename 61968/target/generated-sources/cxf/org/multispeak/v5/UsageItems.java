
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usageItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usageItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageItem" type="{http://www.multispeak.org/V5.0}usageItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageItems", propOrder = {
    "usageItem"
})
public class UsageItems {

    @XmlElement(required = true)
    protected List<UsageItem> usageItem;

    /**
     * Gets the value of the usageItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageItem }
     * 
     * 
     */
    public List<UsageItem> getUsageItem() {
        if (usageItem == null) {
            usageItem = new ArrayList<UsageItem>();
        }
        return this.usageItem;
    }

}