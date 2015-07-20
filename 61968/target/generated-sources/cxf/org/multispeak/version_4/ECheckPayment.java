
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eCheckPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eCheckPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkInfo" type="{http://www.multispeak.org/Version_4.1_Release}checkInfo" minOccurs="0"/>
 *         &lt;element name="tender" type="{http://www.multispeak.org/Version_4.1_Release}tender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eCheckPayment", propOrder = {
    "checkInfo",
    "tender"
})
public class ECheckPayment {

    protected CheckInfo checkInfo;
    protected Tender tender;

    /**
     * Gets the value of the checkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInfo }
     *     
     */
    public CheckInfo getCheckInfo() {
        return checkInfo;
    }

    /**
     * Sets the value of the checkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInfo }
     *     
     */
    public void setCheckInfo(CheckInfo value) {
        this.checkInfo = value;
    }

    /**
     * Gets the value of the tender property.
     * 
     * @return
     *     possible object is
     *     {@link Tender }
     *     
     */
    public Tender getTender() {
        return tender;
    }

    /**
     * Sets the value of the tender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tender }
     *     
     */
    public void setTender(Tender value) {
        this.tender = value;
    }

}
