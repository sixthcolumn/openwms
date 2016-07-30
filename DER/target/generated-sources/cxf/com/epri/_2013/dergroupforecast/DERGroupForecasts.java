
package com.epri._2013.dergroupforecast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DERGroupForecasts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupForecasts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupForecast" type="{http://www.epri.com/2013/DERGroupForecast#}DERGroupForecast" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupForecasts", propOrder = {
    "derGroupForecast"
})
public class DERGroupForecasts {

    @XmlElement(name = "DERGroupForecast", required = true)
    protected List<DERGroupForecast> derGroupForecast;

    /**
     * Gets the value of the derGroupForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroupForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroupForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroupForecast }
     * 
     * 
     */
    public List<DERGroupForecast> getDERGroupForecast() {
        if (derGroupForecast == null) {
            derGroupForecast = new ArrayList<DERGroupForecast>();
        }
        return this.derGroupForecast;
    }

}
