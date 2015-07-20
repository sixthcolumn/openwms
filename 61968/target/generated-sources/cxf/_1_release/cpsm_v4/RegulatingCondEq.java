
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatingCondEq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatingCondEq">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="equipmentContainerID" type="{cpsm_V4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="regulatingControlID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatingCondEq", propOrder = {
    "equipmentContainerID",
    "regulatingControlID"
})
@XmlSeeAlso({
    StaticVarCompensator.class
})
public abstract class RegulatingCondEq
    extends ConductingEquipment
{

    protected ObjectRef equipmentContainerID;
    protected String regulatingControlID;

    /**
     * Gets the value of the equipmentContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEquipmentContainerID() {
        return equipmentContainerID;
    }

    /**
     * Sets the value of the equipmentContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEquipmentContainerID(ObjectRef value) {
        this.equipmentContainerID = value;
    }

    /**
     * Gets the value of the regulatingControlID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatingControlID() {
        return regulatingControlID;
    }

    /**
     * Sets the value of the regulatingControlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatingControlID(String value) {
        this.regulatingControlID = value;
    }

}
