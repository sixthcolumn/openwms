
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for cumDemand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cumDemand">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="sourceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="cumDemandType" type="{http://www.multispeak.org/Version_4.1_Release}cumDemandType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cumDemand", propOrder = {
    "value"
})
public class CumDemand {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "sourceID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sourceID;
    @XmlAttribute(name = "cumDemandType")
    protected CumDemandType cumDemandType;

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
     * Gets the value of the cumDemandType property.
     * 
     * @return
     *     possible object is
     *     {@link CumDemandType }
     *     
     */
    public CumDemandType getCumDemandType() {
        return cumDemandType;
    }

    /**
     * Sets the value of the cumDemandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumDemandType }
     *     
     */
    public void setCumDemandType(CumDemandType value) {
        this.cumDemandType = value;
    }

}
