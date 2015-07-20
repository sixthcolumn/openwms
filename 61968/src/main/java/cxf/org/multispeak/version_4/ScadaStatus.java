
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for scadaStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="quality" type="{http://www.multispeak.org/Version_4.1_Release}qualityDescription" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.multispeak.org/Version_4.1_Release}statusIdentifiers" minOccurs="0"/>
 *         &lt;element name="changeCounter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scadaStatus", propOrder = {
    "quality",
    "status",
    "changeCounter",
    "timeStamp"
})
public class ScadaStatus
    extends MspObject
{

    protected QualityDescription quality;
    protected StatusIdentifiers status;
    protected Long changeCounter;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDescription }
     *     
     */
    public QualityDescription getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDescription }
     *     
     */
    public void setQuality(QualityDescription value) {
        this.quality = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusIdentifiers }
     *     
     */
    public StatusIdentifiers getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusIdentifiers }
     *     
     */
    public void setStatus(StatusIdentifiers value) {
        this.status = value;
    }

    /**
     * Gets the value of the changeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeCounter() {
        return changeCounter;
    }

    /**
     * Sets the value of the changeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeCounter(Long value) {
        this.changeCounter = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
