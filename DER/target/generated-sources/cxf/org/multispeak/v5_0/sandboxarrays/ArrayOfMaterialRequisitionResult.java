
package org.multispeak.v5_0.sandboxarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandbox.MaterialRequisitionResult;


/**
 * <p>Java class for ArrayOfMaterialRequisitionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaterialRequisitionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materialRequisitionResult" type="{http://www.multispeak.org/V5.0/sandbox}materialRequisitionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaterialRequisitionResult", propOrder = {
    "materialRequisitionResult"
})
public class ArrayOfMaterialRequisitionResult {

    protected List<MaterialRequisitionResult> materialRequisitionResult;

    /**
     * Gets the value of the materialRequisitionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequisitionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequisitionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialRequisitionResult }
     * 
     * 
     */
    public List<MaterialRequisitionResult> getMaterialRequisitionResult() {
        if (materialRequisitionResult == null) {
            materialRequisitionResult = new ArrayList<MaterialRequisitionResult>();
        }
        return this.materialRequisitionResult;
    }

}
