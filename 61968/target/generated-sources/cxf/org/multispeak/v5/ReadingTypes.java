
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The definition of readingType comes from Annex C of IEC 61968-9.
 * 
 * <p>Java class for readingTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingType" type="{http://www.multispeak.org/V5.0}readingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingTypes", propOrder = {
    "readingType"
})
public class ReadingTypes {

    @XmlElement(required = true)
    protected List<ReadingType> readingType;

    /**
     * Gets the value of the readingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingType }
     * 
     * 
     */
    public List<ReadingType> getReadingType() {
        if (readingType == null) {
            readingType = new ArrayList<ReadingType>();
        }
        return this.readingType;
    }

}
