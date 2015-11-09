
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERID;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfDERID" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERID" minOccurs="0"/>
 *         &lt;element name="DERGroupID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrayOfDERID",
    "derGroupID",
    "responseURL",
    "transactionID"
})
@XmlRootElement(name = "RemoveDERsFromDERGroup")
public class RemoveDERsFromDERGroup {

    @XmlElement(name = "ArrayOfDERID")
    protected ArrayOfDERID arrayOfDERID;
    @XmlElement(name = "DERGroupID")
    protected ObjectID derGroupID;
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    protected String transactionID;

    /**
     * Gets the value of the arrayOfDERID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERID }
     *     
     */
    public ArrayOfDERID getArrayOfDERID() {
        return arrayOfDERID;
    }

    /**
     * Sets the value of the arrayOfDERID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERID }
     *     
     */
    public void setArrayOfDERID(ArrayOfDERID value) {
        this.arrayOfDERID = value;
    }

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
     * Gets the value of the responseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseURL() {
        return responseURL;
    }

    /**
     * Sets the value of the responseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseURL(String value) {
        this.responseURL = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}
