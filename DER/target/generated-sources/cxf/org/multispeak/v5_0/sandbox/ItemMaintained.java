
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.Measurements;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for itemMaintained complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemMaintained">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="maintenanceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurements" type="{http://www.multispeak.org/V5.0}measurements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemMaintained", propOrder = {
    "itemIdentifier",
    "maintenanceCode",
    "conditionBefore",
    "conditionAfter",
    "remarks",
    "measurements"
})
public class ItemMaintained {

    protected ObjectRef itemIdentifier;
    protected String maintenanceCode;
    protected String conditionBefore;
    protected String conditionAfter;
    protected String remarks;
    protected Measurements measurements;

    /**
     * Gets the value of the itemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * Sets the value of the itemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setItemIdentifier(ObjectRef value) {
        this.itemIdentifier = value;
    }

    /**
     * Gets the value of the maintenanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceCode() {
        return maintenanceCode;
    }

    /**
     * Sets the value of the maintenanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceCode(String value) {
        this.maintenanceCode = value;
    }

    /**
     * Gets the value of the conditionBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionBefore() {
        return conditionBefore;
    }

    /**
     * Sets the value of the conditionBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionBefore(String value) {
        this.conditionBefore = value;
    }

    /**
     * Gets the value of the conditionAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionAfter() {
        return conditionAfter;
    }

    /**
     * Sets the value of the conditionAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionAfter(String value) {
        this.conditionAfter = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link Measurements }
     *     
     */
    public Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measurements }
     *     
     */
    public void setMeasurements(Measurements value) {
        this.measurements = value;
    }

}
