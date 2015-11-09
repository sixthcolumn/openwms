
package org.multispeak.v5_0.sandboxarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandbox.MaterialRequisitionCancellation;


/**
 * <p>Java class for ArrayOfMaterialRequisitionCancellation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaterialRequisitionCancellation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materialRequisitionCancellation" type="{http://www.multispeak.org/V5.0/sandbox}materialRequisitionCancellation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaterialRequisitionCancellation", propOrder = {
    "materialRequisitionCancellation"
})
public class ArrayOfMaterialRequisitionCancellation {

    protected List<MaterialRequisitionCancellation> materialRequisitionCancellation;

    /**
     * Gets the value of the materialRequisitionCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequisitionCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequisitionCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialRequisitionCancellation }
     * 
     * 
     */
    public List<MaterialRequisitionCancellation> getMaterialRequisitionCancellation() {
        if (materialRequisitionCancellation == null) {
            materialRequisitionCancellation = new ArrayList<MaterialRequisitionCancellation>();
        }
        return this.materialRequisitionCancellation;
    }

}
