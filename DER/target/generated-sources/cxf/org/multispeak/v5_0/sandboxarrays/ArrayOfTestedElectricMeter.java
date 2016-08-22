
package org.multispeak.v5_0.sandboxarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandbox.TestedElectricMeter;


/**
 * <p>Java class for ArrayOfTestedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTestedElectricMeter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testedElectricMeter" type="{http://www.multispeak.org/V5.0/sandbox}testedElectricMeter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTestedElectricMeter", propOrder = {
    "testedElectricMeter"
})
public class ArrayOfTestedElectricMeter {

    @XmlElement(nillable = true)
    protected List<TestedElectricMeter> testedElectricMeter;

    /**
     * Gets the value of the testedElectricMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testedElectricMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestedElectricMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestedElectricMeter }
     * 
     * 
     */
    public List<TestedElectricMeter> getTestedElectricMeter() {
        if (testedElectricMeter == null) {
            testedElectricMeter = new ArrayList<TestedElectricMeter>();
        }
        return this.testedElectricMeter;
    }

}