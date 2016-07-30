
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * The generating units associated with this DER.
 * 			
 * 
 * <p>Java class for generatingUnits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generatingUnits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatingUnitRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generatingUnits", propOrder = {
    "generatingUnitRef"
})
public class GeneratingUnits {

    @XmlElement(required = true)
    protected ObjectRef generatingUnitRef;

    /**
     * Gets the value of the generatingUnitRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getGeneratingUnitRef() {
        return generatingUnitRef;
    }

    /**
     * Sets the value of the generatingUnitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setGeneratingUnitRef(ObjectRef value) {
        this.generatingUnitRef = value;
    }

}
