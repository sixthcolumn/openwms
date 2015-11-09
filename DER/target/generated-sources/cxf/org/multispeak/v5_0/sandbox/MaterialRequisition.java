
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5.MspObject;
import org.multispeak.v5_0.commontypes.NounUnspecifiedRef;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This item is a request to requisition material for
 * 				a workOrder design.
 * 
 * <p>Java class for materialRequisition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialRequisition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="requisitionItems" type="{http://www.multispeak.org/V5.0/sandbox}requisitionItems"/>
 *         &lt;element name="needByDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="workItemReference" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="designReference" type="{http://www.multispeak.org/V5.0/commonTypes}nounUnspecifiedRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialRequisition", propOrder = {
    "requisitionItems",
    "needByDate",
    "workItemReference",
    "designReference"
})
public class MaterialRequisition
    extends MspObject
{

    @XmlElement(required = true)
    protected RequisitionItems requisitionItems;
    @XmlElement(required = true)
    protected XMLGregorianCalendar needByDate;
    @XmlElement(required = true)
    protected ObjectRef workItemReference;
    protected NounUnspecifiedRef designReference;

    /**
     * Gets the value of the requisitionItems property.
     * 
     * @return
     *     possible object is
     *     {@link RequisitionItems }
     *     
     */
    public RequisitionItems getRequisitionItems() {
        return requisitionItems;
    }

    /**
     * Sets the value of the requisitionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequisitionItems }
     *     
     */
    public void setRequisitionItems(RequisitionItems value) {
        this.requisitionItems = value;
    }

    /**
     * Gets the value of the needByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNeedByDate() {
        return needByDate;
    }

    /**
     * Sets the value of the needByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNeedByDate(XMLGregorianCalendar value) {
        this.needByDate = value;
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
