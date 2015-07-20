
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convenienceFeeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convenienceFeeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convenienceFeeItem" type="{http://www.multispeak.org/Version_4.1_Release}convenienceFeeItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convenienceFeeList", propOrder = {
    "convenienceFeeItem"
})
public class ConvenienceFeeList {

    protected List<ConvenienceFeeItem> convenienceFeeItem;

    /**
     * Gets the value of the convenienceFeeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convenienceFeeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvenienceFeeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConvenienceFeeItem }
     * 
     * 
     */
    public List<ConvenienceFeeItem> getConvenienceFeeItem() {
        if (convenienceFeeItem == null) {
            convenienceFeeItem = new ArrayList<ConvenienceFeeItem>();
        }
        return this.convenienceFeeItem;
    }

}
