
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="retiredMeters" type="{http://www.multispeak.org/Version_4.1_Release}meters" minOccurs="0"/>
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
    "retiredMeters"
})
@XmlRootElement(name = "MeterRetireNotification")
public class MeterRetireNotification {

    protected Meters retiredMeters;

    /**
     * Gets the value of the retiredMeters property.
     * 
     * @return
     *     possible object is
     *     {@link Meters }
     *     
     */
    public Meters getRetiredMeters() {
        return retiredMeters;
    }

    /**
     * Sets the value of the retiredMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters }
     *     
     */
    public void setRetiredMeters(Meters value) {
        this.retiredMeters = value;
    }

}
