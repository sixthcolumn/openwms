
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}RegularIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="lineDropCompensation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lineDropR" type="{cpsm_V4.1_Release}resistance" minOccurs="0"/>
 *         &lt;element name="lineDropX" type="{cpsm_V4.1_Release}reactance" minOccurs="0"/>
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
@XmlType(name = "RegulationSchedule", propOrder = {
    "lineDropCompensation",
    "lineDropR",
    "lineDropX"
})
public class RegulationSchedule
    extends RegularIntervalSchedule
{

    protected Boolean lineDropCompensation;
    protected Resistance lineDropR;
    protected Reactance lineDropX;

    /**
     * Gets the value of the lineDropCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineDropCompensation() {
        return lineDropCompensation;
    }

    /**
     * Sets the value of the lineDropCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineDropCompensation(Boolean value) {
        this.lineDropCompensation = value;
    }

    /**
     * Gets the value of the lineDropR property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getLineDropR() {
        return lineDropR;
    }

    /**
     * Sets the value of the lineDropR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setLineDropR(Resistance value) {
        this.lineDropR = value;
    }

    /**
     * Gets the value of the lineDropX property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getLineDropX() {
        return lineDropX;
    }

    /**
     * Sets the value of the lineDropX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setLineDropX(Reactance value) {
        this.lineDropX = value;
    }

}
