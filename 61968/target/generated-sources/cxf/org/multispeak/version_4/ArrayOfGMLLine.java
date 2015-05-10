
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGMLLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGMLLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GMLLine" type="{http://www.multispeak.org/Version_4.1_Release}GMLLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGMLLine", propOrder = {
    "gmlLine"
})
public class ArrayOfGMLLine {

    @XmlElement(name = "GMLLine")
    protected List<GMLLine> gmlLine;

    /**
     * Gets the value of the gmlLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gmlLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGMLLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMLLine }
     * 
     * 
     */
    public List<GMLLine> getGMLLine() {
        if (gmlLine == null) {
            gmlLine = new ArrayList<GMLLine>();
        }
        return this.gmlLine;
    }

}
