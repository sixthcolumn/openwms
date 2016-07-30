
package com.sixthc.wsdl.der_request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.TimePeriod;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroup;
import org.multispeak.v5_0.sandboxarrays.ArrayOfRequestedCapability;
import org.multispeak.v5_0.ws.request.MultiSpeakRequestMsgHeader;


/**
 * <p>Java class for DERGroupForecastPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupForecastPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForeCastInterval" type="{http://www.multispeak.org/V5.0/commonTypes}duration"/>
 *         &lt;element name="ForeCastPeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod"/>
 *         &lt;element name="arrayOfDERGroup" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroup"/>
 *         &lt;element name="arrayOfRequestedCapability" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfRequestedCapability"/>
 *         &lt;element name="multiSpeakMsgHeader" type="{http://www.multispeak.org/V5.0/ws/request}MultiSpeakRequestMsgHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupForecastPayload", propOrder = {
    "address",
    "foreCastInterval",
    "foreCastPeriod",
    "arrayOfDERGroup",
    "arrayOfRequestedCapability",
    "multiSpeakMsgHeader"
})
public class DERGroupForecastPayload {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "ForeCastInterval", required = true)
    protected Duration foreCastInterval;
    @XmlElement(name = "ForeCastPeriod", required = true)
    protected TimePeriod foreCastPeriod;
    @XmlElement(required = true)
    protected ArrayOfDERGroup arrayOfDERGroup;
    @XmlElement(required = true)
    protected ArrayOfRequestedCapability arrayOfRequestedCapability;
    @XmlElement(required = true)
    protected MultiSpeakRequestMsgHeader multiSpeakMsgHeader;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the foreCastInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getForeCastInterval() {
        return foreCastInterval;
    }

    /**
     * Sets the value of the foreCastInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setForeCastInterval(Duration value) {
        this.foreCastInterval = value;
    }

    /**
     * Gets the value of the foreCastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getForeCastPeriod() {
        return foreCastPeriod;
    }

    /**
     * Sets the value of the foreCastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setForeCastPeriod(TimePeriod value) {
        this.foreCastPeriod = value;
    }

    /**
     * Gets the value of the arrayOfDERGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroup }
     *     
     */
    public ArrayOfDERGroup getArrayOfDERGroup() {
        return arrayOfDERGroup;
    }

    /**
     * Sets the value of the arrayOfDERGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroup }
     *     
     */
    public void setArrayOfDERGroup(ArrayOfDERGroup value) {
        this.arrayOfDERGroup = value;
    }

    /**
     * Gets the value of the arrayOfRequestedCapability property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRequestedCapability }
     *     
     */
    public ArrayOfRequestedCapability getArrayOfRequestedCapability() {
        return arrayOfRequestedCapability;
    }

    /**
     * Sets the value of the arrayOfRequestedCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRequestedCapability }
     *     
     */
    public void setArrayOfRequestedCapability(ArrayOfRequestedCapability value) {
        this.arrayOfRequestedCapability = value;
    }

    /**
     * Gets the value of the multiSpeakMsgHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSpeakRequestMsgHeader }
     *     
     */
    public MultiSpeakRequestMsgHeader getMultiSpeakMsgHeader() {
        return multiSpeakMsgHeader;
    }

    /**
     * Sets the value of the multiSpeakMsgHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSpeakRequestMsgHeader }
     *     
     */
    public void setMultiSpeakMsgHeader(MultiSpeakRequestMsgHeader value) {
        this.multiSpeakMsgHeader = value;
    }

}
