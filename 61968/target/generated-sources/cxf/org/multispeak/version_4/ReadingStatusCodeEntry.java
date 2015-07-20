
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingStatusCodeEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingStatusCodeEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readingStatusCode" type="{http://www.multispeak.org/Version_4.1_Release}readingStatusCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingStatusCodeEntry", propOrder = {
    "description",
    "readingStatusCode"
})
public class ReadingStatusCodeEntry {

    protected String description;
    protected ReadingStatusCode readingStatusCode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the readingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingStatusCode }
     *     
     */
    public ReadingStatusCode getReadingStatusCode() {
        return readingStatusCode;
    }

    /**
     * Sets the value of the readingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingStatusCode }
     *     
     */
    public void setReadingStatusCode(ReadingStatusCode value) {
        this.readingStatusCode = value;
    }

}
