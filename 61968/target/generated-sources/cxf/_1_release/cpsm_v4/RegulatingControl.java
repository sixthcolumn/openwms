
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulatingControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatingControl">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regulationSchedule" type="{cpsm_V4.1_Release}RegulationSchedule" minOccurs="0"/>
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
@XmlType(name = "RegulatingControl", propOrder = {
    "terminalID",
    "regulationSchedule"
})
public class RegulatingControl
    extends MspCIMObject
{

    protected String terminalID;
    protected RegulationSchedule regulationSchedule;

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the regulationSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationSchedule }
     *     
     */
    public RegulationSchedule getRegulationSchedule() {
        return regulationSchedule;
    }

    /**
     * Sets the value of the regulationSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationSchedule }
     *     
     */
    public void setRegulationSchedule(RegulationSchedule value) {
        this.regulationSchedule = value;
    }

}
