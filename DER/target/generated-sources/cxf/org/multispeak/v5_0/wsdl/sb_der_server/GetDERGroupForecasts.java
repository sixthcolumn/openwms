
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.TimePeriod;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroup;
import org.multispeak.v5_0.sandboxarrays.ArrayOfRequestedCapability;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forecastInterval" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="forecastPeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="ArrayOfDERGroup" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroup" minOccurs="0"/>
 *         &lt;element name="ArrayOfRequestedCapability" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfRequestedCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "forecastInterval",
    "forecastPeriod",
    "arrayOfDERGroup",
    "arrayOfRequestedCapability"
})
@XmlRootElement(name = "GetDERGroupForecasts")
public class GetDERGroupForecasts {

    protected Duration forecastInterval;
    protected TimePeriod forecastPeriod;
    @XmlElement(name = "ArrayOfDERGroup")
    protected ArrayOfDERGroup arrayOfDERGroup;
    @XmlElement(name = "ArrayOfRequestedCapability")
    protected ArrayOfRequestedCapability arrayOfRequestedCapability;

    /**
     * Gets the value of the forecastInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getForecastInterval() {
        return forecastInterval;
    }

    /**
     * Sets the value of the forecastInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setForecastInterval(Duration value) {
        this.forecastInterval = value;
    }

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Sets the value of the forecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setForecastPeriod(TimePeriod value) {
        this.forecastPeriod = value;
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

}
