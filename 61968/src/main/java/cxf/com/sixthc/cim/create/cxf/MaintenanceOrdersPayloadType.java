
package com.sixthc.cim.create.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceOrdersPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceOrdersPayloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iec.ch/TC57/2015/MaintenanceOrders#}MaintenanceOrders"/>
 *         &lt;element name="OperationSet" type="{http://iec.ch/TC57/2011/schema/message}OperationSet" minOccurs="0"/>
 *         &lt;element name="Compressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceOrdersPayloadType", namespace = "http://iec.ch/TC57/2015/MaintenanceOrdersMessage", propOrder = {
    "maintenanceOrders",
    "operationSet",
    "compressed",
    "format"
})
public class MaintenanceOrdersPayloadType {

    @XmlElement(name = "MaintenanceOrders", namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#", required = true)
    protected MaintenanceOrders maintenanceOrders;
    @XmlElement(name = "OperationSet")
    protected OperationSet operationSet;
    @XmlElement(name = "Compressed")
    protected String compressed;
    @XmlElement(name = "Format")
    protected String format;

    /**
     * Gets the value of the maintenanceOrders property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceOrders }
     *     
     */
    public MaintenanceOrders getMaintenanceOrders() {
        return maintenanceOrders;
    }

    /**
     * Sets the value of the maintenanceOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceOrders }
     *     
     */
    public void setMaintenanceOrders(MaintenanceOrders value) {
        this.maintenanceOrders = value;
    }

    /**
     * Gets the value of the operationSet property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSet }
     *     
     */
    public OperationSet getOperationSet() {
        return operationSet;
    }

    /**
     * Sets the value of the operationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSet }
     *     
     */
    public void setOperationSet(OperationSet value) {
        this.operationSet = value;
    }

    /**
     * Gets the value of the compressed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressed() {
        return compressed;
    }

    /**
     * Sets the value of the compressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressed(String value) {
        this.compressed = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
