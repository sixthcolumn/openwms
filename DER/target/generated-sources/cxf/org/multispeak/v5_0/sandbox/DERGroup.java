
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspObject;


/**
 * A grouping of Distributed Energy Resource (DER)
 * 				facilities. The DERGroupName SHALL be carried in the
 * 				DERGroup.primaryIdentifier.
 * 
 * <p>Java class for DERGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="DERIDs" type="{http://www.multispeak.org/V5.0/sandbox}DERIDs" minOccurs="0"/>
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
@XmlType(name = "DERGroup", propOrder = {
    "deriDs"
})
public class DERGroup
    extends MspObject
{

    @XmlElement(name = "DERIDs")
    protected DERIDs deriDs;

    /**
     * Gets the value of the deriDs property.
     * 
     * @return
     *     possible object is
     *     {@link DERIDs }
     *     
     */
    public DERIDs getDERIDs() {
        return deriDs;
    }

    /**
     * Sets the value of the deriDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERIDs }
     *     
     */
    public void setDERIDs(DERIDs value) {
        this.deriDs = value;
    }

}
