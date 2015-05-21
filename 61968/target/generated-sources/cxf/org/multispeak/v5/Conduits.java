
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conduits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conduits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conduit" type="{http://www.multispeak.org/V5.0}conduit" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conduits", propOrder = {
    "conduit"
})
public class Conduits {

    @XmlElement(required = true)
    protected List<Conduit> conduit;

    /**
     * Gets the value of the conduit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conduit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConduit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Conduit }
     * 
     * 
     */
    public List<Conduit> getConduit() {
        if (conduit == null) {
            conduit = new ArrayList<Conduit>();
        }
        return this.conduit;
    }

}
