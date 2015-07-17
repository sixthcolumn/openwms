
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intervalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intervalDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profiles" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalProfile" minOccurs="0"/>
 *         &lt;element name="blocks" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalBlock" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalData", propOrder = {
    "statusDelimiter",
    "intervalDelimiter",
    "comment",
    "profiles",
    "blocks"
})
public class IntervalData {

    protected String statusDelimiter;
    protected String intervalDelimiter;
    protected String comment;
    protected ArrayOfIntervalProfile profiles;
    protected ArrayOfIntervalBlock blocks;

    /**
     * Gets the value of the statusDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDelimiter() {
        return statusDelimiter;
    }

    /**
     * Sets the value of the statusDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDelimiter(String value) {
        this.statusDelimiter = value;
    }

    /**
     * Gets the value of the intervalDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalDelimiter() {
        return intervalDelimiter;
    }

    /**
     * Sets the value of the intervalDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalDelimiter(String value) {
        this.intervalDelimiter = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalProfile }
     *     
     */
    public ArrayOfIntervalProfile getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalProfile }
     *     
     */
    public void setProfiles(ArrayOfIntervalProfile value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the blocks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalBlock }
     *     
     */
    public ArrayOfIntervalBlock getBlocks() {
        return blocks;
    }

    /**
     * Sets the value of the blocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalBlock }
     *     
     */
    public void setBlocks(ArrayOfIntervalBlock value) {
        this.blocks = value;
    }

}
