
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROWAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROWAttributes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="circuitList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCircuit" minOccurs="0"/>
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
@XmlType(name = "ROWAttributes", propOrder = {
    "circuitList"
})
public class ROWAttributes
    extends MspElectricalDefinition
{

    protected ArrayOfCircuit circuitList;

    /**
     * Gets the value of the circuitList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCircuit }
     *     
     */
    public ArrayOfCircuit getCircuitList() {
        return circuitList;
    }

    /**
     * Sets the value of the circuitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCircuit }
     *     
     */
    public void setCircuitList(ArrayOfCircuit value) {
        this.circuitList = value;
    }

}
