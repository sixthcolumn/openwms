
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ppmMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="ppmLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outMeterRead" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
 *         &lt;element name="inMeterRead" type="{http://www.multispeak.org/Version_4.1_Release}meterReading" minOccurs="0"/>
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
@XmlType(name = "ppmMeterExchange", propOrder = {
    "ppmLocationID",
    "outMeterRead",
    "inMeterRead"
})
public class PpmMeterExchange
    extends MspObject
{

    protected String ppmLocationID;
    protected MeterReading outMeterRead;
    protected MeterReading inMeterRead;

    /**
     * Gets the value of the ppmLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpmLocationID() {
        return ppmLocationID;
    }

    /**
     * Sets the value of the ppmLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpmLocationID(String value) {
        this.ppmLocationID = value;
    }

    /**
     * Gets the value of the outMeterRead property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getOutMeterRead() {
        return outMeterRead;
    }

    /**
     * Sets the value of the outMeterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setOutMeterRead(MeterReading value) {
        this.outMeterRead = value;
    }

    /**
     * Gets the value of the inMeterRead property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getInMeterRead() {
        return inMeterRead;
    }

    /**
     * Sets the value of the inMeterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setInMeterRead(MeterReading value) {
        this.inMeterRead = value;
    }

}
