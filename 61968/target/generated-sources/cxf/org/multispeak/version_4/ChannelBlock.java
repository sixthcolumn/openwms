
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for channelBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channelBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.multispeak.org/Version_4.1_Release}blockStatus" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://www.multispeak.org/Version_4.1_Release}interval" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="endTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="intervalPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="endReading" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="endPulse" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelBlock", propOrder = {
    "status",
    "interval"
})
public class ChannelBlock {

    protected BlockStatus status;
    protected List<Interval> interval;
    @XmlAttribute(name = "endTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlAttribute(name = "intervalPeriod", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long intervalPeriod;
    @XmlAttribute(name = "endReading")
    protected Double endReading;
    @XmlAttribute(name = "endPulse")
    @XmlSchemaType(name = "unsignedInt")
    protected Long endPulse;
    @XmlAttribute(name = "sequenceNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNumber;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BlockStatus }
     *     
     */
    public BlockStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockStatus }
     *     
     */
    public void setStatus(BlockStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interval }
     * 
     * 
     */
    public List<Interval> getInterval() {
        if (interval == null) {
            interval = new ArrayList<Interval>();
        }
        return this.interval;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the intervalPeriod property.
     * 
     */
    public long getIntervalPeriod() {
        return intervalPeriod;
    }

    /**
     * Sets the value of the intervalPeriod property.
     * 
     */
    public void setIntervalPeriod(long value) {
        this.intervalPeriod = value;
    }

    /**
     * Gets the value of the endReading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEndReading() {
        return endReading;
    }

    /**
     * Sets the value of the endReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEndReading(Double value) {
        this.endReading = value;
    }

    /**
     * Gets the value of the endPulse property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndPulse() {
        return endPulse;
    }

    /**
     * Sets the value of the endPulse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndPulse(Long value) {
        this.endPulse = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

}
