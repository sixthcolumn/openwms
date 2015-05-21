
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusbarSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusbarSection">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}Connector">
 *       &lt;sequence>
 *         &lt;element name="busbarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eqipmentContainerID" type="{cpsm_V4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="bayID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BusbarSection", propOrder = {
    "busbarType",
    "eqipmentContainerID",
    "bayID"
})
public class BusbarSection
    extends Connector
{

    protected String busbarType;
    protected ObjectRef eqipmentContainerID;
    protected String bayID;

    /**
     * Gets the value of the busbarType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusbarType() {
        return busbarType;
    }

    /**
     * Sets the value of the busbarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusbarType(String value) {
        this.busbarType = value;
    }

    /**
     * Gets the value of the eqipmentContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEqipmentContainerID() {
        return eqipmentContainerID;
    }

    /**
     * Sets the value of the eqipmentContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEqipmentContainerID(ObjectRef value) {
        this.eqipmentContainerID = value;
    }

    /**
     * Gets the value of the bayID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBayID() {
        return bayID;
    }

    /**
     * Sets the value of the bayID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBayID(String value) {
        this.bayID = value;
    }

}
