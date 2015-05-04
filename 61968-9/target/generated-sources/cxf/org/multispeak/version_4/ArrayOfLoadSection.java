
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLoadSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLoadSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadSection" type="{http://www.multispeak.org/Version_4.1_Release}loadSection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLoadSection", propOrder = {
    "loadSection"
})
public class ArrayOfLoadSection {

    protected List<LoadSection> loadSection;

    /**
     * Gets the value of the loadSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadSection }
     * 
     * 
     */
    public List<LoadSection> getLoadSection() {
        if (loadSection == null) {
            loadSection = new ArrayList<LoadSection>();
        }
        return this.loadSection;
    }

}
