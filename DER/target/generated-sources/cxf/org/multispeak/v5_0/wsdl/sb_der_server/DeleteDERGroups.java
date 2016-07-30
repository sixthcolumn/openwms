
package org.multispeak.v5_0.wsdl.sb_der_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.sandboxarrays.ArrayOfDERGroupID;


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
 *         &lt;element name="ArrayOfDERGroupID" type="{http://www.multispeak.org/V5.0/sandboxArrays}ArrayOfDERGroupID" minOccurs="0"/>
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
    "arrayOfDERGroupID",
    "responseURL",
    "transactionID"
})
@XmlRootElement(name = "DeleteDERGroups")
public class DeleteDERGroups {

    @XmlElement(name = "ArrayOfDERGroupID")
    protected ArrayOfDERGroupID arrayOfDERGroupID;
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    protected String transactionID;

    /**
     * Gets the value of the arrayOfDERGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDERGroupID }
     *     
     */
    public ArrayOfDERGroupID getArrayOfDERGroupID() {
        return arrayOfDERGroupID;
    }

    /**
     * Sets the value of the arrayOfDERGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDERGroupID }
     *     
     */
    public void setArrayOfDERGroupID(ArrayOfDERGroupID value) {
        this.arrayOfDERGroupID = value;
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
