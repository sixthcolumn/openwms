
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
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="formattedBlockTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="lastReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "meterID",
    "formattedBlockTemplateName",
    "fieldName",
    "lastReceived"
})
@XmlRootElement(name = "GetLatestReadingByMeterIDAndFieldName")
public class GetLatestReadingByMeterIDAndFieldName {

    protected MeterID meterID;
    protected String formattedBlockTemplateName;
    protected ArrayOfString fieldName;
    protected String lastReceived;

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the formattedBlockTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedBlockTemplateName() {
        return formattedBlockTemplateName;
    }

    /**
     * Sets the value of the formattedBlockTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedBlockTemplateName(String value) {
        this.formattedBlockTemplateName = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFieldName(ArrayOfString value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the lastReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReceived() {
        return lastReceived;
    }

    /**
     * Sets the value of the lastReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReceived(String value) {
        this.lastReceived = value;
    }

}
