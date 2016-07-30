
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MeterIDs;
import org.multispeak.v5.ServicePointIDs;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for PANLinkages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANLinkages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointIDs" type="{http://www.multispeak.org/V5.0}servicePointIDs" minOccurs="0"/>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/V5.0}meterIDs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANLinkages", propOrder = {
    "serviceLocationID",
    "servicePointIDs",
    "meterIDs"
})
public class PANLinkages
    extends MspExtensible
{

    protected ObjectID serviceLocationID;
    protected ServicePointIDs servicePointIDs;
    protected MeterIDs meterIDs;

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the servicePointIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointIDs }
     *     
     */
    public ServicePointIDs getServicePointIDs() {
        return servicePointIDs;
    }

    /**
     * Sets the value of the servicePointIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointIDs }
     *     
     */
    public void setServicePointIDs(ServicePointIDs value) {
        this.servicePointIDs = value;
    }

    /**
     * Gets the value of the meterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterIDs }
     *     
     */
    public MeterIDs getMeterIDs() {
        return meterIDs;
    }

    /**
     * Sets the value of the meterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterIDs }
     *     
     */
    public void setMeterIDs(MeterIDs value) {
        this.meterIDs = value;
    }

}
