
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutageAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageAttachment" type="{http://www.multispeak.org/Version_4.1_Release}outageAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutageAttachment", propOrder = {
    "outageAttachment"
})
public class ArrayOfOutageAttachment {

    protected List<OutageAttachment> outageAttachment;

    /**
     * Gets the value of the outageAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageAttachment }
     * 
     * 
     */
    public List<OutageAttachment> getOutageAttachment() {
        if (outageAttachment == null) {
            outageAttachment = new ArrayList<OutageAttachment>();
        }
        return this.outageAttachment;
    }

}
