
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInHomeDisplayBillingMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInHomeDisplayBillingMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inHomeDisplayBillingMessage" type="{http://www.multispeak.org/Version_4.1_Release}inHomeDisplayBillingMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInHomeDisplayBillingMessage", propOrder = {
    "inHomeDisplayBillingMessage"
})
public class ArrayOfInHomeDisplayBillingMessage {

    protected List<InHomeDisplayBillingMessage> inHomeDisplayBillingMessage;

    /**
     * Gets the value of the inHomeDisplayBillingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inHomeDisplayBillingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInHomeDisplayBillingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InHomeDisplayBillingMessage }
     * 
     * 
     */
    public List<InHomeDisplayBillingMessage> getInHomeDisplayBillingMessage() {
        if (inHomeDisplayBillingMessage == null) {
            inHomeDisplayBillingMessage = new ArrayList<InHomeDisplayBillingMessage>();
        }
        return this.inHomeDisplayBillingMessage;
    }

}
