
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfChannelBlock" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="intervalSourceID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="endReadingSourceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="channelNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel", propOrder = {
    "blockList"
})
public class Channel {

    protected ArrayOfChannelBlock blockList;
    @XmlAttribute(name = "intervalSourceID", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long intervalSourceID;
    @XmlAttribute(name = "endReadingSourceID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long endReadingSourceID;
    @XmlAttribute(name = "channelNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected Long channelNumber;

    /**
     * Gets the value of the blockList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannelBlock }
     *     
     */
    public ArrayOfChannelBlock getBlockList() {
        return blockList;
    }

    /**
     * Sets the value of the blockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannelBlock }
     *     
     */
    public void setBlockList(ArrayOfChannelBlock value) {
        this.blockList = value;
    }

    /**
     * Gets the value of the intervalSourceID property.
     * 
     */
    public long getIntervalSourceID() {
        return intervalSourceID;
    }

    /**
     * Sets the value of the intervalSourceID property.
     * 
     */
    public void setIntervalSourceID(long value) {
        this.intervalSourceID = value;
    }

    /**
     * Gets the value of the endReadingSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndReadingSourceID() {
        return endReadingSourceID;
    }

    /**
     * Sets the value of the endReadingSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndReadingSourceID(Long value) {
        this.endReadingSourceID = value;
    }

    /**
     * Gets the value of the channelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getChannelNumber() {
        if (channelNumber == null) {
            return  0L;
        } else {
            return channelNumber;
        }
    }

    /**
     * Sets the value of the channelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelNumber(Long value) {
        this.channelNumber = value;
    }

}
