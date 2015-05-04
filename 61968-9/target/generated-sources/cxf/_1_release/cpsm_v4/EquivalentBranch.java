
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquivalentBranch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentBranch">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}EquivalentEquipment">
 *       &lt;sequence>
 *         &lt;element name="r" type="{cpsm_V4.1_Release}resistance" minOccurs="0"/>
 *         &lt;element name="x" type="{cpsm_V4.1_Release}reactance" minOccurs="0"/>
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
@XmlType(name = "EquivalentBranch", propOrder = {
    "r",
    "x",
    "equivalentNetworkID"
})
public class EquivalentBranch
    extends EquivalentEquipment
{

    protected Resistance r;
    protected Reactance x;
    protected String equivalentNetworkID;

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setR(Resistance value) {
        this.r = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setX(Reactance value) {
        this.x = value;
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
