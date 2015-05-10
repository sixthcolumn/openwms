
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for meterConnectivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConnectivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageRecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="oldSubstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldFeederName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPhase" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="newSubstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newFeederName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPhase" type="{http://www.multispeak.org/Version_4.1_Release}phaseCode" minOccurs="0"/>
 *         &lt;element name="oldSubstationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldFeederCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSubstationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newFeederCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "meterConnectivity", propOrder = {
    "outageRecordID",
    "eventTime",
    "serviceLocationID",
    "meterID",
    "oldSubstation",
    "oldFeederName",
    "oldPhase",
    "newSubstation",
    "newFeederName",
    "newPhase",
    "oldSubstationCode",
    "oldFeederCode",
    "newSubstationCode",
    "newFeederCode"
})
public class MeterConnectivity
    extends MspObject
{

    protected String outageRecordID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String serviceLocationID;
    protected MeterID meterID;
    protected String oldSubstation;
    protected String oldFeederName;
    protected PhaseCode oldPhase;
    protected String newSubstation;
    protected String newFeederName;
    protected PhaseCode newPhase;
    protected String oldSubstationCode;
    protected String oldFeederCode;
    protected String newSubstationCode;
    protected String newFeederCode;

    /**
     * Gets the value of the outageRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageRecordID() {
        return outageRecordID;
    }

    /**
     * Sets the value of the outageRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageRecordID(String value) {
        this.outageRecordID = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the oldSubstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSubstation() {
        return oldSubstation;
    }

    /**
     * Sets the value of the oldSubstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSubstation(String value) {
        this.oldSubstation = value;
    }

    /**
     * Gets the value of the oldFeederName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldFeederName() {
        return oldFeederName;
    }

    /**
     * Sets the value of the oldFeederName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldFeederName(String value) {
        this.oldFeederName = value;
    }

    /**
     * Gets the value of the oldPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getOldPhase() {
        return oldPhase;
    }

    /**
     * Sets the value of the oldPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setOldPhase(PhaseCode value) {
        this.oldPhase = value;
    }

    /**
     * Gets the value of the newSubstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSubstation() {
        return newSubstation;
    }

    /**
     * Sets the value of the newSubstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSubstation(String value) {
        this.newSubstation = value;
    }

    /**
     * Gets the value of the newFeederName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFeederName() {
        return newFeederName;
    }

    /**
     * Sets the value of the newFeederName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFeederName(String value) {
        this.newFeederName = value;
    }

    /**
     * Gets the value of the newPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getNewPhase() {
        return newPhase;
    }

    /**
     * Sets the value of the newPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setNewPhase(PhaseCode value) {
        this.newPhase = value;
    }

    /**
     * Gets the value of the oldSubstationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSubstationCode() {
        return oldSubstationCode;
    }

    /**
     * Sets the value of the oldSubstationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSubstationCode(String value) {
        this.oldSubstationCode = value;
    }

    /**
     * Gets the value of the oldFeederCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldFeederCode() {
        return oldFeederCode;
    }

    /**
     * Sets the value of the oldFeederCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldFeederCode(String value) {
        this.oldFeederCode = value;
    }

    /**
     * Gets the value of the newSubstationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSubstationCode() {
        return newSubstationCode;
    }

    /**
     * Sets the value of the newSubstationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSubstationCode(String value) {
        this.newSubstationCode = value;
    }

    /**
     * Gets the value of the newFeederCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFeederCode() {
        return newFeederCode;
    }

    /**
     * Sets the value of the newFeederCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFeederCode(String value) {
        this.newFeederCode = value;
    }

}
