
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupForecast;


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
 *         &lt;element name="ArrayOfDERGroupForecast" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroupForecast" minOccurs="0"/>
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
    "arrayOfDERGroupForecast"
})
@XmlRootElement(name = "GetDERGroupForecastsResponse")
public class GetDERGroupForecastsResponse {

    @XmlElement(name = "ArrayOfDERGroupForecast")
    protected ArrayOfDERGroupForecast arrayOfDERGroupForecast;

    /**
     * Gets the value of the arrayOfDERGroupForecast property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroupForecast }
     *     
     */
    public ArrayOfDERGroupForecast getArrayOfDERGroupForecast() {
        return arrayOfDERGroupForecast;
    }

    /**
     * Sets the value of the arrayOfDERGroupForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroupForecast }
     *     
     */
    public void setArrayOfDERGroupForecast(ArrayOfDERGroupForecast value) {
        this.arrayOfDERGroupForecast = value;
    }

}
