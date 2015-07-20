
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intervalProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intervalLength" type="{http://www.multispeak.org/Version_4.1_Release}duration" minOccurs="0"/>
 *         &lt;element name="channels" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfIntervalChannel" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="profileID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalProfile", propOrder = {
    "name",
    "intervalLength",
    "channels"
})
public class IntervalProfile {

    protected String name;
    protected Duration intervalLength;
    protected ArrayOfIntervalChannel channels;
    @XmlAttribute(name = "profileID")
    protected String profileID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the intervalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getIntervalLength() {
        return intervalLength;
    }

    /**
     * Sets the value of the intervalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setIntervalLength(Duration value) {
        this.intervalLength = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIntervalChannel }
     *     
     */
    public ArrayOfIntervalChannel getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIntervalChannel }
     *     
     */
    public void setChannels(ArrayOfIntervalChannel value) {
        this.channels = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

}
