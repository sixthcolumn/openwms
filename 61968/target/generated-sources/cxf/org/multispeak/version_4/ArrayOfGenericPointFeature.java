
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGenericPointFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGenericPointFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericPointFeature" type="{http://www.multispeak.org/Version_4.1_Release}genericPointFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGenericPointFeature", propOrder = {
    "genericPointFeature"
})
public class ArrayOfGenericPointFeature {

    protected List<GenericPointFeature> genericPointFeature;

    /**
     * Gets the value of the genericPointFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericPointFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericPointFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericPointFeature }
     * 
     * 
     */
    public List<GenericPointFeature> getGenericPointFeature() {
        if (genericPointFeature == null) {
            genericPointFeature = new ArrayList<GenericPointFeature>();
        }
        return this.genericPointFeature;
    }

}
