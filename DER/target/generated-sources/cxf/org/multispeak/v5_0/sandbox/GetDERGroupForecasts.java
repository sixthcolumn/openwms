
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * This is the message payload for the message that
 * 				requests forecasts (or predicted values) of capabilities of
 * 				DERGroups over time intervals in the future.
 * 
 * <p>Java class for GetDERGroupForecasts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupForecasts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forecastInterval" type="{http://www.multispeak.org/V5.0/commonTypes}duration"/>
 *         &lt;element name="forecastPeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod"/>
 *         &lt;element name="DERGroup" type="{http://www.multispeak.org/V5.0/sandbox}DERGroup" maxOccurs="unbounded"/>
 *         &lt;element name="requestedCapabilities" type="{http://www.multispeak.org/V5.0/sandbox}requestedCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupForecasts", propOrder = {
    "forecastInterval",
    "forecastPeriod",
    "derGroup",
    "requestedCapabilities"
})
public class GetDERGroupForecasts {

    @XmlElement(required = true)
    protected Duration forecastInterval;
    @XmlElement(required = true)
    protected TimePeriod forecastPeriod;
    @XmlElement(name = "DERGroup", required = true)
    protected List<DERGroup> derGroup;
    @XmlElement(required = true)
    protected RequestedCapabilities requestedCapabilities;

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
     * Gets the value of the derGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroup }
     * 
     * 
     */
    public List<DERGroup> getDERGroup() {
        if (derGroup == null) {
            derGroup = new ArrayList<DERGroup>();
        }
        return this.derGroup;
    }

    /**
     * Gets the value of the requestedCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedCapabilities }
     *     
     */
    public RequestedCapabilities getRequestedCapabilities() {
        return requestedCapabilities;
    }

    /**
     * Sets the value of the requestedCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedCapabilities }
     *     
     */
    public void setRequestedCapabilities(RequestedCapabilities value) {
        this.requestedCapabilities = value;
    }

}
