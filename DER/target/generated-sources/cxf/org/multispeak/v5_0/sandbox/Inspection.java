
package org.multispeak.v5_0.sandbox;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MspWork;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for inspection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inspection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;sequence>
 *         &lt;element name="elementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementCondition" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="serviceOrderID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="observationList" type="{http://www.multispeak.org/V5.0/sandbox}observationList" minOccurs="0"/>
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
@XmlType(name = "inspection", propOrder = {
    "elementStatus",
    "elementCondition",
    "serviceOrderID",
    "observationList"
})
public class Inspection
    extends MspWork
{

    protected String elementStatus;
    protected BigInteger elementCondition;
    protected ObjectID serviceOrderID;
    protected ObservationList observationList;

    /**
     * Gets the value of the elementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementStatus() {
        return elementStatus;
    }

    /**
     * Sets the value of the elementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementStatus(String value) {
        this.elementStatus = value;
    }

    /**
     * Gets the value of the elementCondition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElementCondition() {
        return elementCondition;
    }

    /**
     * Sets the value of the elementCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElementCondition(BigInteger value) {
        this.elementCondition = value;
    }

    /**
     * Gets the value of the serviceOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceOrderID() {
        return serviceOrderID;
    }

    /**
     * Sets the value of the serviceOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceOrderID(ObjectID value) {
        this.serviceOrderID = value;
    }

    /**
     * Gets the value of the observationList property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationList }
     *     
     */
    public ObservationList getObservationList() {
        return observationList;
    }

    /**
     * Sets the value of the observationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationList }
     *     
     */
    public void setObservationList(ObservationList value) {
        this.observationList = value;
    }

}
