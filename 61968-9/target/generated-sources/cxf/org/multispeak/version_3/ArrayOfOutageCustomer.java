
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutageCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageCustomer" type="{http://www.multispeak.org/Version_3.0}outageCustomer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutageCustomer", propOrder = {
    "outageCustomer"
})
public class ArrayOfOutageCustomer {

    protected List<OutageCustomer> outageCustomer;

    /**
     * Gets the value of the outageCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageCustomer }
     * 
     * 
     */
    public List<OutageCustomer> getOutageCustomer() {
        if (outageCustomer == null) {
            outageCustomer = new ArrayList<OutageCustomer>();
        }
        return this.outageCustomer;
    }

}
