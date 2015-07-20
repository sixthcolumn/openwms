
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for flowDemand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flowDemand">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="sourceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="flowDemandType" type="{http://www.multispeak.org/Version_4.1_Release}flowDemandType" />
 *       &lt;attribute name="occurrence" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowDemand", propOrder = {
    "value"
})
public class FlowDemand {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "sourceID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sourceID;
    @XmlAttribute(name = "flowDemandType")
    protected FlowDemandType flowDemandType;
    @XmlAttribute(name = "occurrence")
    @XmlSchemaType(name = "unsignedByte")
    protected Short occurrence;
    @XmlAttribute(name = "dateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceID(Long value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the flowDemandType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowDemandType }
     *     
     */
    public FlowDemandType getFlowDemandType() {
        return flowDemandType;
    }

    /**
     * Sets the value of the flowDemandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDemandType }
     *     
     */
    public void setFlowDemandType(FlowDemandType value) {
        this.flowDemandType = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOccurrence(Short value) {
        this.occurrence = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
