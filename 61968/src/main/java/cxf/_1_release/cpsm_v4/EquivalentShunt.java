
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquivalentShunt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentShunt">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}EquivalentEquipment">
 *       &lt;sequence>
 *         &lt;element name="g" type="{cpsm_V4.1_Release}conductance" minOccurs="0"/>
 *         &lt;element name="b" type="{cpsm_V4.1_Release}susceptance" minOccurs="0"/>
 *         &lt;element name="equivalentNetworkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EquivalentShunt", propOrder = {
    "g",
    "b",
    "equivalentNetworkID"
})
public class EquivalentShunt
    extends EquivalentEquipment
{

    protected Conductance g;
    protected Susceptance b;
    protected String equivalentNetworkID;

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link Conductance }
     *     
     */
    public Conductance getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conductance }
     *     
     */
    public void setG(Conductance value) {
        this.g = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link Susceptance }
     *     
     */
    public Susceptance getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link Susceptance }
     *     
     */
    public void setB(Susceptance value) {
        this.b = value;
    }

    /**
     * Gets the value of the equivalentNetworkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentNetworkID() {
        return equivalentNetworkID;
    }

    /**
     * Sets the value of the equivalentNetworkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentNetworkID(String value) {
        this.equivalentNetworkID = value;
    }

}
