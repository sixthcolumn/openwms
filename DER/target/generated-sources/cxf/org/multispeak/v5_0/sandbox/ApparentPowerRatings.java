
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for apparentPowerRatings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apparentPowerRatings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="apparentPowerRating" type="{http://www.multispeak.org/V5.0/sandbox}apparentPowerRating" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apparentPowerRatings", propOrder = {
    "apparentPowerRating"
})
public class ApparentPowerRatings
    extends MspExtensible
{

    @XmlElement(required = true)
    protected List<ApparentPowerRating> apparentPowerRating;

    /**
     * Gets the value of the apparentPowerRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apparentPowerRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApparentPowerRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApparentPowerRating }
     * 
     * 
     */
    public List<ApparentPowerRating> getApparentPowerRating() {
        if (apparentPowerRating == null) {
            apparentPowerRating = new ArrayList<ApparentPowerRating>();
        }
        return this.apparentPowerRating;
    }

}
