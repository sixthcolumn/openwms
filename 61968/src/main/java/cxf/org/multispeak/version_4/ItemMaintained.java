
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="itemIdentifier" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="maintenanceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditionAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeasurement" minOccurs="0"/>
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
    "measurementList"
})
public class ItemMaintained {

    protected ObjectRef itemIdentifier;
    protected String maintenanceCode;
    protected String conditionBefore;
    protected String conditionAfter;
    protected String remarks;
    protected ArrayOfMeasurement measurementList;

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
     * Gets the value of the measurementList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeasurement }
     *     
     */
    public ArrayOfMeasurement getMeasurementList() {
        return measurementList;
    }

    /**
     * Sets the value of the measurementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeasurement }
     *     
     */
    public void setMeasurementList(ArrayOfMeasurement value) {
        this.measurementList = value;
    }

}
