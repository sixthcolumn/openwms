
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receivedGasMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedGasMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="gasNameplate" type="{http://www.multispeak.org/Version_4.1_Release}gasNameplate" minOccurs="0"/>
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
@XmlType(name = "receivedGasMeter", propOrder = {
    "gasNameplate",
    "manufacturedDate",
    "purchasePrice"
})
public class ReceivedGasMeter
    extends MspMeter
{

    protected GasNameplate gasNameplate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar manufacturedDate;
    protected Money purchasePrice;

    /**
     * Gets the value of the gasNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link GasNameplate }
     *     
     */
    public GasNameplate getGasNameplate() {
        return gasNameplate;
    }

    /**
     * Sets the value of the gasNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasNameplate }
     *     
     */
    public void setGasNameplate(GasNameplate value) {
        this.gasNameplate = value;
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
