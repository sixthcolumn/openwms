
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCircuitElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCircuitElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="circuitElement" type="{http://www.multispeak.org/Version_3.0}circuitElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCircuitElement", propOrder = {
    "circuitElement"
})
public class ArrayOfCircuitElement {

    @XmlElement(nillable = true)
    protected List<CircuitElement> circuitElement;

    /**
     * Gets the value of the circuitElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circuitElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCircuitElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CircuitElement }
     * 
     * 
     */
    public List<CircuitElement> getCircuitElement() {
        if (circuitElement == null) {
            circuitElement = new ArrayList<CircuitElement>();
        }
        return this.circuitElement;
    }

}
