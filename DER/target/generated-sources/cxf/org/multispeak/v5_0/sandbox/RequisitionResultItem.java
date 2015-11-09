
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is the status of the request for a specific
 * 				material item that was made as part of a material requisition.
 * 			
 * 
 * <p>Java class for requisitionResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requisitionResultItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="materialItemID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="requisitionResult" type="{http://www.multispeak.org/V5.0/sandbox}requisitionResult"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ETA" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requisitionResultItem", propOrder = {
    "materialItemID",
    "requisitionResult",
    "quantityOnHand",
    "eta"
})
public class RequisitionResultItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID materialItemID;
    @XmlElement(required = true)
    protected RequisitionResult requisitionResult;
    protected Float quantityOnHand;
    @XmlElement(name = "ETA")
    protected XMLGregorianCalendar eta;

    /**
     * Gets the value of the materialItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialItemID() {
        return materialItemID;
    }

    /**
     * Sets the value of the materialItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialItemID(ObjectID value) {
        this.materialItemID = value;
    }

    /**
     * Gets the value of the requisitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequisitionResult }
     *     
     */
    public RequisitionResult getRequisitionResult() {
        return requisitionResult;
    }

    /**
     * Sets the value of the requisitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequisitionResult }
     *     
     */
    public void setRequisitionResult(RequisitionResult value) {
        this.requisitionResult = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantityOnHand(Float value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETA() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETA(XMLGregorianCalendar value) {
        this.eta = value;
    }

}
