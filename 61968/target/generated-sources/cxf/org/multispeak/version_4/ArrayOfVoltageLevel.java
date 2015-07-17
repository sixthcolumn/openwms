
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.cpsm_v4.VoltageLevel;


/**
 * <p>Java class for ArrayOfVoltageLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVoltageLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoltageLevel" type="{cpsm_V4.1_Release}VoltageLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVoltageLevel", propOrder = {
    "voltageLevel"
})
public class ArrayOfVoltageLevel {

    @XmlElement(name = "VoltageLevel")
    protected List<VoltageLevel> voltageLevel;

    /**
     * Gets the value of the voltageLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voltageLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoltageLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoltageLevel }
     * 
     * 
     */
    public List<VoltageLevel> getVoltageLevel() {
        if (voltageLevel == null) {
            voltageLevel = new ArrayList<VoltageLevel>();
        }
        return this.voltageLevel;
    }

}
