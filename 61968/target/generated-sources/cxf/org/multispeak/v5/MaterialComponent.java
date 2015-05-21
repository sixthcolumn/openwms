
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for materialComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="materialItemID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="stockNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="variant" type="{http://www.multispeak.org/V5.0}variant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialComponent", propOrder = {
    "materialItemID",
    "stockNumber",
    "quantity",
    "variant"
})
public class MaterialComponent
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID materialItemID;
    protected String stockNumber;
    protected float quantity;
    protected Variant variant;

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
     * Gets the value of the stockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockNumber() {
        return stockNumber;
    }

    /**
     * Sets the value of the stockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockNumber(String value) {
        this.stockNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setVariant(Variant value) {
        this.variant = value;
    }

}
