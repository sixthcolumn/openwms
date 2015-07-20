
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricMeters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="electricMeter" type="{http://www.multispeak.org/Version_4.1_Release}electricMeter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricMeters", propOrder = {
    "electricMeter"
})
public class ElectricMeters {

    protected List<ElectricMeter> electricMeter;

    /**
     * Gets the value of the electricMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricMeter }
     * 
     * 
     */
    public List<ElectricMeter> getElectricMeter() {
        if (electricMeter == null) {
            electricMeter = new ArrayList<ElectricMeter>();
        }
        return this.electricMeter;
    }

}
