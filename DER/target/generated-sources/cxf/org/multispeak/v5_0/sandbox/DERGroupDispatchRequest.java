
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspObject;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for DERGroupDispatchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupDispatchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="DERGroupID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="dispatchTargets" type="{http://www.multispeak.org/V5.0/sandbox}dispatchTargets"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupDispatchRequest", propOrder = {
    "derGroupID",
    "dispatchTargets"
})
public class DERGroupDispatchRequest
    extends MspObject
{

    @XmlElement(name = "DERGroupID", required = true)
    protected ObjectID derGroupID;
    @XmlElement(required = true)
    protected DispatchTargets dispatchTargets;

    /**
     * Gets the value of the derGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getDERGroupID() {
        return derGroupID;
    }

    /**
     * Sets the value of the derGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setDERGroupID(ObjectID value) {
        this.derGroupID = value;
    }

    /**
     * Gets the value of the dispatchTargets property.
     * 
     * @return
     *     possible object is
     *     {@link DispatchTargets }
     *     
     */
    public DispatchTargets getDispatchTargets() {
        return dispatchTargets;
    }

    /**
     * Sets the value of the dispatchTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispatchTargets }
     *     
     */
    public void setDispatchTargets(DispatchTargets value) {
        this.dispatchTargets = value;
    }

}
