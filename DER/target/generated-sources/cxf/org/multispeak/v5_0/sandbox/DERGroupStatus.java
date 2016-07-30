
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspEvent;


/**
 * The current status of a DERGroup.
 * 			
 * 
 * <p>Java class for DERGroupStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="DERGroup" type="{http://www.multispeak.org/V5.0/sandbox}DERGroup"/>
 *         &lt;element name="DERGroupCapabilities" type="{http://www.multispeak.org/V5.0/sandbox}DERGroupCapabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupStatus", propOrder = {
    "derGroup",
    "derGroupCapabilities"
})
public class DERGroupStatus
    extends MspEvent
{

    @XmlElement(name = "DERGroup", required = true)
    protected DERGroup derGroup;
    @XmlElement(name = "DERGroupCapabilities")
    protected DERGroupCapabilities derGroupCapabilities;

    /**
     * Gets the value of the derGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroup }
     *     
     */
    public DERGroup getDERGroup() {
        return derGroup;
    }

    /**
     * Sets the value of the derGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroup }
     *     
     */
    public void setDERGroup(DERGroup value) {
        this.derGroup = value;
    }

    /**
     * Gets the value of the derGroupCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupCapabilities }
     *     
     */
    public DERGroupCapabilities getDERGroupCapabilities() {
        return derGroupCapabilities;
    }

    /**
     * Sets the value of the derGroupCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupCapabilities }
     *     
     */
    public void setDERGroupCapabilities(DERGroupCapabilities value) {
        this.derGroupCapabilities = value;
    }

}
