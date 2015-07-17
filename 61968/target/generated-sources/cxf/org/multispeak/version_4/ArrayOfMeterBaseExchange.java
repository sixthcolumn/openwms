
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMeterBaseExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMeterBaseExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterBaseExchange" type="{http://www.multispeak.org/Version_4.1_Release}meterBaseExchange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMeterBaseExchange", propOrder = {
    "meterBaseExchange"
})
public class ArrayOfMeterBaseExchange {

    @XmlElement(nillable = true)
    protected List<MeterBaseExchange> meterBaseExchange;

    /**
     * Gets the value of the meterBaseExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterBaseExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterBaseExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterBaseExchange }
     * 
     * 
     */
    public List<MeterBaseExchange> getMeterBaseExchange() {
        if (meterBaseExchange == null) {
            meterBaseExchange = new ArrayList<MeterBaseExchange>();
        }
        return this.meterBaseExchange;
    }

}
