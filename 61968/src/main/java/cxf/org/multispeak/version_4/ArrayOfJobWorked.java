
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobWorked complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobWorked">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobWorked" type="{http://www.multispeak.org/Version_4.1_Release}jobWorked" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobWorked", propOrder = {
    "jobWorked"
})
public class ArrayOfJobWorked {

    protected List<JobWorked> jobWorked;

    /**
     * Gets the value of the jobWorked property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobWorked property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobWorked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobWorked }
     * 
     * 
     */
    public List<JobWorked> getJobWorked() {
        if (jobWorked == null) {
            jobWorked = new ArrayList<JobWorked>();
        }
        return this.jobWorked;
    }

}
