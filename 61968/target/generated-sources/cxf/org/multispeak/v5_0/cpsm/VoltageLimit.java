
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * <p>Java class for VoltageLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoltageLimit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationalLimitSetID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "VoltageLimit", propOrder = {
    "value",
    "type",
    "operationalLimitSetID"
})
public class VoltageLimit
    extends MspCIMObject
{

    protected Voltage value;
    protected String type;
    protected ObjectID operationalLimitSetID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setValue(Voltage value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the operationalLimitSetID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getOperationalLimitSetID() {
        return operationalLimitSetID;
    }

    /**
     * Sets the value of the operationalLimitSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setOperationalLimitSetID(ObjectID value) {
        this.operationalLimitSetID = value;
    }

}
