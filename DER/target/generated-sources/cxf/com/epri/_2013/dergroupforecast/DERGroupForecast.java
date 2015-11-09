
package com.epri._2013.dergroupforecast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DERGroupForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroup" type="{http://www.epri.com/2013/DERGroupForecast#}DERGroup"/>
 *         &lt;element name="TimeInterval" type="{http://www.epri.com/2013/DERGroupForecast#}TimeInterval"/>
 *         &lt;element name="forecastBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="forecastEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestedCapability" type="{http://www.epri.com/2013/DERGroupForecast#}RequestedCapability"/>
 *         &lt;element name="extensionsList" type="{http://www.epri.com/2013/DERGroupForecast#}extensionsList" minOccurs="0"/>
 *         &lt;element name="Names" type="{http://www.epri.com/2013/DERGroupForecast#}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherCapability" type="{http://www.epri.com/2013/DERGroupForecast#}otherCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupForecast", propOrder = {
    "derGroup",
    "timeInterval",
    "forecastBegin",
    "forecastEnd",
    "requestedCapability",
    "extensionsList",
    "names",
    "mrid",
    "otherCapability"
})
public class DERGroupForecast {

    @XmlElement(name = "DERGroup", required = true)
    protected DERGroup derGroup;
    @XmlElement(name = "TimeInterval", required = true)
    protected TimeInterval timeInterval;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastBegin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastEnd;
    @XmlElement(name = "RequestedCapability", required = true)
    protected RequestedCapability requestedCapability;
    protected ExtensionsList extensionsList;
    @XmlElement(name = "Names")
    protected List<Name> names;
    @XmlElement(name = "mRID")
    protected String mrid;
    protected OtherCapability otherCapability;

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
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setTimeInterval(TimeInterval value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the forecastBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastBegin() {
        return forecastBegin;
    }

    /**
     * Sets the value of the forecastBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastBegin(XMLGregorianCalendar value) {
        this.forecastBegin = value;
    }

    /**
     * Gets the value of the forecastEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastEnd() {
        return forecastEnd;
    }

    /**
     * Sets the value of the forecastEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastEnd(XMLGregorianCalendar value) {
        this.forecastEnd = value;
    }

    /**
     * Gets the value of the requestedCapability property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedCapability }
     *     
     */
    public RequestedCapability getRequestedCapability() {
        return requestedCapability;
    }

    /**
     * Sets the value of the requestedCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedCapability }
     *     
     */
    public void setRequestedCapability(RequestedCapability value) {
        this.requestedCapability = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the otherCapability property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCapability }
     *     
     */
    public OtherCapability getOtherCapability() {
        return otherCapability;
    }

    /**
     * Sets the value of the otherCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCapability }
     *     
     */
    public void setOtherCapability(OtherCapability value) {
        this.otherCapability = value;
    }

}
