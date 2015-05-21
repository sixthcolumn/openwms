
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetOutageEventStatusResult" type="{http://www.multispeak.org/Version_3.0}outageEventStatus" minOccurs="0"/>
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
    "getOutageEventStatusResult"
})
@XmlRootElement(name = "GetOutageEventStatusResponse")
public class GetOutageEventStatusResponse {

    @XmlElement(name = "GetOutageEventStatusResult")
    protected OutageEventStatus getOutageEventStatusResult;

    /**
     * Gets the value of the getOutageEventStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link OutageEventStatus }
     *     
     */
    public OutageEventStatus getGetOutageEventStatusResult() {
        return getOutageEventStatusResult;
    }

    /**
     * Sets the value of the getOutageEventStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageEventStatus }
     *     
     */
    public void setGetOutageEventStatusResult(OutageEventStatus value) {
        this.getOutageEventStatusResult = value;
    }

}
