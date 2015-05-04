
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectivityNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectivityNode">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="voltageLevelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subControlAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nominalVoltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementList" type="{cpsm_V4.1_Release}measurements" minOccurs="0"/>
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
@XmlType(name = "ConnectivityNode", propOrder = {
    "voltageLevelID",
    "subControlAreaID",
    "nominalVoltage",
    "substationID",
    "measurementList"
})
public class ConnectivityNode
    extends MspCIMObject
{

    protected String voltageLevelID;
    protected String subControlAreaID;
    protected String nominalVoltage;
    protected String substationID;
    protected Measurements measurementList;

    /**
     * Gets the value of the voltageLevelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoltageLevelID() {
        return voltageLevelID;
    }

    /**
     * Sets the value of the voltageLevelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoltageLevelID(String value) {
        this.voltageLevelID = value;
    }

    /**
     * Gets the value of the subControlAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubControlAreaID() {
        return subControlAreaID;
    }

    /**
     * Sets the value of the subControlAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubControlAreaID(String value) {
        this.subControlAreaID = value;
    }

    /**
     * Gets the value of the nominalVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * Sets the value of the nominalVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalVoltage(String value) {
        this.nominalVoltage = value;
    }

    /**
     * Gets the value of the substationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationID() {
        return substationID;
    }

    /**
     * Sets the value of the substationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationID(String value) {
        this.substationID = value;
    }

    /**
     * Gets the value of the measurementList property.
     * 
     * @return
     *     possible object is
     *     {@link Measurements }
     *     
     */
    public Measurements getMeasurementList() {
        return measurementList;
    }

    /**
     * Sets the value of the measurementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measurements }
     *     
     */
    public void setMeasurementList(Measurements value) {
        this.measurementList = value;
    }

}
