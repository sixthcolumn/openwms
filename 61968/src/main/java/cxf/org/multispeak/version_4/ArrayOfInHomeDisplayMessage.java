
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInHomeDisplayMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInHomeDisplayMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inHomeDisplayMessage" type="{http://www.multispeak.org/Version_4.1_Release}inHomeDisplayMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInHomeDisplayMessage", propOrder = {
    "inHomeDisplayMessage"
})
public class ArrayOfInHomeDisplayMessage {

    protected List<InHomeDisplayMessage> inHomeDisplayMessage;

    /**
     * Gets the value of the inHomeDisplayMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inHomeDisplayMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInHomeDisplayMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InHomeDisplayMessage }
     * 
     * 
     */
    public List<InHomeDisplayMessage> getInHomeDisplayMessage() {
        if (inHomeDisplayMessage == null) {
            inHomeDisplayMessage = new ArrayList<InHomeDisplayMessage>();
        }
        return this.inHomeDisplayMessage;
    }

}
