
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premisesDisplayMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplayMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premisesDisplayMessage" type="{http://www.multispeak.org/V5.0}premisesDisplayMessage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premisesDisplayMessages", propOrder = {
    "premisesDisplayMessage"
})
public class PremisesDisplayMessages {

    @XmlElement(required = true)
    protected List<PremisesDisplayMessage> premisesDisplayMessage;

    /**
     * Gets the value of the premisesDisplayMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesDisplayMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesDisplayMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesDisplayMessage }
     * 
     * 
     */
    public List<PremisesDisplayMessage> getPremisesDisplayMessage() {
        if (premisesDisplayMessage == null) {
            premisesDisplayMessage = new ArrayList<PremisesDisplayMessage>();
        }
        return this.premisesDisplayMessage;
    }

}