
package org.multispeak.version_4;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for MultiSpeakMsgHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSpeakMsgHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Build" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Branch" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BuildString" use="required" type="{http://www.multispeak.org/Version_4.1_Release}BuildDescriptor" />
 *       &lt;attribute name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Pwd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AppName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DefaultCurrencyCode" type="{http://www.multispeak.org/Version_4.1_Release}DefaultCurrencyCode" />
 *       &lt;attribute name="CSUnits" type="{http://www.multispeak.org/Version_4.1_Release}MessageHeaderCSUnits" default="feet" />
 *       &lt;attribute name="CoordinateSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CoordinateSystemAuthority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CoordinateSystemAuthorityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PreviousSessionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ObjectsRemaining" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="LastSent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegistrationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Context" type="{http://www.multispeak.org/Version_4.1_Release}MessageContext" />
 *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuditPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSpeakMsgHeader")
public class MultiSpeakMsgHeader {

    @XmlAttribute(name = "MajorVersion")
    protected BigInteger majorVersion;
    @XmlAttribute(name = "MinorVersion")
    protected BigInteger minorVersion;
    @XmlAttribute(name = "Build")
    protected BigInteger build;
    @XmlAttribute(name = "Branch")
    protected BigInteger branch;
    @XmlAttribute(name = "BuildString", required = true)
    protected BuildDescriptor buildString;
    @XmlAttribute(name = "UserID")
    protected String userID;
    @XmlAttribute(name = "Pwd")
    protected String pwd;
    @XmlAttribute(name = "AppName")
    protected String appName;
    @XmlAttribute(name = "AppVersion")
    protected String appVersion;
    @XmlAttribute(name = "Company")
    protected String company;
    @XmlAttribute(name = "DefaultCurrencyCode")
    protected DefaultCurrencyCode defaultCurrencyCode;
    @XmlAttribute(name = "CSUnits")
    protected MessageHeaderCSUnits csUnits;
    @XmlAttribute(name = "CoordinateSystemName")
    protected String coordinateSystemName;
    @XmlAttribute(name = "CoordinateSystemAuthority")
    protected String coordinateSystemAuthority;
    @XmlAttribute(name = "CoordinateSystemAuthorityCode")
    protected String coordinateSystemAuthorityCode;
    @XmlAttribute(name = "Datum")
    protected String datum;
    @XmlAttribute(name = "SessionID")
    protected String sessionID;
    @XmlAttribute(name = "PreviousSessionID")
    protected String previousSessionID;
    @XmlAttribute(name = "ObjectsRemaining")
    protected BigInteger objectsRemaining;
    @XmlAttribute(name = "LastSent")
    protected String lastSent;
    @XmlAttribute(name = "RegistrationID")
    protected String registrationID;
    @XmlAttribute(name = "MessageID")
    protected String messageID;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Context")
    protected MessageContext context;
    @XmlAttribute(name = "AuditID")
    protected String auditID;
    @XmlAttribute(name = "AuditPassword")
    protected String auditPassword;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMajorVersion(BigInteger value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinorVersion(BigInteger value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuild(BigInteger value) {
        this.build = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBranch(BigInteger value) {
        this.branch = value;
    }

    /**
     * Gets the value of the buildString property.
     * 
     * @return
     *     possible object is
     *     {@link BuildDescriptor }
     *     
     */
    public BuildDescriptor getBuildString() {
        return buildString;
    }

    /**
     * Sets the value of the buildString property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildDescriptor }
     *     
     */
    public void setBuildString(BuildDescriptor value) {
        this.buildString = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the defaultCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultCurrencyCode }
     *     
     */
    public DefaultCurrencyCode getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    /**
     * Sets the value of the defaultCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultCurrencyCode }
     *     
     */
    public void setDefaultCurrencyCode(DefaultCurrencyCode value) {
        this.defaultCurrencyCode = value;
    }

    /**
     * Gets the value of the csUnits property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderCSUnits }
     *     
     */
    public MessageHeaderCSUnits getCSUnits() {
        if (csUnits == null) {
            return MessageHeaderCSUnits.FEET;
        } else {
            return csUnits;
        }
    }

    /**
     * Sets the value of the csUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderCSUnits }
     *     
     */
    public void setCSUnits(MessageHeaderCSUnits value) {
        this.csUnits = value;
    }

    /**
     * Gets the value of the coordinateSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateSystemName() {
        return coordinateSystemName;
    }

    /**
     * Sets the value of the coordinateSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateSystemName(String value) {
        this.coordinateSystemName = value;
    }

    /**
     * Gets the value of the coordinateSystemAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateSystemAuthority() {
        return coordinateSystemAuthority;
    }

    /**
     * Sets the value of the coordinateSystemAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateSystemAuthority(String value) {
        this.coordinateSystemAuthority = value;
    }

    /**
     * Gets the value of the coordinateSystemAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateSystemAuthorityCode() {
        return coordinateSystemAuthorityCode;
    }

    /**
     * Sets the value of the coordinateSystemAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateSystemAuthorityCode(String value) {
        this.coordinateSystemAuthorityCode = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the previousSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSessionID() {
        return previousSessionID;
    }

    /**
     * Sets the value of the previousSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSessionID(String value) {
        this.previousSessionID = value;
    }

    /**
     * Gets the value of the objectsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectsRemaining() {
        return objectsRemaining;
    }

    /**
     * Sets the value of the objectsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectsRemaining(BigInteger value) {
        this.objectsRemaining = value;
    }

    /**
     * Gets the value of the lastSent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSent() {
        return lastSent;
    }

    /**
     * Sets the value of the lastSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSent(String value) {
        this.lastSent = value;
    }

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
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link MessageContext }
     *     
     */
    public MessageContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageContext }
     *     
     */
    public void setContext(MessageContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the auditID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditID() {
        return auditID;
    }

    /**
     * Sets the value of the auditID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditID(String value) {
        this.auditID = value;
    }

    /**
     * Gets the value of the auditPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditPassword() {
        return auditPassword;
    }

    /**
     * Sets the value of the auditPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditPassword(String value) {
        this.auditPassword = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
