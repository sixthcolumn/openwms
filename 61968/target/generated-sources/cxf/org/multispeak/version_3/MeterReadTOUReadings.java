
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterReadTOUReadings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterReadTOUReadings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TOUReading" type="{http://www.multispeak.org/Version_3.0}TOUReading" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterReadTOUReadings", propOrder = {
    "touReading"
})
public class MeterReadTOUReadings {

    @XmlElement(name = "TOUReading")
    protected List<TOUReading> touReading;

    /**
     * Gets the value of the touReading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the touReading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOUReading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOUReading }
     * 
     * 
     */
    public List<TOUReading> getTOUReading() {
        if (touReading == null) {
            touReading = new ArrayList<TOUReading>();
        }
        return this.touReading;
    }

}
