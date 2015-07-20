
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReceivedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReceivedElectricMeter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receivedElectricMeter" type="{http://www.multispeak.org/Version_4.1_Release}receivedElectricMeter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReceivedElectricMeter", propOrder = {
    "receivedElectricMeter"
})
public class ArrayOfReceivedElectricMeter {

    protected List<ReceivedElectricMeter> receivedElectricMeter;

    /**
     * Gets the value of the receivedElectricMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivedElectricMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivedElectricMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivedElectricMeter }
     * 
     * 
     */
    public List<ReceivedElectricMeter> getReceivedElectricMeter() {
        if (receivedElectricMeter == null) {
            receivedElectricMeter = new ArrayList<ReceivedElectricMeter>();
        }
        return this.receivedElectricMeter;
    }

}
