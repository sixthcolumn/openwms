
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingScheduleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingScheduleResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingScheduleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.multispeak.org/Version_4.1_Release}readingSchedulingResult"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingScheduleResult", propOrder = {
    "readingScheduleID",
    "result",
    "reason"
})
public class ReadingScheduleResult {

    protected String readingScheduleID;
    @XmlElement(required = true)
    protected ReadingSchedulingResult result;
    protected String reason;

    /**
     * Gets the value of the readingScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingScheduleID() {
        return readingScheduleID;
    }

    /**
     * Sets the value of the readingScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingScheduleID(String value) {
        this.readingScheduleID = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingSchedulingResult }
     *     
     */
    public ReadingSchedulingResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingSchedulingResult }
     *     
     */
    public void setResult(ReadingSchedulingResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
