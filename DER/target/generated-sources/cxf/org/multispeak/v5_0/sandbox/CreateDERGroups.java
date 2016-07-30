
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDERGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDERGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroups" type="{http://www.multispeak.org/V5.0/sandbox}DERGroups"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDERGroups", propOrder = {
    "derGroups",
    "responseURL",
    "transactionID"
})
public class CreateDERGroups {

    @XmlElement(name = "DERGroups", required = true)
    protected DERGroups derGroups;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    @XmlElement(required = true)
    protected String transactionID;

    /**
     * Gets the value of the derGroups property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroups }
     *     
     */
    public DERGroups getDERGroups() {
        return derGroups;
    }

    /**
     * Sets the value of the derGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroups }
     *     
     */
    public void setDERGroups(DERGroups value) {
        this.derGroups = value;
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
