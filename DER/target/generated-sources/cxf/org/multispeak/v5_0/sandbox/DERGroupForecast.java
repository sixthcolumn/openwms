
package org.multispeak.v5_0.sandbox;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5.MspEvent;
import org.multispeak.v5_0.commontypes.Duration;


/**
 * <p>Java class for DERGroupForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupForecast">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="forecastDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="forecastInterval" type="{http://www.multispeak.org/V5.0/commonTypes}duration"/>
 *         &lt;element name="DERGroup" type="{http://www.multispeak.org/V5.0/sandbox}DERGroup"/>
 *         &lt;element name="DERGroupPredictions" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupPrediction" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupForecast", propOrder = {
    "forecastDate",
    "forecastInterval",
    "derGroup",
    "derGroupPredictions"
})
public class DERGroupForecast
    extends MspEvent
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar forecastDate;
    @XmlElement(required = true)
    protected Duration forecastInterval;
    @XmlElement(name = "DERGroup", required = true)
    protected DERGroup derGroup;
    @XmlElement(name = "DERGroupPredictions", required = true)
    protected List<DERGroupPrediction> derGroupPredictions;

    /**
     * Gets the value of the forecastDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastDate() {
        return forecastDate;
    }

    /**
     * Sets the value of the forecastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastDate(XMLGregorianCalendar value) {
        this.forecastDate = value;
    }

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
     * Gets the value of the derGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroup }
     *     
     */
    public DERGroup getDERGroup() {
        return derGroup;
    }

    /**
     * Sets the value of the derGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroup }
     *     
     */
    public void setDERGroup(DERGroup value) {
        this.derGroup = value;
    }

    /**
     * Gets the value of the derGroupPredictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroupPredictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroupPredictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroupPrediction }
     * 
     * 
     */
    public List<DERGroupPrediction> getDERGroupPredictions() {
        if (derGroupPredictions == null) {
            derGroupPredictions = new ArrayList<DERGroupPrediction>();
        }
        return this.derGroupPredictions;
    }

}
