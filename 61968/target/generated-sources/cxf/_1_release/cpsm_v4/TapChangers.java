
package _1_release.cpsm_v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TapChangers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TapChangers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TapChanger" type="{cpsm_V4.1_Release}TapChanger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TapChangers", propOrder = {
    "tapChanger"
})
public class TapChangers {

    @XmlElement(name = "TapChanger")
    protected List<TapChanger> tapChanger;

    /**
     * Gets the value of the tapChanger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tapChanger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTapChanger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TapChanger }
     * 
     * 
     */
    public List<TapChanger> getTapChanger() {
        if (tapChanger == null) {
            tapChanger = new ArrayList<TapChanger>();
        }
        return this.tapChanger;
    }

}
