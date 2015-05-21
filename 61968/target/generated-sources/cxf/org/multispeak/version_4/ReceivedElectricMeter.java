
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receivedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedElectricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="electricNameplate" type="{http://www.multispeak.org/Version_4.1_Release}electricNameplate" minOccurs="0"/>
 *         &lt;element name="manufacturedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchasePrice" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
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
@XmlType(name = "receivedElectricMeter", propOrder = {
    "electricNameplate",
    "manufacturedDate",
    "purchasePrice"
})
@XmlSeeAlso({
    TestedElectricMeter.class
})
public class ReceivedElectricMeter
    extends MspMeter
{

    protected ElectricNameplate electricNameplate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar manufacturedDate;
    protected Money purchasePrice;

    /**
     * Gets the value of the electricNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricNameplate }
     *     
     */
    public ElectricNameplate getElectricNameplate() {
        return electricNameplate;
    }

    /**
     * Sets the value of the electricNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricNameplate }
     *     
     */
    public void setElectricNameplate(ElectricNameplate value) {
        this.electricNameplate = value;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufacturedDate(XMLGregorianCalendar value) {
        this.manufacturedDate = value;
    }

    /**
     * Gets the value of the purchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Sets the value of the purchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPurchasePrice(Money value) {
        this.purchasePrice = value;
    }

}
