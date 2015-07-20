
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propaneMeters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propaneMeters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/V5.0}propaneMeter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propaneMeters", propOrder = {
    "propaneMeter"
})
public class PropaneMeters {

    @XmlElement(required = true)
    protected List<PropaneMeter> propaneMeter;

    /**
     * Gets the value of the propaneMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propaneMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropaneMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropaneMeter }
     * 
     * 
     */
    public List<PropaneMeter> getPropaneMeter() {
        if (propaneMeter == null) {
            propaneMeter = new ArrayList<PropaneMeter>();
        }
        return this.propaneMeter;
    }

}