
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCDStateChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCDStateChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CDStateChange" type="{http://www.multispeak.org/Version_4.1_Release}CDStateChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCDStateChange", propOrder = {
    "cdStateChange"
})
public class ArrayOfCDStateChange {

    @XmlElement(name = "CDStateChange", nillable = true)
    protected List<CDStateChange> cdStateChange;

    /**
     * Gets the value of the cdStateChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdStateChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDStateChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDStateChange }
     * 
     * 
     */
    public List<CDStateChange> getCDStateChange() {
        if (cdStateChange == null) {
            cdStateChange = new ArrayList<CDStateChange>();
        }
        return this.cdStateChange;
    }

}
