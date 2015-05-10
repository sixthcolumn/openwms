
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChargeableDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChargeableDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeableDevice" type="{http://www.multispeak.org/Version_4.1_Release}chargeableDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChargeableDevice", propOrder = {
    "chargeableDevice"
})
public class ArrayOfChargeableDevice {

    @XmlElement(nillable = true)
    protected List<ChargeableDevice> chargeableDevice;

    /**
     * Gets the value of the chargeableDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeableDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeableDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeableDevice }
     * 
     * 
     */
    public List<ChargeableDevice> getChargeableDevice() {
        if (chargeableDevice == null) {
            chargeableDevice = new ArrayList<ChargeableDevice>();
        }
        return this.chargeableDevice;
    }

}
