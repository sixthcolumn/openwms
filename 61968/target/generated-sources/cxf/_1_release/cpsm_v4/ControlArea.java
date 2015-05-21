
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlArea">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="netInterchange" type="{cpsm_V4.1_Release}activePower" minOccurs="0"/>
 *         &lt;element name="tieFlow" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positiveFlowIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AGC"/>
 *               &lt;enumeration value="Forecast"/>
 *               &lt;enumeration value="Interchange"/>
 *               &lt;enumeration value="Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EnergyAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ControlArea", propOrder = {
    "netInterchange",
    "tieFlow",
    "type",
    "energyAreaID"
})
public class ControlArea
    extends MspCIMObject
{

    protected ActivePower netInterchange;
    protected ControlArea.TieFlow tieFlow;
    protected String type;
    @XmlElement(name = "EnergyAreaID")
    protected String energyAreaID;

    /**
     * Gets the value of the netInterchange property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getNetInterchange() {
        return netInterchange;
    }

    /**
     * Sets the value of the netInterchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setNetInterchange(ActivePower value) {
        this.netInterchange = value;
    }

    /**
     * Gets the value of the tieFlow property.
     * 
     * @return
     *     possible object is
     *     {@link ControlArea.TieFlow }
     *     
     */
    public ControlArea.TieFlow getTieFlow() {
        return tieFlow;
    }

    /**
     * Sets the value of the tieFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlArea.TieFlow }
     *     
     */
    public void setTieFlow(ControlArea.TieFlow value) {
        this.tieFlow = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the energyAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyAreaID() {
        return energyAreaID;
    }

    /**
     * Sets the value of the energyAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyAreaID(String value) {
        this.energyAreaID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="positiveFlowIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "positiveFlowIn",
        "terminalID"
    })
    public static class TieFlow {

        protected Boolean positiveFlowIn;
        protected String terminalID;

        /**
         * Gets the value of the positiveFlowIn property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPositiveFlowIn() {
            return positiveFlowIn;
        }

        /**
         * Sets the value of the positiveFlowIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPositiveFlowIn(Boolean value) {
            this.positiveFlowIn = value;
        }

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

    }

}
