
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pointers to the distributed energy resources
 * 				contained in this group.
 * 
 * <p>Java class for DERIDs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERIDs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERID" type="{http://www.multispeak.org/V5.0/sandbox}DERID" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERIDs", propOrder = {
    "derid"
})
public class DERIDs {

    @XmlElement(name = "DERID", required = true)
    protected List<DERID> derid;

    /**
     * Gets the value of the derid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERID }
     * 
     * 
     */
    public List<DERID> getDERID() {
        if (derid == null) {
            derid = new ArrayList<DERID>();
        }
        return this.derid;
    }

}
