
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for laborCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="laborCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installCost" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="retireCost" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="salvageCost" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="transferCost" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
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
@XmlType(name = "laborCategory", propOrder = {
    "description",
    "installCost",
    "retireCost",
    "salvageCost",
    "transferCost"
})
public class LaborCategory
    extends MspObject
{

    protected String description;
    protected Money installCost;
    protected Money retireCost;
    protected Money salvageCost;
    protected Money transferCost;

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
     * Gets the value of the installCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInstallCost() {
        return installCost;
    }

    /**
     * Sets the value of the installCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInstallCost(Money value) {
        this.installCost = value;
    }

    /**
     * Gets the value of the retireCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getRetireCost() {
        return retireCost;
    }

    /**
     * Sets the value of the retireCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setRetireCost(Money value) {
        this.retireCost = value;
    }

    /**
     * Gets the value of the salvageCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSalvageCost() {
        return salvageCost;
    }

    /**
     * Sets the value of the salvageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSalvageCost(Money value) {
        this.salvageCost = value;
    }

    /**
     * Gets the value of the transferCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTransferCost() {
        return transferCost;
    }

    /**
     * Sets the value of the transferCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTransferCost(Money value) {
        this.transferCost = value;
    }

}
