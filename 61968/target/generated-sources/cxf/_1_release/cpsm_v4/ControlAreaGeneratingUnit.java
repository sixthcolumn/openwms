
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlAreaGeneratingUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlAreaGeneratingUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="controlAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generatingUnitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ControlAreaGeneratingUnit", propOrder = {
    "controlAreaID",
    "generatingUnitID"
})
public class ControlAreaGeneratingUnit
    extends MspCIMObject
{

    protected String controlAreaID;
    protected String generatingUnitID;

    /**
     * Gets the value of the controlAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlAreaID() {
        return controlAreaID;
    }

    /**
     * Sets the value of the controlAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlAreaID(String value) {
        this.controlAreaID = value;
    }

    /**
     * Gets the value of the generatingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratingUnitID() {
        return generatingUnitID;
    }

    /**
     * Sets the value of the generatingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratingUnitID(String value) {
        this.generatingUnitID = value;
    }

}
