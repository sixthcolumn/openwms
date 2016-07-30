
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDERGroupForecastsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDERGroupForecastsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupForecasts" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupForecasts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDERGroupForecastsResponse", propOrder = {
    "derGroupForecasts"
})
public class GetDERGroupForecastsResponse {

    @XmlElement(name = "DERGroupForecasts")
    protected DERGroupForecasts derGroupForecasts;

    /**
     * Gets the value of the derGroupForecasts property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupForecasts }
     *     
     */
    public DERGroupForecasts getDERGroupForecasts() {
        return derGroupForecasts;
    }

    /**
     * Sets the value of the derGroupForecasts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupForecasts }
     *     
     */
    public void setDERGroupForecasts(DERGroupForecasts value) {
        this.derGroupForecasts = value;
    }

}
