
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registrationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="responseUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsePwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationInfo", propOrder = {
    "registrationID",
    "responseURL",
    "responseUserID",
    "responsePwd",
    "msFunction",
    "methodsList"
})
public class RegistrationInfo {

    protected String registrationID;
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    protected String responseUserID;
    protected String responsePwd;
    @XmlElement(name = "MSFunction")
    protected String msFunction;
    protected ArrayOfString19 methodsList;

    /**
     * Gets the value of the registrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the value of the registrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
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
     * Gets the value of the responseUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseUserID() {
        return responseUserID;
    }

    /**
     * Sets the value of the responseUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseUserID(String value) {
        this.responseUserID = value;
    }

    /**
     * Gets the value of the responsePwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsePwd() {
        return responsePwd;
    }

    /**
     * Sets the value of the responsePwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsePwd(String value) {
        this.responsePwd = value;
    }

    /**
     * Gets the value of the msFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSFunction() {
        return msFunction;
    }

    /**
     * Sets the value of the msFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSFunction(String value) {
        this.msFunction = value;
    }

    /**
     * Gets the value of the methodsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString19 }
     *     
     */
    public ArrayOfString19 getMethodsList() {
        return methodsList;
    }

    /**
     * Sets the value of the methodsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString19 }
     *     
     */
    public void setMethodsList(ArrayOfString19 value) {
        this.methodsList = value;
    }

}
