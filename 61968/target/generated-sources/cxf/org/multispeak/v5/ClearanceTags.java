
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tags associated with a switching order.
 * 
 * <p>Java class for clearanceTags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearanceTags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearanceTag" type="{http://www.multispeak.org/V5.0}clearanceTag" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearanceTags", propOrder = {
    "clearanceTag"
})
public class ClearanceTags {

    @XmlElement(required = true)
    protected List<ClearanceTag> clearanceTag;

    /**
     * Gets the value of the clearanceTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearanceTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearanceTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearanceTag }
     * 
     * 
     */
    public List<ClearanceTag> getClearanceTag() {
        if (clearanceTag == null) {
            clearanceTag = new ArrayList<ClearanceTag>();
        }
        return this.clearanceTag;
    }

}