
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for electricMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outMeterReading" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
 *         &lt;element name="inMeterReading" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
 *         &lt;element name="lastRead" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
 *         &lt;element name="lastReadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="averageConsumption" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfConsumptionItem" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricMeterExchange", propOrder = {
    "serviceLocationID",
    "electricServiceID",
    "outMeterReading",
    "inMeterReading",
    "lastRead",
    "lastReadDate",
    "averageConsumption"
})
public class ElectricMeterExchange
    extends MspObject
{

    protected String serviceLocationID;
    protected String electricServiceID;
    protected MeterReading outMeterReading;
    protected MeterReading inMeterReading;
    protected MeterReading lastRead;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReadDate;
    protected ArrayOfConsumptionItem averageConsumption;

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the electricServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectricServiceID() {
        return electricServiceID;
    }

    /**
     * Sets the value of the electricServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricServiceID(String value) {
        this.electricServiceID = value;
    }

    /**
     * Gets the value of the outMeterReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getOutMeterReading() {
        return outMeterReading;
    }

    /**
     * Sets the value of the outMeterReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setOutMeterReading(MeterReading value) {
        this.outMeterReading = value;
    }

    /**
     * Gets the value of the inMeterReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getInMeterReading() {
        return inMeterReading;
    }

    /**
     * Sets the value of the inMeterReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setInMeterReading(MeterReading value) {
        this.inMeterReading = value;
    }

    /**
     * Gets the value of the lastRead property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getLastRead() {
        return lastRead;
    }

    /**
     * Sets the value of the lastRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setLastRead(MeterReading value) {
        this.lastRead = value;
    }

    /**
     * Gets the value of the lastReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReadDate() {
        return lastReadDate;
    }

    /**
     * Sets the value of the lastReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReadDate(XMLGregorianCalendar value) {
        this.lastReadDate = value;
    }

    /**
     * Gets the value of the averageConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConsumptionItem }
     *     
     */
    public ArrayOfConsumptionItem getAverageConsumption() {
        return averageConsumption;
    }

    /**
     * Sets the value of the averageConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConsumptionItem }
     *     
     */
    public void setAverageConsumption(ArrayOfConsumptionItem value) {
        this.averageConsumption = value;
    }

}
