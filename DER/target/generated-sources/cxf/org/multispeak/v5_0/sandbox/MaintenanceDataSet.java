
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5.MspObject;


/**
 * <p>Java class for maintenanceDataSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maintenanceDataSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="maintenanceDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemsMaintained" type="{http://www.multispeak.org/V5.0/sandbox}itemsMaintained" minOccurs="0"/>
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
@XmlType(name = "maintenanceDataSet", propOrder = {
    "maintenanceDate",
    "description",
    "itemsMaintained"
})
public class MaintenanceDataSet
    extends MspObject
{

    protected XMLGregorianCalendar maintenanceDate;
    protected String description;
    protected ItemsMaintained itemsMaintained;

    /**
     * Gets the value of the maintenanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceDate() {
        return maintenanceDate;
    }

    /**
     * Sets the value of the maintenanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceDate(XMLGregorianCalendar value) {
        this.maintenanceDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the itemsMaintained property.
     * 
     * @return
     *     possible object is
     *     {@link ItemsMaintained }
     *     
     */
    public ItemsMaintained getItemsMaintained() {
        return itemsMaintained;
    }

    /**
     * Sets the value of the itemsMaintained property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsMaintained }
     *     
     */
    public void setItemsMaintained(ItemsMaintained value) {
        this.itemsMaintained = value;
    }

}
