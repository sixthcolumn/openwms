
package ch.iec.tc57._2015.maintenanceorders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="critical" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="utcNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Location" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkLocation" minOccurs="0" form="qualified"/>
 *         &lt;element name="Names" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Name" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="Procedures" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *                   &lt;element name="kind" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}ProcedureKind" form="qualified"/>
 *                   &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="Measurements" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="phases" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}PhaseCode" minOccurs="0" form="qualified"/>
 *                             &lt;element name="unitMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                             &lt;element name="unitSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "mrid",
    "critical",
    "utcNumber",
    "location",
    "names",
    "procedures"
})
public class Asset {

    @XmlElement(name = "mRID")
    protected String mrid;
    protected boolean critical;
    @XmlElement(required = true)
    protected String utcNumber;
    @XmlElement(name = "Location")
    protected WorkLocation location;
    @XmlElement(name = "Names")
    protected List<Name> names;
    @XmlElement(name = "Procedures")
    protected List<Asset.Procedures> procedures;

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
     * Gets the value of the critical property.
     * 
     */
    public boolean isCritical() {
        return critical;
    }

    /**
     * Sets the value of the critical property.
     * 
     */
    public void setCritical(boolean value) {
        this.critical = value;
    }

    /**
     * Gets the value of the utcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtcNumber() {
        return utcNumber;
    }

    /**
     * Sets the value of the utcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtcNumber(String value) {
        this.utcNumber = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocation }
     *     
     */
    public WorkLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocation }
     *     
     */
    public void setLocation(WorkLocation value) {
        this.location = value;
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
     * Gets the value of the procedures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asset.Procedures }
     * 
     * 
     */
    public List<Asset.Procedures> getProcedures() {
        if (procedures == null) {
            procedures = new ArrayList<Asset.Procedures>();
        }
        return this.procedures;
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
     *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
     *         &lt;element name="kind" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}ProcedureKind" form="qualified"/>
     *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="Measurements" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="phases" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}PhaseCode" minOccurs="0" form="qualified"/>
     *                   &lt;element name="unitMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *                   &lt;element name="unitSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
        "instruction",
        "kind",
        "sequenceNumber",
        "measurements"
    })
    public static class Procedures {

        @XmlElement(required = true)
        protected String instruction;
        @XmlElement(required = true)
        protected ProcedureKind kind;
        protected String sequenceNumber;
        @XmlElement(name = "Measurements")
        protected List<Asset.Procedures.Measurements> measurements;

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
         * Gets the value of the kind property.
         * 
         * @return
         *     possible object is
         *     {@link ProcedureKind }
         *     
         */
        public ProcedureKind getKind() {
            return kind;
        }

        /**
         * Sets the value of the kind property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcedureKind }
         *     
         */
        public void setKind(ProcedureKind value) {
            this.kind = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNumber(String value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the measurements property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measurements property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeasurements().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Asset.Procedures.Measurements }
         * 
         * 
         */
        public List<Asset.Procedures.Measurements> getMeasurements() {
            if (measurements == null) {
                measurements = new ArrayList<Asset.Procedures.Measurements>();
            }
            return this.measurements;
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
         *         &lt;element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="phases" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}PhaseCode" minOccurs="0" form="qualified"/>
         *         &lt;element name="unitMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
         *         &lt;element name="unitSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
            "measurementType",
            "phases",
            "unitMultiplier",
            "unitSymbol"
        })
        public static class Measurements {

            protected String measurementType;
            protected PhaseCode phases;
            protected String unitMultiplier;
            protected String unitSymbol;

            /**
             * Gets the value of the measurementType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeasurementType() {
                return measurementType;
            }

            /**
             * Sets the value of the measurementType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMeasurementType(String value) {
                this.measurementType = value;
            }

            /**
             * Gets the value of the phases property.
             * 
             * @return
             *     possible object is
             *     {@link PhaseCode }
             *     
             */
            public PhaseCode getPhases() {
                return phases;
            }

            /**
             * Sets the value of the phases property.
             * 
             * @param value
             *     allowed object is
             *     {@link PhaseCode }
             *     
             */
            public void setPhases(PhaseCode value) {
                this.phases = value;
            }

            /**
             * Gets the value of the unitMultiplier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitMultiplier() {
                return unitMultiplier;
            }

            /**
             * Sets the value of the unitMultiplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitMultiplier(String value) {
                this.unitMultiplier = value;
            }

            /**
             * Gets the value of the unitSymbol property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitSymbol() {
                return unitSymbol;
            }

            /**
             * Sets the value of the unitSymbol property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitSymbol(String value) {
                this.unitSymbol = value;
            }

        }

    }

}
