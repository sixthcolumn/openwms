
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transformerEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformerEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="noLoadLoss" type="{http://www.multispeak.org/Version_4.1_Release}realPower" minOccurs="0"/>
 *         &lt;element name="windingAttributes" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWinding" minOccurs="0"/>
 *         &lt;element name="windingPairAttributes" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfWindingPair" minOccurs="0"/>
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
@XmlType(name = "transformerEntry", propOrder = {
    "noLoadLoss",
    "windingAttributes",
    "windingPairAttributes"
})
public class TransformerEntry
    extends MspElectricalDefinition
{

    protected RealPower noLoadLoss;
    protected ArrayOfWinding windingAttributes;
    protected ArrayOfWindingPair windingPairAttributes;

    /**
     * Gets the value of the noLoadLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getNoLoadLoss() {
        return noLoadLoss;
    }

    /**
     * Sets the value of the noLoadLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setNoLoadLoss(RealPower value) {
        this.noLoadLoss = value;
    }

    /**
     * Gets the value of the windingAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWinding }
     *     
     */
    public ArrayOfWinding getWindingAttributes() {
        return windingAttributes;
    }

    /**
     * Sets the value of the windingAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWinding }
     *     
     */
    public void setWindingAttributes(ArrayOfWinding value) {
        this.windingAttributes = value;
    }

    /**
     * Gets the value of the windingPairAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWindingPair }
     *     
     */
    public ArrayOfWindingPair getWindingPairAttributes() {
        return windingPairAttributes;
    }

    /**
     * Sets the value of the windingPairAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWindingPair }
     *     
     */
    public void setWindingPairAttributes(ArrayOfWindingPair value) {
        this.windingPairAttributes = value;
    }

}
