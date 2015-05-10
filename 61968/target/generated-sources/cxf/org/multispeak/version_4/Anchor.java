
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anchor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anchor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="lead" type="{http://www.multispeak.org/Version_4.1_Release}lead" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.multispeak.org/Version_4.1_Release}featureStatus" minOccurs="0"/>
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
@XmlType(name = "anchor", propOrder = {
    "lead",
    "status"
})
public class Anchor
    extends MspObject
{

    protected Lead lead;
    protected FeatureStatus status;

    /**
     * Gets the value of the lead property.
     * 
     * @return
     *     possible object is
     *     {@link Lead }
     *     
     */
    public Lead getLead() {
        return lead;
    }

    /**
     * Sets the value of the lead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lead }
     *     
     */
    public void setLead(Lead value) {
        this.lead = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatus }
     *     
     */
    public FeatureStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatus }
     *     
     */
    public void setStatus(FeatureStatus value) {
        this.status = value;
    }

}
