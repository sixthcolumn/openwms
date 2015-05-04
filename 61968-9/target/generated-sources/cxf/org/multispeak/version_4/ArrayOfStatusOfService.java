
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusOfService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusOfService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusOfService" type="{http://www.multispeak.org/Version_4.1_Release}statusOfService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusOfService", propOrder = {
    "statusOfService"
})
public class ArrayOfStatusOfService {

    protected List<StatusOfService> statusOfService;

    /**
     * Gets the value of the statusOfService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusOfService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusOfService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusOfService }
     * 
     * 
     */
    public List<StatusOfService> getStatusOfService() {
        if (statusOfService == null) {
            statusOfService = new ArrayList<StatusOfService>();
        }
        return this.statusOfService;
    }

}
