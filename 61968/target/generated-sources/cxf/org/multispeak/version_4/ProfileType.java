
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="dataSetNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="channelList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfChannel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileType", propOrder = {
    "meterID",
    "dataSetNumber",
    "channelList"
})
public class ProfileType {

    protected MeterID meterID;
    @XmlSchemaType(name = "unsignedByte")
    protected Short dataSetNumber;
    protected ArrayOfChannel channelList;

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the dataSetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDataSetNumber() {
        return dataSetNumber;
    }

    /**
     * Sets the value of the dataSetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDataSetNumber(Short value) {
        this.dataSetNumber = value;
    }

    /**
     * Gets the value of the channelList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannel }
     *     
     */
    public ArrayOfChannel getChannelList() {
        return channelList;
    }

    /**
     * Sets the value of the channelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannel }
     *     
     */
    public void setChannelList(ArrayOfChannel value) {
        this.channelList = value;
    }

}
