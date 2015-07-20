
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transformerBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformerBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="bankRatings" type="{http://www.multispeak.org/Version_4.1_Release}bankRatings" minOccurs="0"/>
 *         &lt;element name="windingCode" type="{http://www.multispeak.org/Version_4.1_Release}wdgCode" minOccurs="0"/>
 *         &lt;element name="centerTapPhase" type="{http://www.multispeak.org/Version_4.1_Release}mspPhase" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mounting" type="{http://www.multispeak.org/Version_4.1_Release}mounting" minOccurs="0"/>
 *         &lt;element name="tertiarySectionID" type="{http://www.multispeak.org/Version_4.1_Release}objectRef" minOccurs="0"/>
 *         &lt;element name="secondaryProtection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryProtection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformerList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTransformer" minOccurs="0"/>
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
@XmlType(name = "transformerBank", propOrder = {
    "bankRatings",
    "windingCode",
    "centerTapPhase",
    "description",
    "mounting",
    "tertiarySectionID",
    "secondaryProtection",
    "primaryProtection",
    "transformerList"
})
public class TransformerBank
    extends MspBankObject
{

    protected BankRatings bankRatings;
    protected WdgCode windingCode;
    protected MspPhase centerTapPhase;
    protected String description;
    protected Mounting mounting;
    protected ObjectRef tertiarySectionID;
    protected String secondaryProtection;
    protected String primaryProtection;
    protected ArrayOfTransformer transformerList;

    /**
     * Gets the value of the bankRatings property.
     * 
     * @return
     *     possible object is
     *     {@link BankRatings }
     *     
     */
    public BankRatings getBankRatings() {
        return bankRatings;
    }

    /**
     * Sets the value of the bankRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRatings }
     *     
     */
    public void setBankRatings(BankRatings value) {
        this.bankRatings = value;
    }

    /**
     * Gets the value of the windingCode property.
     * 
     * @return
     *     possible object is
     *     {@link WdgCode }
     *     
     */
    public WdgCode getWindingCode() {
        return windingCode;
    }

    /**
     * Sets the value of the windingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdgCode }
     *     
     */
    public void setWindingCode(WdgCode value) {
        this.windingCode = value;
    }

    /**
     * Gets the value of the centerTapPhase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getCenterTapPhase() {
        return centerTapPhase;
    }

    /**
     * Sets the value of the centerTapPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setCenterTapPhase(MspPhase value) {
        this.centerTapPhase = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link Mounting }
     *     
     */
    public Mounting getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mounting }
     *     
     */
    public void setMounting(Mounting value) {
        this.mounting = value;
    }

    /**
     * Gets the value of the tertiarySectionID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getTertiarySectionID() {
        return tertiarySectionID;
    }

    /**
     * Sets the value of the tertiarySectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setTertiarySectionID(ObjectRef value) {
        this.tertiarySectionID = value;
    }

    /**
     * Gets the value of the secondaryProtection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryProtection() {
        return secondaryProtection;
    }

    /**
     * Sets the value of the secondaryProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryProtection(String value) {
        this.secondaryProtection = value;
    }

    /**
     * Gets the value of the primaryProtection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryProtection() {
        return primaryProtection;
    }

    /**
     * Sets the value of the primaryProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryProtection(String value) {
        this.primaryProtection = value;
    }

    /**
     * Gets the value of the transformerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformer }
     *     
     */
    public ArrayOfTransformer getTransformerList() {
        return transformerList;
    }

    /**
     * Sets the value of the transformerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformer }
     *     
     */
    public void setTransformerList(ArrayOfTransformer value) {
        this.transformerList = value;
    }

}
