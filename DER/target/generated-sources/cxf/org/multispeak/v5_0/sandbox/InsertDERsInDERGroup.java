
package org.multispeak.v5_0.sandbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for InsertDERsInDERGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertDERsInDERGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="DERIDs" type="{http://www.multispeak.org/V5.0/sandbox}DERIDs"/>
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
@XmlType(name = "InsertDERsInDERGroup", propOrder = {
    "derGroupID",
    "deriDs",
    "responseURL",
    "transactionID"
})
public class InsertDERsInDERGroup {

    @XmlElement(name = "DERGroupID", required = true)
    protected ObjectID derGroupID;
    @XmlElement(name = "DERIDs", required = true)
    protected DERIDs deriDs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    @XmlElement(required = true)
    protected String transactionID;

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
