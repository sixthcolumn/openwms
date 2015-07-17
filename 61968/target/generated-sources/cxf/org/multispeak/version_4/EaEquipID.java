
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for eaEquipID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eaEquipID">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="objectID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="equipmentType" type="{http://www.multispeak.org/Version_4.1_Release}equipmentType" />
 *       &lt;attribute name="entryName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eaEquipID", propOrder = {
    "value"
})
public class EaEquipID {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "objectID")
    protected String objectID;
    @XmlAttribute(name = "equipmentType")
    protected EquipmentType equipmentType;
    @XmlAttribute(name = "entryName")
    protected String entryName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEquipmentType(EquipmentType value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the entryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryName() {
        return entryName;
    }

    /**
     * Sets the value of the entryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryName(String value) {
        this.entryName = value;
    }

}
