
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.OutageRemarkReferable;


/**
 * <p>Java class for ArrayOfOutageRemarkReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageRemarkReferable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageRemarkReferable" type="{http://www.multispeak.org/V5.0}outageRemarkReferable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutageRemarkReferable", propOrder = {
    "outageRemarkReferable"
})
public class ArrayOfOutageRemarkReferable {

    protected List<OutageRemarkReferable> outageRemarkReferable;

    /**
     * Gets the value of the outageRemarkReferable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageRemarkReferable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageRemarkReferable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageRemarkReferable }
     * 
     * 
     */
    public List<OutageRemarkReferable> getOutageRemarkReferable() {
        if (outageRemarkReferable == null) {
            outageRemarkReferable = new ArrayList<OutageRemarkReferable>();
        }
        return this.outageRemarkReferable;
    }

}
