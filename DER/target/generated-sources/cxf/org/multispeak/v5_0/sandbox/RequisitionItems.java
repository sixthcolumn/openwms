
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requisitionItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requisitionItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requisitionItem" type="{http://www.multispeak.org/V5.0/sandbox}requisitionItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requisitionItems", propOrder = {
    "requisitionItem"
})
public class RequisitionItems {

    @XmlElement(required = true)
    protected List<RequisitionItem> requisitionItem;

    /**
     * Gets the value of the requisitionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisitionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisitionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequisitionItem }
     * 
     * 
     */
    public List<RequisitionItem> getRequisitionItem() {
        if (requisitionItem == null) {
            requisitionItem = new ArrayList<RequisitionItem>();
        }
        return this.requisitionItem;
    }

}
