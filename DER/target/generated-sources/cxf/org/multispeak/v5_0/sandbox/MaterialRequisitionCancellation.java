
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspReferable;
import org.multispeak.v5_0.commontypes.NounUnspecifiedRef;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This is the payload of the
 * 				CancelMaterialRequisition method.
 * 
 * <p>Java class for materialRequisitionCancellation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialRequisitionCancellation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="requisitionID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="workItemReference" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="designReference" type="{http://www.multispeak.org/V5.0/commonTypes}nounUnspecifiedRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialRequisitionCancellation", propOrder = {
    "requisitionID",
    "workItemReference",
    "designReference"
})
public class MaterialRequisitionCancellation
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID requisitionID;
    @XmlElement(required = true)
    protected ObjectRef workItemReference;
    protected NounUnspecifiedRef designReference;

    /**
     * Gets the value of the requisitionID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getRequisitionID() {
        return requisitionID;
    }

    /**
     * Sets the value of the requisitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setRequisitionID(ObjectID value) {
        this.requisitionID = value;
    }

    /**
     * Gets the value of the workItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getWorkItemReference() {
        return workItemReference;
    }

    /**
     * Sets the value of the workItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setWorkItemReference(ObjectRef value) {
        this.workItemReference = value;
    }

    /**
     * Gets the value of the designReference property.
     * 
     * @return
     *     possible object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public NounUnspecifiedRef getDesignReference() {
        return designReference;
    }

    /**
     * Sets the value of the designReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public void setDesignReference(NounUnspecifiedRef value) {
        this.designReference = value;
    }

}
