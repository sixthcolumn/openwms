
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import _1_release.cpsm_v4.TransformerWinding;


/**
 * <p>Java class for ArrayOfTransformerWinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransformerWinding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransformerWinding" type="{cpsm_V4.1_Release}TransformerWinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransformerWinding", propOrder = {
    "transformerWinding"
})
public class ArrayOfTransformerWinding {

    @XmlElement(name = "TransformerWinding")
    protected List<TransformerWinding> transformerWinding;

    /**
     * Gets the value of the transformerWinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformerWinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformerWinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformerWinding }
     * 
     * 
     */
    public List<TransformerWinding> getTransformerWinding() {
        if (transformerWinding == null) {
            transformerWinding = new ArrayList<TransformerWinding>();
        }
        return this.transformerWinding;
    }

}
