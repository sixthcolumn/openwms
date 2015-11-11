
package ch.iec.tc57._2015.maintenanceorders;

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
 * <p>Java class for Work complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="kind" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkKind" form="qualified"/>
 *         &lt;element name="lastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="requestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="statusKind" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkStatusKind" form="qualified"/>
 *         &lt;element name="ActivityRecords" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}ActivityRecord" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="Names" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Name" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="priority" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="justification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                   &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TimeSchedules" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkTimeSchedule" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkLocation" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkLocation" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkTasks" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}WorkTask" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="Attachments" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attachment" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Attachment" maxOccurs="unbounded" form="qualified"/>
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
@XmlType(name = "Work", propOrder = {
    "mrid",
    "kind",
    "lastModifiedDateTime",
    "requestDateTime",
    "statusKind",
    "activityRecords",
    "names",
    "priority",
    "timeSchedules",
    "workLocation",
    "workTasks",
    "attachments"
})
public class Work {

    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlElement(required = true)
    protected WorkKind kind;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDateTime;
    @XmlElement(required = true)
    protected WorkStatusKind statusKind;
    @XmlElement(name = "ActivityRecords")
    protected List<ActivityRecord> activityRecords;
    @XmlElement(name = "Names")
    protected List<Name> names;
    protected Work.Priority priority;
    @XmlElement(name = "TimeSchedules")
    protected List<WorkTimeSchedule> timeSchedules;
    @XmlElement(name = "WorkLocation")
    protected WorkLocation workLocation;
    @XmlElement(name = "WorkTasks")
    protected List<WorkTask> workTasks;
    @XmlElement(name = "Attachments")
    protected Work.Attachments attachments;

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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link WorkKind }
     *     
     */
    public WorkKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkKind }
     *     
     */
    public void setKind(WorkKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateTime(XMLGregorianCalendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the requestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Sets the value of the requestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDateTime(XMLGregorianCalendar value) {
        this.requestDateTime = value;
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
     * Gets the value of the activityRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityRecord }
     * 
     * 
     */
    public List<ActivityRecord> getActivityRecords() {
        if (activityRecords == null) {
            activityRecords = new ArrayList<ActivityRecord>();
        }
        return this.activityRecords;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Work.Priority }
     *     
     */
    public Work.Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work.Priority }
     *     
     */
    public void setPriority(Work.Priority value) {
        this.priority = value;
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
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocation }
     *     
     */
    public WorkLocation getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocation }
     *     
     */
    public void setWorkLocation(WorkLocation value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the workTasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workTasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTask }
     * 
     * 
     */
    public List<WorkTask> getWorkTasks() {
        if (workTasks == null) {
            workTasks = new ArrayList<WorkTask>();
        }
        return this.workTasks;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Work.Attachments }
     *     
     */
    public Work.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work.Attachments }
     *     
     */
    public void setAttachments(Work.Attachments value) {
        this.attachments = value;
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
     *         &lt;element name="Attachment" type="{http://iec.ch/TC57/2015/MaintenanceOrders#}Attachment" maxOccurs="unbounded" form="qualified"/>
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
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Attachment", required = true)
        protected List<Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Attachment }
         * 
         * 
         */
        public List<Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<Attachment>();
            }
            return this.attachment;
        }

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
     *         &lt;element name="justification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
     *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}integer" form="qualified"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
        "justification",
        "rank",
        "type"
    })
    public static class Priority {

        protected String justification;
        @XmlElement(required = true)
        protected BigInteger rank;
        protected String type;

        /**
         * Gets the value of the justification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustification() {
            return justification;
        }

        /**
         * Sets the value of the justification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustification(String value) {
            this.justification = value;
        }

        /**
         * Gets the value of the rank property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRank() {
            return rank;
        }

        /**
         * Sets the value of the rank property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRank(BigInteger value) {
            this.rank = value;
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

    }

}
