
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageReportingCodeList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOutageReportingCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReason", propOrder = {
    "description",
    "outageReportingCodeList"
})
public class OutageReason {

    protected String description;
    protected ArrayOfOutageReportingCode outageReportingCodeList;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the outageReportingCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageReportingCode }
     *     
     */
    public ArrayOfOutageReportingCode getOutageReportingCodeList() {
        return outageReportingCodeList;
    }

    /**
     * Sets the value of the outageReportingCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageReportingCode }
     *     
     */
    public void setOutageReportingCodeList(ArrayOfOutageReportingCode value) {
        this.outageReportingCodeList = value;
    }

}
