
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class contains information on the status of a
 * 				material request. 
 * 
 * <p>Java class for requisitionResultItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requisitionResultItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requisitionResultItem" type="{http://www.multispeak.org/V5.0/sandbox}requisitionResultItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requisitionResultItems", propOrder = {
    "requisitionResultItem"
})
public class RequisitionResultItems {

    @XmlElement(required = true)
    protected List<RequisitionResultItem> requisitionResultItem;

    /**
     * Gets the value of the requisitionResultItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisitionResultItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisitionResultItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequisitionResultItem }
     * 
     * 
     */
    public List<RequisitionResultItem> getRequisitionResultItem() {
        if (requisitionResultItem == null) {
            requisitionResultItem = new ArrayList<RequisitionResultItem>();
        }
        return this.requisitionResultItem;
    }

}