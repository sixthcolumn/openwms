
package org.multispeak.version_4;

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
 *         &lt;element name="GetProjectResult" type="{http://www.multispeak.org/Version_4.1_Release}project" minOccurs="0"/>
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
    "getProjectResult"
})
@XmlRootElement(name = "GetProjectResponse")
public class GetProjectResponse {

    @XmlElement(name = "GetProjectResult")
    protected Project getProjectResult;

    /**
     * Gets the value of the getProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getGetProjectResult() {
        return getProjectResult;
    }

    /**
     * Sets the value of the getProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setGetProjectResult(Project value) {
        this.getProjectResult = value;
    }

}
