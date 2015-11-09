
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * These are the objectIDs of the transformer unit(s) from which this serivce location receives service.
 * 
 * <p>Java class for unitIDs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unitIDs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitIDs", propOrder = {
    "unitID"
})
public class UnitIDs {

    @XmlElement(required = true)
    protected List<ObjectID> unitID;

    /**
     * Gets the value of the unitID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectID }
     * 
     * 
     */
    public List<ObjectID> getUnitID() {
        if (unitID == null) {
            unitID = new ArrayList<ObjectID>();
        }
        return this.unitID;
    }

}