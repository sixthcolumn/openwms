
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransformerWinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformerWinding">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="tapChangers" type="{cpsm_V4.1_Release}TapChangers" minOccurs="0"/>
 *         &lt;element name="baseVoltageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="windingNativeAttributes" type="{cpsm_V4.1_Release}WindingNativeAttributes" minOccurs="0"/>
 *         &lt;element name="terminalList" type="{cpsm_V4.1_Release}TerminalList" minOccurs="0"/>
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
@XmlType(name = "TransformerWinding", propOrder = {
    "tapChangers",
    "baseVoltageID",
    "windingNativeAttributes",
    "terminalList"
})
public class TransformerWinding
    extends ConductingEquipment
{

    protected TapChangers tapChangers;
    protected String baseVoltageID;
    protected WindingNativeAttributes windingNativeAttributes;
    protected TerminalList terminalList;

    /**
     * Gets the value of the tapChangers property.
     * 
     * @return
     *     possible object is
     *     {@link TapChangers }
     *     
     */
    public TapChangers getTapChangers() {
        return tapChangers;
    }

    /**
     * Sets the value of the tapChangers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapChangers }
     *     
     */
    public void setTapChangers(TapChangers value) {
        this.tapChangers = value;
    }

    /**
     * Gets the value of the baseVoltageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseVoltageID() {
        return baseVoltageID;
    }

    /**
     * Sets the value of the baseVoltageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseVoltageID(String value) {
        this.baseVoltageID = value;
    }

    /**
     * Gets the value of the windingNativeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link WindingNativeAttributes }
     *     
     */
    public WindingNativeAttributes getWindingNativeAttributes() {
        return windingNativeAttributes;
    }

    /**
     * Sets the value of the windingNativeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingNativeAttributes }
     *     
     */
    public void setWindingNativeAttributes(WindingNativeAttributes value) {
        this.windingNativeAttributes = value;
    }

    /**
     * Gets the value of the terminalList property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalList }
     *     
     */
    public TerminalList getTerminalList() {
        return terminalList;
    }

    /**
     * Sets the value of the terminalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalList }
     *     
     */
    public void setTerminalList(TerminalList value) {
        this.terminalList = value;
    }

}
