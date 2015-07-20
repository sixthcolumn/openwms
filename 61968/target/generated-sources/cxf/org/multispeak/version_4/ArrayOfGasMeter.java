
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGasMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGasMeter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gasMeter" type="{http://www.multispeak.org/Version_4.1_Release}gasMeter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGasMeter", propOrder = {
    "gasMeter"
})
public class ArrayOfGasMeter {

    protected List<GasMeter> gasMeter;

    /**
     * Gets the value of the gasMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gasMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGasMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GasMeter }
     * 
     * 
     */
    public List<GasMeter> getGasMeter() {
        if (gasMeter == null) {
            gasMeter = new ArrayList<GasMeter>();
        }
        return this.gasMeter;
    }

}
