
package com.sixthc.cim.create.cxf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}mRID" minOccurs="0"/>
 *         &lt;element name="crewETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusKind" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkStatusKind"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskKind" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkTaskKind"/>
 *         &lt;element name="Assets" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Asset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Crews" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Crew" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialItems" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mRID" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}mRID" minOccurs="0"/>
 *                   &lt;element name="Names" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Name" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="quantity" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="multiplier" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}UnitMultiplier" minOccurs="0"/>
 *                             &lt;element name="unit" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}UnitSymbol" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Names" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OldAsset" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Asset" minOccurs="0"/>
 *         &lt;element name="TimeSchedules" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkTimeSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkTask", namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#", propOrder = {
    "mrid",
    "crewETA",
    "instruction",
    "statusKind",
    "subject",
    "taskKind",
    "assets",
    "crews",
    "materialItems",
    "names",
    "oldAsset",
    "timeSchedules"
})
public class WorkTask {

    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar crewETA;
    protected String instruction;
    @XmlElement(required = true)
    protected WorkStatusKind statusKind;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected WorkTaskKind taskKind;
    @XmlElement(name = "Assets")
    protected List<Asset> assets;
    @XmlElement(name = "Crews")
    protected List<Crew> crews;
    @XmlElement(name = "MaterialItems")
    protected List<WorkTask.MaterialItems> materialItems;
    @XmlElement(name = "Names")
    protected List<Name> names;
    @XmlElement(name = "OldAsset")
    protected Asset oldAsset;
    @XmlElement(name = "TimeSchedules")
    protected List<WorkTimeSchedule> timeSchedules;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the crewETA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrewETA() {
        return crewETA;
    }

    /**
     * Sets the value of the crewETA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrewETA(XMLGregorianCalendar value) {
        this.crewETA = value;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the statusKind property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusKind }
     *     
     */
    public WorkStatusKind getStatusKind() {
        return statusKind;
    }

    /**
     * Sets the value of the statusKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusKind }
     *     
     */
    public void setStatusKind(WorkStatusKind value) {
        this.statusKind = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the taskKind property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTaskKind }
     *     
     */
    public WorkTaskKind getTaskKind() {
        return taskKind;
    }

    /**
     * Sets the value of the taskKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTaskKind }
     *     
     */
    public void setTaskKind(WorkTaskKind value) {
        this.taskKind = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asset }
     * 
     * 
     */
    public List<Asset> getAssets() {
        if (assets == null) {
            assets = new ArrayList<Asset>();
        }
        return this.assets;
    }

    /**
     * Gets the value of the crews property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crews property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Crew }
     * 
     * 
     */
    public List<Crew> getCrews() {
        if (crews == null) {
            crews = new ArrayList<Crew>();
        }
        return this.crews;
    }

    /**
     * Gets the value of the materialItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTask.MaterialItems }
     * 
     * 
     */
    public List<WorkTask.MaterialItems> getMaterialItems() {
        if (materialItems == null) {
            materialItems = new ArrayList<WorkTask.MaterialItems>();
        }
        return this.materialItems;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the oldAsset property.
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getOldAsset() {
        return oldAsset;
    }

    /**
     * Sets the value of the oldAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setOldAsset(Asset value) {
        this.oldAsset = value;
    }

    /**
     * Gets the value of the timeSchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTimeSchedule }
     * 
     * 
     */
    public List<WorkTimeSchedule> getTimeSchedules() {
        if (timeSchedules == null) {
            timeSchedules = new ArrayList<WorkTimeSchedule>();
        }
        return this.timeSchedules;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mRID" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}mRID" minOccurs="0"/>
     *         &lt;element name="Names" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Name" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="quantity" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="multiplier" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}UnitMultiplier" minOccurs="0"/>
     *                   &lt;element name="unit" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}UnitSymbol" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mrid",
        "names",
        "quantity"
    })
    public static class MaterialItems {

        @XmlElement(name = "mRID", namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#")
        protected String mrid;
        @XmlElement(name = "Names", namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#")
        protected List<Name> names;
        @XmlElement(namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#")
        protected WorkTask.MaterialItems.Quantity quantity;

        /**
         * Gets the value of the mrid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMRID() {
            return mrid;
        }

        /**
         * Sets the value of the mrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMRID(String value) {
            this.mrid = value;
        }

        /**
         * Gets the value of the names property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the names property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Name }
         * 
         * 
         */
        public List<Name> getNames() {
            if (names == null) {
                names = new ArrayList<Name>();
            }
            return this.names;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link WorkTask.MaterialItems.Quantity }
         *     
         */
        public WorkTask.MaterialItems.Quantity getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link WorkTask.MaterialItems.Quantity }
         *     
         */
        public void setQuantity(WorkTask.MaterialItems.Quantity value) {
            this.quantity = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="multiplier" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}UnitMultiplier" minOccurs="0"/>
         *         &lt;element name="unit" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}UnitSymbol" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "multiplier",
            "unit",
            "value"
        })
        public static class Quantity {

            @XmlElement(namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#")
            protected String multiplier;
            @XmlElement(namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#")
            protected String unit;
            @XmlElement(namespace = "http://iec.ch/TC57/2015/MaintenanceOrders#", required = true)
            protected BigInteger value;

            /**
             * Gets the value of the multiplier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMultiplier() {
                return multiplier;
            }

            /**
             * Sets the value of the multiplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMultiplier(String value) {
                this.multiplier = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                return unit;
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

        }

    }

}
