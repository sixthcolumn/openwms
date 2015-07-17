
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
 *         &lt;element name="GetDomainNamesResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfString" minOccurs="0"/>
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
    "getDomainNamesResult"
})
@XmlRootElement(name = "GetDomainNamesResponse")
public class GetDomainNamesResponse {

    @XmlElement(name = "GetDomainNamesResult")
    protected ArrayOfString getDomainNamesResult;

    /**
     * Gets the value of the getDomainNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetDomainNamesResult() {
        return getDomainNamesResult;
    }

    /**
     * Sets the value of the getDomainNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetDomainNamesResult(ArrayOfString value) {
        this.getDomainNamesResult = value;
    }

}
