
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="contentsList" type="{cpsm_V4.1_Release}ContentsList" minOccurs="0"/>
 *         &lt;element name="connectivityNodes" type="{cpsm_V4.1_Release}ConnectivityNodes" minOccurs="0"/>
 *         &lt;element name="connectivitySections" type="{cpsm_V4.1_Release}ConnectivitySections" minOccurs="0"/>
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
@XmlType(name = "EquipmentContainer", propOrder = {
    "contentsList",
    "connectivityNodes",
    "connectivitySections"
})
@XmlSeeAlso({
    Line.class,
    VoltageLevel.class,
    Bay.class
})
public abstract class EquipmentContainer
    extends MspCIMObject
{

    protected ContentsList contentsList;
    protected ConnectivityNodes connectivityNodes;
    protected ConnectivitySections connectivitySections;

    /**
     * Gets the value of the contentsList property.
     * 
     * @return
     *     possible object is
     *     {@link ContentsList }
     *     
     */
    public ContentsList getContentsList() {
        return contentsList;
    }

    /**
     * Sets the value of the contentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentsList }
     *     
     */
    public void setContentsList(ContentsList value) {
        this.contentsList = value;
    }

    /**
     * Gets the value of the connectivityNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityNodes }
     *     
     */
    public ConnectivityNodes getConnectivityNodes() {
        return connectivityNodes;
    }

    /**
     * Sets the value of the connectivityNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityNodes }
     *     
     */
    public void setConnectivityNodes(ConnectivityNodes value) {
        this.connectivityNodes = value;
    }

    /**
     * Gets the value of the connectivitySections property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivitySections }
     *     
     */
    public ConnectivitySections getConnectivitySections() {
        return connectivitySections;
    }

    /**
     * Sets the value of the connectivitySections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivitySections }
     *     
     */
    public void setConnectivitySections(ConnectivitySections value) {
        this.connectivitySections = value;
    }

}
