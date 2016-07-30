
package com.epri._2013.dergroup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an optional, self-describing means to
 * 				extend any MultiSpeak object.
 * 
 * <p>Java class for extensionsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extensionsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensionsItem" type="{http://www.epri.com/2013/DERGroup#}extensionsItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extensionsList", propOrder = {
    "extensionsItem"
})
public class ExtensionsList {

    @XmlElement(required = true)
    protected List<ExtensionsItem> extensionsItem;

    /**
     * Gets the value of the extensionsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsItem }
     * 
     * 
     */
    public List<ExtensionsItem> getExtensionsItem() {
        if (extensionsItem == null) {
            extensionsItem = new ArrayList<ExtensionsItem>();
        }
        return this.extensionsItem;
    }

}
