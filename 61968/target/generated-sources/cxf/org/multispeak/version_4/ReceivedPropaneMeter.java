
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receivedPropaneMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedPropaneMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="propaneNameplate" type="{http://www.multispeak.org/Version_4.1_Release}propaneNameplate" minOccurs="0"/>
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
@XmlType(name = "receivedPropaneMeter", propOrder = {
    "propaneNameplate",
    "manufacturedDate",
    "purchasePrice"
})
public class ReceivedPropaneMeter
    extends MspMeter
{

    protected PropaneNameplate propaneNameplate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar manufacturedDate;
    protected Money purchasePrice;

    /**
     * Gets the value of the propaneNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneNameplate }
     *     
     */
    public PropaneNameplate getPropaneNameplate() {
        return propaneNameplate;
    }

    /**
     * Sets the value of the propaneNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneNameplate }
     *     
     */
    public void setPropaneNameplate(PropaneNameplate value) {
        this.propaneNameplate = value;
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
